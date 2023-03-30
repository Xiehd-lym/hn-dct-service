package com.ahzx.hndctservice.generator.farmer.mapper;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerHk;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Mapper
public interface TFarmerHkMapper extends BaseMapper<TFarmerHk>
{
    /**
     * 查询海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * 
     * @param id 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海主键
     * @return 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     */
    public TFarmerHk selectTFarmerHkById(Long id);

    /**
     * 查询海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海列表
     * 
     * @param tFarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * @return 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海集合
     */
    public List<TFarmerHk> selectTFarmerHkList(TFarmerHk tFarmerHk);

    /**
     * 新增海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * 
     * @param tFarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * @return 结果
     */
    public int insertTFarmerHk(TFarmerHk tFarmerHk);

    /**
     * 修改海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * 
     * @param tFarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * @return 结果
     */
    public int updateTFarmerHk(TFarmerHk tFarmerHk);

    /**
     * 删除海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * 
     * @param id 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海主键
     * @return 结果
     */
    public int deleteTFarmerHkById(Long id);

    /**
     * 批量删除海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTFarmerHkByIds(String[] ids);
}
