package com.ahzx.hndctservice.generator.newFarmer.service;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerLd;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 乐东 						Service接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public interface ITNewfarmerLdService  extends IService<TNewfarmerLd>
{
    /**
     * 查询乐东 						
     * 
     * @param id 乐东 						主键
     * @return 乐东 						
     */
    public TNewfarmerLd selectTNewfarmerLdById(Long id);

    /**
     * 查询乐东 						列表
     * 
     * @param tNewfarmerLd 乐东 						
     * @return 乐东 						集合
     */
    public List<TNewfarmerLd> selectTNewfarmerLdList(TNewfarmerLd tNewfarmerLd);

    /**
     * 新增乐东 						
     * 
     * @param tNewfarmerLd 乐东 						
     * @return 结果
     */
    public int insertTNewfarmerLd(TNewfarmerLd tNewfarmerLd);

    /**
     * 修改乐东 						
     * 
     * @param tNewfarmerLd 乐东 						
     * @return 结果
     */
    public int updateTNewfarmerLd(TNewfarmerLd tNewfarmerLd);

}
