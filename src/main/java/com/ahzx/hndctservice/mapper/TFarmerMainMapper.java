package com.ahzx.hndctservice.mapper;

import com.ahzx.hndctservice.entity.Do.FarmerDo;
import com.ahzx.hndctservice.entity.Dto.TFarmer.*;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

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
    TFarmerBTDto selectFullMsgBT(FarmerDo farmerDo);
    TFarmerDADto selectFullMsgDA(FarmerDo farmerDo);
    TFarmerHKDto selectFullMsgHK(FarmerDo farmerDo);
    TFarmerQZDto selectFullMsgQZ(FarmerDo farmerDo);
    TFarmerSYDto selectFullMsgSY(FarmerDo farmerDo);
    TFarmerWCDto selectFullMsgWC(FarmerDo farmerDo);
    TFarmerWZSDto selectFullMsgWZS(FarmerDo farmerDo);
}
