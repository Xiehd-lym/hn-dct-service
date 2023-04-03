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

 Date: 03/04/2023 21:28:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_newfarmer_bt
-- ----------------------------
DROP TABLE IF EXISTS `t_newfarmer_bt`;
CREATE TABLE `t_newfarmer_bt`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `farmer_id` int(11) NULL DEFAULT NULL COMMENT '新型农业主体id',
  `area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `farmer_type` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收入金额 * 单位：万元',
  `income_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收入主要来源 * 给100字符描写经营主体年收入主要来源',
  `pay_out` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出金额 * 单位：万元',
  `pay_out_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出主要用途 * 给100字符描写经营主体年支出主要用途',
  `income_and_expenditure` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `house_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营用房情况 *  单位：平方米',
  `house_struct` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营用房结构 *  选项1.砖木 2.砖混 3.钢混',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营土地使用面积 *  单位：亩',
  `plant_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '种养种类 * 选项1.农产品种养 2.农产品加工、贸易 3.农资生产、贸易（可多选）',
  `plant_income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '流动资产 * 单位：万元',
  `vehicle_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '机动车价值 * 单位：万元',
  `other_assets_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产名称 * 给100字符描写经营主体其他资产',
  `other_assets_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产价值 * 单位：万元',
  `debt_amount` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债金额 * 单位：万元',
  `debt_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债原因 给100字符描写经营主体负债原因',
  `honor_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营主体及所有者获得的社会荣誉名称 给100字符描写家庭成员获得的社会荣誉',
  `honor_level` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营主体及所有者获得的社会荣誉级别 选项1.村镇级  2.县级以上',
  `criminal_record` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '近五年经营主体及所有者是否存在犯罪记录 * 选项1.是  2.否',
  `credit_status` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所有者（负责人）信用（征信）记录情况 选项 1.存在信用记录且正常 2.信用记录空白 3.近5年内存在不良信用记录',
  `villages_gov` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '保亭					' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_newfarmer_da
-- ----------------------------
DROP TABLE IF EXISTS `t_newfarmer_da`;
CREATE TABLE `t_newfarmer_da`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `farmer_id` int(11) NULL DEFAULT NULL COMMENT '新型农业主体id',
  `area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `farmer_type` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `income_and_expenditure` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营主体年收支盈余 * 选项 1.0 万元以下 2.0 至 10 万元 3.10 至 30 万元4.30 万元以上',
  `income_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收入主要来源 * 给 100 字符描写家庭年收入主要来源',
  `pay_out_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出主要用途 * 给 100 字符描写家庭年支出主要用途',
  `house_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营用房面积 * 选项 1.0 至 150 平方米 2.150 至 300 平方米 3.300 平方米以上',
  `house_struct` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营用房结构 *  选项 1.砖木 2.砖混 3.钢混',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '土地经营面积 * 选项 1.0 至 20 亩 2.20 至 40 亩 3.40 亩以上',
  `plant_income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '流动资产 * 选项 1.0-10 万元 2.10-30 万元 3.30 万元以上',
  `vehicle_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '机动车价值 * 选项 1.0-15 万元 2.15-30 万元 3.30 万元以上',
  `other_assets_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产价值 * 选项 1.0-10 万元 2.10-30 万元 3.30 万元以上',
  `debt_amount` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债金额 * 选项 1.0-10 万元 2.10-50 万元 3.50 万元以上',
  `debt_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债原因 给 100 字符描写经营主体负债原因',
  `honor_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '获得的社会荣誉名称 给 100 字符描写家庭成员获得的社会荣誉',
  `honor_level` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '获得的社会荣誉级别 选项 1.村镇级  2.县级以上',
  `criminal_record` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '近五年经营主体及所有者是否存在犯罪记录 * 选项 1.是  2.否',
  `credit_status` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所有者（负责人）信 用（征信）记录情况 选项 1.存在信用记录且正常 2.信用记录空白 3.近 5 年内存在不良信用记录',
  `villages_gov` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '定安、澄迈						' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_newfarmer_hk
-- ----------------------------
DROP TABLE IF EXISTS `t_newfarmer_hk`;
CREATE TABLE `t_newfarmer_hk`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `farmer_id` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新型农业主体id',
  `area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `farmer_type` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收入金额 * 单位： 万元',
  `income_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收入主要来源 * 给 100 字符描写经营主体年收入主要来源',
  `pay_out` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出金额 * 单位： 万元',
  `pay_out_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出主要用途 * 给 100 字符描写经营主体年支出主要用途',
  `income_and_expenditure` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `house_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用房情况 *  单位： 平方米',
  `house_struct` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用房结构 *  选项 1.砖木 2.砖混 3.钢混',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '土地使用面积 *  单位： 亩',
  `plant_type` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营种类 * 选项 1.农产品种养 2.农产品加工、贸易 3.农资生 产、贸易',
  `plant_income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '流动资产 * 单位： 万元',
  `vehicle_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '机动车价值 * 单位： 万元',
  `other_assets_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产名称 * 给 100 字符描写经营主体其他资产',
  `other_assets_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产价值 * 单位： 万元',
  `debt_amount` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债金额 * 单位： 万元',
  `debt_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债原因 给 100 字符描写经营主体负债原因',
  `honor_desc` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '社会荣誉名称 给 100 字符描写家庭成员获得的社会荣誉',
  `honor_level` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '社会荣誉级别 选项 1.村镇级  2.县级以上',
  `criminal_record` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '近五年经营主体及所有者是否存在犯罪记录 * 选项 1.是  2.否',
  `credit_status` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所有者（负责人）信用 （征信） 记录情况 选项 1.存在信用记录且正常 2.信用记录空白 3.近 5 年内存在不良信用记录',
  `villages_gov` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_newfarmer_hk_his
-- ----------------------------
DROP TABLE IF EXISTS `t_newfarmer_hk_his`;
CREATE TABLE `t_newfarmer_hk_his`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `farmer_id` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新型农业主体id',
  `area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `farmer_type` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收入金额 * 单位： 万元',
  `income_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收入主要来源 * 给 100 字符描写经营主体年收入主要来源',
  `pay_out` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出金额 * 单位： 万元',
  `pay_out_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出主要用途 * 给 100 字符描写经营主体年支出主要用途',
  `income_and_expenditure` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `house_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用房情况 *  单位： 平方米',
  `house_struct` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用房结构 *  选项 1.砖木 2.砖混 3.钢混',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '土地使用面积 *  单位： 亩',
  `plant_type` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营种类 * 选项 1.农产品种养 2.农产品加工、贸易 3.农资生 产、贸易',
  `plant_income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '流动资产 * 单位： 万元',
  `vehicle_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '机动车价值 * 单位： 万元',
  `other_assets_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产名称 * 给 100 字符描写经营主体其他资产',
  `other_assets_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产价值 * 单位： 万元',
  `debt_amount` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债金额 * 单位： 万元',
  `debt_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债原因 给 100 字符描写经营主体负债原因',
  `honor_desc` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '社会荣誉名称 给 100 字符描写家庭成员获得的社会荣誉',
  `honor_level` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '社会荣誉级别 选项 1.村镇级  2.县级以上',
  `criminal_record` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '近五年经营主体及所有者是否存在犯罪记录 * 选项 1.是  2.否',
  `credit_status` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所有者（负责人）信用 （征信） 记录情况 选项 1.存在信用记录且正常 2.信用记录空白 3.近 5 年内存在不良信用记录',
  `villages_gov` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '海口、儋州、白沙、万宁、陵水、昌江、临高、东方、琼海等 9 个市县' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_newfarmer_ld
-- ----------------------------
DROP TABLE IF EXISTS `t_newfarmer_ld`;
CREATE TABLE `t_newfarmer_ld`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `farmer_id` int(11) NULL DEFAULT NULL COMMENT '新型农业主体id',
  `area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `farmer_type` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `obj_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '企业名称',
  `obj_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '统一社会信用代码',
  `registered_capital` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '注册资本',
  `obj_addr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营地址',
  `obj_create_date` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '成立时间',
  `income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收入金额 * 单位：万元',
  `income_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收入主要来源 * 给100字符描写经营主体年收入主要来源',
  `pay_out` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出金额 * 单位：万元',
  `pay_out_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出主要用途 * 给100字符描写经营主体年支出主要用途',
  `income_and_expenditure` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `house_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营用房情况 *  单位：平方米',
  `house_struct` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营用房结构 *  选项1.砖木 2.砖混 3.钢混',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营土地使用面积 *  单位：亩',
  `plant_type` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '种养种类 * 选项1.农产品种养 2.农产品加工、贸易 3.农资生产、贸易',
  `plant_income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '流动资产 * 单位：万元',
  `vehicle_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '机动车价值 * 单位：万元',
  `other_assets_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产名称 * 给100字符描写经营主体其他资产',
  `other_assets_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产价值 * 单位：万元',
  `debt_amount` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债金额 * 单位：万元',
  `debt_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债原因 给100字符描写经营主体负债原因 给100字符描写家庭成员获得的社会荣誉',
  `honor_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营主体及所有者获得的社会荣誉名称 给100字符描写家庭成员获得的社会荣誉',
  `honor_level` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营主体及所有者获得的社会荣誉级别 选项1.村镇级  2.县级以上',
  `criminal_record` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '近五年经营主体及所有者是否存在犯罪记录 * 选项1.是  2.否',
  `credit_status` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所有者（负责人）信用（征信）记录情况 选项 1.存在信用记录且正常 2.信用记录空白 3.近5年内存在不良信用记录',
  `villages_gov` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '乐东 						' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_newfarmer_main
-- ----------------------------
DROP TABLE IF EXISTS `t_newfarmer_main`;
CREATE TABLE `t_newfarmer_main`  (
  `farmer_id` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键id',
  `person_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所有者（负责人）姓名',
  `card_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `education` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学历',
  `marital_status` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '婚姻状态',
  `work_count` int(11) NULL DEFAULT NULL COMMENT '经营主体劳动力数',
  `area` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `credit_score` decimal(16, 0) NULL DEFAULT NULL COMMENT '评分',
  `credit_level` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评级',
  `detail_tab_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '明细表名称',
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
) ENGINE = MyISAM AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '新型农业主体信息主表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_newfarmer_main_his
-- ----------------------------
DROP TABLE IF EXISTS `t_newfarmer_main_his`;
CREATE TABLE `t_newfarmer_main_his`  (
  `farmer_id` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键id',
  `person_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所有者（负责人）姓名',
  `card_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `education` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学历',
  `marital_status` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '婚姻状态',
  `work_count` int(11) NULL DEFAULT NULL COMMENT '经营主体劳动力数',
  `area` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `credit_score` decimal(16, 0) NULL DEFAULT NULL COMMENT '评分',
  `credit_level` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评级',
  `detail_tab_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '明细表名称',
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
) ENGINE = MyISAM AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '新型农业主体信息主表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_newfarmer_qz
-- ----------------------------
DROP TABLE IF EXISTS `t_newfarmer_qz`;
CREATE TABLE `t_newfarmer_qz`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `farmer_id` int(11) NULL DEFAULT NULL COMMENT '新型农业主体id',
  `area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `farmer_type` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `obj_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营主体名称',
  `industry` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属行业',
  `age_select` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年龄',
  `income_and_expenditure` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收支盈余 *选项1.10万以下 2.10-30万元 3.30万元以上',
  `income_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收入主要来源 * 给100字符描写经营主体年收入主要来源',
  `pay_out_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出主要用途 * 给100字符描写经营主体年支出主要用途',
  `assets_debts_structure` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资产负债结构 *选项1.结构不合理，短债长用现象较为严重，或者存在到期债务过度集中的问题 2.结构较为合理，基本不存在短债长用现象，注意对流动性和债务到期的管理 3.结构合理，流动性管理好，不存在短债长用现象',
  `credit_status` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '信用记录 * 选项1.存在信用记录且正常 2.信用记录空白 3.近5年内存在不良信用记录（非恶意逾期）',
  `house_area` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营用房情况 * 选项1.0-150平方米 2.150-300平方米 3.300平方米以上米',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '土地经营面积 * 选项1.0-20亩 3.20-40亩 4.40亩以上',
  `plant_income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '流动资产 * 选项1.0-10万元 2.10-30万元 3.30万元以上',
  `vehicle_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '机动车价值 * 选项1.0-15万元 2.15-30万元 3.30万元以上',
  `honor_level` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '荣誉信息 选项1.村镇级  2.县级以上',
  `villages_gov` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '琼中 						' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_newfarmer_sy
-- ----------------------------
DROP TABLE IF EXISTS `t_newfarmer_sy`;
CREATE TABLE `t_newfarmer_sy`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `farmer_id` int(11) NULL DEFAULT NULL COMMENT '新型农业主体id',
  `area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `farmer_type` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收入金额 * 单位：万元',
  `income_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收入主要来源 * 给100字符描写经营主体年收入主要来源',
  `pay_out` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出金额 * 单位：万元',
  `pay_out_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出主要用途 * 给100字符描写经营主体年支出主要用途',
  `income_and_expenditure` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `house_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营用房情况 *  单位：平方米',
  `house_struct` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营用房结构 *  选项1.砖木 2.砖混 3.钢混',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营土地使用面积 *  单位：亩',
  `plant_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '种养种类 * 给100字符描写经营主体种养种类',
  `plant_income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '流动资产 * 单位：万元',
  `vehicle_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '机动车价值 * 单位：万元',
  `other_assets_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产名称',
  `other_assets_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产价值 * 单位：万元',
  `debt_amount` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债金额 * 单位：万元',
  `debt_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债原因 给100字符描写经营主体负债原因',
  `honor_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营主体及所有者获得的社会荣誉名称 给100字符描写家庭成员获得的社会荣誉',
  `honor_level` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营主体及所有者获得的社会荣誉级别 选项1.村镇级  2.县级以上',
  `criminal_record` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '近五年经营主体及所有者是否存在犯罪记录 * 选项1.是  2.否',
  `credit_status` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所有者（负责人）信用（征信）记录情况 选项 1.存在信用记录且正常 2.信用记录空白 3.近5年内存在不良信用记录',
  `prospect` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农产品销售 选项1.前景好 2.一般 3.较差',
  `disaster_response` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农业灾害应对能力 选项1.前景好 2.一般 3.较差',
  `villages_gov` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '三亚 						' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_newfarmer_wc
-- ----------------------------
DROP TABLE IF EXISTS `t_newfarmer_wc`;
CREATE TABLE `t_newfarmer_wc`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `farmer_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新型农业主体id',
  `area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `farmer_type` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `income_and_expenditure` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收支盈余',
  `house_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营用房面积 * 选项1.0至150平方米 2.150至300平方米 3.300平方米及以上',
  `house_struct` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营用房结构 *  选项1.砖木 2.砖混 3.钢混',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '土地经营面积 *  选项1.0至20亩 2.20至40亩 3.40亩以上',
  `plant_income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '流动资产 * 选项1.0-10万元 2.10-30万元 3.30万元以上',
  `vehicle_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '机动车价值 * 选项1.0-15万元 2.15-30万元 3.30万元以上',
  `other_assets_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产 * 选项1.0-10万元 2.10-30万元 3.30万元以上',
  `debt_desc` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '贷款信息（包括银行、支付宝、微信、白条等借款） * 选项 1.无贷款记录 2.有贷款记录且无不良 3.有不良贷款记录',
  `honor_level` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营主体（所有者）获得的社会荣誉 选项1.村镇级  2.县级以上',
  `criminal_record` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '近五年经营主体及所有者是否存在犯罪记录 * 选项1.是  2.否',
  `villages_gov` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '文昌 						' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_newfarmer_wzs
-- ----------------------------
DROP TABLE IF EXISTS `t_newfarmer_wzs`;
CREATE TABLE `t_newfarmer_wzs`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `farmer_id` int(11) NOT NULL COMMENT '新型农业主体id',
  `area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区域',
  `farmer_type` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '农户类型',
  `income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收入金额 * 单位：万元',
  `income_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年收入主要来源 * 给100字符描写经营主体年收入主要来源',
  `pay_out` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出金额 * 单位：万元',
  `pay_out_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年支出主要用途 * 给100字符描写经营主体年支出主要用途',
  `income_and_expenditure` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收支盈余',
  `house_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营用房情况 单位：平方米',
  `house_struct` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营用房结构 选项1.砖木 2.砖混 3.钢混',
  `land_area` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营使用土地面积 单位：亩',
  `plant_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营种类 给100字符描写经营主体种养种类',
  `plant_income` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营主体流动资产 单位：万元',
  `vehicle_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '机动车价值 单位：万元',
  `other_assets_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产名称 * 给100字符描写经营主体其他资产',
  `other_assets_value` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '其他资产价值 单位：万元',
  `debt_amount` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债金额 单位：万元',
  `debt_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负债原因',
  `honor_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营主体及所有者获得的社会荣誉名称',
  `honor_level` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经营主体及所有者获得的社会荣誉级别 选项1.村镇级? 2.县级以上',
  `criminal_record` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '近五年经营主体及所有者是否存在犯罪记录  选项1.是? 2.否',
  `credit_status` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所有者（负责人）信用（征信）记录情况 选项 1.存在信用记录且正常 2.信用记录空白 3.近5年内存在不良信用记录',
  `insurance_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '法人代表参保信息 选项1.未参保 2.参加财产保险 3.参加人寿保险 4.参加农业保险 5参加城乡居民医保（多选）',
  `vehicle_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '运输工具信息 选项1.有家庭性车辆 2.有生产性机具 3.有经营性车辆（多选）',
  `honor_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '法人代表荣誉信息 选项1.人大代表（政协委员）2.劳动模范（致富带头人）3.转退伍军人 4.村干部 5.党员',
  `villages_gov` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '五指山' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
