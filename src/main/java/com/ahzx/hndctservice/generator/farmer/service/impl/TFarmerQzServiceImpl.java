package com.ahzx.hndctservice.generator.farmer.service.impl;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerQz;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import com.ahzx.hndctservice.generator.farmer.mapper.TFarmerQzMapper;
import com.ahzx.hndctservice.generator.farmer.service.ITFarmerQzService;
import com.ahzx.hndctservice.mapper.TFarmerMainMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 琼中Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Service
public class TFarmerQzServiceImpl extends ServiceImpl<TFarmerQzMapper, TFarmerQz> implements ITFarmerQzService
{
    @Autowired
    private TFarmerQzMapper tFarmerQzMapper;

    /**
     * 查询琼中
     * 
     * @param id 琼中主键
     * @return 琼中
     */
    @Override
    public TFarmerQz selectTFarmerQzById(Long id)
    {
        return tFarmerQzMapper.selectTFarmerQzById(id);
    }

    /**
     * 查询琼中列表
     * 
     * @param tFarmerQz 琼中
     * @return 琼中
     */
    @Override
    public List<TFarmerQz> selectTFarmerQzList(TFarmerQz tFarmerQz)
    {
        return tFarmerQzMapper.selectTFarmerQzList(tFarmerQz);
    }

    /**
     * 新增琼中
     * 
     * @param tFarmerQz 琼中
     * @return 结果
     */
    @Override
    public int insertTFarmerQz(TFarmerQz tFarmerQz)
    {
        return tFarmerQzMapper.insertTFarmerQz(tFarmerQz);
    }

    /**
     * 修改琼中
     * 
     * @param tFarmerQz 琼中
     * @return 结果
     */
    @Override
    public int updateTFarmerQz(TFarmerQz tFarmerQz)
    {
        return tFarmerQzMapper.updateTFarmerQz(tFarmerQz);
    }

}
