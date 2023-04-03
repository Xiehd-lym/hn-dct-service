package com.ahzx.hndctservice.entity.mainFarmerEntity.his.farmer;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerHk;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import lombok.Data;

import java.util.Date;

/**
 * 海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海 *
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TFarmerHkHis extends TFarmerHk {

    private static final long serialVersionUID = 1L;

    private Date hisTime;

    private String hisName;

    private String supportingFileUrl;
}
