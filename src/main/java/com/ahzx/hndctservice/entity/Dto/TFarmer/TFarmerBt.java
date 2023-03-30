package com.ahzx.hndctservice.entity.Dto.TFarmer;

import com.ahzx.hndctservice.entity.mainFarmerEntity.TFarmerMain;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 保亭 *
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TFarmerBt extends TFarmerMain {

    /** 主键 */
    private Long id;

    /** 农户id */
    private String farmerId;

    /** 区域 */
    private String area;

    /** 农户类型 */
    private String farmerType;

    /** 家庭年收支盈余 */
    private String incomeAndExpenditure;

    /** 农房面积 */
    private String houseArea;

    /** 农房结构 */
    private String houseStruct;

    /** 土地经营面积 */
    private String landArea;

    /** 土地种养年纯收入 */
    private String plantIncome;

    /** 机动车现价 */
    private String vehicleValue;

    /** 其他资产 */
    private String otherAssetsValue;

    /** 负债 */
    private String debtAmount;

    /** 家庭成员获得的社会荣誉 */
    private String honorLevel;

    /** 信用（征信）记录情况 */
    private String creditStatus;

    /** 近五年农户家庭成员是否存在犯罪记录 */
    private String criminalRecord;

    /** 荣誉信息 */
    private String honorInfo;

    /** 爱党爱国 */
    private String adag;

    /** 勤劳致富 */
    private String qlzf;

    /** 遵纪守法 */
    private String zjsf;

    /** 学用科技 */
    private String xykj;

    /** 文化教育 */
    private String whjy;

    /** 移风易俗 */
    private String yfys;

    /** 家庭和睦 */
    private String jthm;

    /** 邻里团结 */
    private String lltj;

    /** 环境卫生 */
    private String hjws;

    private String villagesGov;

}
