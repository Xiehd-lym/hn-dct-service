package com.ahzx.hndctservice.controller.his.farmerMapper;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerBt;
import com.ahzx.hndctservice.entity.mainFarmerEntity.his.farmer.TFarmerHkHis;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 保亭Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Mapper
public interface TFarmerBtHisMapper extends BaseMapper<TFarmerHkHis>
{
    /**
     * 查询保亭
     * 
     * @param id 保亭主键
     * @return 保亭
     */
    public TFarmerBt selectTFarmerBtById(Long id);

    /**
     * 查询保亭列表
     * 
     * @param tFarmerBt 保亭
     * @return 保亭集合
     */
    public List<TFarmerBt> selectTFarmerBtList(TFarmerHkHis tFarmerBt);

    /**
     * 新增保亭
     * 
     * @param tFarmerBt 保亭
     * @return 结果
     */
    public int insertTFarmerBt(TFarmerHkHis tFarmerBt);

    /**
     * 修改保亭
     * 
     * @param tFarmerBt 保亭
     * @return 结果
     */
    public int updateTFarmerBt(TFarmerHkHis tFarmerBt);

}
