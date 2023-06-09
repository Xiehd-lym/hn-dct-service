package com.ahzx.hndctservice.entity.Dto.TFarmer;

import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 定安、澄迈 *
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TFarmerDa extends TFarmerMain {

    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 农户id */
    private Long farmerId;

    /** 区域 */
    private String area;

    /** 农户类型 */
    private String farmerType;

    /** 家庭年收支盈余 */
    private String incomeAndExpenditure;

    /** 家庭年收入主要来源 */
    private String incomeDesc;

    /** 年支出主要用途 */
    private String payOutDesc;

    /** 农户农房面积 */
    private String houseArea;

    /** 农户农房结构 */
    private String houseStruct;

    /** 农户土地经营面积 单位：亩 */
    private String landArea;

    /** 农户种养年纯收入 */
    private String plantIncome;

    /** 农户家庭机动车价值 */
    private String vehicleValue;

    /** 农户家庭其他资产名称 */
    private String otherAssetsValue;

    /** 农户家庭负债金额 */
    private String debtAmount;

    /** 农户家庭负债原因 */
    private String debtDesc;

    /** 农户家庭成员获得的社会荣誉名称 */
    private String honorDesc;

    /** 农户家庭成员获得的社会荣誉级别 1-村镇级 2-县级以上 */
    private String honorLevel;

    /** 近五年农户家庭成员是否存在犯罪记录 1-是 2-否 */
    private String criminalRecord;

    /** 近五年农户家庭成员是否存在犯罪记录 1.存在信用记录且正常 2.信用记录空白?3.近?5?年内存在不良信用记录 */
    private String creditStatus;

}
