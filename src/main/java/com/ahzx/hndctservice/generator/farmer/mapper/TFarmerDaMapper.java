package com.ahzx.hndctservice.generator.farmer.mapper;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerDa;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 定安、澄迈Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Mapper
public interface TFarmerDaMapper extends BaseMapper<TFarmerDa>
{
    /**
     * 查询定安、澄迈
     * 
     * @param id 定安、澄迈主键
     * @return 定安、澄迈
     */
    public TFarmerDa selectTFarmerDaById(Long id);

    /**
     * 查询定安、澄迈列表
     * 
     * @param tFarmerDa 定安、澄迈
     * @return 定安、澄迈集合
     */
    public List<TFarmerDa> selectTFarmerDaList(TFarmerDa tFarmerDa);

    /**
     * 新增定安、澄迈
     * 
     * @param tFarmerDa 定安、澄迈
     * @return 结果
     */
    public int insertTFarmerDa(TFarmerDa tFarmerDa);

    /**
     * 修改定安、澄迈
     * 
     * @param tFarmerDa 定安、澄迈
     * @return 结果
     */
    public int updateTFarmerDa(TFarmerDa tFarmerDa);

    /**
     * 删除定安、澄迈
     * 
     * @param id 定安、澄迈主键
     * @return 结果
     */
    public int deleteTFarmerDaById(Long id);

    /**
     * 批量删除定安、澄迈
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTFarmerDaByIds(String[] ids);
}
