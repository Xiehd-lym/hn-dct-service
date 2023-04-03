package com.ahzx.hndctservice.entity.mainFarmerEntity.his.newFarmer;

import com.ahzx.hndctservice.entity.Dto.TNewFarmer.TNewfarmerLd;
import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import lombok.Data;

import java.util.Date;

/**
 * 乐东对象 t_newfarmer_ld*
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TNewfarmerLdHis extends TNewfarmerLd {
    private static final long serialVersionUID = 1L;

    private Date hisTime;

    private String hisName;

    private String supportingFileUrl;
}
