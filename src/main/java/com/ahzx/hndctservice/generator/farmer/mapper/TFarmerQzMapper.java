package com.ahzx.hndctservice.generator.farmer.mapper;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerQz;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 琼中Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Mapper
public interface TFarmerQzMapper extends BaseMapper<TFarmerQz>
{
    /**
     * 查询琼中
     * 
     * @param id 琼中主键
     * @return 琼中
     */
    public TFarmerQz selectTFarmerQzById(Long id);

    /**
     * 查询琼中列表
     * 
     * @param tFarmerQz 琼中
     * @return 琼中集合
     */
    public List<TFarmerQz> selectTFarmerQzList(TFarmerQz tFarmerQz);

    /**
     * 新增琼中
     * 
     * @param tFarmerQz 琼中
     * @return 结果
     */
    public int insertTFarmerQz(TFarmerQz tFarmerQz);

    /**
     * 修改琼中
     * 
     * @param tFarmerQz 琼中
     * @return 结果
     */
    public int updateTFarmerQz(TFarmerQz tFarmerQz);

    /**
     * 删除琼中
     * 
     * @param id 琼中主键
     * @return 结果
     */
    public int deleteTFarmerQzById(Long id);

    /**
     * 批量删除琼中
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTFarmerQzByIds(String[] ids);
}
