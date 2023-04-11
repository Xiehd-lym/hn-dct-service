package com.ahzx.hndctservice.entity.Vo;

import com.ahzx.hndctservice.entity.BizCollector;
import lombok.Data;

/**
 *  用户登录类 *
 * @Author xiehd
 * @Date 2023 04 03
 **/
@Data
public class BizCollectorVo extends BizCollector {

    private String areaName;

    private int dctFlag;

}
