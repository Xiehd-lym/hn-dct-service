package com.ahzx.hndctservice.entity.mainFarmerEntity.his.newFarmer;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerWzs;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import lombok.Data;

import java.util.Date;

/**
 * 五指山对象 t_newfarmer_wzs *
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TNewfarmerWzsHis extends TNewfarmerWzs {

    private static final long serialVersionUID = 1L;

    private Date hisTime;

    private String hisName;

    private String supportingFileUrl;

}
