package com.ahzx.hndctservice.generator.farmer.service;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerSy;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 三亚Service接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public interface ITFarmerSyService extends IService<TFarmerSy>
{
    /**
     * 查询三亚
     * 
     * @param id 三亚主键
     * @return 三亚
     */
    public TFarmerSy selectTFarmerSyById(Long id);

    /**
     * 查询三亚列表
     * 
     * @param tFarmerSy 三亚
     * @return 三亚集合
     */
    public List<TFarmerSy> selectTFarmerSyList(TFarmerSy tFarmerSy);

    /**
     * 新增三亚
     * 
     * @param tFarmerSy 三亚
     * @return 结果
     */
    public int insertTFarmerSy(TFarmerSy tFarmerSy);

    /**
     * 修改三亚
     * 
     * @param tFarmerSy 三亚
     * @return 结果
     */
    public int updateTFarmerSy(TFarmerSy tFarmerSy);

}
