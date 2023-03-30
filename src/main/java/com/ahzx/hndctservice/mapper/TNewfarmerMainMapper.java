package com.ahzx.hndctservice.mapper;

import com.ahzx.hndctservice.entity.Do.FarmerDo;
import com.ahzx.hndctservice.entity.Dto.TNewFarmer.*;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 新型农业主体信息主Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
@Mapper
public interface TNewfarmerMainMapper extends BaseMapper<TNewfarmerMain>
{

    /**
     * 新增新型农业主体信息主
     * 
     * @param tNewfarmerMain 新型农业主体信息主
     * @return 结果
     */
    public int insertTNewfarmerMain(TNewfarmerMain tNewfarmerMain);

    /**
     * 修改新型农业主体信息主
     * 
     * @param tNewfarmerMain 新型农业主体信息主
     * @return 结果
     */
    public int updateTNewfarmerMain(TNewfarmerMain tNewfarmerMain);

    /**
     * 根据地区查询完整新型农业主体信息
     *
     * @param farmerDo 新型农业主体
     * @return 结果
     */
    TNewfarmerHKDto selectFullMsgHK(FarmerDo farmerDo);

    TNewfarmerBTDto selectFullMsgBT(FarmerDo farmerDo);

    TNewfarmerDADto selectFullMsgDA(FarmerDo farmerDo);

    TNewfarmerLDDto selectFullMsgLD(FarmerDo farmerDo);

    TNewfarmerQZDto selectFullMsgQZ(FarmerDo farmerDo);

    TNewfarmerSYDto selectFullMsgSY(FarmerDo farmerDo);

    TNewfarmerWCDto selectFullMsgWC(FarmerDo farmerDo);

    TNewfarmerWZSDto selectFullMsgWZS(FarmerDo farmerDo);
}
