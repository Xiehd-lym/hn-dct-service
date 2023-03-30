package com.ahzx.hndctservice.service.impl;

import com.ahzx.hndctservice.common.utils.DateUtils;
import com.ahzx.hndctservice.entity.Do.FarmerDo;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import com.ahzx.hndctservice.mapper.TNewfarmerMainMapper;
import com.ahzx.hndctservice.service.ITNewfarmerMainService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 新型农业主体信息主Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
@Service
public class TNewfarmerMainServiceImpl extends ServiceImpl<TNewfarmerMainMapper, TNewfarmerMain> implements ITNewfarmerMainService
{
    @Autowired
    private TNewfarmerMainMapper tNewfarmerMainMapper;

    /**
     * 新增新型农业主体信息主
     * 
     * @param tNewfarmerMain 新型农业主体信息主
     * @return 结果
     */
    @Override
    public int insertTNewfarmerMain(TNewfarmerMain tNewfarmerMain)
    {
        tNewfarmerMain.setCreateTime(DateUtils.getNowDate());
        return tNewfarmerMainMapper.insertTNewfarmerMain(tNewfarmerMain);
    }

    /**
     * 修改新型农业主体信息主
     * 
     * @param tNewfarmerMain 新型农业主体信息主
     * @return 结果
     */
    @Override
    public int updateTNewfarmerMain(TNewfarmerMain tNewfarmerMain)
    {
        tNewfarmerMain.setUpdateTime(DateUtils.getNowDate());
        return tNewfarmerMainMapper.updateTNewfarmerMain(tNewfarmerMain);
    }

    /**
     * 根据地区查询完整新型农业主体信息
     *
     * @param farmerDo 新型农业主体
     * @return 结果
     */
    @Override
    public Object selectFullMsgByTableName(FarmerDo farmerDo) {
        String tableName = farmerDo.getTableName();
        if (tableName.equals("t_newfarmer_hk")){
            return tNewfarmerMainMapper.selectFullMsgHK(farmerDo);
        }else
        if (tableName.equals("t_newfarmer_bt")){
            return tNewfarmerMainMapper.selectFullMsgBT(farmerDo);
        }else
        if (tableName.equals("t_newfarmer_da")){
            return tNewfarmerMainMapper.selectFullMsgDA(farmerDo);
        }else
        if (tableName.equals("t_newfarmer_ld")){
            return tNewfarmerMainMapper.selectFullMsgLD(farmerDo);
        }else
        if (tableName.equals("t_newfarmer_qz")){
            return tNewfarmerMainMapper.selectFullMsgQZ(farmerDo);
        }else
        if (tableName.equals("t_newfarmer_sy")){
            return tNewfarmerMainMapper.selectFullMsgSY(farmerDo);
        }else
        if (tableName.equals("t_newfarmer_wc")){
            return tNewfarmerMainMapper.selectFullMsgWC(farmerDo);
        }
        if (tableName.equals("t_newfarmer_wzs")){
            return tNewfarmerMainMapper.selectFullMsgWZS(farmerDo);
        }else {
            return null;
        }
    }

}
