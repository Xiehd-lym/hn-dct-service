package com.ahzx.hndctservice.generator.newFarmer.service;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerQz;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 琼中 						Service接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public interface ITNewfarmerQzService  extends IService<TNewfarmerQz>
{
    /**
     * 查询琼中 						
     * 
     * @param id 琼中 						主键
     * @return 琼中 						
     */
    public TNewfarmerQz selectTNewfarmerQzById(Long id);

    /**
     * 查询琼中 						列表
     * 
     * @param tNewfarmerQz 琼中 						
     * @return 琼中 						集合
     */
    public List<TNewfarmerQz> selectTNewfarmerQzList(TNewfarmerQz tNewfarmerQz);

    /**
     * 新增琼中 						
     * 
     * @param tNewfarmerQz 琼中 						
     * @return 结果
     */
    public int insertTNewfarmerQz(TNewfarmerQz tNewfarmerQz);

    /**
     * 修改琼中 						
     * 
     * @param tNewfarmerQz 琼中 						
     * @return 结果
     */
    public int updateTNewfarmerQz(TNewfarmerQz tNewfarmerQz);

}
