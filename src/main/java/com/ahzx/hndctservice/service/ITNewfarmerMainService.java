package com.ahzx.hndctservice.service;

import com.ahzx.hndctservice.entity.Do.FarmerDo;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 新型农业主体信息主Service接口
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
public interface ITNewfarmerMainService extends IService<TNewfarmerMain>
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
     * @param demoDo 新型农业主体
     * @return 结果
     */
    Object selectFullMsgByTableName(FarmerDo demoDo);

}
