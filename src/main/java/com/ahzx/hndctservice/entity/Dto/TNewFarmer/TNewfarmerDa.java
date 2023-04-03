package com.ahzx.hndctservice.entity.Dto.TNewFarmer;

import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import lombok.Data;

/**
 * 定安、澄迈对象 t_newfarmer_da*
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TNewfarmerDa extends TNewfarmerMain {
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 新型农业主体id */
    private String farmerId;

    /** 区域 */
    private String area;

    /** 农户类型 */
    private String farmerType;

    /** 经营主体年收支盈余 * 选项 1.0 万元以下 2.0 至 10 万元 3.10 至 30 万元4.30 万元以上 */
    private String incomeAndExpenditure;

    /** 年收入主要来源 * 给 100 字符描写家庭年收入主要来源 */
    private String incomeDesc;

    /** 年支出主要用途 * 给 100 字符描写家庭年支出主要用途 */
    private String payOutDesc;

    /** 经营用房面积 * 选项 1.0 至 150 平方米 2.150 至 300 平方米 3.300 平方米以上 */
    private String houseArea;

    /** 经营用房结构 *  选项 1.砖木 2.砖混 3.钢混 */
    private String houseStruct;

    /** 土地经营面积 * 选项 1.0 至 20 亩 2.20 至 40 亩 3.40 亩以上 */
    private String landArea;

    /** 流动资产 * 选项 1.0-10 万元 2.10-30 万元 3.30 万元以上 */
    private String plantIncome;

    /** 机动车价值 * 选项 1.0-15 万元 2.15-30 万元 3.30 万元以上 */
    private String vehicleValue;

    /** 其他资产价值 * 选项 1.0-10 万元 2.10-30 万元 3.30 万元以上 */
    private String otherAssetsValue;

    /** 负债金额 * 选项 1.0-10 万元 2.10-50 万元 3.50 万元以上 */
    private String debtAmount;

    /** 负债原因 给 100 字符描写经营主体负债原因 */
    private String debtDesc;

    /** 获得的社会荣誉名称 给 100 字符描写家庭成员获得的社会荣誉 */
    private String honorDesc;

    /** 获得的社会荣誉级别 选项 1.村镇级  2.县级以上 */
    private String honorLevel;

    /** 近五年经营主体及所有者是否存在犯罪记录 * 选项 1.是  2.否 */
    private String criminalRecord;

    /** 所有者（负责人）信 用（征信）记录情况 选项 1.存在信用记录且正常 2.信用记录空白 3.近 5 年内存在不良信用记录 */
    private String creditStatus;

    /** $column.columnComment */
    private String villagesGov;
}
