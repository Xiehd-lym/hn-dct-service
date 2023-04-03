package com.ahzx.hndctservice.entity.mainFarmerEntity.his;

import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import lombok.Data;

import java.util.Date;

/**
 * 新型农业主体信息主对象 t_newfarmer_main_his
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
@Data
public class TNewfarmerMainHis extends TNewfarmerMain
{

    private static final long serialVersionUID = 1L;

    private Date hisTime;

    private String hisName;

    private String supportingFileUrl;

}
