package com.ahzx.hndctservice.service.his;

import com.ahzx.hndctservice.entity.Do.FarmerDo;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import com.ahzx.hndctservice.entity.mainFarmerEntity.his.TFarmerMainHis;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 农户信息主Service接口
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
public interface ITFarmerMainHisService extends IService<TFarmerMainHis>
{
    /**
     * 新增农户信息主
     * 
     * @param tFarmerMain 农户信息主
     * @return 结果
     */
    public int insertTFarmerMain(TFarmerMainHis tFarmerMain);

    /**
     * 修改农户信息主
     * 
     * @param tFarmerMain 农户信息主
     * @return 结果
     */
    public int updateTFarmerMain(TFarmerMainHis tFarmerMain);

    /**
     * 根据地区查询完整农户信息
     *
     * @param farmerDo 农户信息主
     * @return 结果
     */
    Object selectFullMsgByTableName(FarmerDo farmerDo);

}
