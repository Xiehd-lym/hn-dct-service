package com.ahzx.hndctservice.generator.farmer.mapper;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerWc;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 文昌Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Mapper
public interface TFarmerWcMapper extends BaseMapper<TFarmerWc>
{
    /**
     * 查询文昌
     * 
     * @param id 文昌主键
     * @return 文昌
     */
    public TFarmerWc selectTFarmerWcById(Long id);

    /**
     * 查询文昌列表
     * 
     * @param tFarmerWc 文昌
     * @return 文昌集合
     */
    public List<TFarmerWc> selectTFarmerWcList(TFarmerWc tFarmerWc);

    /**
     * 新增文昌
     * 
     * @param tFarmerWc 文昌
     * @return 结果
     */
    public int insertTFarmerWc(TFarmerWc tFarmerWc);

    /**
     * 修改文昌
     * 
     * @param tFarmerWc 文昌
     * @return 结果
     */
    public int updateTFarmerWc(TFarmerWc tFarmerWc);

    /**
     * 删除文昌
     * 
     * @param id 文昌主键
     * @return 结果
     */
    public int deleteTFarmerWcById(Long id);

    /**
     * 批量删除文昌
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTFarmerWcByIds(String[] ids);
}
