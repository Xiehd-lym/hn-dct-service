package com.ahzx.hndctservice.entity.Dto.TFarmer;

import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import lombok.Data;

/**
 * 琼中 *
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TFarmerQz extends TFarmerMain {

    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 农户id */
    private String farmerId;

    /** 区域 */
    private String area;

    /** 农户类型 */
    private String farmerType;

    /** 年龄1.18-25岁（含） 2.25-55岁（含） 3.55-65岁（含）4.65岁以上 */
    private String ageSelect;

    /** 年度总收入1.2万元以下 2.2-5万元 3.5万元以上 */
    private String income;

    /** 不良贷款记录1.无贷款记录 2.有贷款记录且无不良 */
    private String debtDesc;

    /** 存量资产额1.2万元以下 2.2-10万元 3.10万元以上 */
    private String assetValue;

    /** 耕地面积1.2亩 2.2-8亩 3.8-12亩 4.12亩以上 */
    private String landArea;

    /** 经营用房面积1.0-150平方米 2.150-300平方米 3.300平方米以上 */
    private String houseArea;

    /** 经济用林面积1.0-150平方米 2.150-300平方米 3.300平方米以上 */
    private String forestArea;

    /** 参保信息1.未参加 2.参加财产保险 3.参加人寿保险 4.参加农业保险 5.参加城乡居民医保（多选） */
    private String insuranceInfo;

    /** 运输工具1.有家庭性车辆 2.有生产性机具 3.有经营性车辆（多选） */
    private String vehicleInfo;

    /** 荣誉信息1.人大代表（政协委员） 2.劳动模范（致富带头人） 3.转退伍军人 4.村干部 5.党员 */
    private String honorInfo;

    /** $column.columnComment */
    private String villagesGov;
}
