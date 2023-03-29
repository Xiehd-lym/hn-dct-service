package com.ahzx.hndctservice.controller;

import com.ahzx.hndctservice.common.result.R;
import com.ahzx.hndctservice.entity.vo.ListDataReqVo;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 查询相关接口 *
 * @Author xiehd
 * @Date 2023 03 23
 **/
@Api(tags = "查询相关接口")
@RestController
@RequestMapping("/api/dtcData")
@Slf4j
public class DctApiController {

    /**
     * *
     * @param listDataReqVo
     *
     *      //当前页
     *      private int pageNum;
     *      //每页的数量
     *      private int pageSize;
     *      //当前页的数量
     *      private int size;
     *      //当前页面第一个元素在数据库中的行号
     *      private int startRow;
     *      //当前页面最后一个元素在数据库中的行号
     *      private int endRow;
     *      //总记录数
     *      private long total;
     *      //总页数
     *      private int pages;
     *
     */
    // 列表查询
    @PostMapping("/getDataListByPage")
    public R dataList(@Validated  @RequestBody ListDataReqVo listDataReqVo){
        PageHelper.startPage(listDataReqVo.getPagenum(), listDataReqVo.getPagesize());
        // todo 根据采集员的采集地区范围去查询所有的被采集人员基础列表信息
        return R.ok();
    }

    /**-----------------------------**采集详情页**-----------------------------**/

    /**
     * 基本信息 *
     */
    @PostMapping("/baseData")
    public void baseData(){
        // todo
    }

    /**
     * 详情查询 *
     */
    @GetMapping("/dataDetail")
    public void dataDetail(){
        // todo
        
    }

    /**
     * 详情录入 *
     */
    @GetMapping("/dataInsert")
    public void dataInsert(){
        
        // todo
    }

}
