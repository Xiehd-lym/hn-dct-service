package com.ahzx.hndctservice.controller;

import com.ahzx.hndctservice.common.enums.FarmerAreaTableEnum;
import com.ahzx.hndctservice.common.enums.NewFarmerAreaTableEnum;
import com.ahzx.hndctservice.common.result.R;
import com.ahzx.hndctservice.entity.Do.FarmerDo;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import com.ahzx.hndctservice.entity.Vo.BaseDataVo;
import com.ahzx.hndctservice.entity.Vo.ListDataReqVo;
import com.ahzx.hndctservice.entity.Vo.StatisticsVo;
import com.ahzx.hndctservice.service.ITFarmerMainService;
import com.ahzx.hndctservice.service.ITNewfarmerMainService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
     * 基本信息 *
     */
    @PostMapping("/statisticsData")
    public R statisticsData(@Validated  @RequestBody StatisticsVo statisticsVo){
        String queryUserType = statisticsVo.getQueryUserType();
        String area = statisticsVo.getArea();
        Integer countNum = null;
        // todo 待确定用户类型值
        if (queryUserType.equals("1")){
            QueryWrapper<TFarmerMain> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("area",area);
            // 未采集 1   已采集 2
            queryWrapper.eq("collect_status","2");
            countNum = farmerMainService.count(queryWrapper);
        }else {
            QueryWrapper<TNewfarmerMain> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("area",area);
            // 未采集 1   已采集 2
            queryWrapper.eq("collect_status","2");
            countNum = newfarmerMainService.count(queryWrapper);
        }
        return R.ok().message("查询成功").data("num",countNum);
    }

    // 列表查询
    @PostMapping("/getDataListByPage")
    public R dataList(@Validated  @RequestBody ListDataReqVo listDataReqVo){
        PageHelper.startPage(listDataReqVo.getPagenum(), listDataReqVo.getPagesize());
        String queryUserType = listDataReqVo.getQueryUserType();
        // todo 待确定用户类型值
        if(queryUserType.equals("1")){
            QueryWrapper<TFarmerMain> queryWrapper = new QueryWrapper<>();
            queryWrapper.like("person_name",listDataReqVo.getSearchValue());
            queryWrapper.eq("area",listDataReqVo.getArea());
            // 根据采集员的采集地区范围去查询所有的被采集人员基础列表信息
            List<TFarmerMain> list = farmerMainService.list(queryWrapper);
            PageInfo<TFarmerMain> pageInfo = new PageInfo<>(list);
            return R.ok().message("查询成功").data("list",pageInfo);
        }else {
            QueryWrapper<TNewfarmerMain> queryWrapper = new QueryWrapper<>();
            queryWrapper.like("person_name",listDataReqVo.getSearchValue());
            queryWrapper.eq("area",listDataReqVo.getArea());
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

        // todo 待确定用户类型值
        if (queryUserType.equals("1")){
            String tableName = FarmerAreaTableEnum.getTableNameByArea(area);
            FarmerDo demoDo = new FarmerDo();
            demoDo.setTableName(tableName);
            demoDo.setFarmerId(farmerId);
            Object result = farmerMainService.selectFullMsgByTableName(demoDo);
            return R.ok().message("查询成功").data("result",result);
        }else {
            String tableName = NewFarmerAreaTableEnum.getTableNameByArea(area);
            FarmerDo demoDo = new FarmerDo();
            demoDo.setTableName(tableName);
            demoDo.setFarmerId(farmerId);
            Object result = newfarmerMainService.selectFullMsgByTableName(demoDo);
            return R.ok().message("查询成功").data("result",result);
        }
    }

    /**
     * 详情录入 *
     */
    @GetMapping("/dataInsert")
    public void dataInsert(@RequestBody Map map){
        // todo
    }

    /**
     * 详情修改 *
     */
    @GetMapping("/dataUpdate")
    public void dataUpdate(@RequestBody Map map){
        // todo
    }

    // todo 采集员 我的接口

}
