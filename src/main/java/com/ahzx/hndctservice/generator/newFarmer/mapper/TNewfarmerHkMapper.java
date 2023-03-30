package com.ahzx.hndctservice.generator.newFarmer.mapper;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerHk;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Mapper
public interface TNewfarmerHkMapper extends BaseMapper<TNewfarmerHk>
{
    /**
     * 查询海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县
     * 
     * @param id 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县主键
     * @return 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县
     */
    public TNewfarmerHk selectTNewfarmerHkById(Long id);

    /**
     * 查询海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县列表
     * 
     * @param tNewfarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县
     * @return 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县集合
     */
    public List<TNewfarmerHk> selectTNewfarmerHkList(TNewfarmerHk tNewfarmerHk);

    /**
     * 新增海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县
     * 
     * @param tNewfarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县
     * @return 结果
     */
    public int insertTNewfarmerHk(TNewfarmerHk tNewfarmerHk);

    /**
     * 修改海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县
     * 
     * @param tNewfarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县
     * @return 结果
     */
    public int updateTNewfarmerHk(TNewfarmerHk tNewfarmerHk);

}
