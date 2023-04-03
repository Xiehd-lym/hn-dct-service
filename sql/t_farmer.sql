/*
 Navicat Premium Data Transfer

 Source Server         : MySQL8.0
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : ry

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 03/04/2023 21:27:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_farmer_bt
-- ----------------------------
DROP TABLE IF EXISTS `t_farmer_bt`;
CREATE TABLE `t_farmer_bt`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `farmer_id` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户id',
  `area` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `farmer_type` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `income_and_expenditure` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭年收支盈余',
  `house_area` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农房面积',
  `house_struct` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农房结构',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '土地经营面积',
  `plant_income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '土地种养年纯收入',
  `vehicle_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '机动车现价',
  `other_assets_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产',
  `debt_amount` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债',
  `honor_level` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭成员获得的社会荣誉',
  `credit_status` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '信用（征信）记录情况',
  `criminal_record` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '近五年农户家庭成员是否存在犯罪记录',
  `honor_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '荣誉信息',
  `adag` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '爱党爱国',
  `qlzf` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '勤劳致富',
  `zjsf` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '遵纪守法',
  `xykj` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学用科技',
  `whjy` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文化教育',
  `yfys` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '移风易俗',
  `jthm` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭和睦',
  `lltj` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邻里团结',
  `hjws` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '环境卫生',
  `villages_gov` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '保亭' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_farmer_da
-- ----------------------------
DROP TABLE IF EXISTS `t_farmer_da`;
CREATE TABLE `t_farmer_da`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `farmer_id` int(11) NOT NULL COMMENT '农户id',
  `area` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `farmer_type` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `income_and_expenditure` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭年收支盈余',
  `income_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭年收入主要来源',
  `pay_out_desc` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出主要用途',
  `house_area` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户农房面积',
  `house_struct` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户农房结构',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户土地经营面积 单位：亩',
  `plant_income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户种养年纯收入',
  `vehicle_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭机动车价值',
  `other_assets_value` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭其他资产名称',
  `debt_amount` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭负债金额',
  `debt_desc` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭负债原因',
  `honor_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭成员获得的社会荣誉名称',
  `honor_level` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭成员获得的社会荣誉级别 1-村镇级 2-县级以上',
  `criminal_record` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '近五年农户家庭成员是否存在犯罪记录 1-是 2-否',
  `credit_status` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '近五年农户家庭成员是否存在犯罪记录 1.存在信用记录且正常 2.信用记录空白?3.近?5?年内存在不良信用记录',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '定安、澄迈' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_farmer_hk
-- ----------------------------
DROP TABLE IF EXISTS `t_farmer_hk`;
CREATE TABLE `t_farmer_hk`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `farmer_id` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '农户主表id',
  `area` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `farmer_type` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭年收入金额  单位：万元',
  `income_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭年收入主要来源',
  `pay_out` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭年支出金额  单位：万元',
  `pay_out_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭年支出主要用途',
  `income_and_expenditure` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭年收支盈余',
  `house_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户农房面积',
  `house_struct` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户农房结构 1.砖木 2.砖混?3.钢混',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户土地经营面积 单位：亩',
  `plant_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户种养种类',
  `plant_income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户种养年纯收入',
  `vehicle_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭机动车价值',
  `other_assets_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭其他资产名称',
  `other_assets_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭其他资产价值',
  `debt_amount` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭负债金额',
  `debt_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭负债原因',
  `honor_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭成员获得的社会荣誉名称',
  `honor_level` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭成员获得的社会荣誉级别 1-村镇级 2-县级以上',
  `criminal_record` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '近五年农户家庭成员是否存在犯罪记录 1-是 2-否',
  `credit_status` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户主要劳动力信用（征信）记录情况 1.存在信用记录且正常 2.信用记录空白?3.近?5?年内存在不良信用记录',
  `villages_gov` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_farmer_hk_his
-- ----------------------------
DROP TABLE IF EXISTS `t_farmer_hk_his`;
CREATE TABLE `t_farmer_hk_his`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `farmer_id` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '农户主表id',
  `area` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `farmer_type` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭年收入金额  单位：万元',
  `income_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭年收入主要来源',
  `pay_out` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭年支出金额  单位：万元',
  `pay_out_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭年支出主要用途',
  `income_and_expenditure` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭年收支盈余',
  `house_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户农房面积',
  `house_struct` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户农房结构 1.砖木 2.砖混?3.钢混',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户土地经营面积 单位：亩',
  `plant_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户种养种类',
  `plant_income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户种养年纯收入',
  `vehicle_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭机动车价值',
  `other_assets_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭其他资产名称',
  `other_assets_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭其他资产价值',
  `debt_amount` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭负债金额',
  `debt_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭负债原因',
  `honor_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭成员获得的社会荣誉名称',
  `honor_level` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户家庭成员获得的社会荣誉级别 1-村镇级 2-县级以上',
  `criminal_record` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '近五年农户家庭成员是否存在犯罪记录 1-是 2-否',
  `credit_status` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户主要劳动力信用（征信）记录情况 1.存在信用记录且正常 2.信用记录空白?3.近?5?年内存在不良信用记录',
  `villages_gov` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_farmer_main
-- ----------------------------
DROP TABLE IF EXISTS `t_farmer_main`;
CREATE TABLE `t_farmer_main`  (
  `farmer_id` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键id',
  `person_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '户主姓名',
  `home_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '户号',
  `card_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `education` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学历',
  `marital_status` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '婚姻状态',
  `work_count` int(11) NULL DEFAULT NULL COMMENT '劳动力数',
  `person_count` int(11) NULL DEFAULT NULL COMMENT '家庭人口数',
  `area` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `credit_score` decimal(16, 0) NULL DEFAULT NULL COMMENT '评分',
  `credit_level` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评级',
  `farmer_tab_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '明细表名称',
  `collect_task_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '采集任务编号',
  `collect_time` datetime(0) NULL DEFAULT NULL COMMENT '采集时间',
  `collect_status` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '采集状态',
  `create_time` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `update_time` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `eva_status` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0-未初评，1-已初评，2-已评定',
  `del_flag` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '0-正常 1-已删除',
  PRIMARY KEY (`farmer_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '农户信息主表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_farmer_main_his
-- ----------------------------
DROP TABLE IF EXISTS `t_farmer_main_his`;
CREATE TABLE `t_farmer_main_his`  (
  `farmer_id` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键id',
  `person_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '户主姓名',
  `home_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '户号',
  `card_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `education` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学历',
  `marital_status` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '婚姻状态',
  `work_count` int(11) NULL DEFAULT NULL COMMENT '劳动力数',
  `person_count` int(11) NULL DEFAULT NULL COMMENT '家庭人口数',
  `area` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `credit_score` decimal(16, 0) NULL DEFAULT NULL COMMENT '评分',
  `credit_level` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评级',
  `farmer_tab_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '明细表名称',
  `collect_task_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '采集任务编号',
  `collect_time` datetime(0) NULL DEFAULT NULL COMMENT '采集时间',
  `collect_status` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '采集状态',
  `create_time` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `update_time` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间',
  `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `eva_status` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0-未初评，1-已初评，2-已评定',
  `del_flag` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '0-正常 1-已删除',
  `his_time` datetime(0) NULL DEFAULT NULL,
  `his_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `supporting_file_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`farmer_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '农户信息主表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_farmer_qz
-- ----------------------------
DROP TABLE IF EXISTS `t_farmer_qz`;
CREATE TABLE `t_farmer_qz`  (
  `id` int(11) NOT NULL COMMENT '主键',
  `farmer_id` int(11) NOT NULL COMMENT '农户id',
  `area` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `farmer_type` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `age_select` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年龄1.18-25岁（含） 2.25-55岁（含） 3.55-65岁（含）4.65岁以上',
  `income` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年度总收入1.2万元以下 2.2-5万元 3.5万元以上',
  `debt_desc` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '不良贷款记录1.无贷款记录 2.有贷款记录且无不良',
  `asset_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '存量资产额1.2万元以下 2.2-10万元 3.10万元以上',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '耕地面积1.2亩 2.2-8亩 3.8-12亩 4.12亩以上',
  `house_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营用房面积1.0-150平方米 2.150-300平方米 3.300平方米以上',
  `forest_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经济用林面积1.0-150平方米 2.150-300平方米 3.300平方米以上',
  `insurance_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '参保信息1.未参加 2.参加财产保险 3.参加人寿保险 4.参加农业保险 5.参加城乡居民医保（多选）',
  `vehicle_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '运输工具1.有家庭性车辆 2.有生产性机具 3.有经营性车辆（多选）',
  `honor_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '荣誉信息1.人大代表（政协委员） 2.劳动模范（致富带头人） 3.转退伍军人 4.村干部 5.党员',
  `villages_gov` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '琼中' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_farmer_sy
-- ----------------------------
DROP TABLE IF EXISTS `t_farmer_sy`;
CREATE TABLE `t_farmer_sy`  (
  `id` int(11) NOT NULL COMMENT '主键',
  `farmer_id` int(11) NOT NULL COMMENT '农户主表id',
  `area` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `farmer_type` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年经营收入 单位：万元',
  `pay_out` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年经营成本 单位：万元',
  `net_income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭年净收入 单位：万元',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '实际经营土地面积? 单位：亩',
  `house_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农房面积*? 单位：平方米',
  `debt_amount` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭负债金额* 单位：万元',
  `house_count` int(10) NULL DEFAULT NULL COMMENT '商品房单位：套',
  `vehicle_count` int(10) NULL DEFAULT NULL COMMENT '小汽车单位：辆',
  `villages_gov` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '三亚' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_farmer_wc
-- ----------------------------
DROP TABLE IF EXISTS `t_farmer_wc`;
CREATE TABLE `t_farmer_wc`  (
  `id` int(11) NOT NULL COMMENT '主键',
  `farmer_id` int(11) NOT NULL COMMENT '农户id',
  `area` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `farmer_type` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `income_and_expenditure` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收支盈余* 选项1.-2至0万元 2.0至2万元 3.2至5万元 4.5万元以上',
  `house_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '宅基地面积选项1.0至150平方米 2.150至300平方米 3.300平方米及以上',
  `house_date` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭住房建成时间*? 选项1.2015年之前建成 2.2015年之后建成',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '种养殖地面积* 选项1.0至10亩 2.10至20亩 3.20亩以上',
  `land_income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '种养年纯收入* 选项1.0-3万元 2.3-8万元 3.8万元以上',
  `vehicle_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '机动车现价* 选项1.5万元以下 2.5-15万元 3.15万元以上',
  `other_assets_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产选项1.5万元以下 2.5-10万元 3.10万元以上',
  `debt_desc` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '贷款信息（包括银行、支付宝、微信、白条等借款）* 选项 1.无贷款记录 2.有贷款记录且无不良 3.有不良贷款记录',
  `insurance` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '参加商业保险选项 1.是 2.否',
  `country_insurance` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '参加城乡居民医疗保险选项 1.是 2.否',
  `honor_level` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭成员获得的社会荣誉选项 1.村镇级? 2.县市级及以上',
  `criminal_record` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '近五年农户家庭成员是否存在犯罪记录* 选项1.是? 2.否',
  `villages_gov` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '文昌' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_farmer_wzs
-- ----------------------------
DROP TABLE IF EXISTS `t_farmer_wzs`;
CREATE TABLE `t_farmer_wzs`  (
  `id` int(11) NOT NULL COMMENT '主键',
  `farmer_id` int(11) NOT NULL COMMENT '农户主表id',
  `area` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '区域',
  `farmer_type` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收入金额* 单位：万元',
  `income_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收入主要来源* 给100字符描写家庭年收入主要来源',
  `pay_out` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出金额* 单位：万元',
  `pay_out_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出主要用途* 给100字符描写家庭年支出主要用途',
  `income_and_expenditure` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收支盈余',
  `house_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农房面积*? 单位：平方米',
  `house_struct` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农房结构*? 选项1.砖木 2.砖混 3.钢混',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '土地经营面积*? 单位：亩',
  `plant_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户种养种类* 给100字符描写农户种养种类',
  `plant_income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '种养年纯收入* 单位：万元',
  `vehicle_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '机动车价值* 单位：万元',
  `other_assets_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产名称* 给100字符描写家庭其他资产',
  `other_assets_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产价值* 单位：万元',
  `debt_amount` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债金额* 单位：万元',
  `debt_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债原因给100字符描写家庭负债原因',
  `honor_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭成员获得的社会荣誉名称给100字符描写家庭成员获得的社会荣誉',
  `honor_level` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '家庭成员获得的社会荣誉级别选项1.村镇级? 2.县级以上',
  `criminal_record` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '近五年农户家庭成员是否存在犯罪记录* 选项1.是? 2.否',
  `credit_status` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户主要劳动力信用（征信）记录情况选项 1.存在信用记录且正常 2.信用记录空白 3.近5年内存在不良信用记录',
  `insurance_info` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '参保信息选项1.未参保 2.参加财产保险 3.参加人寿保险 4.参加农业保险 5参加城乡居民医保（多选）',
  `vehicle_info` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '运输工具信息选项1.有家庭性车辆 2.有生产性机具 3.有经营性车辆（多选）',
  `honor_info` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '荣誉信息选项1.人大代表（政协委员）2.劳动模范（致富带头人）3.转退伍军人 4.村干部 5.党员',
  `villages_gov` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '五指山、乐东、屯昌' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
