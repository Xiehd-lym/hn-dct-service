package com.ahzx.hndctservice.entity.mainFarmerEntity;

import com.ahzx.hndctservice.common.annotation.PrivacyEncrypt;
import com.ahzx.hndctservice.common.enums.PrivacyTypeEnum;
import com.ahzx.hndctservice.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 农户信息主对象 t_farmer_main
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
@Data
public class TFarmerMain extends BaseEntity
{

    private static final long serialVersionUID = 1L;

    /** 主键id */
    @TableId(type = IdType.ASSIGN_UUID)
    private String farmerId;

    /** 户主姓名 */
    private String personName;

    /** 户号 */
    private String homeNo;

    /** 身份证号 */
    @PrivacyEncrypt(type = PrivacyTypeEnum.ID_CARD)
    private String cardNo;

    /** 年龄 */
    private Long age;

    /** 联系电话 */
    @PrivacyEncrypt(type = PrivacyTypeEnum.PHONE)
    private String phone;

    /** 学历 */
    private String education;

    /** 婚姻状态 */
    private String maritalStatus;

    /** 劳动力数 */
    private Long workCount;

    /** 家庭人口数 */
    private Long personCount;

    /** 区域 */
    private String area;

    /** 评分 */
    private Long creditScore;

    /** 评级 */
    private String creditLevel;

    /** 明细表名称 */
    private String farmerTabName;

    /** 采集任务编号 */
    private String collectTaskNo;

    /** 采集时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField(fill = FieldFill.INSERT)
    private Date collectTime;

    /** 采集状态 */
    private String collectStatus;

    /** 0-未初评，1-已初评，2-已评定 */
    private String evaStatus;

    /** 0-正常 1-已删除 */
    @TableLogic
    private Integer delFlag;

}
