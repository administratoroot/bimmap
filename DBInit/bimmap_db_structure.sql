/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50514
Source Host           : localhost:3306
Source Database       : bimmap_db

Target Server Type    : MYSQL
Target Server Version : 50514
File Encoding         : 65001

Date: 2015-12-22 18:58:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for attentionreladict
-- ----------------------------
DROP TABLE IF EXISTS `attentionreladict`;
CREATE TABLE `attentionreladict` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userID` int(11) DEFAULT NULL,
  `buildingID` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for buildinginfo
-- ----------------------------
DROP TABLE IF EXISTS `buildinginfo`;
CREATE TABLE `buildinginfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `BuildingName` varchar(255) NOT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `GISLat` double(255,3) DEFAULT NULL,
  `GISLon` double(255,3) DEFAULT NULL,
  `GISAlt` double(255,3) DEFAULT NULL,
  `Authority` int(255) DEFAULT NULL,
  `Area` double(11,0) DEFAULT NULL,
  `BuildingType` int(11) DEFAULT NULL,
  `StructureType` int(11) DEFAULT NULL,
  `UpFloorNum` int(11) DEFAULT NULL,
  `SubFloorNum` int(11) DEFAULT NULL,
  `Developer` varchar(255) DEFAULT NULL,
  `Builder` varchar(255) DEFAULT NULL,
  `Supervisor` varchar(255) DEFAULT NULL,
  `ModelDrawer` varchar(255) DEFAULT NULL,
  `UploadTime` varchar(255) DEFAULT NULL,
  `UploadUserID` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for buildingtypedict
-- ----------------------------
DROP TABLE IF EXISTS `buildingtypedict`;
CREATE TABLE `buildingtypedict` (
  `BuildingTypeID` int(11) NOT NULL,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`BuildingTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for commentinfo
-- ----------------------------
DROP TABLE IF EXISTS `commentinfo`;
CREATE TABLE `commentinfo` (
  `BuildingID` int(11) NOT NULL,
  `CommentType` int(1) DEFAULT NULL,
  `CommentContent` varchar(255) DEFAULT NULL,
  `CommentUser` varchar(255) DEFAULT NULL,
  KEY `BuildingID` (`BuildingID`),
  CONSTRAINT `commentinfo_ibfk_1` FOREIGN KEY (`BuildingID`) REFERENCES `buildinginfo` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for hat_area
-- ----------------------------
DROP TABLE IF EXISTS `hat_area`;
CREATE TABLE `hat_area` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `areaID` varchar(50) DEFAULT NULL,
  `area` varchar(60) DEFAULT NULL,
  `father` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3145 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for hat_city
-- ----------------------------
DROP TABLE IF EXISTS `hat_city`;
CREATE TABLE `hat_city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cityID` varchar(6) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `father` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=346 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for hat_province
-- ----------------------------
DROP TABLE IF EXISTS `hat_province`;
CREATE TABLE `hat_province` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `provinceID` varchar(6) DEFAULT NULL,
  `province` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for structuretypedict
-- ----------------------------
DROP TABLE IF EXISTS `structuretypedict`;
CREATE TABLE `structuretypedict` (
  `StructureTypeID` int(11) NOT NULL,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`StructureTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for userdict
-- ----------------------------
DROP TABLE IF EXISTS `userdict`;
CREATE TABLE `userdict` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` int(11) DEFAULT NULL,
  `manageRegion` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `IndexName` (`userName`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for userroletypedict
-- ----------------------------
DROP TABLE IF EXISTS `userroletypedict`;
CREATE TABLE `userroletypedict` (
  `UserRoleType` int(11) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `ANNOTATE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
