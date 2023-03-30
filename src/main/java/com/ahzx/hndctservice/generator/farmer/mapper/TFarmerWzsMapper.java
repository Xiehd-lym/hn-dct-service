package com.ahzx.hndctservice.generator.farmer.mapper;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerWzs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 五指山、乐东、屯昌Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Mapper
public interface TFarmerWzsMapper extends BaseMapper<TFarmerWzs>
{
    /**
     * 查询五指山、乐东、屯昌
     * 
     * @param id 五指山、乐东、屯昌主键
     * @return 五指山、乐东、屯昌
     */
    public TFarmerWzs selectTFarmerWzsById(Long id);

    /**
     * 查询五指山、乐东、屯昌列表
     * 
     * @param tFarmerWzs 五指山、乐东、屯昌
     * @return 五指山、乐东、屯昌集合
     */
    public List<TFarmerWzs> selectTFarmerWzsList(TFarmerWzs tFarmerWzs);

    /**
     * 新增五指山、乐东、屯昌
     * 
     * @param tFarmerWzs 五指山、乐东、屯昌
     * @return 结果
     */
    public int insertTFarmerWzs(TFarmerWzs tFarmerWzs);

    /**
     * 修改五指山、乐东、屯昌
     * 
     * @param tFarmerWzs 五指山、乐东、屯昌
     * @return 结果
     */
    public int updateTFarmerWzs(TFarmerWzs tFarmerWzs);

    /**
     * 删除五指山、乐东、屯昌
     * 
     * @param id 五指山、乐东、屯昌主键
     * @return 结果
     */
    public int deleteTFarmerWzsById(Long id);

    /**
     * 批量删除五指山、乐东、屯昌
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTFarmerWzsByIds(String[] ids);
}
