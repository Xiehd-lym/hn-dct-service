package com.ahzx.hndctservice.controller.his.newFarmerMapper;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerHk;
import com.ahzx.hndctservice.entity.mainFarmerEntity.his.newFarmer.TNewfarmerHkHis;
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
public interface TNewfarmerHkHisMapper extends BaseMapper<TNewfarmerHkHis>
{

    /**
     * 新增海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县
     * 
     * @param tNewfarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县
     * @return 结果
     */
    public int insertTNewfarmerHk(TNewfarmerHkHis tNewfarmerHk);

    /**
     * 修改海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县
     * 
     * @param tNewfarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县
     * @return 结果
     */
    public int updateTNewfarmerHk(TNewfarmerHkHis tNewfarmerHk);

}
