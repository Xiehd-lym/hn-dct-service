package com.ahzx.hndctservice.entity.Dto.TNewFarmer;

import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import lombok.Data;

/**
 * 三亚对象 t_newfarmer_sy *
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TNewfarmerSYDto extends TNewfarmerMain {
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 新型农业主体id */
    private Long farmerId;

    /** 区域 */
    private String area;

    /** 农户类型 */
    private String farmerType;

    /** 年收入金额 * 单位：万元 */
    private String income;

    /** 年收入主要来源 * 给100字符描写经营主体年收入主要来源 */
    private String incomeDesc;

    /** 年支出金额 * 单位：万元 */
    private String payOut;

    /** 年支出主要用途 * 给100字符描写经营主体年支出主要用途 */
    private String payOutDesc;

    /** $column.columnComment */
    private String incomeAndExpenditure;

    /** 经营用房情况 *  单位：平方米 */
    private String houseArea;

    /** 经营用房结构 *  选项1.砖木 2.砖混 3.钢混 */
    private String houseStruct;

    /** 经营土地使用面积 *  单位：亩 */
    private String landArea;

    /** 种养种类 * 给100字符描写经营主体种养种类 */
    private String plantType;

    /** 流动资产 * 单位：万元 */
    private String plantIncome;

    /** 机动车价值 * 单位：万元 */
    private String vehicleValue;

    /** 其他资产名称 */
    private String otherAssetsName;

    /** 其他资产价值 * 单位：万元 */
    private String otherAssetsValue;

    /** 负债金额 * 单位：万元 */
    private String debtAmount;

    /** 负债原因 给100字符描写经营主体负债原因 */
    private String debtDesc;

    /** 经营主体及所有者获得的社会荣誉名称 给100字符描写家庭成员获得的社会荣誉 */
    private String honorDesc;

    /** 经营主体及所有者获得的社会荣誉级别 选项1.村镇级  2.县级以上 */
    private String honorLevel;

    /** 近五年经营主体及所有者是否存在犯罪记录 * 选项1.是  2.否 */
    private String criminalRecord;

    /** 所有者（负责人）信用（征信）记录情况 选项 1.存在信用记录且正常 2.信用记录空白 3.近5年内存在不良信用记录 */
    private String creditStatus;

    /** 农产品销售 选项1.前景好 2.一般 3.较差 */
    private String prospect;

    /** 农业灾害应对能力 选项1.前景好 2.一般 3.较差 */
    private String disasterResponse;

    /** $column.columnComment */
    private String villagesGov;
}
