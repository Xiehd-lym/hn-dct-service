package com.ahzx.hndctservice.controller.his.newFarmerMapper;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerBt;
import com.ahzx.hndctservice.entity.mainFarmerEntity.his.newFarmer.TNewfarmerBtHis;
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
public interface TNewfarmerBtHisMapper extends BaseMapper<TNewfarmerBtHis>
{
    /**
     * 查询保亭					
     * 
     * @param id 保亭					主键
     * @return 保亭					
     */
    public TNewfarmerBtHis selectTNewfarmerBtById(Long id);

    /**
     * 查询保亭					列表
     * 
     * @param tNewfarmerBt 保亭					
     * @return 保亭					集合
     */
    public List<TNewfarmerBt> selectTNewfarmerBtList(TNewfarmerBtHis tNewfarmerBt);

    /**
     * 新增保亭					
     * 
     * @param tNewfarmerBt 保亭					
     * @return 结果
     */
    public int insertTNewfarmerBt(TNewfarmerBtHis tNewfarmerBt);

    /**
     * 修改保亭					
     * 
     * @param tNewfarmerBt 保亭					
     * @return 结果
     */
    public int updateTNewfarmerBt(TNewfarmerBtHis tNewfarmerBt);

}
