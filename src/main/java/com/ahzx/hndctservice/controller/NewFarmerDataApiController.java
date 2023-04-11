package com.ahzx.hndctservice.controller;

import com.ahzx.hndctservice.common.result.R;
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
    public R btData(@RequestBody TNewfarmerBt tNewfarmerBt){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerBt,newfarmerMain);
        newfarmerMain.setDetailTabName("t_newfarmer_bt");
        newfarmerMain.setEvaStatus("0");
        newfarmerMain.setCollectStatus("2");
        mainService.save(newfarmerMain);
        tNewfarmerBt.setFarmerType("newFarmer");
        tNewfarmerBt.setFarmerId(newfarmerMain.getFarmerId());
        btService.insertTNewfarmerBt(tNewfarmerBt);
        return R.ok().message("操作成功");
    }
    @PostMapping("/btDataUpdate")
    @Transactional
    public R btDataUpdate(@RequestBody TNewfarmerBt tNewfarmerBt){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerBt,newfarmerMain);
        mainService.updateById(newfarmerMain);
        tNewfarmerBt.setFarmerId(newfarmerMain.getFarmerId());
        btService.updateTNewfarmerBt(tNewfarmerBt);
        return R.ok().message("操作成功");
    }

    /**                                 **/

    @PostMapping("/daData")
    @Transactional
    public R daData(@RequestBody TNewfarmerDa tNewfarmerDa){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerDa,newfarmerMain);
        newfarmerMain.setDetailTabName("t_newfarmer_da");
        newfarmerMain.setEvaStatus("0");
        newfarmerMain.setCollectStatus("2");
        mainService.save(newfarmerMain);
        tNewfarmerDa.setFarmerType("newFarmer");
        tNewfarmerDa.setFarmerId(newfarmerMain.getFarmerId());
        daService.insertTNewfarmerDa(tNewfarmerDa);
        return R.ok().message("操作成功");
    }

    @PostMapping("/daDataUpdate")
    @Transactional
    public R daDataUpdate(@RequestBody TNewfarmerDa tNewfarmerDa){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerDa,newfarmerMain);
        mainService.updateById(newfarmerMain);
        tNewfarmerDa.setFarmerId(newfarmerMain.getFarmerId());
        daService.updateTNewfarmerDa(tNewfarmerDa);
        return R.ok().message("操作成功");
    }

    /**                                 **/

    @PostMapping("/hkData")
    @Transactional
    public R hkData(@RequestBody TNewfarmerHk tNewfarmerHk){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerHk,newfarmerMain);
        newfarmerMain.setDetailTabName("t_newfarmer_hk");
        newfarmerMain.setEvaStatus("0");
        newfarmerMain.setCollectStatus("2");
        mainService.save(newfarmerMain);
        tNewfarmerHk.setFarmerType("newFarmer");
        tNewfarmerHk.setFarmerId(newfarmerMain.getFarmerId());
        hkService.insertTNewfarmerHk(tNewfarmerHk);
        return R.ok().message("操作成功");
    }

    @PostMapping("/hkDataUpdate")
    @Transactional
    public R hkDataUpdate(@RequestBody TNewfarmerHk tNewfarmerHk){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerHk,newfarmerMain);
        mainService.updateById(newfarmerMain);
        tNewfarmerHk.setFarmerId(newfarmerMain.getFarmerId());
        hkService.updateTNewfarmerHk(tNewfarmerHk);
        return R.ok().message("操作成功");
    }

    /**                                 **/

    @PostMapping("/syData")
    @Transactional
    public R data(@RequestBody TNewfarmerSy tNewfarmerSy){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerSy,newfarmerMain);
        newfarmerMain.setEvaStatus("0");
        newfarmerMain.setCollectStatus("2");
        newfarmerMain.setDetailTabName("t_newfarmer_sy");
        mainService.save(newfarmerMain);
        tNewfarmerSy.setFarmerType("newFarmer");
        tNewfarmerSy.setFarmerId(newfarmerMain.getFarmerId());
        syService.insertTNewfarmerSy(tNewfarmerSy);
        return R.ok().message("操作成功");
    }

    @PostMapping("/syDataUpdate")
    @Transactional
    public R dataUpdate(@RequestBody TNewfarmerSy tNewfarmerSy){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerSy,newfarmerMain);
        mainService.updateById(newfarmerMain);
        tNewfarmerSy.setFarmerId(newfarmerMain.getFarmerId());
        syService.updateTNewfarmerSy(tNewfarmerSy);
        return R.ok().message("操作成功");
    }

    /**                                 **/

    @PostMapping("/qzData")
    @Transactional
    public R qzData(@RequestBody TNewfarmerQz tNewfarmerQz){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerQz,newfarmerMain);
        newfarmerMain.setEvaStatus("0");
        newfarmerMain.setCollectStatus("2");
        newfarmerMain.setDetailTabName("t_newfarmer_qz");
        mainService.save(newfarmerMain);
        tNewfarmerQz.setFarmerType("newFarmer");
        tNewfarmerQz.setFarmerId(newfarmerMain.getFarmerId());
        qzService.insertTNewfarmerQz(tNewfarmerQz);
        return R.ok().message("操作成功");
    }

    @PostMapping("/qzDataUpdate")
    @Transactional
    public R qzDataUpdate(@RequestBody TNewfarmerQz tNewfarmerQz){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerQz,newfarmerMain);
        mainService.updateById(newfarmerMain);
        tNewfarmerQz.setFarmerId(newfarmerMain.getFarmerId());
        qzService.updateTNewfarmerQz(tNewfarmerQz);
        return R.ok().message("操作成功");
    }

    /**                                 **/

    @PostMapping("/wcData")
    @Transactional
    public R wcData(@RequestBody TNewfarmerWc tNewfarmerWc){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerWc,newfarmerMain);
        newfarmerMain.setEvaStatus("0");
        newfarmerMain.setCollectStatus("2");
        newfarmerMain.setDetailTabName("t_newfarmer_wc");
        mainService.save(newfarmerMain);
        tNewfarmerWc.setFarmerType("newFarmer");
        tNewfarmerWc.setFarmerId(newfarmerMain.getFarmerId());
        wcService.insertTNewfarmerWc(tNewfarmerWc);
        return R.ok().message("操作成功");
    }

    @PostMapping("/wcDataUpdate")
    @Transactional
    public R wcDataUpdate(@RequestBody TNewfarmerWc tNewfarmerWc){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerWc,newfarmerMain);
        mainService.updateById(newfarmerMain);
        tNewfarmerWc.setFarmerId(newfarmerMain.getFarmerId());
        wcService.updateTNewfarmerWc(tNewfarmerWc);
        return R.ok().message("操作成功");
    }

    /**                                 **/

    @PostMapping("/wzsData")
    @Transactional
    public R wzsData(@RequestBody TNewfarmerWzs tNewfarmerWzs){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerWzs,newfarmerMain);
        newfarmerMain.setEvaStatus("0");
        newfarmerMain.setCollectStatus("2");
        newfarmerMain.setDetailTabName("t_newfarmer_wzs");
        mainService.save(newfarmerMain);
        tNewfarmerWzs.setFarmerType("newFarmer");
        tNewfarmerWzs.setFarmerId(newfarmerMain.getFarmerId());
        wzsService.insertTNewfarmerWzs(tNewfarmerWzs);
        return R.ok().message("操作成功");
    }

    @PostMapping("/wzsDataUpdate")
    @Transactional
    public R wzsDataUpdate(@RequestBody TNewfarmerWzs tNewfarmerWzs){
        TNewfarmerMain newfarmerMain = new TNewfarmerMain();
        BeanUtils.copyProperties(tNewfarmerWzs,newfarmerMain);
        mainService.updateById(newfarmerMain);
        tNewfarmerWzs.setFarmerId(newfarmerMain.getFarmerId());
        wzsService.updateTNewfarmerWzs(tNewfarmerWzs);
        return R.ok().message("操作成功");
    }

}
