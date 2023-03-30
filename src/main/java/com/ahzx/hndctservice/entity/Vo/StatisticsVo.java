package com.ahzx.hndctservice.entity.Vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 统计数据请求类
 * @Author xiehd
 * @Date 2023 03 29
 **/
@Data
public class StatisticsVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "area")
    @NotBlank(message = "area is empty")
    private String area;

    @ApiModelProperty(value = "查询的用户类型")
    @NotBlank(message = "queryUserType is empty")
    private String queryUserType;

}
