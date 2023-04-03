package com.ahzx.hndctservice.entity;

import com.ahzx.hndctservice.entity.Vo.UserLoginVo;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户登录实体类 *
 * @Author xiehd
 * @Date 2023 03 28
 **/
@Data
public class BizCollector extends UserLoginVo {

    private Long collectorId;
    private String phone;
    private String status;
    private String areaNo;
    private String name;
    private String sex;
    private String province;
    private String city;
    private String area;
    private String town;

}
