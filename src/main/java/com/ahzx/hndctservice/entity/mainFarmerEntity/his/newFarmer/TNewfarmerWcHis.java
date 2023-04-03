package com.ahzx.hndctservice.entity.mainFarmerEntity.his.newFarmer;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerWc;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import lombok.Data;

import java.util.Date;

/**
 * 文昌对象 t_newfarmer_wc *
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TNewfarmerWcHis extends TNewfarmerWc {
    private static final long serialVersionUID = 1L;

    private Date hisTime;

    private String hisName;

    private String supportingFileUrl;
}
