package com.ahzx.hndctservice.common.enums;

import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;

/**
 * 农户采集数据模板枚举 *
 * @Author xiehd
 * @Date 2023 03 28
 **/
@Getter
@ToString
public enum FarmerTemplateTypeEnum {

    HK_FARMER_TEMPLATE(1,"t_farmer_hk","46010000000000"),
    DZ_FARMER_TEMPLATE(2,"t_farmer_hk","46040000000000"),
    BS_FARMER_TEMPLATE(3,"t_farmer_hk","46902500000000"),
    WN_FARMER_TEMPLATE(4,"t_farmer_hk","46900600000000"),
    LS_FARMER_TEMPLATE(5,"t_farmer_hk","46902800000000"),
    CJ_FARMER_TEMPLATE(6,"t_farmer_hk","46902600000000"),
    LG_FARMER_TEMPLATE(7,"t_farmer_hk","46902400000000"),
    DF_FARMER_TEMPLATE(8,"t_farmer_hk","46900700000000"),
    QH_FARMER_TEMPLATE(9,"t_farmer_hk","46900200000000"),
    DA_FARMER_TEMPLATE(10,"t_farmer_da","46902100000000"),
    DM_FARMER_TEMPLATE(11,"t_farmer_da","46902300000000"),
    BT_FARMER_TEMPLATE(12,"t_farmer_bt","46902900000000"),
    QZ_FARMER_TEMPLATE(13,"t_farmer_qz","46903000000000"),
    SY_FARMER_TEMPLATE(14,"t_farmer_sy","46020000000000"),
    WC_FARMER_TEMPLATE(15,"t_farmer_wc","46900500000000"),
    WZS_FARMER_TEMPLATE(16,"t_farmer_wzs","469001000000"),
    LD_FARMER_TEMPLATE(17,"t_farmer_wzs","469027000000"),
    TC_FARMER_TEMPLATE(18,"t_farmer_wzs","469022000000");

    private Integer code;
    private String templateName;
    private String area;

    FarmerTemplateTypeEnum(Integer code, String templateName,String area) {
        this.code = code;
        this.templateName = templateName;
        this.area = area;
    }

    public static String getTemplateNameByArea(String area){
        return Arrays.stream(FarmerTemplateTypeEnum.values()).filter(x -> x.getArea().equals(area)).findFirst().get().getTemplateName();
    }

}
