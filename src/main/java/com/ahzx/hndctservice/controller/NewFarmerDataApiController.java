package com.ahzx.hndctservice.controller;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.*;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import com.ahzx.hndctservice.generator.newFarmer.service.*;
import com.ahzx.hndctservice.service.ITNewfarmerMainService;
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
 * 新型农业主体数据操作相关接口 *
 * @Author xiehd
 * @Date 2023 03 23
 **/
@Api(tags = "新型农业主体数据操作相关接口")
@RestController
@RequestMapping("/api/newFarmerData")
@Slf4j
public class NewFarmerDataApiController {

    @Autowired
    private ITNewfarmerMainService mainService;
    @Autowired
    private ITNewfarmerBtService btService;
    @Autowired
    private ITNewfarmerDaService daService;
    @Autowired
    private ITNewfarmerHkService hkService;
    @Autowired
    private ITNewfarmerQzService qzService;
    @Autowired
    private ITNewfarmerSyService syService;
    @Autowired
    private ITNewfarmerWcService wcService;
    @Autowired
    private ITNewfarmerWzsService wzsService;

    /**                                 **/

    @PostMapping("/btData")
    @Transactional
    public void btData(@RequestBody TNewfarmerBt tNewfarmerBt){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerBt,newfarmerMain);
        mainService.save(newfarmerMain);
        tNewfarmerBt.setFarmerId(newfarmerMain.getFarmerId());
        btService.insertTNewfarmerBt(tNewfarmerBt);
    }
    @PostMapping("/btDataUpdate")
    @Transactional
    public void btDataUpdate(@RequestBody TNewfarmerBt tNewfarmerBt){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerBt,newfarmerMain);
        mainService.updateById(newfarmerMain);
        tNewfarmerBt.setFarmerId(newfarmerMain.getFarmerId());
        btService.updateTNewfarmerBt(tNewfarmerBt);
    }

    /**                                 **/

    @PostMapping("/daData")
    @Transactional
    public void daData(@RequestBody TNewfarmerDa tNewfarmerDa){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerDa,newfarmerMain);
        mainService.save(newfarmerMain);
        tNewfarmerDa.setFarmerId(newfarmerMain.getFarmerId());
        daService.insertTNewfarmerDa(tNewfarmerDa);
    }

    @PostMapping("/daDataUpdate")
    @Transactional
    public void daDataUpdate(@RequestBody TNewfarmerDa tNewfarmerDa){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerDa,newfarmerMain);
        mainService.updateById(newfarmerMain);
        tNewfarmerDa.setFarmerId(newfarmerMain.getFarmerId());
        daService.updateTNewfarmerDa(tNewfarmerDa);
    }

    /**                                 **/

    @PostMapping("/hkData")
    @Transactional
    public void hkData(@RequestBody TNewfarmerHk tNewfarmerHk){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerHk,newfarmerMain);
        mainService.save(newfarmerMain);
        tNewfarmerHk.setFarmerId(newfarmerMain.getFarmerId());
        hkService.insertTNewfarmerHk(tNewfarmerHk);
    }

    @PostMapping("/hkDataUpdate")
    @Transactional
    public void hkDataUpdate(@RequestBody TNewfarmerHk tNewfarmerHk){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerHk,newfarmerMain);
        mainService.updateById(newfarmerMain);
        tNewfarmerHk.setFarmerId(newfarmerMain.getFarmerId());
        hkService.updateTNewfarmerHk(tNewfarmerHk);
    }

    /**                                 **/

    @PostMapping("/syData")
    @Transactional
    public void data(@RequestBody TNewfarmerSy tNewfarmerSy){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerSy,newfarmerMain);
        mainService.save(newfarmerMain);
        tNewfarmerSy.setFarmerId(newfarmerMain.getFarmerId());
        syService.insertTNewfarmerSy(tNewfarmerSy);
    }

    @PostMapping("/syDataUpdate")
    @Transactional
    public void dataUpdate(@RequestBody TNewfarmerSy tNewfarmerSy){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerSy,newfarmerMain);
        mainService.updateById(newfarmerMain);
        tNewfarmerSy.setFarmerId(newfarmerMain.getFarmerId());
        syService.updateTNewfarmerSy(tNewfarmerSy);
    }

    /**                                 **/

    @PostMapping("/qzData")
    @Transactional
    public void qzData(@RequestBody TNewfarmerQz tNewfarmerQz){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerQz,newfarmerMain);
        mainService.save(newfarmerMain);
        tNewfarmerQz.setFarmerId(newfarmerMain.getFarmerId());
        qzService.insertTNewfarmerQz(tNewfarmerQz);
    }

    @PostMapping("/qzDataUpdate")
    @Transactional
    public void qzDataUpdate(@RequestBody TNewfarmerQz tNewfarmerQz){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerQz,newfarmerMain);
        mainService.updateById(newfarmerMain);
        tNewfarmerQz.setFarmerId(newfarmerMain.getFarmerId());
        qzService.updateTNewfarmerQz(tNewfarmerQz);
    }

    /**                                 **/

    @PostMapping("/wcData")
    @Transactional
    public void wcData(@RequestBody TNewfarmerWc tNewfarmerWc){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerWc,newfarmerMain);
        mainService.save(newfarmerMain);
        tNewfarmerWc.setFarmerId(newfarmerMain.getFarmerId());
        wcService.insertTNewfarmerWc(tNewfarmerWc);
    }

    @PostMapping("/wcDataUpdate")
    @Transactional
    public void wcDataUpdate(@RequestBody TNewfarmerWc tNewfarmerWc){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerWc,newfarmerMain);
        mainService.updateById(newfarmerMain);
        tNewfarmerWc.setFarmerId(newfarmerMain.getFarmerId());
        wcService.updateTNewfarmerWc(tNewfarmerWc);
    }

    /**                                 **/

    @PostMapping("/wzsData")
    @Transactional
    public void wzsData(@RequestBody TNewfarmerWzs tNewfarmerWzs){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerWzs,newfarmerMain);
        mainService.save(newfarmerMain);
        tNewfarmerWzs.setFarmerId(newfarmerMain.getFarmerId());
        wzsService.insertTNewfarmerWzs(tNewfarmerWzs);
    }

    @PostMapping("/wzsDataUpdate")
    @Transactional
    public void wzsDataUpdate(@RequestBody TNewfarmerWzs tNewfarmerWzs){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerWzs,newfarmerMain);
        mainService.updateById(newfarmerMain);
        tNewfarmerWzs.setFarmerId(newfarmerMain.getFarmerId());
        wzsService.updateTNewfarmerWzs(tNewfarmerWzs);
    }

}
