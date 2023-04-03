package com.ahzx.hndctservice.controller;

import com.ahzx.hndctservice.common.enums.FarmerTemplateTypeEnum;
import com.ahzx.hndctservice.common.enums.NewFarmerTemplateTypeEnum;
import com.ahzx.hndctservice.common.result.R;
import com.ahzx.hndctservice.common.utils.StringUtils;
import com.ahzx.hndctservice.entity.Do.FarmerDo;
import com.ahzx.hndctservice.entity.Vo.BaseDataVo;
import com.ahzx.hndctservice.entity.Vo.ListDataReqVo;
import com.ahzx.hndctservice.entity.Vo.StatisticsVo;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import com.ahzx.hndctservice.service.ITFarmerMainService;
import com.ahzx.hndctservice.service.ITNewfarmerMainService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @Autowired
    private ITFarmerMainService farmerMainService;
    @Autowired
    private ITNewfarmerMainService newfarmerMainService;

    /**
     * 统计信息 *
     */
    @PostMapping("/statisticsData")
    public R statisticsData(@Validated  @RequestBody StatisticsVo statisticsVo){
        String queryUserType = statisticsVo.getQueryUserType();
        String area = statisticsVo.getArea();
        String trueArea = area.substring(0, 3);
        Integer countNum = null;
        if (queryUserType.equals("1")){
            QueryWrapper<TFarmerMain> queryWrapper = new QueryWrapper<>();
            queryWrapper.likeRight("area",trueArea);
            // 未采集 1   已采集 2
            queryWrapper.eq("collect_status","2");
            countNum = farmerMainService.count(queryWrapper);
        }else {
            QueryWrapper<TNewfarmerMain> queryWrapper = new QueryWrapper<>();
            queryWrapper.likeRight("area",trueArea);
            // 未采集 1   已采集 2
            queryWrapper.eq("collect_status","2");
            countNum = newfarmerMainService.count(queryWrapper);
        }
        return R.ok().message("查询成功").data("num",countNum);
    }

    // 列表查询
    @PostMapping("/getDataList")
    public R dataList(@Validated  @RequestBody ListDataReqVo listDataReqVo){
        PageHelper.startPage(listDataReqVo.getPagenum(), listDataReqVo.getPagesize());
        String queryUserType = listDataReqVo.getQueryUserType();
        String searchValue = listDataReqVo.getSearchValue();

        if(queryUserType.equals("1")){
            QueryWrapper<TFarmerMain> queryWrapper = new QueryWrapper<>();
            if (StringUtils.isNoneBlank(searchValue)){
                queryWrapper.like("person_name",searchValue);
            }
            queryWrapper.likeRight("area",listDataReqVo.getArea());
            // 根据采集员的采集地区范围去查询所有的被采集人员基础列表信息
            List<TFarmerMain> list = farmerMainService.list(queryWrapper);
            PageInfo<TFarmerMain> pageInfo = new PageInfo<>(list);
            return R.ok().message("查询成功").data("list",pageInfo);
        }else {
            QueryWrapper<TNewfarmerMain> queryWrapper = new QueryWrapper<>();
            if (StringUtils.isNoneBlank(searchValue)){
                queryWrapper.like("person_name",searchValue);
            }
            queryWrapper.likeRight("area",listDataReqVo.getArea());
            // 根据采集员的采集地区范围去查询所有的被采集人员基础列表信息
            List<TNewfarmerMain> list = newfarmerMainService.list(queryWrapper);
            PageInfo<TNewfarmerMain> pageInfo = new PageInfo<>(list);
            return R.ok().message("查询成功").data("list",pageInfo);
        }
    }

    /**-----------------------------**采集详情页**-----------------------------**/

    /**
     * 完整信息 *
     */
    @PostMapping("/baseData")
    public R baseData(@RequestBody BaseDataVo baseDataVo){
        Long farmerId = baseDataVo.getFarmerId();
        String queryUserType = baseDataVo.getQueryUserType();
        String area = baseDataVo.getArea();

        if (queryUserType.equals("1")){
            String tableName = FarmerTemplateTypeEnum.getTemplateNameByArea(area);
            FarmerDo demoDo = new FarmerDo();
            demoDo.setTableName(tableName);
            demoDo.setFarmerId(farmerId);
            Object result = farmerMainService.selectFullMsgByTableName(demoDo);
            return R.ok().message("查询成功").data("result",result);
        }else {
            String tableName = NewFarmerTemplateTypeEnum.getTemplateNameByArea(area);
            FarmerDo demoDo = new FarmerDo();
            demoDo.setTableName(tableName);
            demoDo.setFarmerId(farmerId);
            Object result = newfarmerMainService.selectFullMsgByTableName(demoDo);
            return R.ok().message("查询成功").data("result",result);
        }
    }

}
