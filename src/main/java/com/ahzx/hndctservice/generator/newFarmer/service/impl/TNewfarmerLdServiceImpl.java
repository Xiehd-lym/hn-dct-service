package com.ahzx.hndctservice.generator.newFarmer.service.impl;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerLd;
import com.ahzx.hndctservice.generator.newFarmer.mapper.TNewfarmerLdMapper;
import com.ahzx.hndctservice.generator.newFarmer.service.ITNewfarmerLdService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 乐东 						Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Service
public class TNewfarmerLdServiceImpl extends ServiceImpl<TNewfarmerLdMapper, TNewfarmerLd>  implements ITNewfarmerLdService
{
    @Autowired
    private TNewfarmerLdMapper tNewfarmerLdMapper;

    /**
     * 查询乐东 						
     * 
     * @param id 乐东 						主键
     * @return 乐东 						
     */
    @Override
    public TNewfarmerLd selectTNewfarmerLdById(Long id)
    {
        return tNewfarmerLdMapper.selectTNewfarmerLdById(id);
    }

    /**
     * 查询乐东 						列表
     * 
     * @param tNewfarmerLd 乐东 						
     * @return 乐东 						
     */
    @Override
    public List<TNewfarmerLd> selectTNewfarmerLdList(TNewfarmerLd tNewfarmerLd)
    {
        return tNewfarmerLdMapper.selectTNewfarmerLdList(tNewfarmerLd);
    }

    /**
     * 新增乐东 						
     * 
     * @param tNewfarmerLd 乐东 						
     * @return 结果
     */
    @Override
    public int insertTNewfarmerLd(TNewfarmerLd tNewfarmerLd)
    {
        return tNewfarmerLdMapper.insertTNewfarmerLd(tNewfarmerLd);
    }

    /**
     * 修改乐东 						
     * 
     * @param tNewfarmerLd 乐东 						
     * @return 结果
     */
    @Override
    public int updateTNewfarmerLd(TNewfarmerLd tNewfarmerLd)
    {
        return tNewfarmerLdMapper.updateTNewfarmerLd(tNewfarmerLd);
    }

}
