package com.ahzx.hndctservice.generator.farmer.service;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerWc;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 文昌Service接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public interface ITFarmerWcService extends IService<TFarmerWc>
{
    /**
     * 查询文昌
     * 
     * @param id 文昌主键
     * @return 文昌
     */
    public TFarmerWc selectTFarmerWcById(Long id);

    /**
     * 查询文昌列表
     * 
     * @param tFarmerWc 文昌
     * @return 文昌集合
     */
    public List<TFarmerWc> selectTFarmerWcList(TFarmerWc tFarmerWc);

    /**
     * 新增文昌
     * 
     * @param tFarmerWc 文昌
     * @return 结果
     */
    public int insertTFarmerWc(TFarmerWc tFarmerWc);

    /**
     * 修改文昌
     * 
     * @param tFarmerWc 文昌
     * @return 结果
     */
    public int updateTFarmerWc(TFarmerWc tFarmerWc);

}
