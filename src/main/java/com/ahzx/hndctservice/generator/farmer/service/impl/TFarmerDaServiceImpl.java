package com.ahzx.hndctservice.generator.farmer.service.impl;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerDa;
import com.ahzx.hndctservice.generator.farmer.mapper.TFarmerDaMapper;
import com.ahzx.hndctservice.generator.farmer.service.ITFarmerDaService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 定安、澄迈Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Service
public class TFarmerDaServiceImpl extends ServiceImpl<TFarmerDaMapper, TFarmerDa> implements ITFarmerDaService
{
    @Autowired
    private TFarmerDaMapper tFarmerDaMapper;

    /**
     * 查询定安、澄迈
     * 
     * @param id 定安、澄迈主键
     * @return 定安、澄迈
     */
    @Override
    public TFarmerDa selectTFarmerDaById(Long id)
    {
        return tFarmerDaMapper.selectTFarmerDaById(id);
    }

    /**
     * 查询定安、澄迈列表
     * 
     * @param tFarmerDa 定安、澄迈
     * @return 定安、澄迈
     */
    @Override
    public List<TFarmerDa> selectTFarmerDaList(TFarmerDa tFarmerDa)
    {
        return tFarmerDaMapper.selectTFarmerDaList(tFarmerDa);
    }

    /**
     * 新增定安、澄迈
     * 
     * @param tFarmerDa 定安、澄迈
     * @return 结果
     */
    @Override
    public int insertTFarmerDa(TFarmerDa tFarmerDa)
    {
        return tFarmerDaMapper.insertTFarmerDa(tFarmerDa);
    }

    /**
     * 修改定安、澄迈
     * 
     * @param tFarmerDa 定安、澄迈
     * @return 结果
     */
    @Override
    public int updateTFarmerDa(TFarmerDa tFarmerDa)
    {
        return tFarmerDaMapper.updateTFarmerDa(tFarmerDa);
    }

}
