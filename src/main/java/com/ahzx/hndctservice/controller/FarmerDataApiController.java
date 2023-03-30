package com.ahzx.hndctservice.controller;


import com.ahzx.hndctservice.entity.Dto.TFarmer.*;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import com.ahzx.hndctservice.generator.farmer.service.*;
import com.ahzx.hndctservice.service.ITFarmerMainService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 农户数据操作相关接口 *
 * @Author xiehd
 * @Date 2023 03 23
 **/
@Api(tags = "农户数据操作相关接口")
@RestController
@RequestMapping("/api/farmerData")
@Slf4j
public class FarmerDataApiController {

    @Autowired
    private ITFarmerMainService mainService;
    @Autowired
    private ITFarmerBtService btService;
    @Autowired
    private ITFarmerDaService daService;
    @Autowired
    private ITFarmerHkService hkService;
    @Autowired
    private ITFarmerQzService qzService;
    @Autowired
    private ITFarmerSyService syService;
    @Autowired
    private ITFarmerWcService wcService;
    @Autowired
    private ITFarmerWzsService wzsService;

    /**                                 **/

    @PostMapping("/btData")
    @Transactional
    public void btData(@RequestBody TFarmerBt farmerBt){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerBt,tFarmerMain);
        mainService.save(tFarmerMain);
        farmerBt.setFarmerId(tFarmerMain.getFarmerId());
        btService.insertTFarmerBt(farmerBt);
    }

    @PostMapping("/btDataUpDate")
    @Transactional
    public void btDataUp(@RequestBody TFarmerBt farmerBt){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerBt,tFarmerMain);
        mainService.updateById(tFarmerMain);
        farmerBt.setFarmerId(tFarmerMain.getFarmerId());
        btService.updateTFarmerBt(farmerBt);
    }

    /**                                 **/

    @PostMapping("/daData")
    @Transactional
    public void daData(@RequestBody TFarmerDa farmerDa){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerDa,tFarmerMain);
        mainService.save(tFarmerMain);
        farmerDa.setFarmerId(tFarmerMain.getFarmerId());
        daService.insertTFarmerDa(farmerDa);
    }
    @PostMapping("/daDataUpdate")
    @Transactional
    public void daDataUpdate(@RequestBody TFarmerDa farmerDa){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerDa,tFarmerMain);
        mainService.updateById(tFarmerMain);
        farmerDa.setFarmerId(tFarmerMain.getFarmerId());
        daService.updateTFarmerDa(farmerDa);
    }

    /**                                 **/

    @PostMapping("/hkData")
    @Transactional
    public void hkData(@RequestBody TFarmerHk farmerHk){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerHk,tFarmerMain);
        mainService.save(tFarmerMain);
        farmerHk.setFarmerId(tFarmerMain.getFarmerId());
        hkService.insertTFarmerHk(farmerHk);
    }
    @PostMapping("/hkDataUpdate")
    @Transactional
    public void hkDataUpdate(@RequestBody TFarmerHk farmerHk){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerHk,tFarmerMain);
        mainService.updateById(tFarmerMain);
        farmerHk.setFarmerId(tFarmerMain.getFarmerId());
        hkService.updateTFarmerHk(farmerHk);
    }

    /**                                 **/

    @PostMapping("/qzData")
    @Transactional
    public void qzData(@RequestBody TFarmerQz farmerQz){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerQz,tFarmerMain);
        mainService.save(tFarmerMain);
        farmerQz.setFarmerId(tFarmerMain.getFarmerId());
        qzService.insertTFarmerQz(farmerQz);
    }
    @PostMapping("/qzDataUpdate")
    @Transactional
    public void qzDataUpdate(@RequestBody TFarmerQz farmerQz){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerQz,tFarmerMain);
        mainService.updateById(tFarmerMain);
        farmerQz.setFarmerId(tFarmerMain.getFarmerId());
        qzService.updateTFarmerQz(farmerQz);
    }

    /**                                 **/

    @PostMapping("/syData")
    @Transactional
    public void syData(@RequestBody TFarmerSy farmerSy){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerSy,tFarmerMain);
        mainService.save(tFarmerMain);
        farmerSy.setFarmerId(tFarmerMain.getFarmerId());
        syService.insertTFarmerSy(farmerSy);
    }
    @PostMapping("/syDataUpdate")
    @Transactional
    public void syDataUpdate(@RequestBody TFarmerSy farmerSy){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerSy,tFarmerMain);
        mainService.updateById(tFarmerMain);
        farmerSy.setFarmerId(tFarmerMain.getFarmerId());
        syService.updateTFarmerSy(farmerSy);
    }

    /**                                 **/

    @PostMapping("/wcData")
    @Transactional
    public void wcData(@RequestBody TFarmerWc farmerWc){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerWc,tFarmerMain);
        mainService.save(tFarmerMain);
        farmerWc.setFarmerId(tFarmerMain.getFarmerId());
        wcService.insertTFarmerWc(farmerWc);
    }
    @PostMapping("/wcDataUpdate")
    @Transactional
    public void wcDataUpdate(@RequestBody TFarmerWc farmerWc){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerWc,tFarmerMain);
        mainService.updateById(tFarmerMain);
        farmerWc.setFarmerId(tFarmerMain.getFarmerId());
        wcService.updateTFarmerWc(farmerWc);
    }

    /**                                 **/

    @PostMapping("/wzsData")
    @Transactional
    public void wzsData(@RequestBody TFarmerWzs farmerWzs){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerWzs,tFarmerMain);
        mainService.save(tFarmerMain);
        farmerWzs.setFarmerId(tFarmerMain.getFarmerId());
        wzsService.insertTFarmerWzs(farmerWzs);
    }
    @PostMapping("/wzsDataUpdate")
    @Transactional
    public void wzsDataUpdate(@RequestBody TFarmerWzs farmerWzs){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerWzs,tFarmerMain);
        mainService.updateById(tFarmerMain);
        farmerWzs.setFarmerId(tFarmerMain.getFarmerId());
        wzsService.updateTFarmerWzs(farmerWzs);
    }

}
