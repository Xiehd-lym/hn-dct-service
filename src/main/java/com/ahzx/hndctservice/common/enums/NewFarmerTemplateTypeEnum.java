package com.ahzx.hndctservice.common.enums;

import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;

/**
 * 新型农业主体采集数据模板枚举 *
 * @Author xiehd
 * @Date 2023 03 28
 **/
@Getter
@ToString
public enum NewFarmerTemplateTypeEnum {

    HK_NEWFARMER_TEMPLATE(1,"t_newfarmer_hk","46010000000000"),
    DZ_NEWFARMER_TEMPLATE(2,"t_newfarmer_hk","46040000000000"),
    BS_NEWFARMER_TEMPLATE(3,"t_newfarmer_hk","46902500000000"),
    WN_NEWFARMER_TEMPLATE(4,"t_newfarmer_hk","46900600000000"),
    LS_NEWFARMER_TEMPLATE(5,"t_newfarmer_hk","46902800000000"),
    CJ_NEWFARMER_TEMPLATE(6,"t_newfarmer_hk","46902600000000"),
    LG_NEWFARMER_TEMPLATE(7,"t_newfarmer_hk","46902400000000"),
    DF_NEWFARMER_TEMPLATE(8,"t_newfarmer_hk","46900700000000"),
    QH_NEWFARMER_TEMPLATE(9,"t_newfarmer_hk","46900200000000"),
    BT_NEWFARMER_TEMPLATE(10,"t_newfarmer_bt","46902900000000"),
    TC_NEWFARMER_TEMPLATE(11,"t_newfarmer_bt","469022000000"),
    DA_NEWFARMER_TEMPLATE(12,"t_newfarmer_da","46902100000000"),
    DM_NEWFARMER_TEMPLATE(13,"t_newfarmer_da","46902300000000"),
    LD_NEWFARMER_TEMPLATE(14,"t_newfarmer_ld","469027000000"),
    QZ_NEWFARMER_TEMPLATE(15,"t_newfarmer_qz","46903000000000"),
    SY_NEWFARMER_TEMPLATE(16,"t_newfarmer_sy","46020000000000"),
    WC_NEWFARMER_TEMPLATE(17,"t_newfarmer_wc","46900500000000"),
    WZS_NEWFARMER_TEMPLATE(18,"t_newfarmer_wzs","469001000000");

    private Integer code;
    private String templateName;
    private String area;

    NewFarmerTemplateTypeEnum(Integer code, String templateName,String area) {
        this.code = code;
        this.templateName = templateName;
        this.area = area;
    }

    public static String getTemplateNameByArea(String area){
        return Arrays.stream(NewFarmerTemplateTypeEnum.values()).filter(x -> x.getArea().equals(area)).findFirst().get().getTemplateName();
    }

}
