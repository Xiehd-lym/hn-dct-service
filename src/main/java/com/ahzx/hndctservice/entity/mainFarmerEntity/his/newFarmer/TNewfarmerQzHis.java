package com.ahzx.hndctservice.entity.mainFarmerEntity.his.newFarmer;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerQz;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import lombok.Data;

import java.util.Date;

/**
 * 琼中对象 t_newfarmer_qz *
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TNewfarmerQzHis extends TNewfarmerQz {
    private static final long serialVersionUID = 1L;

    private Date hisTime;

    private String hisName;

    private String supportingFileUrl;
}
