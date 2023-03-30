package com.ahzx.hndctservice.common.enums.table;

import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;

/**
 * 新型农业主体采集数据表枚举 *
 * @Author xiehd
 * @Date 2023 03 28
 **/
@Getter
@ToString
public enum NewFarmerAreaTableEnum {

    BT_FARMER_TEMPLATE(17,"t_newfarmer_bt","3000001"),
    DA_FARMER_TEMPLATE(17,"t_newfarmer_da","3000002"),
    HK_FARMER_TEMPLATE(17,"t_newfarmer_hk","3000003"),
    LD_FARMER_TEMPLATE(17,"t_newfarmer_ld","3000004"),
    QZ_FARMER_TEMPLATE(17,"t_newfarmer_qz","3000005"),
    SY_FARMER_TEMPLATE(17,"t_newfarmer_sy","3000006"),
    WC_FARMER_TEMPLATE(17,"t_newfarmer_wc","3000007"),
    WZS_FARMER_TEMPLATE(18,"t_newfarmer_wzs","3000008");

    private Integer code;
    private String tableName;
    private String area;

    NewFarmerAreaTableEnum(Integer code, String tableName,String area) {
        this.code = code;
        this.tableName = tableName;
        this.area = area;
    }

    public static void main(String[] args) {
        String templateNameByArea = getTableNameByArea("3000001");
        System.out.println(templateNameByArea);
    }

    public static String getTableNameByArea(String area){
        return Arrays.stream(NewFarmerAreaTableEnum.values()).filter(x -> x.getArea().equals(area)).findFirst().get().getTableName();
    }
}
