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

    HK_FARMER_TEMPLATE(1,"t_farmer_hk","4601"),
    DZ_FARMER_TEMPLATE(2,"t_farmer_hk","4604"),
    BS_FARMER_TEMPLATE(3,"t_farmer_hk","469025"),
    WN_FARMER_TEMPLATE(4,"t_farmer_hk","469006"),
    LS_FARMER_TEMPLATE(5,"t_farmer_hk","469028"),
    CJ_FARMER_TEMPLATE(6,"t_farmer_hk","469026"),
    LG_FARMER_TEMPLATE(7,"t_farmer_hk","469024"),
    DF_FARMER_TEMPLATE(8,"t_farmer_hk","469007"),
    QH_FARMER_TEMPLATE(9,"t_farmer_hk","469002"),
    DA_FARMER_TEMPLATE(10,"t_farmer_da","469021"),
    DM_FARMER_TEMPLATE(11,"t_farmer_da","469023"),
    BT_FARMER_TEMPLATE(12,"t_farmer_bt","469029"),
    QZ_FARMER_TEMPLATE(13,"t_farmer_qz","46903"),
    SY_FARMER_TEMPLATE(14,"t_farmer_sy","4602"),
    WC_FARMER_TEMPLATE(15,"t_farmer_wc","469005"),
    WZS_FARMER_TEMPLATE(16,"t_farmer_wzs","469001"),
    LD_FARMER_TEMPLATE(17,"t_farmer_wzs","469027"),
    TC_FARMER_TEMPLATE(18,"t_farmer_wzs","469022");

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
