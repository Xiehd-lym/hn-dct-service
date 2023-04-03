package com.ahzx.hndctservice.controller.his;

import com.ahzx.hndctservice.common.result.R;
import com.ahzx.hndctservice.controller.his.newFarmerMapper.TNewfarmerHkHisMapper;
import com.ahzx.hndctservice.entity.Dto.TNewFarmer.*;
import com.ahzx.hndctservice.entity.mainFarmerEntity.his.TNewfarmerMainHis;
import com.ahzx.hndctservice.entity.mainFarmerEntity.his.newFarmer.TNewfarmerHkHis;
import com.ahzx.hndctservice.generator.newFarmer.service.*;
import com.ahzx.hndctservice.service.ITNewfarmerMainService;
import com.ahzx.hndctservice.service.his.ITNewfarmerMainHisService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 新型农业主体历史数据操作相关接口 *
 * @Author xiehd
 * @Date 2023 03 23
 **/
@Api(tags = "新型农业主体历史数据操作相关接口")
@RestController
@RequestMapping("/api/newFarmerDataHis")
@Slf4j
public class NewFarmerHisDataApiController {

    @Autowired
    private ITNewfarmerMainHisService mainService;
    @Autowired
    private ITNewfarmerBtService btService;
    @Autowired
    private ITNewfarmerDaService daService;
    @Autowired
    private ITNewfarmerHkService hkService;
    @Autowired
    private TNewfarmerHkHisMapper tNewfarmerHkHisMapper;
    @Autowired
    private ITNewfarmerQzService qzService;
    @Autowired
    private ITNewfarmerSyService syService;
    @Autowired
    private ITNewfarmerWcService wcService;
    @Autowired
    private ITNewfarmerWzsService wzsService;

//    /**                                 **/

//    @PostMapping("/btData")
//    @Transactional
//    public void btData(@RequestBody TNewfarmerBt tNewfarmerBt){
//        TNewfarmerMainHis newfarmerMain = new TNewfarmerMainHis();
//        BeanUtils.copyProperties(tNewfarmerBt,newfarmerMain);
//        newfarmerMain.setDetailTabName("t_newfarmer_bt");
//        mainService.save(newfarmerMain);
//        tNewfarmerBt.setFarmerType("newFarmer");
//        tNewfarmerBt.setFarmerId(newfarmerMain.getFarmerId());
//        btService.insertTNewfarmerBt(tNewfarmerBt);
//    }
//    @PostMapping("/btDataUpdate")
//    @Transactional
//    public void btDataUpdate(@RequestBody TNewfarmerBt tNewfarmerBt){
//        TNewfarmerMainHis newfarmerMain = new TNewfarmerMainHis();
//        BeanUtils.copyProperties(tNewfarmerBt,newfarmerMain);
//        mainService.updateById(newfarmerMain);
//        tNewfarmerBt.setFarmerId(newfarmerMain.getFarmerId());
//        btService.updateTNewfarmerBt(tNewfarmerBt);
//    }

//    /**                                 **/

//    @PostMapping("/daData")
//    @Transactional
//    public void daData(@RequestBody TNewfarmerDa tNewfarmerDa){
//        TNewfarmerMainHis newfarmerMain = new TNewfarmerMainHis();
//        BeanUtils.copyProperties(tNewfarmerDa,newfarmerMain);
//        newfarmerMain.setDetailTabName("t_newfarmer_da");
//        mainService.save(newfarmerMain);
//        tNewfarmerDa.setFarmerType("newFarmer");
//        tNewfarmerDa.setFarmerId(newfarmerMain.getFarmerId());
//        daService.insertTNewfarmerDa(tNewfarmerDa);
//    }
//
//    @PostMapping("/daDataUpdate")
//    @Transactional
//    public void daDataUpdate(@RequestBody TNewfarmerDa tNewfarmerDa){
//        TNewfarmerMainHis newfarmerMain = new TNewfarmerMainHis();
//        BeanUtils.copyProperties(tNewfarmerDa,newfarmerMain);
//        mainService.updateById(newfarmerMain);
//        tNewfarmerDa.setFarmerId(newfarmerMain.getFarmerId());
//        daService.updateTNewfarmerDa(tNewfarmerDa);
//    }

    /**                                 **/

    @PostMapping("/hkData")
    @Transactional
    public R hkData(@RequestBody TNewfarmerHkHis tNewfarmerHk){
        TNewfarmerMainHis newfarmerMain = new TNewfarmerMainHis();
        BeanUtils.copyProperties(tNewfarmerHk,newfarmerMain);
        newfarmerMain.setDetailTabName("t_newfarmer_hk_his");
        mainService.save(newfarmerMain);
        tNewfarmerHk.setFarmerType("newFarmer");
        tNewfarmerHk.setFarmerId(newfarmerMain.getFarmerId());
        tNewfarmerHkHisMapper.insertTNewfarmerHk(tNewfarmerHk);
        return R.ok().message("操作成功");
    }

    @PostMapping("/hkDataUpdate")
    @Transactional
    public R hkDataUpdate(@RequestBody TNewfarmerHkHis tNewfarmerHk){
        TNewfarmerMainHis newfarmerMain = new TNewfarmerMainHis();
        BeanUtils.copyProperties(tNewfarmerHk,newfarmerMain);
        mainService.updateById(newfarmerMain);
        tNewfarmerHk.setFarmerId(newfarmerMain.getFarmerId());
        tNewfarmerHkHisMapper.updateTNewfarmerHk(tNewfarmerHk);
        return R.ok().message("操作成功");
    }

    /**                                 **/

//    @PostMapping("/syData")
//    @Transactional
//    public void data(@RequestBody TNewfarmerSy tNewfarmerSy){
//        TNewfarmerMainHis newfarmerMain = new TNewfarmerMainHis();
//        BeanUtils.copyProperties(tNewfarmerSy,newfarmerMain);
//        newfarmerMain.setDetailTabName("t_newfarmer_sy");
//        mainService.save(newfarmerMain);
//        tNewfarmerSy.setFarmerType("newFarmer");
//        tNewfarmerSy.setFarmerId(newfarmerMain.getFarmerId());
//        syService.insertTNewfarmerSy(tNewfarmerSy);
//    }
//
//    @PostMapping("/syDataUpdate")
//    @Transactional
//    public void dataUpdate(@RequestBody TNewfarmerSy tNewfarmerSy){
//        TNewfarmerMainHis newfarmerMain = new TNewfarmerMainHis();
//        BeanUtils.copyProperties(tNewfarmerSy,newfarmerMain);
//        mainService.updateById(newfarmerMain);
//        tNewfarmerSy.setFarmerId(newfarmerMain.getFarmerId());
//        syService.updateTNewfarmerSy(tNewfarmerSy);
//    }

    /**                                 **/

//    @PostMapping("/qzData")
//    @Transactional
//    public void qzData(@RequestBody TNewfarmerQz tNewfarmerQz){
//        TNewfarmerMainHis newfarmerMain = new TNewfarmerMainHis();
//        BeanUtils.copyProperties(tNewfarmerQz,newfarmerMain);
//        newfarmerMain.setDetailTabName("t_newfarmer_qz");
//        mainService.save(newfarmerMain);
//        tNewfarmerQz.setFarmerType("newFarmer");
//        tNewfarmerQz.setFarmerId(newfarmerMain.getFarmerId());
//        qzService.insertTNewfarmerQz(tNewfarmerQz);
//    }
//
//    @PostMapping("/qzDataUpdate")
//    @Transactional
//    public void qzDataUpdate(@RequestBody TNewfarmerQz tNewfarmerQz){
//        TNewfarmerMainHis newfarmerMain = new TNewfarmerMainHis();
//        BeanUtils.copyProperties(tNewfarmerQz,newfarmerMain);
//        mainService.updateById(newfarmerMain);
//        tNewfarmerQz.setFarmerId(newfarmerMain.getFarmerId());
//        qzService.updateTNewfarmerQz(tNewfarmerQz);
//    }

    /**                                 **/

//    @PostMapping("/wcData")
//    @Transactional
//    public void wcData(@RequestBody TNewfarmerWc tNewfarmerWc){
//        TNewfarmerMainHis newfarmerMain = new TNewfarmerMainHis();
//        BeanUtils.copyProperties(tNewfarmerWc,newfarmerMain);
//        newfarmerMain.setDetailTabName("t_newfarmer_wc");
//        mainService.save(newfarmerMain);
//        tNewfarmerWc.setFarmerType("newFarmer");
//        tNewfarmerWc.setFarmerId(newfarmerMain.getFarmerId());
//        wcService.insertTNewfarmerWc(tNewfarmerWc);
//    }
//
//    @PostMapping("/wcDataUpdate")
//    @Transactional
//    public void wcDataUpdate(@RequestBody TNewfarmerWc tNewfarmerWc){
//        TNewfarmerMainHis newfarmerMain = new TNewfarmerMainHis();
//        BeanUtils.copyProperties(tNewfarmerWc,newfarmerMain);
//        mainService.updateById(newfarmerMain);
//        tNewfarmerWc.setFarmerId(newfarmerMain.getFarmerId());
//        wcService.updateTNewfarmerWc(tNewfarmerWc);
//    }

    /**                                 **/

//    @PostMapping("/wzsData")
//    @Transactional
//    public void wzsData(@RequestBody TNewfarmerWzs tNewfarmerWzs){
//        TNewfarmerMainHis newfarmerMain = new TNewfarmerMainHis();
//        BeanUtils.copyProperties(tNewfarmerWzs,newfarmerMain);
//        newfarmerMain.setDetailTabName("t_newfarmer_wzs");
//        mainService.save(newfarmerMain);
//        tNewfarmerWzs.setFarmerType("newFarmer");
//        tNewfarmerWzs.setFarmerId(newfarmerMain.getFarmerId());
//        wzsService.insertTNewfarmerWzs(tNewfarmerWzs);
//    }
//
//    @PostMapping("/wzsDataUpdate")
//    @Transactional
//    public void wzsDataUpdate(@RequestBody TNewfarmerWzs tNewfarmerWzs){
//        TNewfarmerMainHis newfarmerMain = new TNewfarmerMainHis();
//        BeanUtils.copyProperties(tNewfarmerWzs,newfarmerMain);
//        mainService.updateById(newfarmerMain);
//        tNewfarmerWzs.setFarmerId(newfarmerMain.getFarmerId());
//        wzsService.updateTNewfarmerWzs(tNewfarmerWzs);
//    }

}
