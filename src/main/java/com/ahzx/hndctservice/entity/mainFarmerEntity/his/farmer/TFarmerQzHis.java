package com.ahzx.hndctservice.entity.mainFarmerEntity.his.farmer;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerQz;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import lombok.Data;

import java.util.Date;

/**
 * 琼中 *
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TFarmerQzHis extends TFarmerQz {

    private static final long serialVersionUID = 1L;

    private Date hisTime;

    private String hisName;

    private String supportingFileUrl;
}
