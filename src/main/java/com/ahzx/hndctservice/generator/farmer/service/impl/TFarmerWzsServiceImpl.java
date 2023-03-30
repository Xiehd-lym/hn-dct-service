package com.ahzx.hndctservice.generator.farmer.service.impl;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerWzs;
import com.ahzx.hndctservice.generator.farmer.mapper.TFarmerWzsMapper;
import com.ahzx.hndctservice.generator.farmer.service.ITFarmerWzsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 五指山、乐东、屯昌Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Service
public class TFarmerWzsServiceImpl extends ServiceImpl<TFarmerWzsMapper, TFarmerWzs>  implements ITFarmerWzsService
{
    @Autowired
    private TFarmerWzsMapper tFarmerWzsMapper;

    /**
     * 查询五指山、乐东、屯昌
     * 
     * @param id 五指山、乐东、屯昌主键
     * @return 五指山、乐东、屯昌
     */
    @Override
    public TFarmerWzs selectTFarmerWzsById(Long id)
    {
        return tFarmerWzsMapper.selectTFarmerWzsById(id);
    }

    /**
     * 查询五指山、乐东、屯昌列表
     * 
     * @param tFarmerWzs 五指山、乐东、屯昌
     * @return 五指山、乐东、屯昌
     */
    @Override
    public List<TFarmerWzs> selectTFarmerWzsList(TFarmerWzs tFarmerWzs)
    {
        return tFarmerWzsMapper.selectTFarmerWzsList(tFarmerWzs);
    }

    /**
     * 新增五指山、乐东、屯昌
     * 
     * @param tFarmerWzs 五指山、乐东、屯昌
     * @return 结果
     */
    @Override
    public int insertTFarmerWzs(TFarmerWzs tFarmerWzs)
    {
        return tFarmerWzsMapper.insertTFarmerWzs(tFarmerWzs);
    }

    /**
     * 修改五指山、乐东、屯昌
     * 
     * @param tFarmerWzs 五指山、乐东、屯昌
     * @return 结果
     */
    @Override
    public int updateTFarmerWzs(TFarmerWzs tFarmerWzs)
    {
        return tFarmerWzsMapper.updateTFarmerWzs(tFarmerWzs);
    }

}
