package com.ahzx.hndctservice.controller.his;

import com.ahzx.hndctservice.common.result.R;
import com.ahzx.hndctservice.controller.his.farmerMapper.TFarmerHkHisMapper;
import com.ahzx.hndctservice.controller.his.newFarmerMapper.TNewfarmerHkHisMapper;
import com.ahzx.hndctservice.entity.Dto.TFarmer.*;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import com.ahzx.hndctservice.entity.mainFarmerEntity.his.TFarmerMainHis;
import com.ahzx.hndctservice.entity.mainFarmerEntity.his.farmer.TFarmerHkHis;
import com.ahzx.hndctservice.generator.farmer.service.*;
import com.ahzx.hndctservice.generator.newFarmer.mapper.TNewfarmerHkMapper;
import com.ahzx.hndctservice.service.ITFarmerMainService;
import com.ahzx.hndctservice.service.his.ITFarmerMainHisService;
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
 * 农户数据历史操作相关接口 *
 * @Author xiehd
 * @Date 2023 03 23
 **/
@Api(tags = "农户数据历史操作相关接口")
@RestController
@RequestMapping("/api/user/farmerDataHis")
@Slf4j
public class FarmerHisDataApiController {

    @Autowired
    private ITFarmerMainHisService mainService;
    @Autowired
    private TFarmerHkHisMapper tFarmerHkHisMapper;
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

//    /**
//     * 1 添加参数 hisType  *  **/
//    @PostMapping("/btData")
//    @Transactional
//    public void btData(@RequestBody TFarmerBt farmerBt){
//        TFarmerMainHis tFarmerMain = new TFarmerMainHis();
//        BeanUtils.copyProperties(farmerBt,tFarmerMain);
//        tFarmerMain.setFarmerTabName("t_farmer_bt");
//        mainService.save(tFarmerMain);
//        farmerBt.setFarmerType("farmer");
//        farmerBt.setFarmerId(tFarmerMain.getFarmerId());
//        btService.insertTFarmerBt(farmerBt);
//    }
//
//    @PostMapping("/btDataUpDate")
//    @Transactional
//    public void btDataUp(@RequestBody TFarmerBt farmerBt){
//        TFarmerMainHis tFarmerMain = new TFarmerMainHis();
//        BeanUtils.copyProperties(farmerBt,tFarmerMain);
//        mainService.updateById(tFarmerMain);
//        farmerBt.setFarmerId(tFarmerMain.getFarmerId());
//        btService.updateTFarmerBt(farmerBt);
//    }

    /**                                 **/

//    @PostMapping("/daData")
//    @Transactional
//    public void daData(@RequestBody TFarmerDa farmerDa){
//        TFarmerMainHis tFarmerMain = new TFarmerMainHis();
//        BeanUtils.copyProperties(farmerDa,tFarmerMain);
//        tFarmerMain.setFarmerTabName("t_farmer_da");
//        mainService.save(tFarmerMain);
//        farmerDa.setFarmerType("farmer");
//        farmerDa.setFarmerId(tFarmerMain.getFarmerId());
//        daService.insertTFarmerDa(farmerDa);
//    }
//    @PostMapping("/daDataUpdate")
//    @Transactional
//    public void daDataUpdate(@RequestBody TFarmerDa farmerDa){
//        TFarmerMainHis tFarmerMain = new TFarmerMainHis();
//        BeanUtils.copyProperties(farmerDa,tFarmerMain);
//        mainService.updateById(tFarmerMain);
//        farmerDa.setFarmerId(tFarmerMain.getFarmerId());
//        daService.updateTFarmerDa(farmerDa);
//    }

    /**                                 **/

    @PostMapping("/hkData")
    @Transactional
    public R hkData(@RequestBody TFarmerHkHis farmerHk){
        TFarmerMainHis tFarmerMain = new TFarmerMainHis();
        BeanUtils.copyProperties(farmerHk,tFarmerMain);
        farmerHk.setFarmerTabName("t_farmer_hk_his");
        mainService.save(tFarmerMain);
        farmerHk.setFarmerType("farmer");
        farmerHk.setFarmerId(tFarmerMain.getFarmerId());
        tFarmerHkHisMapper.insertTFarmerHk(farmerHk);
        return R.ok().message("操作成功");
    }
    @PostMapping("/hkDataUpdate")
    @Transactional
    public R hkDataUpdate(@RequestBody TFarmerHkHis farmerHk){
        TFarmerMainHis tFarmerMain = new TFarmerMainHis();
        BeanUtils.copyProperties(farmerHk,tFarmerMain);
        mainService.updateById(tFarmerMain);
        farmerHk.setFarmerId(tFarmerMain.getFarmerId());
        tFarmerHkHisMapper.updateTFarmerHk(farmerHk);
        return R.ok().message("操作成功");
    }

    /**                                 **/

//    @PostMapping("/qzData")
//    @Transactional
//    public void qzData(@RequestBody TFarmerQz farmerQz){
//        TFarmerMainHis tFarmerMain = new TFarmerMainHis();
//        BeanUtils.copyProperties(farmerQz,tFarmerMain);
//        tFarmerMain.setFarmerTabName("t_farmer_qz");
//        mainService.save(tFarmerMain);
//        farmerQz.setFarmerType("farmer");
//        farmerQz.setFarmerId(tFarmerMain.getFarmerId());
//        qzService.insertTFarmerQz(farmerQz);
//    }
//    @PostMapping("/qzDataUpdate")
//    @Transactional
//    public void qzDataUpdate(@RequestBody TFarmerQz farmerQz){
//        TFarmerMainHis tFarmerMain = new TFarmerMainHis();
//        BeanUtils.copyProperties(farmerQz,tFarmerMain);
//        mainService.updateById(tFarmerMain);
//        farmerQz.setFarmerId(tFarmerMain.getFarmerId());
//        qzService.updateTFarmerQz(farmerQz);
//    }

    /**                                 **/

//    @PostMapping("/syData")
//    @Transactional
//    public void syData(@RequestBody TFarmerSy farmerSy){
//        TFarmerMainHis tFarmerMain = new TFarmerMainHis();
//        BeanUtils.copyProperties(farmerSy,tFarmerMain);
//        tFarmerMain.setFarmerTabName("t_farmer_sy");
//        mainService.save(tFarmerMain);
//        farmerSy.setFarmerType("farmer");
//        farmerSy.setFarmerId(tFarmerMain.getFarmerId());
//        syService.insertTFarmerSy(farmerSy);
//    }
//    @PostMapping("/syDataUpdate")
//    @Transactional
//    public void syDataUpdate(@RequestBody TFarmerSy farmerSy){
//        TFarmerMainHis tFarmerMain = new TFarmerMainHis();
//        BeanUtils.copyProperties(farmerSy,tFarmerMain);
//        mainService.updateById(tFarmerMain);
//        farmerSy.setFarmerId(tFarmerMain.getFarmerId());
//        syService.updateTFarmerSy(farmerSy);
//    }

    /**                                 **/

//    @PostMapping("/wcData")
//    @Transactional
//    public void wcData(@RequestBody TFarmerWc farmerWc){
//        TFarmerMainHis tFarmerMain = new TFarmerMainHis();
//        BeanUtils.copyProperties(farmerWc,tFarmerMain);
//        tFarmerMain.setFarmerTabName("t_farmer_wc");
//        mainService.save(tFarmerMain);
//        farmerWc.setFarmerType("farmer");
//        farmerWc.setFarmerId(tFarmerMain.getFarmerId());
//        wcService.insertTFarmerWc(farmerWc);
//    }
//    @PostMapping("/wcDataUpdate")
//    @Transactional
//    public void wcDataUpdate(@RequestBody TFarmerWc farmerWc){
//        TFarmerMainHis tFarmerMain = new TFarmerMainHis();
//        BeanUtils.copyProperties(farmerWc,tFarmerMain);
//        mainService.updateById(tFarmerMain);
//        farmerWc.setFarmerId(tFarmerMain.getFarmerId());
//        wcService.updateTFarmerWc(farmerWc);
//    }

    /**                                 **/

//    @PostMapping("/wzsData")
//    @Transactional
//    public void wzsData(@RequestBody TFarmerWzs farmerWzs){
//        TFarmerMainHis tFarmerMain = new TFarmerMainHis();
//        BeanUtils.copyProperties(farmerWzs,tFarmerMain);
//        tFarmerMain.setFarmerTabName("t_farmer_wzs");
//        mainService.save(tFarmerMain);
//        farmerWzs.setFarmerType("farmer");
//        farmerWzs.setFarmerId(tFarmerMain.getFarmerId());
//        wzsService.insertTFarmerWzs(farmerWzs);
//    }
//    @PostMapping("/wzsDataUpdate")
//    @Transactional
//    public void wzsDataUpdate(@RequestBody TFarmerWzs farmerWzs){
//        TFarmerMainHis tFarmerMain = new TFarmerMainHis();
//        BeanUtils.copyProperties(farmerWzs,tFarmerMain);
//        mainService.updateById(tFarmerMain);
//        farmerWzs.setFarmerId(tFarmerMain.getFarmerId());
//        wzsService.updateTFarmerWzs(farmerWzs);
//    }

}
