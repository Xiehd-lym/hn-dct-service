package com.ahzx.hndctservice.generator.newFarmer.service;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerSy;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 三亚 						Service接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public interface ITNewfarmerSyService  extends IService<TNewfarmerSy>
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
