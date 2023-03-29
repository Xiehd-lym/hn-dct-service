package com.ahzx.hndctservice.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 列表请求类 *
 * @Author xiehd
 * @Date 2023 03 27
 **/
@Data
@ApiModel("列表请求类")
public class ListDataReqVo {

    @ApiModelProperty(value = "pagenum")
    @NotBlank(message = "pagenum is empty")
    private int pagenum;

    @ApiModelProperty(value = "pagesize")
    @NotBlank(message = "pagesize is empty")
    private int pagesize;

    @ApiModelProperty(value = "area")
    @NotBlank(message = "area is empty")
    private String area;

    @ApiModelProperty(value = "searchValue")
    private String searchValue;

}
