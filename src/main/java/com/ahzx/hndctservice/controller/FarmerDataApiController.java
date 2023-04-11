package com.ahzx.hndctservice.controller;

import com.ahzx.hndctservice.common.result.R;
import com.ahzx.hndctservice.entity.Dto.TFarmer.*;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import com.ahzx.hndctservice.generator.farmer.service.*;
import com.ahzx.hndctservice.service.ITFarmerMainService;
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

    /**
     * 1 添加参数 hisType  *  **/
    @PostMapping("/btData")
    @Transactional
    public R btData(@RequestBody TFarmerBt farmerBt){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerBt,tFarmerMain);
        tFarmerMain.setFarmerTabName("t_farmer_bt");
        tFarmerMain.setEvaStatus("0");
        tFarmerMain.setCollectStatus("2");
        mainService.save(tFarmerMain);
        farmerBt.setFarmerType("farmer");
        farmerBt.setFarmerId(tFarmerMain.getFarmerId());
        btService.insertTFarmerBt(farmerBt);
        return R.ok().message("操作成功");
    }

    @PostMapping("/btDataUpDate")
    @Transactional
    public R btDataUp(@RequestBody TFarmerBt farmerBt){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerBt,tFarmerMain);
        mainService.updateById(tFarmerMain);
        farmerBt.setFarmerId(tFarmerMain.getFarmerId());
        btService.updateTFarmerBt(farmerBt);
        return R.ok().message("操作成功");
    }

    /**                                 **/

    @PostMapping("/daData")
    @Transactional
    public R daData(@RequestBody TFarmerDa farmerDa){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerDa,tFarmerMain);
        tFarmerMain.setEvaStatus("0");
        tFarmerMain.setCollectStatus("2");
        tFarmerMain.setFarmerTabName("t_farmer_da");
        mainService.save(tFarmerMain);
        farmerDa.setFarmerType("farmer");
        farmerDa.setFarmerId(tFarmerMain.getFarmerId());
        daService.insertTFarmerDa(farmerDa);
        return R.ok().message("操作成功");
    }
    @PostMapping("/daDataUpdate")
    @Transactional
    public R daDataUpdate(@RequestBody TFarmerDa farmerDa){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerDa,tFarmerMain);
        mainService.updateById(tFarmerMain);
        farmerDa.setFarmerId(tFarmerMain.getFarmerId());
        daService.updateTFarmerDa(farmerDa);
        return R.ok().message("操作成功");
    }

    /**                                 **/

    @PostMapping("/hkData")
    @Transactional
    public R hkData(@RequestBody TFarmerHk farmerHk){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerHk,tFarmerMain);
        tFarmerMain.setEvaStatus("0");
        tFarmerMain.setCollectStatus("2");
        farmerHk.setFarmerTabName("t_farmer_hk");
        mainService.save(tFarmerMain);
        farmerHk.setFarmerType("farmer");
        farmerHk.setFarmerId(tFarmerMain.getFarmerId());
        hkService.insertTFarmerHk(farmerHk);
        return R.ok().message("操作成功");
    }
    @PostMapping("/hkDataUpdate")
    @Transactional
    public R hkDataUpdate(@RequestBody TFarmerHk farmerHk){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerHk,tFarmerMain);
        mainService.updateById(tFarmerMain);
        farmerHk.setFarmerId(tFarmerMain.getFarmerId());
        hkService.updateTFarmerHk(farmerHk);
        return R.ok().message("操作成功");
    }

    /**                                 **/

    @PostMapping("/qzData")
    @Transactional
    public R qzData(@RequestBody TFarmerQz farmerQz){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerQz,tFarmerMain);
        tFarmerMain.setFarmerTabName("t_farmer_qz");
        tFarmerMain.setEvaStatus("0");
        tFarmerMain.setCollectStatus("2");
        mainService.save(tFarmerMain);
        farmerQz.setFarmerType("farmer");
        farmerQz.setFarmerId(tFarmerMain.getFarmerId());
        qzService.insertTFarmerQz(farmerQz);
        return R.ok().message("操作成功");
    }
    @PostMapping("/qzDataUpdate")
    @Transactional
    public R qzDataUpdate(@RequestBody TFarmerQz farmerQz){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerQz,tFarmerMain);
        tFarmerMain.setEvaStatus("0");
        tFarmerMain.setCollectStatus("2");
        mainService.updateById(tFarmerMain);
        farmerQz.setFarmerId(tFarmerMain.getFarmerId());
        qzService.updateTFarmerQz(farmerQz);
        return R.ok().message("操作成功");
    }

    /**                                 **/

    @PostMapping("/syData")
    @Transactional
    public R syData(@RequestBody TFarmerSy farmerSy){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerSy,tFarmerMain);
        tFarmerMain.setFarmerTabName("t_farmer_sy");
        tFarmerMain.setEvaStatus("0");
        tFarmerMain.setCollectStatus("2");
        mainService.save(tFarmerMain);
        farmerSy.setFarmerType("farmer");
        farmerSy.setFarmerId(tFarmerMain.getFarmerId());
        syService.insertTFarmerSy(farmerSy);
        return R.ok().message("操作成功");
    }
    @PostMapping("/syDataUpdate")
    @Transactional
    public R syDataUpdate(@RequestBody TFarmerSy farmerSy){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerSy,tFarmerMain);
        mainService.updateById(tFarmerMain);
        farmerSy.setFarmerId(tFarmerMain.getFarmerId());
        syService.updateTFarmerSy(farmerSy);
        return R.ok().message("操作成功");
    }

    /**                                 **/

    @PostMapping("/wcData")
    @Transactional
    public R wcData(@RequestBody TFarmerWc farmerWc){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerWc,tFarmerMain);
        tFarmerMain.setEvaStatus("0");
        tFarmerMain.setCollectStatus("2");
        tFarmerMain.setFarmerTabName("t_farmer_wc");
        mainService.save(tFarmerMain);
        farmerWc.setFarmerType("farmer");
        farmerWc.setFarmerId(tFarmerMain.getFarmerId());
        wcService.insertTFarmerWc(farmerWc);
        return R.ok().message("操作成功");
    }
    @PostMapping("/wcDataUpdate")
    @Transactional
    public R wcDataUpdate(@RequestBody TFarmerWc farmerWc){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerWc,tFarmerMain);
        mainService.updateById(tFarmerMain);
        farmerWc.setFarmerId(tFarmerMain.getFarmerId());
        wcService.updateTFarmerWc(farmerWc);
        return R.ok().message("操作成功");
    }

    /**                                 **/

    @PostMapping("/wzsData")
    @Transactional
    public R wzsData(@RequestBody TFarmerWzs farmerWzs){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerWzs,tFarmerMain);
        tFarmerMain.setEvaStatus("0");
        tFarmerMain.setCollectStatus("2");
        tFarmerMain.setFarmerTabName("t_farmer_wzs");
        mainService.save(tFarmerMain);
        farmerWzs.setFarmerType("farmer");
        farmerWzs.setFarmerId(tFarmerMain.getFarmerId());
        wzsService.insertTFarmerWzs(farmerWzs);
        return R.ok().message("操作成功");
    }
    @PostMapping("/wzsDataUpdate")
    @Transactional
    public R wzsDataUpdate(@RequestBody TFarmerWzs farmerWzs){
        TFarmerMain tFarmerMain = new TFarmerMain();
        BeanUtils.copyProperties(farmerWzs,tFarmerMain);
        mainService.updateById(tFarmerMain);
        farmerWzs.setFarmerId(tFarmerMain.getFarmerId());
        wzsService.updateTFarmerWzs(farmerWzs);
        return R.ok().message("操作成功");
    }

}
