package com.ahzx.hndctservice.generator.newFarmer.service.impl;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerQz;
import com.ahzx.hndctservice.generator.newFarmer.mapper.TNewfarmerQzMapper;
import com.ahzx.hndctservice.generator.newFarmer.service.ITNewfarmerQzService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 琼中 						Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Service
public class TNewfarmerQzServiceImpl extends ServiceImpl<TNewfarmerQzMapper, TNewfarmerQz> implements ITNewfarmerQzService
{
    @Autowired
    private TNewfarmerQzMapper tNewfarmerQzMapper;

    /**
     * 查询琼中 						
     * 
     * @param id 琼中 						主键
     * @return 琼中 						
     */
    @Override
    public TNewfarmerQz selectTNewfarmerQzById(Long id)
    {
        return tNewfarmerQzMapper.selectTNewfarmerQzById(id);
    }

    /**
     * 查询琼中 						列表
     * 
     * @param tNewfarmerQz 琼中 						
     * @return 琼中 						
     */
    @Override
    public List<TNewfarmerQz> selectTNewfarmerQzList(TNewfarmerQz tNewfarmerQz)
    {
        return tNewfarmerQzMapper.selectTNewfarmerQzList(tNewfarmerQz);
    }

    /**
     * 新增琼中 						
     * 
     * @param tNewfarmerQz 琼中 						
     * @return 结果
     */
    @Override
    public int insertTNewfarmerQz(TNewfarmerQz tNewfarmerQz)
    {
        return tNewfarmerQzMapper.insertTNewfarmerQz(tNewfarmerQz);
    }

    /**
     * 修改琼中 						
     * 
     * @param tNewfarmerQz 琼中 						
     * @return 结果
     */
    @Override
    public int updateTNewfarmerQz(TNewfarmerQz tNewfarmerQz)
    {
        return tNewfarmerQzMapper.updateTNewfarmerQz(tNewfarmerQz);
    }

}
