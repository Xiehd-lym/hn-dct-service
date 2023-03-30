package com.ahzx.hndctservice.generator.newFarmer.service.impl;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerDa;
import com.ahzx.hndctservice.generator.newFarmer.mapper.TNewfarmerDaMapper;
import com.ahzx.hndctservice.generator.newFarmer.service.ITNewfarmerDaService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 定安、澄迈						Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Service
public class TNewfarmerDaServiceImpl extends ServiceImpl<TNewfarmerDaMapper, TNewfarmerDa> implements ITNewfarmerDaService
{
    @Autowired
    private TNewfarmerDaMapper tNewfarmerDaMapper;

    /**
     * 查询定安、澄迈						
     * 
     * @param id 定安、澄迈						主键
     * @return 定安、澄迈						
     */
    @Override
    public TNewfarmerDa selectTNewfarmerDaById(Long id)
    {
        return tNewfarmerDaMapper.selectTNewfarmerDaById(id);
    }

    /**
     * 查询定安、澄迈						列表
     * 
     * @param tNewfarmerDa 定安、澄迈						
     * @return 定安、澄迈						
     */
    @Override
    public List<TNewfarmerDa> selectTNewfarmerDaList(TNewfarmerDa tNewfarmerDa)
    {
        return tNewfarmerDaMapper.selectTNewfarmerDaList(tNewfarmerDa);
    }

    /**
     * 新增定安、澄迈						
     * 
     * @param tNewfarmerDa 定安、澄迈						
     * @return 结果
     */
    @Override
    public int insertTNewfarmerDa(TNewfarmerDa tNewfarmerDa)
    {
        return tNewfarmerDaMapper.insertTNewfarmerDa(tNewfarmerDa);
    }

    /**
     * 修改定安、澄迈						
     * 
     * @param tNewfarmerDa 定安、澄迈						
     * @return 结果
     */
    @Override
    public int updateTNewfarmerDa(TNewfarmerDa tNewfarmerDa)
    {
        return tNewfarmerDaMapper.updateTNewfarmerDa(tNewfarmerDa);
    }

}
