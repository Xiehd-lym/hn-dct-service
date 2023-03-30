package com.ahzx.hndctservice.entity.Do;

import lombok.Data;

/**
 * 实例 @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class FarmerDo {
    // 关联查询的表名
    private String tableName;
    // 关联查询的主键
    private Long farmerId;
}
