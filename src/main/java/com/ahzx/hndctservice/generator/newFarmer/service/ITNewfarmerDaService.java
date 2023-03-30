package com.ahzx.hndctservice.generator.newFarmer.service;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerDa;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 定安、澄迈						Service接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public interface ITNewfarmerDaService  extends IService<TNewfarmerDa>
{
    /**
     * 查询定安、澄迈						
     * 
     * @param id 定安、澄迈						主键
     * @return 定安、澄迈						
     */
    public TNewfarmerDa selectTNewfarmerDaById(Long id);

    /**
     * 查询定安、澄迈						列表
     * 
     * @param tNewfarmerDa 定安、澄迈						
     * @return 定安、澄迈						集合
     */
    public List<TNewfarmerDa> selectTNewfarmerDaList(TNewfarmerDa tNewfarmerDa);

    /**
     * 新增定安、澄迈						
     * 
     * @param tNewfarmerDa 定安、澄迈						
     * @return 结果
     */
    public int insertTNewfarmerDa(TNewfarmerDa tNewfarmerDa);

    /**
     * 修改定安、澄迈
     *
     * @param tNewfarmerDa 定安、澄迈
     * @return 结果
     */
    public int updateTNewfarmerDa(TNewfarmerDa tNewfarmerDa);


}
