package com.ahzx.hndctservice.mapper;

import com.ahzx.hndctservice.entity.Do.FarmerDo;
import com.ahzx.hndctservice.entity.Dto.TNewFarmer.*;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

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
    TNewfarmerHk selectFullMsgHK(FarmerDo farmerDo);

    TNewfarmerBt selectFullMsgBT(FarmerDo farmerDo);

    TNewfarmerDa selectFullMsgDA(FarmerDo farmerDo);

    TNewfarmerLd selectFullMsgLD(FarmerDo farmerDo);

    TNewfarmerQz selectFullMsgQZ(FarmerDo farmerDo);

    TNewfarmerSy selectFullMsgSY(FarmerDo farmerDo);

    TNewfarmerWc selectFullMsgWC(FarmerDo farmerDo);

    TNewfarmerWzs selectFullMsgWZS(FarmerDo farmerDo);
}
