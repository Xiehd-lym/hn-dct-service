package com.ahzx.hndctservice.common.enums.template;

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

    LD_NEWFARMER_TEMPLATE(17,"t_farmer_wzs","12"),
    TC_NEWFARMER_TEMPLATE(18,"t_farmer_wzs","12");

    private Integer code;
    private String templateName;
    private String area;

    NewFarmerTemplateTypeEnum(Integer code, String templateName,String area) {
        this.code = code;
        this.templateName = templateName;
        this.area = area;
    }

    public static void main(String[] args) {
        String templateNameByArea = getTemplateNameByArea("3000001");
        System.out.println(templateNameByArea);
    }

    public static String getTemplateNameByArea(String area){
        return Arrays.stream(NewFarmerTemplateTypeEnum.values()).filter(x -> x.getArea().equals(area)).findFirst().get().getTemplateName();
    }

}
