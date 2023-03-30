package com.ahzx.hndctservice.generator.newFarmer.service.impl;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerHk;
import com.ahzx.hndctservice.generator.newFarmer.mapper.TNewfarmerHkMapper;
import com.ahzx.hndctservice.generator.newFarmer.service.ITNewfarmerHkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Service
public class TNewfarmerHkServiceImpl extends ServiceImpl<TNewfarmerHkMapper, TNewfarmerHk> implements ITNewfarmerHkService
{
    @Autowired
    private TNewfarmerHkMapper tNewfarmerHkMapper;

    /**
     * 查询海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县
     * 
     * @param id 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县主键
     * @return 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县
     */
    @Override
    public TNewfarmerHk selectTNewfarmerHkById(Long id)
    {
        return tNewfarmerHkMapper.selectTNewfarmerHkById(id);
    }

    /**
     * 查询海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县列表
     * 
     * @param tNewfarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县
     * @return 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县
     */
    @Override
    public List<TNewfarmerHk> selectTNewfarmerHkList(TNewfarmerHk tNewfarmerHk)
    {
        return tNewfarmerHkMapper.selectTNewfarmerHkList(tNewfarmerHk);
    }

    /**
     * 新增海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县
     * 
     * @param tNewfarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县
     * @return 结果
     */
    @Override
    public int insertTNewfarmerHk(TNewfarmerHk tNewfarmerHk)
    {
        return tNewfarmerHkMapper.insertTNewfarmerHk(tNewfarmerHk);
    }

    /**
     * 修改海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县
     * 
     * @param tNewfarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县
     * @return 结果
     */
    @Override
    public int updateTNewfarmerHk(TNewfarmerHk tNewfarmerHk)
    {
        return tNewfarmerHkMapper.updateTNewfarmerHk(tNewfarmerHk);
    }

 
}
