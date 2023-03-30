package com.ahzx.hndctservice.generator.newFarmer.service.impl;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerWc;
import com.ahzx.hndctservice.generator.newFarmer.mapper.TNewfarmerWcMapper;
import com.ahzx.hndctservice.generator.newFarmer.service.ITNewfarmerWcService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文昌 						Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Service
public class TNewfarmerWcServiceImpl extends ServiceImpl<TNewfarmerWcMapper, TNewfarmerWc> implements ITNewfarmerWcService
{
    @Autowired
    private TNewfarmerWcMapper tNewfarmerWcMapper;

    /**
     * 查询文昌 						
     * 
     * @param id 文昌 						主键
     * @return 文昌 						
     */
    @Override
    public TNewfarmerWc selectTNewfarmerWcById(Long id)
    {
        return tNewfarmerWcMapper.selectTNewfarmerWcById(id);
    }

    /**
     * 查询文昌 						列表
     * 
     * @param tNewfarmerWc 文昌 						
     * @return 文昌 						
     */
    @Override
    public List<TNewfarmerWc> selectTNewfarmerWcList(TNewfarmerWc tNewfarmerWc)
    {
        return tNewfarmerWcMapper.selectTNewfarmerWcList(tNewfarmerWc);
    }

    /**
     * 新增文昌 						
     * 
     * @param tNewfarmerWc 文昌 						
     * @return 结果
     */
    @Override
    public int insertTNewfarmerWc(TNewfarmerWc tNewfarmerWc)
    {
        return tNewfarmerWcMapper.insertTNewfarmerWc(tNewfarmerWc);
    }

    /**
     * 修改文昌 						
     * 
     * @param tNewfarmerWc 文昌 						
     * @return 结果
     */
    @Override
    public int updateTNewfarmerWc(TNewfarmerWc tNewfarmerWc)
    {
        return tNewfarmerWcMapper.updateTNewfarmerWc(tNewfarmerWc);
    }

}
