package com.ahzx.hndctservice.generator.farmer.service.impl;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerSy;
import com.ahzx.hndctservice.generator.farmer.mapper.TFarmerSyMapper;
import com.ahzx.hndctservice.generator.farmer.service.ITFarmerSyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 三亚Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Service
public class TFarmerSyServiceImpl extends ServiceImpl<TFarmerSyMapper, TFarmerSy> implements ITFarmerSyService
{
    @Autowired
    private TFarmerSyMapper tFarmerSyMapper;

    /**
     * 查询三亚
     * 
     * @param id 三亚主键
     * @return 三亚
     */
    @Override
    public TFarmerSy selectTFarmerSyById(Long id)
    {
        return tFarmerSyMapper.selectTFarmerSyById(id);
    }

    /**
     * 查询三亚列表
     * 
     * @param tFarmerSy 三亚
     * @return 三亚
     */
    @Override
    public List<TFarmerSy> selectTFarmerSyList(TFarmerSy tFarmerSy)
    {
        return tFarmerSyMapper.selectTFarmerSyList(tFarmerSy);
    }

    /**
     * 新增三亚
     * 
     * @param tFarmerSy 三亚
     * @return 结果
     */
    @Override
    public int insertTFarmerSy(TFarmerSy tFarmerSy)
    {
        return tFarmerSyMapper.insertTFarmerSy(tFarmerSy);
    }

    /**
     * 修改三亚
     * 
     * @param tFarmerSy 三亚
     * @return 结果
     */
    @Override
    public int updateTFarmerSy(TFarmerSy tFarmerSy)
    {
        return tFarmerSyMapper.updateTFarmerSy(tFarmerSy);
    }

}
