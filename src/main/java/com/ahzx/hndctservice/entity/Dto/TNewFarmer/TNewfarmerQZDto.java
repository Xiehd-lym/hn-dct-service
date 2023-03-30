package com.ahzx.hndctservice.entity.Dto.TNewFarmer;

import com.ahzx.hndctservice.entity.mainFarmerEntity.TNewfarmerMain;
import lombok.Data;

/**
 * 琼中对象 t_newfarmer_qz *
 * @Author xiehd
 * @Date 2023 03 30
 **/
@Data
public class TNewfarmerQZDto extends TNewfarmerMain {
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 新型农业主体id */
    private Long farmerId;

    /** 区域 */
    private String area;

    /** 农户类型 */
    private String farmerType;

    /** 经营主体名称 */
    private String objName;

    /** 所属行业 */
    private String industry;

    /** 年龄 */
    private String ageSelect;

    /** 年收支盈余 *选项1.10万以下 2.10-30万元 3.30万元以上 */
    private String incomeAndExpenditure;

    /** 年收入主要来源 * 给100字符描写经营主体年收入主要来源 */
    private String incomeDesc;

    /** 年支出主要用途 * 给100字符描写经营主体年支出主要用途 */
    private String payOutDesc;

    /** 资产负债结构 *选项1.结构不合理，短债长用现象较为严重，或者存在到期债务过度集中的问题 2.结构较为合理，基本不存在短债长用现象，注意对流动性和债务到期的管理 3.结构合理，流动性管理好，不存在短债长用现象 */
    private String assetsDebtsStructure;

    /** 信用记录 * 选项1.存在信用记录且正常 2.信用记录空白 3.近5年内存在不良信用记录（非恶意逾期） */
    private String creditStatus;

    /** 经营用房情况 * 选项1.0-150平方米 2.150-300平方米 3.300平方米以上米 */
    private String houseArea;

    /** 土地经营面积 * 选项1.0-20亩 3.20-40亩 4.40亩以上 */
    private String landArea;

    /** 流动资产 * 选项1.0-10万元 2.10-30万元 3.30万元以上 */
    private String plantIncome;

    /** 机动车价值 * 选项1.0-15万元 2.15-30万元 3.30万元以上 */
    private String vehicleValue;

    /** 荣誉信息 选项1.村镇级  2.县级以上 */
    private String honorLevel;

    /** $column.columnComment */
    private String villagesGov;
}
