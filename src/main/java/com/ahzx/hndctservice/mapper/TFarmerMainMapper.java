package com.ahzx.hndctservice.mapper;

import com.ahzx.hndctservice.entity.Do.FarmerDo;
import com.ahzx.hndctservice.entity.Dto.TFarmer.*;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 农户信息主Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
@Mapper
public interface TFarmerMainMapper extends BaseMapper<TFarmerMain>
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
    TFarmerBt selectFullMsgBT(FarmerDo farmerDo);
    TFarmerDa selectFullMsgDA(FarmerDo farmerDo);
    TFarmerHk selectFullMsgHK(FarmerDo farmerDo);
    TFarmerQz selectFullMsgQZ(FarmerDo farmerDo);
    TFarmerSy selectFullMsgSY(FarmerDo farmerDo);
    TFarmerWc selectFullMsgWC(FarmerDo farmerDo);
    TFarmerWzs selectFullMsgWZS(FarmerDo farmerDo);
}
