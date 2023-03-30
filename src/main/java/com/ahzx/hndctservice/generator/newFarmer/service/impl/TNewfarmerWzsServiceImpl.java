package com.ahzx.hndctservice.generator.newFarmer.service.impl;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerWzs;
import com.ahzx.hndctservice.generator.newFarmer.mapper.TNewfarmerWzsMapper;
import com.ahzx.hndctservice.generator.newFarmer.service.ITNewfarmerWzsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 五指山Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Service
public class TNewfarmerWzsServiceImpl extends ServiceImpl<TNewfarmerWzsMapper, TNewfarmerWzs> implements ITNewfarmerWzsService
{
    @Autowired
    private TNewfarmerWzsMapper tNewfarmerWzsMapper;

    /**
     * 查询五指山
     * 
     * @param id 五指山主键
     * @return 五指山
     */
    @Override
    public TNewfarmerWzs selectTNewfarmerWzsById(Long id)
    {
        return tNewfarmerWzsMapper.selectTNewfarmerWzsById(id);
    }

    /**
     * 查询五指山列表
     * 
     * @param tNewfarmerWzs 五指山
     * @return 五指山
     */
    @Override
    public List<TNewfarmerWzs> selectTNewfarmerWzsList(TNewfarmerWzs tNewfarmerWzs)
    {
        return tNewfarmerWzsMapper.selectTNewfarmerWzsList(tNewfarmerWzs);
    }

    /**
     * 新增五指山
     * 
     * @param tNewfarmerWzs 五指山
     * @return 结果
     */
    @Override
    public int insertTNewfarmerWzs(TNewfarmerWzs tNewfarmerWzs)
    {
        return tNewfarmerWzsMapper.insertTNewfarmerWzs(tNewfarmerWzs);
    }

    /**
     * 修改五指山
     * 
     * @param tNewfarmerWzs 五指山
     * @return 结果
     */
    @Override
    public int updateTNewfarmerWzs(TNewfarmerWzs tNewfarmerWzs)
    {
        return tNewfarmerWzsMapper.updateTNewfarmerWzs(tNewfarmerWzs);
    }

}
