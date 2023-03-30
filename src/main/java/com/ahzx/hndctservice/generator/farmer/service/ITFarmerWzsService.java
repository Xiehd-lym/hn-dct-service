package com.ahzx.hndctservice.generator.farmer.service;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerWzs;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 五指山、乐东、屯昌Service接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public interface ITFarmerWzsService extends IService<TFarmerWzs>
{
    /**
     * 查询五指山、乐东、屯昌
     * 
     * @param id 五指山、乐东、屯昌主键
     * @return 五指山、乐东、屯昌
     */
    public TFarmerWzs selectTFarmerWzsById(Long id);

    /**
     * 查询五指山、乐东、屯昌列表
     * 
     * @param tFarmerWzs 五指山、乐东、屯昌
     * @return 五指山、乐东、屯昌集合
     */
    public List<TFarmerWzs> selectTFarmerWzsList(TFarmerWzs tFarmerWzs);

    /**
     * 新增五指山、乐东、屯昌
     * 
     * @param tFarmerWzs 五指山、乐东、屯昌
     * @return 结果
     */
    public int insertTFarmerWzs(TFarmerWzs tFarmerWzs);

    /**
     * 修改五指山、乐东、屯昌
     * 
     * @param tFarmerWzs 五指山、乐东、屯昌
     * @return 结果
     */
    public int updateTFarmerWzs(TFarmerWzs tFarmerWzs);

}
