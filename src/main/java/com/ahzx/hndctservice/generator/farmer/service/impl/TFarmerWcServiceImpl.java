package com.ahzx.hndctservice.generator.farmer.service.impl;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerWc;
import com.ahzx.hndctservice.generator.farmer.mapper.TFarmerWcMapper;
import com.ahzx.hndctservice.generator.farmer.service.ITFarmerWcService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文昌Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Service
public class TFarmerWcServiceImpl extends ServiceImpl<TFarmerWcMapper, TFarmerWc> implements ITFarmerWcService
{
    @Autowired
    private TFarmerWcMapper tFarmerWcMapper;

    /**
     * 查询文昌
     * 
     * @param id 文昌主键
     * @return 文昌
     */
    @Override
    public TFarmerWc selectTFarmerWcById(Long id)
    {
        return tFarmerWcMapper.selectTFarmerWcById(id);
    }

    /**
     * 查询文昌列表
     * 
     * @param tFarmerWc 文昌
     * @return 文昌
     */
    @Override
    public List<TFarmerWc> selectTFarmerWcList(TFarmerWc tFarmerWc)
    {
        return tFarmerWcMapper.selectTFarmerWcList(tFarmerWc);
    }

    /**
     * 新增文昌
     * 
     * @param tFarmerWc 文昌
     * @return 结果
     */
    @Override
    public int insertTFarmerWc(TFarmerWc tFarmerWc)
    {
        return tFarmerWcMapper.insertTFarmerWc(tFarmerWc);
    }

    /**
     * 修改文昌
     * 
     * @param tFarmerWc 文昌
     * @return 结果
     */
    @Override
    public int updateTFarmerWc(TFarmerWc tFarmerWc)
    {
        return tFarmerWcMapper.updateTFarmerWc(tFarmerWc);
    }

}
