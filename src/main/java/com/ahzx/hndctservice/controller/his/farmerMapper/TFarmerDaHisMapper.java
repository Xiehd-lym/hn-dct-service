package com.ahzx.hndctservice.controller.his.farmerMapper;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerDa;
import com.ahzx.hndctservice.entity.mainFarmerEntity.his.farmer.TFarmerDaHis;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 定安、澄迈Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Mapper
public interface TFarmerDaHisMapper extends BaseMapper<TFarmerDaHis>
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
    public List<TFarmerDa> selectTFarmerDaList(TFarmerDaHis tFarmerDa);

    /**
     * 新增定安、澄迈
     * 
     * @param tFarmerDa 定安、澄迈
     * @return 结果
     */
    public int insertTFarmerDa(TFarmerDaHis tFarmerDa);

    /**
     * 修改定安、澄迈
     * 
     * @param tFarmerDa 定安、澄迈
     * @return 结果
     */
    public int updateTFarmerDa(TFarmerDaHis tFarmerDa);

}
