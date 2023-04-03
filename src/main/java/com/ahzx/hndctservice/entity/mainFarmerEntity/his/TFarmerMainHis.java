package com.ahzx.hndctservice.entity.mainFarmerEntity.his;

import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import lombok.Data;

import java.util.Date;

/**
 * 农户信息主对象 t_farmer_main_his
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
@Data
public class TFarmerMainHis extends TFarmerMain
{

    private static final long serialVersionUID = 1L;

    private Date hisTime;

    private String hisName;

    private String supportingFileUrl;

}
