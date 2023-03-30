package com.ahzx.hndctservice.generator.newFarmer.service.impl;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerBt;
import com.ahzx.hndctservice.generator.newFarmer.mapper.TNewfarmerBtMapper;
import com.ahzx.hndctservice.generator.newFarmer.service.ITNewfarmerBtService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 保亭					Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Service
public class TNewfarmerBtServiceImpl extends ServiceImpl<TNewfarmerBtMapper, TNewfarmerBt> implements ITNewfarmerBtService
{
    @Autowired
    private TNewfarmerBtMapper tNewfarmerBtMapper;

    /**
     * 查询保亭					
     * 
     * @param id 保亭					主键
     * @return 保亭					
     */
    @Override
    public TNewfarmerBt selectTNewfarmerBtById(Long id)
    {
        return tNewfarmerBtMapper.selectTNewfarmerBtById(id);
    }

    /**
     * 查询保亭					列表
     * 
     * @param tNewfarmerBt 保亭					
     * @return 保亭					
     */
    @Override
    public List<TNewfarmerBt> selectTNewfarmerBtList(TNewfarmerBt tNewfarmerBt)
    {
        return tNewfarmerBtMapper.selectTNewfarmerBtList(tNewfarmerBt);
    }

    /**
     * 新增保亭					
     * 
     * @param tNewfarmerBt 保亭					
     * @return 结果
     */
    @Override
    public int insertTNewfarmerBt(TNewfarmerBt tNewfarmerBt)
    {
        return tNewfarmerBtMapper.insertTNewfarmerBt(tNewfarmerBt);
    }

    /**
     * 修改保亭					
     * 
     * @param tNewfarmerBt 保亭					
     * @return 结果
     */
    @Override
    public int updateTNewfarmerBt(TNewfarmerBt tNewfarmerBt)
    {
        return tNewfarmerBtMapper.updateTNewfarmerBt(tNewfarmerBt);
    }

}
