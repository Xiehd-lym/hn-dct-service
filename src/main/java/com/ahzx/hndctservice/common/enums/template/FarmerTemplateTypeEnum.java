package com.ahzx.hndctservice.common.enums.template;

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

    HK_FARMER_TEMPLATE(1,"t_farmer_hk","3000001"),
    ZZ_FARMER_TEMPLATE(2,"t_farmer_hk","3000002"),
    BS_FARMER_TEMPLATE(3,"t_farmer_hk","3000003"),
    WN_FARMER_TEMPLATE(4,"t_farmer_hk","3000004"),
    LS_FARMER_TEMPLATE(5,"t_farmer_hk","3000005"),
    CJ_FARMER_TEMPLATE(6,"t_farmer_hk","3000006"),
    LG_FARMER_TEMPLATE(7,"t_farmer_hk","3000007"),
    DF_FARMER_TEMPLATE(8,"t_farmer_hk","3000008"),
    QH_FARMER_TEMPLATE(9,"t_farmer_hk","3000009"),
    DA_FARMER_TEMPLATE(10,"t_farmer_da","3000010"),
    DM_FARMER_TEMPLATE(11,"t_farmer_da","3000011"),
    BT_FARMER_TEMPLATE(12,"t_farmer_bt","3000012"),
    QZ_FARMER_TEMPLATE(13,"t_farmer_qz","3000013"),
    SY_FARMER_TEMPLATE(14,"t_farmer_sy","3000014"),
    WC_FARMER_TEMPLATE(15,"t_farmer_wc","3000000"),
    WZS_FARMER_TEMPLATE(16,"t_farmer_wzs","3000000"),
    LD_FARMER_TEMPLATE(17,"t_farmer_wzs","3000000"),
    TC_FARMER_TEMPLATE(18,"t_farmer_wzs","3000000");

    private Integer code;
    private String templateName;
    private String area;

    FarmerTemplateTypeEnum(Integer code, String templateName,String area) {
        this.code = code;
        this.templateName = templateName;
        this.area = area;
    }

    public static void main(String[] args) {
        String templateNameByArea = getTemplateNameByArea("3000001");
        System.out.println(templateNameByArea);
    }

    public static String getTemplateNameByArea(String area){
        return Arrays.stream(FarmerTemplateTypeEnum.values()).filter(x -> x.getArea().equals(area)).findFirst().get().getTemplateName();
    }

}
