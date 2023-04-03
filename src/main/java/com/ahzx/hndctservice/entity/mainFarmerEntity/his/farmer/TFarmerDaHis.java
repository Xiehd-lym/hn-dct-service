package com.ahzx.hndctservice.entity.mainFarmerEntity.his.farmer;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerDa;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import lombok.Data;

import java.util.Date;

/**
 * 定安、澄迈 *
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TFarmerDaHis extends TFarmerDa {

    private static final long serialVersionUID = 1L;

    private Date hisTime;

    private String hisName;

    private String supportingFileUrl;
}
