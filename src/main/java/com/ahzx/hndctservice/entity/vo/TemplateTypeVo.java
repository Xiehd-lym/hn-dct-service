package com.ahzx.hndctservice.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 模板选择请求类 *
 * @Author xiehd
 * @Date 2023 03 24
 **/
@Data
@ApiModel("模板选择请求类")
public class TemplateTypeVo {

    @ApiModelProperty(value = "地区")
    @NotBlank(message = "area is empty")
    private String area;

    @ApiModelProperty(value = "用户类型")
    @NotBlank(message = "loginUserType is empty")
    private String loginUserType;
}
