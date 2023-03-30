package com.ahzx.hndctservice.generator.newFarmer.service;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerBt;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 保亭					Service接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public interface ITNewfarmerBtService  extends IService<TNewfarmerBt>
{
    /**
     * 查询保亭					
     * 
     * @param id 保亭					主键
     * @return 保亭					
     */
    public TNewfarmerBt selectTNewfarmerBtById(Long id);

    /**
     * 查询保亭					列表
     * 
     * @param tNewfarmerBt 保亭					
     * @return 保亭					集合
     */
    public List<TNewfarmerBt> selectTNewfarmerBtList(TNewfarmerBt tNewfarmerBt);

    /**
     * 新增保亭					
     * 
     * @param tNewfarmerBt 保亭					
     * @return 结果
     */
    public int insertTNewfarmerBt(TNewfarmerBt tNewfarmerBt);

    /**
     * 修改保亭					
     * 
     * @param tNewfarmerBt 保亭					
     * @return 结果
     */
    public int updateTNewfarmerBt(TNewfarmerBt tNewfarmerBt);

}
