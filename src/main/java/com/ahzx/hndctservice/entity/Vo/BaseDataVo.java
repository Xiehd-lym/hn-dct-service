package com.ahzx.hndctservice.entity.Vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 列表请求类 *
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
@ApiModel("列表请求类")
public class BaseDataVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "查询的用户类型")
    @NotBlank(message = "queryUserType is empty")
    private String queryUserType;

    /** 主键id */
    @ApiModelProperty(value = "主键id")
    @NotBlank(message = "主键id is empty")
    private Long farmerId;

    @ApiModelProperty(value = "地区")
    @NotBlank(message = "area is empty")
    private String area;

}
