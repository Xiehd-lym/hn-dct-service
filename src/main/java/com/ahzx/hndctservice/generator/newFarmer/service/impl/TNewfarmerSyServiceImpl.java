package com.ahzx.hndctservice.generator.newFarmer.service.impl;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerSy;
import com.ahzx.hndctservice.generator.newFarmer.mapper.TNewfarmerSyMapper;
import com.ahzx.hndctservice.generator.newFarmer.service.ITNewfarmerSyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 三亚 						Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Service
public class TNewfarmerSyServiceImpl extends ServiceImpl<TNewfarmerSyMapper, TNewfarmerSy> implements ITNewfarmerSyService
{
    @Autowired
    private TNewfarmerSyMapper tNewfarmerSyMapper;

    /**
     * 查询三亚 						
     * 
     * @param id 三亚 						主键
     * @return 三亚 						
     */
    @Override
    public TNewfarmerSy selectTNewfarmerSyById(Long id)
    {
        return tNewfarmerSyMapper.selectTNewfarmerSyById(id);
    }

    /**
     * 查询三亚 						列表
     * 
     * @param tNewfarmerSy 三亚 						
     * @return 三亚 						
     */
    @Override
    public List<TNewfarmerSy> selectTNewfarmerSyList(TNewfarmerSy tNewfarmerSy)
    {
        return tNewfarmerSyMapper.selectTNewfarmerSyList(tNewfarmerSy);
    }

    /**
     * 新增三亚 						
     * 
     * @param tNewfarmerSy 三亚 						
     * @return 结果
     */
    @Override
    public int insertTNewfarmerSy(TNewfarmerSy tNewfarmerSy)
    {
        return tNewfarmerSyMapper.insertTNewfarmerSy(tNewfarmerSy);
    }

    /**
     * 修改三亚 						
     * 
     * @param tNewfarmerSy 三亚 						
     * @return 结果
     */
    @Override
    public int updateTNewfarmerSy(TNewfarmerSy tNewfarmerSy)
    {
        return tNewfarmerSyMapper.updateTNewfarmerSy(tNewfarmerSy);
    }

}
