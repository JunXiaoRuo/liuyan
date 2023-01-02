/*
 Navicat Premium Data Transfer

 Source Server         : 111
 Source Server Type    : MySQL
 Source Server Version : 50732
 Source Host           : localhost:3306
 Source Schema         : ssm_db

 Target Server Type    : MySQL
 Target Server Version : 50732
 File Encoding         : 65001

 Date: 02/01/2023 14:56:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_book
-- ----------------------------
DROP TABLE IF EXISTS `tbl_book`;
CREATE TABLE `tbl_book`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 38 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_book
-- ----------------------------
INSERT INTO `tbl_book` VALUES (1, '计算机理论', 'spring', '1');
INSERT INTO `tbl_book` VALUES (2, '计算机理论', 'mybatis', '2');
INSERT INTO `tbl_book` VALUES (3, '计算机理论', 'springMVC', '3');
INSERT INTO `tbl_book` VALUES (4, '计算机理论', 'ssm', '4');
INSERT INTO `tbl_book` VALUES (5, '市场营销', '直播1', '5');
INSERT INTO `tbl_book` VALUES (6, '市场营销', '直播2', '6');
INSERT INTO `tbl_book` VALUES (7, '市场营销', '直播3', '7');
INSERT INTO `tbl_book` VALUES (8, '市场营销', '直播4', '8');
INSERT INTO `tbl_book` VALUES (9, '市场营销', '直播5', '9');
INSERT INTO `tbl_book` VALUES (10, '市场营销', '直播6', '10');
INSERT INTO `tbl_book` VALUES (11, '市场营销', '直播7', '11');
INSERT INTO `tbl_book` VALUES (15, '测试123', '测试123', '测试123');
INSERT INTO `tbl_book` VALUES (16, '测试123', '测试123', '测试123');
INSERT INTO `tbl_book` VALUES (27, '123', '1234', '123');
INSERT INTO `tbl_book` VALUES (28, '123', '1233', '123');
INSERT INTO `tbl_book` VALUES (29, '123', '12311', '123');
INSERT INTO `tbl_book` VALUES (30, '测试1', '测试1', '测试1');
INSERT INTO `tbl_book` VALUES (33, '213', '12312', NULL);
INSERT INTO `tbl_book` VALUES (35, '测试123', '测试123', '测试123');
INSERT INTO `tbl_book` VALUES (36, '测试123', '测试123', '测试123');
INSERT INTO `tbl_book` VALUES (37, '测试123', '测试123', '测试123');

-- ----------------------------
-- Table structure for tbl_liuyan
-- ----------------------------
DROP TABLE IF EXISTS `tbl_liuyan`;
CREATE TABLE `tbl_liuyan`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 36 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_liuyan
-- ----------------------------
INSERT INTO `tbl_liuyan` VALUES (1, '灰太狼', '哈哈哈哈', 'https://s1.ax1x.com/2022/07/20/jbVobn.jpg');
INSERT INTO `tbl_liuyan` VALUES (2, '灰太狼', '嘻嘻嘻', NULL);
INSERT INTO `tbl_liuyan` VALUES (29, 'hhh ', '11111<br>2023/01/02 12:41:47', 'https://jrboy.oss-cn-chengdu.aliyuncs.com/love/2023/01/02/eaf4a93333a74fd3beee38d580b513711.jpg');
INSERT INTO `tbl_liuyan` VALUES (32, '用户2', '哈哈哈\n<br>2023/01/02 13:05:17', NULL);
INSERT INTO `tbl_liuyan` VALUES (33, '用户2', '你好呀<br>2023/01/02 13:13:05', 'https://jrboy.oss-cn-chengdu.aliyuncs.com/love/2023/01/02/f51d9305eab94ac7ac5eb12abb273d591.jpg');
INSERT INTO `tbl_liuyan` VALUES (34, '用户2', '你好呀<br>2023/01/02 13:15:46', 'https://jrboy.oss-cn-chengdu.aliyuncs.com/love/2023/01/02/c5d106d6f0f14fbaa743c23c07f51b6f1.jpg');
INSERT INTO `tbl_liuyan` VALUES (35, '12345', '1111111<br>2023/01/02 13:29:03', 'https://jrboy.oss-cn-chengdu.aliyuncs.com/liuyan/2023/01/02/7d2ff9c63c6149d0b1f7385fe16f43ee1.jpg');

-- ----------------------------
-- Table structure for tbl_love
-- ----------------------------
DROP TABLE IF EXISTS `tbl_love`;
CREATE TABLE `tbl_love`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_love
-- ----------------------------
INSERT INTO `tbl_love` VALUES (1, '灰太狼', '哈哈哈哈', 'https://s1.ax1x.com/2022/07/20/jbVobn.jpg');
INSERT INTO `tbl_love` VALUES (2, '灰太狼', '嘻嘻嘻', NULL);
INSERT INTO `tbl_love` VALUES (9, '灰太狼', '哈哈哈哈', NULL);
INSERT INTO `tbl_love` VALUES (10, '测试', '测试测试', 'https://jrboy.oss-cn-chengdu.aliyuncs.com/love/2022/07/20/3b9bf80d1b3741f3b487c97dcf98083610801920.png');
INSERT INTO `tbl_love` VALUES (11, 'sss', 'ssss', NULL);
INSERT INTO `tbl_love` VALUES (12, 'sdsds', 'dsdadasdsd', NULL);
INSERT INTO `tbl_love` VALUES (19, '122321', '213123', 'https://jrboy.oss-cn-chengdu.aliyuncs.com/love/2022/07/21/5308e7b3ee0249c787612030c57a7b5f10801920.png');
INSERT INTO `tbl_love` VALUES (20, '大树', 'q q q<br>2022/09/14 14:39:59', NULL);
INSERT INTO `tbl_love` VALUES (21, '大树', '1a 1<br>2022/09/14 14:41:13', NULL);
INSERT INTO `tbl_love` VALUES (22, '大树', '1q11<br>2022/09/14 14:45:18', NULL);
INSERT INTO `tbl_love` VALUES (23, '测试123', NULL, NULL);
INSERT INTO `tbl_love` VALUES (24, '测试123', NULL, NULL);
INSERT INTO `tbl_love` VALUES (25, '测试123', NULL, NULL);
INSERT INTO `tbl_love` VALUES (26, '测试123', NULL, NULL);
INSERT INTO `tbl_love` VALUES (27, '测试123', NULL, NULL);
INSERT INTO `tbl_love` VALUES (28, '测试123', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
