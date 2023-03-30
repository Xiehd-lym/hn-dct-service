package com.ahzx.hndctservice.generator.newFarmer.mapper;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerDa;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 定安、澄迈						Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Mapper
public interface TNewfarmerDaMapper extends BaseMapper<TNewfarmerDa>
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
