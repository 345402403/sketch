/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : sketch

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 06/01/2022 16:05:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for personalInfo
-- ----------------------------
DROP TABLE IF EXISTS `personalInfo`;
CREATE TABLE `personalInfo`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `gender` int(11) NULL DEFAULT NULL COMMENT '性别 1:男 2：女',
  `birthday` datetime(0) NULL DEFAULT NULL COMMENT '出生日期',
  `phone` bigint(11) NULL DEFAULT NULL COMMENT '联系电话',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `identity` bigint(11) NULL DEFAULT NULL COMMENT '身份证号',
  `education` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学历',
  `school` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '毕业学校',
  `img_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '照片url',
  `work_status` int(11) NULL DEFAULT NULL COMMENT '工作状态：1:正式 2:试用 3:实习 4:离职',
  `department_id` int(11) NULL DEFAULT NULL COMMENT '部门id',
  `position_id` int(11) NULL DEFAULT NULL COMMENT '职位id',
  `begin_date` datetime(0) NULL DEFAULT NULL COMMENT '入职时间',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of personalInfo
-- ----------------------------
INSERT INTO `personalInfo` VALUES (1, '张三', 1, '1991-12-20 00:00:00', 18888888888, 'xxxx@qq.com', 430600199112200000, '本科', 'xxx大学', 'http://image.timelost.cn/ehr/1638690037555893842.jpg', 2, 1, 1, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for roleInfo
-- ----------------------------
DROP TABLE IF EXISTS `roleInfo`;
CREATE TABLE `roleInfo`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `permission_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of roleInfo
-- ----------------------------
INSERT INTO `roleInfo` VALUES (1, 'admin', '管理员', NULL);
INSERT INTO `roleInfo` VALUES (2, 'userInfo', '普通用户', NULL);

-- ----------------------------
-- Table structure for userInfo
-- ----------------------------
DROP TABLE IF EXISTS `userInfo`;
CREATE TABLE `userInfo`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `salt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `role_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userInfo
-- ----------------------------
INSERT INTO `userInfo` VALUES (1, 'admin', '2750c0b8de30d4286c0c88876ccfa795', 'LlDnqkuxHQ', 1);
INSERT INTO `userInfo` VALUES (2, 'test', '20ca5ce0b375619db93ea45c54adb155', 'dHdgflonAX', 2);

SET FOREIGN_KEY_CHECKS = 1;

-- ----------------------------
-- 捐赠需求信息
-- ----------------------------
CREATE TABLE `demand_info` (
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `demand_code` varchar(255) DEFAULT NULL COMMENT '需求Code',
   `demand_name` varchar(255) DEFAULT NULL COMMENT '需求名称',
   `demand_status` tinyint(3) DEFAULT 0 COMMENT '需求状态，0：未发布,1:已发布,2:已结束',
   `host_name` varchar(255) DEFAULT NULL COMMENT '需求单位名称',
   `host_contacts` varchar(32) DEFAULT NULL COMMENT '需求单位联系人',
   `host_phone`  varchar(32) DEFAULT NULL COMMENT '需求单位电话',
   `begin_date` datetime DEFAULT NULL COMMENT '开始日期',
   `end_date` datetime DEFAULT NULL COMMENT '结束日期',
   `desc` varchar(255) DEFAULT NULL COMMENT '需求描述',
   `create_time` datetime DEFAULT NULL,
   `update_time` datetime DEFAULT NULL,
   PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

