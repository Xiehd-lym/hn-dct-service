package com.ahzx.hndctservice.controller.his.farmerMapper;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerHk;
import com.ahzx.hndctservice.entity.mainFarmerEntity.his.farmer.TFarmerHkHis;
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
public interface TFarmerHkHisMapper extends BaseMapper<TFarmerHkHis>
{

    /**
     * 新增海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * 
     * @param tFarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * @return 结果
     */
    public int insertTFarmerHk(TFarmerHkHis tFarmerHk);

    /**
     * 修改海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * 
     * @param tFarmerHk 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海
     * @return 结果
     */
    public int updateTFarmerHk(TFarmerHkHis tFarmerHk);


}
