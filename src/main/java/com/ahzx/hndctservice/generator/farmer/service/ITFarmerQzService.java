package com.ahzx.hndctservice.generator.farmer.service;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerQz;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 琼中Service接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public interface ITFarmerQzService extends IService<TFarmerQz>
{
    /**
     * 查询琼中
     * 
     * @param id 琼中主键
     * @return 琼中
     */
    public TFarmerQz selectTFarmerQzById(Long id);

    /**
     * 查询琼中列表
     * 
     * @param tFarmerQz 琼中
     * @return 琼中集合
     */
    public List<TFarmerQz> selectTFarmerQzList(TFarmerQz tFarmerQz);

    /**
     * 新增琼中
     * 
     * @param tFarmerQz 琼中
     * @return 结果
     */
    public int insertTFarmerQz(TFarmerQz tFarmerQz);

    /**
     * 修改琼中
     * 
     * @param tFarmerQz 琼中
     * @return 结果
     */
    public int updateTFarmerQz(TFarmerQz tFarmerQz);

}
