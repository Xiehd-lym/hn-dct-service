package com.ahzx.hndctservice.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础实体类 *
 * @Author xiehd
 * @Date 2023 03 28
 **/
@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 搜索值 */
    private String searchValue;

    @TableId(type = IdType.ASSIGN_UUID)
    private Integer id;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

//    @Version
//    private Integer version;

    @TableLogic
    private Integer delFlag;

    /** 创建者 */
    private String createBy;

    /** 更新者 */
    private String updateBy;

    /** 备注 */
    private String remark;


}
