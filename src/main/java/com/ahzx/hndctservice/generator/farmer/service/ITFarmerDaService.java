package com.ahzx.hndctservice.generator.farmer.service;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerDa;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 定安、澄迈Service接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public interface ITFarmerDaService extends IService<TFarmerDa>
{
    /**
     * 查询定安、澄迈
     * 
     * @param id 定安、澄迈主键
     * @return 定安、澄迈
     */
    public TFarmerDa selectTFarmerDaById(Long id);

    /**
     * 查询定安、澄迈列表
     * 
     * @param tFarmerDa 定安、澄迈
     * @return 定安、澄迈集合
     */
    public List<TFarmerDa> selectTFarmerDaList(TFarmerDa tFarmerDa);

    /**
     * 新增定安、澄迈
     * 
     * @param tFarmerDa 定安、澄迈
     * @return 结果
     */
    public int insertTFarmerDa(TFarmerDa tFarmerDa);

    /**
     * 修改定安、澄迈
     * 
     * @param tFarmerDa 定安、澄迈
     * @return 结果
     */
    public int updateTFarmerDa(TFarmerDa tFarmerDa);

}
