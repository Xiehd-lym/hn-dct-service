package com.ahzx.hndctservice.entity.Dto.TFarmer;

import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import lombok.Data;

/**
 * 三亚 *
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TFarmerSy extends TFarmerMain {

    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 农户主表id */
    private String farmerId;

    /** 区域 */
    private String area;

    /** 农户类型 */
    private String farmerType;

    /** 年经营收入 单位：万元 */
    private String income;

    /** 年经营成本 单位：万元 */
    private String payOut;

    /** 家庭年净收入 单位：万元 */
    private String netIncome;

    /** 实际经营土地面积? 单位：亩 */
    private String landArea;

    /** 农房面积*? 单位：平方米 */
    private String houseArea;

    /** 家庭负债金额* 单位：万元 */
    private String debtAmount;

    /** 商品房单位：套 */
    private Integer houseCount;

    /** 小汽车单位：辆 */
    private Integer vehicleCount;

    /** $column.columnComment */
    private String villagesGov;

}
