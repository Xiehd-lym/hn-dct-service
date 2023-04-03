package com.ahzx.hndctservice.entity.mainFarmerEntity.his.newFarmer;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerDa;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import lombok.Data;

import java.util.Date;

/**
 * 定安、澄迈对象 t_newfarmer_da*
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TNewfarmerDaHis extends TNewfarmerDa {
    private static final long serialVersionUID = 1L;

    private Date hisTime;

    private String hisName;

    private String supportingFileUrl;

}
