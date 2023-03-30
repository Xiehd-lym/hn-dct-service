package com.ahzx.hndctservice.generator.farmer.mapper;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerSy;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 三亚Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Mapper
public interface TFarmerSyMapper extends BaseMapper<TFarmerSy>
{
    /**
     * 查询三亚
     * 
     * @param id 三亚主键
     * @return 三亚
     */
    public TFarmerSy selectTFarmerSyById(Long id);

    /**
     * 查询三亚列表
     * 
     * @param tFarmerSy 三亚
     * @return 三亚集合
     */
    public List<TFarmerSy> selectTFarmerSyList(TFarmerSy tFarmerSy);

    /**
     * 新增三亚
     * 
     * @param tFarmerSy 三亚
     * @return 结果
     */
    public int insertTFarmerSy(TFarmerSy tFarmerSy);

    /**
     * 修改三亚
     * 
     * @param tFarmerSy 三亚
     * @return 结果
     */
    public int updateTFarmerSy(TFarmerSy tFarmerSy);

    /**
     * 删除三亚
     * 
     * @param id 三亚主键
     * @return 结果
     */
    public int deleteTFarmerSyById(Long id);

    /**
     * 批量删除三亚
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTFarmerSyByIds(String[] ids);
}
