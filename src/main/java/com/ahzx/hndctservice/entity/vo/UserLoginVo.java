package com.ahzx.hndctservice.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 *  用户登录请求类 *
 * @Author xiehd
 * @Date 2023 03 24
 **/
@Data
@ApiModel("用户登录基础类")
public class UserLoginVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户名")
    @NotEmpty(message = "用户姓名不能为空")
    private String username;

    @ApiModelProperty(value = "电话号码")
//    @NotEmpty(message = "电话号码不能为空")
    private String mobile;

    @ApiModelProperty(value = "密码")
    @NotEmpty(message = "登陆密码不能为空")
    private String password;

}