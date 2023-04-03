package com.ahzx.hndctservice.entity.Dto.TNewFarmer;

import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import lombok.Data;

/**
 * 文昌对象 t_newfarmer_wc *
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TNewfarmerWc extends TNewfarmerMain {
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 新型农业主体id */
    private String farmerId;

    /** 区域 */
    private String area;

    /** 农户类型 */
    private String farmerType;

    /** 收支盈余 */
    private String incomeAndExpenditure;

    /** 经营用房面积 * 选项1.0至150平方米 2.150至300平方米 3.300平方米及以上 */
    private String houseArea;

    /** 经营用房结构 *  选项1.砖木 2.砖混 3.钢混 */
    private String houseStruct;

    /** 土地经营面积 *  选项1.0至20亩 2.20至40亩 3.40亩以上 */
    private String landArea;

    /** 流动资产 * 选项1.0-10万元 2.10-30万元 3.30万元以上 */
    private String plantIncome;

    /** 机动车价值 * 选项1.0-15万元 2.15-30万元 3.30万元以上 */
    private String vehicleValue;

    /** 其他资产 * 选项1.0-10万元 2.10-30万元 3.30万元以上 */
    private String otherAssetsValue;

    /** 贷款信息（包括银行、支付宝、微信、白条等借款） * 选项 1.无贷款记录 2.有贷款记录且无不良 3.有不良贷款记录 */
    private String debtDesc;

    /** 经营主体（所有者）获得的社会荣誉 选项1.村镇级  2.县级以上 */
    private String honorLevel;

    /** 近五年经营主体及所有者是否存在犯罪记录 * 选项1.是  2.否 */
    private String criminalRecord;

    /** $column.columnComment */
    private String villagesGov;
}
