package com.ahzx.hndctservice.controller.his.newFarmerMapper;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerWzs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 五指山Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Mapper
public interface TNewfarmerWzsHisMapper extends BaseMapper<TNewfarmerWzs>
{
    /**
     * 查询五指山
     * 
     * @param id 五指山主键
     * @return 五指山
     */
    public TNewfarmerWzs selectTNewfarmerWzsById(Long id);

    /**
     * 查询五指山列表
     * 
     * @param tNewfarmerWzs 五指山
     * @return 五指山集合
     */
    public List<TNewfarmerWzs> selectTNewfarmerWzsList(TNewfarmerWzs tNewfarmerWzs);

    /**
     * 新增五指山
     * 
     * @param tNewfarmerWzs 五指山
     * @return 结果
     */
    public int insertTNewfarmerWzs(TNewfarmerWzs tNewfarmerWzs);

    /**
     * 修改五指山
     * 
     * @param tNewfarmerWzs 五指山
     * @return 结果
     */
    public int updateTNewfarmerWzs(TNewfarmerWzs tNewfarmerWzs);

}
