package com.ahzx.hndctservice.service.his;

import com.ahzx.hndctservice.common.utils.DateUtils;
import com.ahzx.hndctservice.entity.Do.FarmerDo;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import com.ahzx.hndctservice.entity.mainFarmerEntity.his.TFarmerMainHis;
import com.ahzx.hndctservice.mapper.TFarmerMainMapper;
import com.ahzx.hndctservice.mapper.his.TFarmerMainHisMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 农户信息主Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
@Service
public class TFarmerMainHisServiceImpl extends ServiceImpl<TFarmerMainHisMapper, TFarmerMainHis> implements ITFarmerMainHisService
{
    @Autowired
    private TFarmerMainHisMapper tFarmerMainMapper;

    /**
     * 新增农户信息主
     * @param tFarmerMain 农户信息主
     * @return 结果
     */
    @Override
    public int insertTFarmerMain(TFarmerMainHis tFarmerMain)
    {
        tFarmerMain.setCreateTime(DateUtils.getNowDate());
        return tFarmerMainMapper.insertTFarmerMain(tFarmerMain);
    }

    /**
     * 修改农户信息主
     * @param tFarmerMain 农户信息主
     * @return 结果
     */
    @Override
    public int updateTFarmerMain(TFarmerMainHis tFarmerMain)
    {
        tFarmerMain.setUpdateTime(DateUtils.getNowDate());
        return tFarmerMainMapper.updateById(tFarmerMain);
    }

    /**
     * 根据地区查询完整农户信息
     * @param farmerDo 农户信息主
     * @return 结果
     */
    @Override
    public Object selectFullMsgByTableName(FarmerDo farmerDo) {
        String tableName = farmerDo.getTableName();
        if (tableName.equals("t_farmer_bt")){
            return tFarmerMainMapper.selectFullMsgBT(farmerDo);
        }else
        if (tableName.equals("t_farmer_da")){
            return tFarmerMainMapper.selectFullMsgDA(farmerDo);
        }else
        if (tableName.equals("t_farmer_hk")){
            return tFarmerMainMapper.selectFullMsgHK(farmerDo);
        }else
        if (tableName.equals("t_farmer_qz")){
            return tFarmerMainMapper.selectFullMsgQZ(farmerDo);
        }else
        if (tableName.equals("t_farmer_sy")){
            return tFarmerMainMapper.selectFullMsgSY(farmerDo);
        }else
        if (tableName.equals("t_farmer_wc")){
            return tFarmerMainMapper.selectFullMsgWC(farmerDo);
        }else
        if (tableName.equals("t_farmer_wzs")){
            return tFarmerMainMapper.selectFullMsgWZS(farmerDo);
        }else {
            return null;
        }
    }

}