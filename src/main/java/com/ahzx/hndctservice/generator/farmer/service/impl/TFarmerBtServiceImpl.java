package com.ahzx.hndctservice.generator.farmer.service.impl;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerBt;
import com.ahzx.hndctservice.generator.farmer.mapper.TFarmerBtMapper;
import com.ahzx.hndctservice.generator.farmer.service.ITFarmerBtService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 保亭Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Service
public class TFarmerBtServiceImpl extends ServiceImpl<TFarmerBtMapper, TFarmerBt>  implements ITFarmerBtService
{
    @Autowired
    private TFarmerBtMapper tFarmerBtMapper;

    /**
     * 查询保亭
     * 
     * @param id 保亭主键
     * @return 保亭
     */
    @Override
    public TFarmerBt selectTFarmerBtById(Long id)
    {
        return tFarmerBtMapper.selectTFarmerBtById(id);
    }

    /**
     * 查询保亭列表
     * 
     * @param tFarmerBt 保亭
     * @return 保亭
     */
    @Override
    public List<TFarmerBt> selectTFarmerBtList(TFarmerBt tFarmerBt)
    {
        return tFarmerBtMapper.selectTFarmerBtList(tFarmerBt);
    }

    /**
     * 新增保亭
     * 
     * @param tFarmerBt 保亭
     * @return 结果
     */
    @Override
    public int insertTFarmerBt(TFarmerBt tFarmerBt)
    {
        return tFarmerBtMapper.insertTFarmerBt(tFarmerBt);
    }

    /**
     * 修改保亭
     * 
     * @param tFarmerBt 保亭
     * @return 结果
     */
    @Override
    public int updateTFarmerBt(TFarmerBt tFarmerBt)
    {
        return tFarmerBtMapper.updateTFarmerBt(tFarmerBt);
    }

}
