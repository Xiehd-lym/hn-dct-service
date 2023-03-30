package com.ahzx.hndctservice.entity.Vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 列表请求类 *
 * @Author xiehd
 * @Date 2023 03 27
 **/
@Data
@ApiModel("列表请求类")
public class ListDataReqVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "pagenum")
    @NotNull(message = "pagenum is empty")
    private Integer pagenum;

    @ApiModelProperty(value = "pagesize")
    @NotNull(message = "pagesize is empty")
    private Integer pagesize;

    @ApiModelProperty(value = "area")
    @NotBlank(message = "area is empty")
    private String area;

    @ApiModelProperty(value = "searchValue")
    private String searchValue;

    @ApiModelProperty(value = "查询的用户类型")
    @NotBlank(message = "queryUserType is empty")
    private String queryUserType;

}
