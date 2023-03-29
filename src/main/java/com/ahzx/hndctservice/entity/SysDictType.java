package com.ahzx.hndctservice.entity;

import lombok.Data;

/**
 * 字典类型实体类 *
 * @Author xiehd
 * @Date 2023 03 28
 **/
@Data
public class SysDictType extends BaseEntity{
    private static final long serialVersionUID = 1L;

    /** 字典主键 */
    private Long dictId;

    /** 字典名称 */
    private String dictName;

    /** 字典类型 */
    private String dictType;

    /** 状态（0正常 1停用） */
    private String status;

}
