package com.ahzx.hndctservice.generator.newFarmer.service;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerWzs;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 五指山Service接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public interface ITNewfarmerWzsService  extends IService<TNewfarmerWzs>
{
    /**
     * 查询五指山
     * 
     * @param id 五指山主键
     * @return 五指山
     */
    public TNewfarmerWzs selectTNewfarmerWzsById(Long id);

    /**
     * 查询五指山列表
     * 
     * @param tNewfarmerWzs 五指山
     * @return 五指山集合
     */
    public List<TNewfarmerWzs> selectTNewfarmerWzsList(TNewfarmerWzs tNewfarmerWzs);

    /**
     * 新增五指山
     * 
     * @param tNewfarmerWzs 五指山
     * @return 结果
     */
    public int insertTNewfarmerWzs(TNewfarmerWzs tNewfarmerWzs);

    /**
     * 修改五指山
     * 
     * @param tNewfarmerWzs 五指山
     * @return 结果
     */
    public int updateTNewfarmerWzs(TNewfarmerWzs tNewfarmerWzs);

}
