package com.ahzx.hndctservice.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * 基础实体类 *
 * @Author xiehd
 * @Date 2023 03 28
 **/
@Data
public class BaseEntity {

    @TableId(type = IdType.ASSIGN_UUID)
    private Integer id;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    @Version
    private Integer version;

    @TableLogic
    private Integer flag;

}
