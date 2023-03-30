package com.ahzx.hndctservice.generator.newFarmer.service;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerWc;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 文昌 						Service接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public interface ITNewfarmerWcService  extends IService<TNewfarmerWc>
{
    /**
     * 查询文昌 						
     * 
     * @param id 文昌 						主键
     * @return 文昌 						
     */
    public TNewfarmerWc selectTNewfarmerWcById(Long id);

    /**
     * 查询文昌 						列表
     * 
     * @param tNewfarmerWc 文昌 						
     * @return 文昌 						集合
     */
    public List<TNewfarmerWc> selectTNewfarmerWcList(TNewfarmerWc tNewfarmerWc);

    /**
     * 新增文昌 						
     * 
     * @param tNewfarmerWc 文昌 						
     * @return 结果
     */
    public int insertTNewfarmerWc(TNewfarmerWc tNewfarmerWc);

    /**
     * 修改文昌 						
     * 
     * @param tNewfarmerWc 文昌 						
     * @return 结果
     */
    public int updateTNewfarmerWc(TNewfarmerWc tNewfarmerWc);

}
