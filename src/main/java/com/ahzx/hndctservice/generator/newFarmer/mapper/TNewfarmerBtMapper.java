package com.ahzx.hndctservice.generator.newFarmer.mapper;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerBt;
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
public interface TNewfarmerBtMapper extends BaseMapper<TNewfarmerBt>
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
