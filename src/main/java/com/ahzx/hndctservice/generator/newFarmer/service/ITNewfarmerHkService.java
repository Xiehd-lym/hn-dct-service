package com.ahzx.hndctservice.generator.newFarmer.service;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerHk;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县Service接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public interface ITNewfarmerHkService  extends IService<TNewfarmerHk>
{
    /**
     * 查询海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县
     * 
     * @param id 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县主键
     * @return 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县
     */
    public TNewfarmerHk selectTNewfarmerHkById(Long id);

    /**
     * 查询海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县列表
     * 
     * @param tNewfarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县
     * @return 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县集合
     */
    public List<TNewfarmerHk> selectTNewfarmerHkList(TNewfarmerHk tNewfarmerHk);

    /**
     * 新增海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县
     * 
     * @param tNewfarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县
     * @return 结果
     */
    public int insertTNewfarmerHk(TNewfarmerHk tNewfarmerHk);

    /**
     * 修改海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县
     * 
     * @param tNewfarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等个市县
     * @return 结果
     */
    public int updateTNewfarmerHk(TNewfarmerHk tNewfarmerHk);
 
}
