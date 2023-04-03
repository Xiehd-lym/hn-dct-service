package com.ahzx.hndctservice.controller.his.farmerMapper;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerQz;
import com.ahzx.hndctservice.entity.mainFarmerEntity.his.farmer.TFarmerQzHis;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 琼中Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Mapper
public interface TFarmerQzHisMapper extends BaseMapper<TFarmerQzHis>
{
    /**
     * 查询琼中
     * 
     * @param id 琼中主键
     * @return 琼中
     */
    public TFarmerQzHis selectTFarmerQzById(Long id);

    /**
     * 查询琼中列表
     * 
     * @param tFarmerQz 琼中
     * @return 琼中集合
     */
    public List<TFarmerQz> selectTFarmerQzList(TFarmerQzHis tFarmerQz);

    /**
     * 新增琼中
     * 
     * @param tFarmerQz 琼中
     * @return 结果
     */
    public int insertTFarmerQz(TFarmerQzHis tFarmerQz);

    /**
     * 修改琼中
     * 
     * @param tFarmerQz 琼中
     * @return 结果
     */
    public int updateTFarmerQz(TFarmerQzHis tFarmerQz);


}
