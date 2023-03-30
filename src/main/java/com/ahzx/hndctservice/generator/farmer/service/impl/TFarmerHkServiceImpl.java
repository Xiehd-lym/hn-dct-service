package com.ahzx.hndctservice.generator.farmer.service.impl;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerHk;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import com.ahzx.hndctservice.generator.farmer.mapper.TFarmerHkMapper;
import com.ahzx.hndctservice.generator.farmer.service.ITFarmerHkService;
import com.ahzx.hndctservice.mapper.TFarmerMainMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Service
public class TFarmerHkServiceImpl extends ServiceImpl<TFarmerHkMapper, TFarmerHk> implements ITFarmerHkService
{
    @Autowired
    private TFarmerHkMapper tFarmerHkMapper;

    /**
     * 查询海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * 
     * @param id 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海主键
     * @return 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     */
    @Override
    public TFarmerHk selectTFarmerHkById(Long id)
    {
        return tFarmerHkMapper.selectTFarmerHkById(id);
    }

    /**
     * 查询海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海列表
     * 
     * @param tFarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * @return 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     */
    @Override
    public List<TFarmerHk> selectTFarmerHkList(TFarmerHk tFarmerHk)
    {
        return tFarmerHkMapper.selectTFarmerHkList(tFarmerHk);
    }

    /**
     * 新增海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * 
     * @param tFarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * @return 结果
     */
    @Override
    public int insertTFarmerHk(TFarmerHk tFarmerHk)
    {
        return tFarmerHkMapper.insertTFarmerHk(tFarmerHk);
    }

    /**
     * 修改海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * 
     * @param tFarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * @return 结果
     */
    @Override
    public int updateTFarmerHk(TFarmerHk tFarmerHk)
    {
        return tFarmerHkMapper.updateTFarmerHk(tFarmerHk);
    }

}
