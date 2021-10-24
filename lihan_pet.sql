/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : lihan_pet

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 24/10/2021 22:21:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for app_version
-- ----------------------------
DROP TABLE IF EXISTS `app_version`;
CREATE TABLE `app_version`  (
  `app_version_id` int(11) NOT NULL AUTO_INCREMENT,
  `app_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `app_version` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`app_version_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of app_version
-- ----------------------------

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `comment_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `comment_parent_id` bigint(20) NOT NULL COMMENT '回复评论id',
  `comment_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评论内容',
  `createdon` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `createdby` bigint(20) NULL DEFAULT NULL COMMENT '创建人id',
  PRIMARY KEY (`comment_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `order_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '订单号',
  `order_status` tinyint(1) NULL DEFAULT NULL COMMENT '订单状态(1.待揽件、2.已揽件、3.已取消、4.派送中、5.已完成)',
  `transport_type` tinyint(4) NULL DEFAULT NULL COMMENT '运输方式',
  `appointment_time` datetime(0) NULL DEFAULT NULL COMMENT '预约揽件时间',
  `pickup_time` datetime(0) NULL DEFAULT NULL COMMENT '揽件时间',
  `shipping_code` tinyint(4) NULL DEFAULT NULL COMMENT '寄件码',
  `send_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '寄件地址',
  `member_id` bigint(20) NULL DEFAULT NULL COMMENT '寄件用户id',
  `send_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '寄件人姓名',
  `send_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '寄件人手机号',
  `receive_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收件地址',
  `receive_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收件人姓名',
  `receive_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收件人手机号',
  `transporter_id` bigint(20) NULL DEFAULT NULL COMMENT '揽件人id',
  `createdon` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `createdby` bigint(20) NULL DEFAULT NULL COMMENT '创建人id',
  `modifiedon` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `modifiedby` bigint(20) NULL DEFAULT NULL COMMENT '修改人id',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for pet
-- ----------------------------
DROP TABLE IF EXISTS `pet`;
CREATE TABLE `pet`  (
  `pet_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '宠物id',
  `pet_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '宠物名字',
  `pet_type` tinyint(4) NULL DEFAULT NULL COMMENT '宠物类别',
  `pet_size` tinyint(4) NULL DEFAULT NULL COMMENT '宠物体型',
  `pet_weight` float(3, 2) NULL DEFAULT NULL COMMENT '宠物体重',
  `medical_history` tinyint(4) NULL DEFAULT NULL COMMENT '有无过往病史',
  `medical_detail` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '病史详情',
  `pet_picture` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '宠物照片地址',
  `createdon` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `createdby` bigint(20) NULL DEFAULT NULL COMMENT '创建人id',
  `modifiedon` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `modifiedby` bigint(20) NULL DEFAULT NULL COMMENT '修改人id',
  PRIMARY KEY (`pet_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pet
-- ----------------------------

-- ----------------------------
-- Table structure for place
-- ----------------------------
DROP TABLE IF EXISTS `place`;
CREATE TABLE `place`  (
  `place_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '网点id',
  `place_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '网点名称',
  `province_code` bigint(20) NULL DEFAULT NULL COMMENT '所在省code',
  `city_code` bigint(20) NULL DEFAULT NULL COMMENT '所在市code',
  `area_code` bigint(20) NULL DEFAULT NULL COMMENT '所在区县code',
  `createdon` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `createdby` bigint(20) NULL DEFAULT NULL COMMENT '创建人id',
  `modifiedon` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `modifiedby` bigint(20) NULL DEFAULT NULL COMMENT '修改人id',
  PRIMARY KEY (`place_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of place
-- ----------------------------

-- ----------------------------
-- Table structure for transporter
-- ----------------------------
DROP TABLE IF EXISTS `transporter`;
CREATE TABLE `transporter`  (
  `transporter_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '运输员id',
  `transporter_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '运输员姓名',
  `transporter_password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录密码',
  `transporter_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '运输员手机号',
  `transporter_avatar` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像图片地址',
  `palce_id` bigint(20) NULL DEFAULT NULL COMMENT '负责网点id',
  `createdon` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `createdby` bigint(20) NULL DEFAULT NULL COMMENT '创建人id',
  `modifiedon` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `modifiedby` bigint(20) NULL DEFAULT NULL COMMENT '修改人id',
  PRIMARY KEY (`transporter_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of transporter
-- ----------------------------

-- ----------------------------
-- Table structure for waybill
-- ----------------------------
DROP TABLE IF EXISTS `waybill`;
CREATE TABLE `waybill`  (
  `waybill_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '运单id',
  `waybill_no` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '运单号',
  `order_id` bigint(20) NULL DEFAULT NULL COMMENT '订单id',
  `order_no` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单号',
  `receiving_code` tinyint(4) NULL DEFAULT NULL COMMENT '收件码',
  `pet_id` bigint(20) NULL DEFAULT NULL COMMENT '宠物id',
  `device_imei` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '设备编号',
  `waybill_type` tinyint(4) NULL DEFAULT NULL COMMENT '运单运输方式',
  `waybill_status` tinyint(4) NULL DEFAULT NULL COMMENT '运单状态',
  `send_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '寄件地址',
  `receive_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收件地址',
  `transporter_id` bigint(20) NULL DEFAULT NULL COMMENT '派件员id',
  `createdon` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `createdby` bigint(20) NULL DEFAULT NULL COMMENT '创建人id',
  `modifiedon` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `modifiedby` bigint(20) NULL DEFAULT NULL COMMENT '修改人id',
  PRIMARY KEY (`waybill_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of waybill
-- ----------------------------

-- ----------------------------
-- Table structure for waybill_node
-- ----------------------------
DROP TABLE IF EXISTS `waybill_node`;
CREATE TABLE `waybill_node`  (
  `waybill_node_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '运单节点id',
  `waybill_id` bigint(20) NULL DEFAULT NULL COMMENT '运单id',
  `waybill_no` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '运单号',
  `waybill_node_time` datetime(0) NULL DEFAULT NULL COMMENT '运单节点时间',
  `waybill_node_status` tinyint(4) NULL DEFAULT NULL COMMENT '节点运输状态',
  `transport_type` tinyint(4) NULL DEFAULT NULL COMMENT '节点运输类型',
  `conveyance_info` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '运输工具信息',
  `start_station` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '始发站',
  `end_station` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '终点站',
  `estimate_time` datetime(0) NULL DEFAULT NULL COMMENT '预计到达时间',
  `createdon` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `createdby` bigint(20) NULL DEFAULT NULL COMMENT '创建人id',
  PRIMARY KEY (`waybill_node_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of waybill_node
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
