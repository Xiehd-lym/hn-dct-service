package com.ahzx.hndctservice.entity.mainFarmerEntity.his.farmer;

import com.ahzx.hndctservice.entity.Dto.TFarmer.TFarmerWzs;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import lombok.Data;

import java.util.Date;

/**
 * 五指山、乐东、屯昌
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TFarmerWzsHis extends TFarmerWzs {

    private static final long serialVersionUID = 1L;

    private Date hisTime;

    private String hisName;

    private String supportingFileUrl;

}
