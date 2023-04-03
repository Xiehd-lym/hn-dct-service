package com.ahzx.hndctservice.controller.his.newFarmerMapper;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerSy;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 三亚 						Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Mapper
public interface TNewfarmerSyHisMapper extends BaseMapper<TNewfarmerSy>
{
    /**
     * 查询三亚 						
     * 
     * @param id 三亚 						主键
     * @return 三亚 						
     */
    public TNewfarmerSy selectTNewfarmerSyById(Long id);

    /**
     * 查询三亚 						列表
     * 
     * @param tNewfarmerSy 三亚 						
     * @return 三亚 						集合
     */
    public List<TNewfarmerSy> selectTNewfarmerSyList(TNewfarmerSy tNewfarmerSy);

    /**
     * 新增三亚 						
     * 
     * @param tNewfarmerSy 三亚 						
     * @return 结果
     */
    public int insertTNewfarmerSy(TNewfarmerSy tNewfarmerSy);

    /**
     * 修改三亚 						
     * 
     * @param tNewfarmerSy 三亚 						
     * @return 结果
     */
    public int updateTNewfarmerSy(TNewfarmerSy tNewfarmerSy);

}
