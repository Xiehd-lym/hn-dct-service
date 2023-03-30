package com.ahzx.hndctservice.service;

import com.ahzx.hndctservice.entity.Do.FarmerDo;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 农户信息主Service接口
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
public interface ITFarmerMainService  extends IService<TFarmerMain>
{
    /**
     * 新增农户信息主
     * 
     * @param tFarmerMain 农户信息主
     * @return 结果
     */
    public int insertTFarmerMain(TFarmerMain tFarmerMain);

    /**
     * 修改农户信息主
     * 
     * @param tFarmerMain 农户信息主
     * @return 结果
     */
    public int updateTFarmerMain(TFarmerMain tFarmerMain);

    /**
     * 根据地区查询完整农户信息
     *
     * @param farmerDo 农户信息主
     * @return 结果
     */
    Object selectFullMsgByTableName(FarmerDo farmerDo);

}
