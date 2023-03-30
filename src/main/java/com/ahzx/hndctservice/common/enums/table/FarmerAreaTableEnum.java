package com.ahzx.hndctservice.common.enums.table;

import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;

/**
 * 农户采集数据表枚举 *
 * @Author xiehd
 * @Date 2023 03 28
 **/
@Getter
@ToString
public enum FarmerAreaTableEnum {

    BT_FARMER_TEMPLATE(1,"t_farmer_bt","3000001"),
    DA_FARMER_TEMPLATE(2,"t_farmer_da","3000002"),
    HK_FARMER_TEMPLATE(3,"t_farmer_hk","3000003"),
    QZ_FARMER_TEMPLATE(4,"t_farmer_qz","3000004"),
    SY_FARMER_TEMPLATE(5,"t_farmer_sy","3000005"),
    WC_FARMER_TEMPLATE(6,"t_farmer_wc","3000006"),
    WZS_FARMER_TEMPLATE(7,"t_farmer_wzs","3000007");

    private Integer code;
    private String tableName;
    private String area;

    FarmerAreaTableEnum(Integer code, String tableName,String area) {
        this.code = code;
        this.tableName = tableName;
        this.area = area;
    }

    public static void main(String[] args) {
        String templateNameByArea = getTableNameByArea("3000001");
        System.out.println(templateNameByArea);
    }

    public static String getTableNameByArea(String area){
        return Arrays.stream(FarmerAreaTableEnum.values()).filter(x -> x.getArea().equals(area)).findFirst().get().getTableName();
    }
}
