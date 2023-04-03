package com.ahzx.hndctservice.controller;

import com.ahzx.hndctservice.common.result.R;
import com.ahzx.hndctservice.common.utils.CpachaUtil;
import com.ahzx.hndctservice.common.utils.DateUtils;
import com.ahzx.hndctservice.common.utils.JwtUtils;
import com.ahzx.hndctservice.entity.BizCollector;
import com.ahzx.hndctservice.entity.Vo.UserLoginVo;
import com.ahzx.hndctservice.mapper.UserLoginMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户登录相关接口 *
 * @Author xiehd
 * @Date 2023 03 27
 **/
@Api(tags = "用户相关接口")
@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserApiController {

    @Autowired
    private UserLoginMapper userLoginMapper;

    @GetMapping("/getCpacha")
    @ResponseBody
    public R getCpacha(
            @RequestParam(name = "len",required = false,defaultValue = "4") Integer codeLen,
            @RequestParam(name = "width",required = false,defaultValue = "100") Integer width,
            @RequestParam(name = "height",required = false,defaultValue = "30") Integer height,
            @RequestParam(name = "type",defaultValue = "loginCpacha") String cpachaType,
            HttpServletRequest request, HttpServletResponse response) {
        // 获取工具类对象
        CpachaUtil caCpachaUtil = new CpachaUtil(codeLen, width, height);
        // 生成验证码字符串
        String code = caCpachaUtil.generatorVCode();
        // 获取Session对
        HttpSession httpSession = request.getSession();
        // 存进session域中
        httpSession.setAttribute(cpachaType, code);
        // 获得旋转字体的验证码图片
        BufferedImage bufferedImage = caCpachaUtil.generatorRotateVCodeImage(code, true);
        ByteArrayOutputStream  outputStream = new ByteArrayOutputStream();
        Map<String, Object> result = new HashMap<>();
        try {
            // 以图片流的形式写到响应对象中
            ImageIO.write(bufferedImage, "gif", outputStream);
            byte[] img = outputStream.toByteArray();
            String base64String = Base64Utils.encodeToString(img);

            result.put("imgBase64",base64String);
            result.put("Cpacha",code);
            log.info("登录时间是：{}，的验证码为：{}", DateUtils.getNowDate(),code);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return R.ok().message("验证码生成成功").data(result);
    }

    /**
     * 用户登录
     * @param loginVo
     * @return
     */
    @ApiOperation(value = "用户登录")
    @PostMapping(value = "/login")
    public R userLogin(
            @RequestParam(name = "type",defaultValue = "loginCpacha") String cpachaType,
            HttpServletRequest request,
            @ApiParam(value = "登录表单", required = true) @RequestBody UserLoginVo loginVo){
        // 获取Session对
//        HttpSession httpSession = request.getSession();
//        String code =(String)httpSession.getAttribute(cpachaType);

        String loginName = loginVo.getLoginName();
        String password = loginVo.getPassword();

        // 验证账号密码是否正确
        BizCollector userLogin = new BizCollector();
        userLogin.setLoginName(loginName);
        // todo 拿到若依的登录代码 加盐加密
        userLogin.setPassword(password);
        QueryWrapper<BizCollector> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .eq("login_name", loginName)
                .eq("password", password);

        List<BizCollector> list = userLoginMapper.selectList(queryWrapper);
        if(CollectionUtils.isNotEmpty(list)) {
            // 登录成功,加上 token
            String token = JwtUtils.createToken(list.get(0).getLoginName());
            Map<String, Object> data = new HashMap<>();
            data.put("token", token);
            data.put("user",list.get(0));
            data.put("areaName",userLoginMapper.getAreaNameByCity(list.get(0).getCity()));
            data.put("loginResult", true);
            return R.ok().code(200).data("data", data).message("登录成功");
        }else {
            return R.error().data("loginResult", false).message("登录失败，请认真检查账号密码哦");
        }
    }

    // todo 采集员 我的接口


}
