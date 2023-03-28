package com.ahzx.hndctservice.entity;

import com.ahzx.hndctservice.entity.vo.UserLoginVo;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 用户登录实体类 *
 * @Author xiehd
 * @Date 2023 03 28
 **/
@Data
@TableName("user_login")
@ApiModel("用户登录表单对象")
public class UserLogin extends UserLoginVo {
}
