package com.ahzx.hndctservice.entity.Dto.TFarmer;

import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import lombok.Data;

/**
 * 文昌 *
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TFarmerWCDto extends TFarmerMain {

    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 农户id */
    private Long farmerId;

    /** 区域 */
    private String area;

    /** 农户类型 */
    private String farmerType;

    /** 年收支盈余* 选项1.-2至0万元 2.0至2万元 3.2至5万元 4.5万元以上 */
    private String incomeAndExpenditure;

    /** 宅基地面积选项1.0至150平方米 2.150至300平方米 3.300平方米及以上 */
    private String houseArea;

    /** 家庭住房建成时间*? 选项1.2015年之前建成 2.2015年之后建成 */
    private String houseDate;

    /** 种养殖地面积* 选项1.0至10亩 2.10至20亩 3.20亩以上 */
    private String landArea;

    /** 种养年纯收入* 选项1.0-3万元 2.3-8万元 3.8万元以上 */
    private String landIncome;

    /** 机动车现价* 选项1.5万元以下 2.5-15万元 3.15万元以上 */
    private String vehicleValue;

    /** 其他资产选项1.5万元以下 2.5-10万元 3.10万元以上 */
    private String otherAssetsValue;

    /** 贷款信息（包括银行、支付宝、微信、白条等借款）* 选项 1.无贷款记录 2.有贷款记录且无不良 3.有不良贷款记录 */
    private String debtDesc;

    /** 参加商业保险选项 1.是 2.否 */
    private String insurance;

    /** 参加城乡居民医疗保险选项 1.是 2.否 */
    private String countryInsurance;

    /** 家庭成员获得的社会荣誉选项 1.村镇级? 2.县市级及以上 */
    private String honorLevel;

    /** 近五年农户家庭成员是否存在犯罪记录* 选项1.是? 2.否 */
    private String criminalRecord;

    /** $column.columnComment */
    private String villagesGov;

}
