package com.ahzx.hndctservice.entity.mainFarmerEntity.his.newFarmer;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerHk;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import lombok.Data;

import java.util.Date;

/**
 * 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县对象 t_newfarmer_hk *
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TNewfarmerHkHis extends TNewfarmerHk {
    private static final long serialVersionUID = 1L;

    private Date hisTime;

    private String hisName;

    private String supportingFileUrl;
}
