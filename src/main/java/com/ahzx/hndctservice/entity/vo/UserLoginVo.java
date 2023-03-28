package com.ahzx.hndctservice.entity.vo;

import java.io.Serializable;
import java.util.Date;

import com.ahzx.hndctservice.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *  用户登录基础类 user_login *
 * @Author xiehd
 * @Date 2023 03 24
 **/
@Data
@ApiModel("用户登录表单对象")
public class UserLoginVo extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    @ApiModelProperty(value = "电话号码")
    private String mobile;
    @ApiModelProperty(value = "密码")
    private String password;

}