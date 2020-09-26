/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : tiangao-book

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2020-09-26 12:50:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `no` int(11) NOT NULL AUTO_INCREMENT,
  `type_no` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `price` decimal(10,0) NOT NULL,
  `pub_time` datetime NOT NULL,
  `author` varchar(255) NOT NULL,
  `pub_company` varchar(255) NOT NULL,
  PRIMARY KEY (`no`),
  KEY `type_no` (`type_no`),
  CONSTRAINT `book_ibfk_1` FOREIGN KEY (`type_no`) REFERENCES `booktype` (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=202 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('102', '2', '0本', '0', '2020-09-26 12:31:07', '0个作者', '天高');
INSERT INTO `book` VALUES ('103', '2', '1本', '1', '2020-09-26 12:31:07', '1个作者', '天高');
INSERT INTO `book` VALUES ('104', '2', '2本', '2', '2020-09-26 12:31:07', '2个作者', '天高');
INSERT INTO `book` VALUES ('105', '2', '3本', '3', '2020-09-26 12:31:07', '3个作者', '天高');
INSERT INTO `book` VALUES ('106', '2', '4本', '4', '2020-09-26 12:31:07', '4个作者', '天高');
INSERT INTO `book` VALUES ('107', '2', '5本', '5', '2020-09-26 12:31:07', '5个作者', '天高');
INSERT INTO `book` VALUES ('108', '2', '6本', '6', '2020-09-26 12:31:07', '6个作者', '天高');
INSERT INTO `book` VALUES ('109', '2', '7本', '7', '2020-09-26 12:31:07', '7个作者', '天高');
INSERT INTO `book` VALUES ('110', '2', '8本', '8', '2020-09-26 12:31:07', '8个作者', '天高');
INSERT INTO `book` VALUES ('111', '2', '9本', '9', '2020-09-26 12:31:07', '9个作者', '天高');
INSERT INTO `book` VALUES ('112', '2', '10本', '10', '2020-09-26 12:31:07', '10个作者', '天高');
INSERT INTO `book` VALUES ('113', '2', '11本', '11', '2020-09-26 12:31:07', '11个作者', '天高');
INSERT INTO `book` VALUES ('114', '2', '12本', '12', '2020-09-26 12:31:07', '12个作者', '天高');
INSERT INTO `book` VALUES ('115', '2', '13本', '13', '2020-09-26 12:31:07', '13个作者', '天高');
INSERT INTO `book` VALUES ('116', '2', '14本', '14', '2020-09-26 12:31:07', '14个作者', '天高');
INSERT INTO `book` VALUES ('117', '2', '15本', '15', '2020-09-26 12:31:07', '15个作者', '天高');
INSERT INTO `book` VALUES ('118', '2', '16本', '16', '2020-09-26 12:31:07', '16个作者', '天高');
INSERT INTO `book` VALUES ('119', '2', '17本', '17', '2020-09-26 12:31:07', '17个作者', '天高');
INSERT INTO `book` VALUES ('120', '2', '18本', '18', '2020-09-26 12:31:07', '18个作者', '天高');
INSERT INTO `book` VALUES ('121', '2', '19本', '19', '2020-09-26 12:31:07', '19个作者', '天高');
INSERT INTO `book` VALUES ('122', '2', '20本', '20', '2020-09-26 12:31:07', '20个作者', '天高');
INSERT INTO `book` VALUES ('123', '2', '21本', '21', '2020-09-26 12:31:07', '21个作者', '天高');
INSERT INTO `book` VALUES ('124', '2', '22本', '22', '2020-09-26 12:31:07', '22个作者', '天高');
INSERT INTO `book` VALUES ('125', '2', '23本', '23', '2020-09-26 12:31:07', '23个作者', '天高');
INSERT INTO `book` VALUES ('126', '2', '24本', '24', '2020-09-26 12:31:07', '24个作者', '天高');
INSERT INTO `book` VALUES ('127', '2', '25本', '25', '2020-09-26 12:31:07', '25个作者', '天高');
INSERT INTO `book` VALUES ('128', '2', '26本', '26', '2020-09-26 12:31:07', '26个作者', '天高');
INSERT INTO `book` VALUES ('129', '2', '27本', '27', '2020-09-26 12:31:07', '27个作者', '天高');
INSERT INTO `book` VALUES ('130', '2', '28本', '28', '2020-09-26 12:31:07', '28个作者', '天高');
INSERT INTO `book` VALUES ('131', '2', '29本', '29', '2020-09-26 12:31:07', '29个作者', '天高');
INSERT INTO `book` VALUES ('132', '2', '30本', '30', '2020-09-26 12:31:07', '30个作者', '天高');
INSERT INTO `book` VALUES ('133', '2', '31本', '31', '2020-09-26 12:31:07', '31个作者', '天高');
INSERT INTO `book` VALUES ('134', '2', '32本', '32', '2020-09-26 12:31:07', '32个作者', '天高');
INSERT INTO `book` VALUES ('135', '2', '33本', '33', '2020-09-26 12:31:07', '33个作者', '天高');
INSERT INTO `book` VALUES ('136', '2', '34本', '34', '2020-09-26 12:31:07', '34个作者', '天高');
INSERT INTO `book` VALUES ('137', '2', '35本', '35', '2020-09-26 12:31:07', '35个作者', '天高');
INSERT INTO `book` VALUES ('138', '2', '36本', '36', '2020-09-26 12:31:07', '36个作者', '天高');
INSERT INTO `book` VALUES ('139', '2', '37本', '37', '2020-09-26 12:31:07', '37个作者', '天高');
INSERT INTO `book` VALUES ('140', '2', '38本', '38', '2020-09-26 12:31:07', '38个作者', '天高');
INSERT INTO `book` VALUES ('141', '2', '39本', '39', '2020-09-26 12:31:07', '39个作者', '天高');
INSERT INTO `book` VALUES ('142', '2', '40本', '40', '2020-09-26 12:31:07', '40个作者', '天高');
INSERT INTO `book` VALUES ('143', '2', '41本', '41', '2020-09-26 12:31:07', '41个作者', '天高');
INSERT INTO `book` VALUES ('144', '2', '42本', '42', '2020-09-26 12:31:07', '42个作者', '天高');
INSERT INTO `book` VALUES ('145', '2', '43本', '43', '2020-09-26 12:31:07', '43个作者', '天高');
INSERT INTO `book` VALUES ('146', '2', '44本', '44', '2020-09-26 12:31:07', '44个作者', '天高');
INSERT INTO `book` VALUES ('147', '2', '45本', '45', '2020-09-26 12:31:07', '45个作者', '天高');
INSERT INTO `book` VALUES ('148', '2', '46本', '46', '2020-09-26 12:31:07', '46个作者', '天高');
INSERT INTO `book` VALUES ('149', '2', '47本', '47', '2020-09-26 12:31:07', '47个作者', '天高');
INSERT INTO `book` VALUES ('150', '2', '48本', '48', '2020-09-26 12:31:07', '48个作者', '天高');
INSERT INTO `book` VALUES ('151', '2', '49本', '49', '2020-09-26 12:31:07', '49个作者', '天高');
INSERT INTO `book` VALUES ('152', '2', '50本', '50', '2020-09-26 12:31:07', '50个作者', '天高');
INSERT INTO `book` VALUES ('153', '2', '51本', '51', '2020-09-26 12:31:07', '51个作者', '天高');
INSERT INTO `book` VALUES ('154', '2', '52本', '52', '2020-09-26 12:31:07', '52个作者', '天高');
INSERT INTO `book` VALUES ('155', '2', '53本', '53', '2020-09-26 12:31:07', '53个作者', '天高');
INSERT INTO `book` VALUES ('156', '2', '54本', '54', '2020-09-26 12:31:07', '54个作者', '天高');
INSERT INTO `book` VALUES ('157', '2', '55本', '55', '2020-09-26 12:31:07', '55个作者', '天高');
INSERT INTO `book` VALUES ('158', '2', '56本', '56', '2020-09-26 12:31:07', '56个作者', '天高');
INSERT INTO `book` VALUES ('159', '2', '57本', '57', '2020-09-26 12:31:07', '57个作者', '天高');
INSERT INTO `book` VALUES ('160', '2', '58本', '58', '2020-09-26 12:31:07', '58个作者', '天高');
INSERT INTO `book` VALUES ('161', '2', '59本', '59', '2020-09-26 12:31:07', '59个作者', '天高');
INSERT INTO `book` VALUES ('162', '2', '60本', '60', '2020-09-26 12:31:07', '60个作者', '天高');
INSERT INTO `book` VALUES ('163', '2', '61本', '61', '2020-09-26 12:31:07', '61个作者', '天高');
INSERT INTO `book` VALUES ('164', '2', '62本', '62', '2020-09-26 12:31:07', '62个作者', '天高');
INSERT INTO `book` VALUES ('165', '2', '63本', '63', '2020-09-26 12:31:07', '63个作者', '天高');
INSERT INTO `book` VALUES ('166', '2', '64本', '64', '2020-09-26 12:31:07', '64个作者', '天高');
INSERT INTO `book` VALUES ('167', '2', '65本', '65', '2020-09-26 12:31:07', '65个作者', '天高');
INSERT INTO `book` VALUES ('168', '2', '66本', '66', '2020-09-26 12:31:07', '66个作者', '天高');
INSERT INTO `book` VALUES ('169', '2', '67本', '67', '2020-09-26 12:31:07', '67个作者', '天高');
INSERT INTO `book` VALUES ('170', '2', '68本', '68', '2020-09-26 12:31:07', '68个作者', '天高');
INSERT INTO `book` VALUES ('171', '2', '69本', '69', '2020-09-26 12:31:07', '69个作者', '天高');
INSERT INTO `book` VALUES ('172', '2', '70本', '70', '2020-09-26 12:31:07', '70个作者', '天高');
INSERT INTO `book` VALUES ('173', '2', '71本', '71', '2020-09-26 12:31:07', '71个作者', '天高');
INSERT INTO `book` VALUES ('174', '2', '72本', '72', '2020-09-26 12:31:07', '72个作者', '天高');
INSERT INTO `book` VALUES ('175', '2', '73本', '73', '2020-09-26 12:31:07', '73个作者', '天高');
INSERT INTO `book` VALUES ('176', '2', '74本', '74', '2020-09-26 12:31:07', '74个作者', '天高');
INSERT INTO `book` VALUES ('177', '2', '75本', '75', '2020-09-26 12:31:07', '75个作者', '天高');
INSERT INTO `book` VALUES ('178', '2', '76本', '76', '2020-09-26 12:31:07', '76个作者', '天高');
INSERT INTO `book` VALUES ('179', '2', '77本', '77', '2020-09-26 12:31:07', '77个作者', '天高');
INSERT INTO `book` VALUES ('180', '2', '78本', '78', '2020-09-26 12:31:07', '78个作者', '天高');
INSERT INTO `book` VALUES ('181', '2', '79本', '79', '2020-09-26 12:31:07', '79个作者', '天高');
INSERT INTO `book` VALUES ('182', '2', '80本', '80', '2020-09-26 12:31:07', '80个作者', '天高');
INSERT INTO `book` VALUES ('183', '2', '81本', '81', '2020-09-26 12:31:07', '81个作者', '天高');
INSERT INTO `book` VALUES ('184', '2', '82本', '82', '2020-09-26 12:31:07', '82个作者', '天高');
INSERT INTO `book` VALUES ('185', '2', '83本', '83', '2020-09-26 12:31:07', '83个作者', '天高');
INSERT INTO `book` VALUES ('186', '2', '84本', '84', '2020-09-26 12:31:07', '84个作者', '天高');
INSERT INTO `book` VALUES ('187', '2', '85本', '85', '2020-09-26 12:31:07', '85个作者', '天高');
INSERT INTO `book` VALUES ('188', '2', '86本', '86', '2020-09-26 12:31:07', '86个作者', '天高');
INSERT INTO `book` VALUES ('189', '2', '87本', '87', '2020-09-26 12:31:07', '87个作者', '天高');
INSERT INTO `book` VALUES ('190', '2', '88本', '88', '2020-09-26 12:31:07', '88个作者', '天高');
INSERT INTO `book` VALUES ('191', '2', '89本', '89', '2020-09-26 12:31:07', '89个作者', '天高');
INSERT INTO `book` VALUES ('192', '2', '90本', '90', '2020-09-26 12:31:07', '90个作者', '天高');
INSERT INTO `book` VALUES ('193', '2', '91本', '91', '2020-09-26 12:31:07', '91个作者', '天高');
INSERT INTO `book` VALUES ('194', '2', '92本', '92', '2020-09-26 12:31:07', '92个作者', '天高');
INSERT INTO `book` VALUES ('195', '2', '93本', '93', '2020-09-26 12:31:07', '93个作者', '天高');
INSERT INTO `book` VALUES ('196', '2', '94本', '94', '2020-09-26 12:31:07', '94个作者', '天高');
INSERT INTO `book` VALUES ('197', '2', '95本', '95', '2020-09-26 12:31:07', '95个作者', '天高');
INSERT INTO `book` VALUES ('198', '2', '96本', '96', '2020-09-26 12:31:07', '96个作者', '天高');
INSERT INTO `book` VALUES ('199', '2', '97本', '97', '2020-09-26 12:31:07', '97个作者', '天高');
INSERT INTO `book` VALUES ('200', '2', '98本', '98', '2020-09-26 12:31:07', '98个作者', '天高');
INSERT INTO `book` VALUES ('201', '2', '99本', '99', '2020-09-26 12:31:07', '99个作者', '天高');

-- ----------------------------
-- Table structure for booktype
-- ----------------------------
DROP TABLE IF EXISTS `booktype`;
CREATE TABLE `booktype` (
  `no` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of booktype
-- ----------------------------
INSERT INTO `booktype` VALUES ('2', '杂志1900期');
INSERT INTO `booktype` VALUES ('3', '杂志1901期');
INSERT INTO `booktype` VALUES ('4', '杂志1902期');
INSERT INTO `booktype` VALUES ('5', '杂志1903期');
INSERT INTO `booktype` VALUES ('6', '杂志1904期');
INSERT INTO `booktype` VALUES ('7', '杂志1905期');
INSERT INTO `booktype` VALUES ('8', '杂志1906期');
INSERT INTO `booktype` VALUES ('9', '杂志1907期');
INSERT INTO `booktype` VALUES ('10', '杂志1908期');
INSERT INTO `booktype` VALUES ('11', '杂志1909期');
INSERT INTO `booktype` VALUES ('12', '杂志1910期');
INSERT INTO `booktype` VALUES ('13', '杂志1911期');
INSERT INTO `booktype` VALUES ('14', '杂志1912期');
INSERT INTO `booktype` VALUES ('15', '杂志1913期');
INSERT INTO `booktype` VALUES ('16', '杂志1914期');
INSERT INTO `booktype` VALUES ('17', '杂志1915期');
INSERT INTO `booktype` VALUES ('18', '杂志1916期');
INSERT INTO `booktype` VALUES ('19', '杂志1917期');
INSERT INTO `booktype` VALUES ('20', '杂志1918期');
INSERT INTO `booktype` VALUES ('21', '杂志1919期');
INSERT INTO `booktype` VALUES ('22', '杂志1920期');
INSERT INTO `booktype` VALUES ('23', '杂志1921期');
INSERT INTO `booktype` VALUES ('24', '杂志1922期');
INSERT INTO `booktype` VALUES ('25', '杂志1923期');
INSERT INTO `booktype` VALUES ('26', '杂志1924期');
INSERT INTO `booktype` VALUES ('27', '杂志1925期');
INSERT INTO `booktype` VALUES ('28', '杂志1926期');
INSERT INTO `booktype` VALUES ('29', '杂志1927期');
INSERT INTO `booktype` VALUES ('30', '杂志1928期');
INSERT INTO `booktype` VALUES ('31', '杂志1929期');
INSERT INTO `booktype` VALUES ('32', '杂志1930期');
INSERT INTO `booktype` VALUES ('33', '杂志1931期');
INSERT INTO `booktype` VALUES ('34', '杂志1932期');
INSERT INTO `booktype` VALUES ('35', '杂志1933期');
INSERT INTO `booktype` VALUES ('36', '杂志1934期');
INSERT INTO `booktype` VALUES ('37', '杂志1935期');
INSERT INTO `booktype` VALUES ('38', '杂志1936期');
INSERT INTO `booktype` VALUES ('39', '杂志1937期');
INSERT INTO `booktype` VALUES ('40', '杂志1938期');
INSERT INTO `booktype` VALUES ('41', '杂志1939期');
INSERT INTO `booktype` VALUES ('42', '杂志1940期');
INSERT INTO `booktype` VALUES ('43', '杂志1941期');
INSERT INTO `booktype` VALUES ('44', '杂志1942期');
INSERT INTO `booktype` VALUES ('45', '杂志1943期');
INSERT INTO `booktype` VALUES ('46', '杂志1944期');
INSERT INTO `booktype` VALUES ('47', '杂志1945期');
INSERT INTO `booktype` VALUES ('48', '杂志1946期');
INSERT INTO `booktype` VALUES ('49', '杂志1947期');
INSERT INTO `booktype` VALUES ('50', '杂志1948期');
INSERT INTO `booktype` VALUES ('51', '杂志1949期');
INSERT INTO `booktype` VALUES ('52', '杂志1950期');
INSERT INTO `booktype` VALUES ('53', '杂志1951期');
INSERT INTO `booktype` VALUES ('54', '杂志1952期');
INSERT INTO `booktype` VALUES ('55', '杂志1953期');
INSERT INTO `booktype` VALUES ('56', '杂志1954期');
INSERT INTO `booktype` VALUES ('57', '杂志1955期');
INSERT INTO `booktype` VALUES ('58', '杂志1956期');
INSERT INTO `booktype` VALUES ('59', '杂志1957期');
INSERT INTO `booktype` VALUES ('60', '杂志1958期');
INSERT INTO `booktype` VALUES ('61', '杂志1959期');
INSERT INTO `booktype` VALUES ('62', '杂志1960期');
INSERT INTO `booktype` VALUES ('63', '杂志1961期');
INSERT INTO `booktype` VALUES ('64', '杂志1962期');
INSERT INTO `booktype` VALUES ('65', '杂志1963期');
INSERT INTO `booktype` VALUES ('66', '杂志1964期');
INSERT INTO `booktype` VALUES ('67', '杂志1965期');
INSERT INTO `booktype` VALUES ('68', '杂志1966期');
INSERT INTO `booktype` VALUES ('69', '杂志1967期');
INSERT INTO `booktype` VALUES ('70', '杂志1968期');
INSERT INTO `booktype` VALUES ('71', '杂志1969期');
INSERT INTO `booktype` VALUES ('72', '杂志1970期');
INSERT INTO `booktype` VALUES ('73', '杂志1971期');
INSERT INTO `booktype` VALUES ('74', '杂志1972期');
INSERT INTO `booktype` VALUES ('75', '杂志1973期');
INSERT INTO `booktype` VALUES ('76', '杂志1974期');
INSERT INTO `booktype` VALUES ('77', '杂志1975期');
INSERT INTO `booktype` VALUES ('78', '杂志1976期');
INSERT INTO `booktype` VALUES ('79', '杂志1977期');
INSERT INTO `booktype` VALUES ('80', '杂志1978期');
INSERT INTO `booktype` VALUES ('81', '杂志1979期');
INSERT INTO `booktype` VALUES ('82', '杂志1980期');
INSERT INTO `booktype` VALUES ('83', '杂志1981期');
INSERT INTO `booktype` VALUES ('84', '杂志1982期');
INSERT INTO `booktype` VALUES ('85', '杂志1983期');
INSERT INTO `booktype` VALUES ('86', '杂志1984期');
INSERT INTO `booktype` VALUES ('87', '杂志1985期');
INSERT INTO `booktype` VALUES ('88', '杂志1986期');
INSERT INTO `booktype` VALUES ('89', '杂志1987期');
INSERT INTO `booktype` VALUES ('90', '杂志1988期');
INSERT INTO `booktype` VALUES ('91', '杂志1989期');
INSERT INTO `booktype` VALUES ('92', '杂志1990期');
INSERT INTO `booktype` VALUES ('93', '杂志1991期');
INSERT INTO `booktype` VALUES ('94', '杂志1992期');
INSERT INTO `booktype` VALUES ('95', '杂志1993期');
INSERT INTO `booktype` VALUES ('96', '杂志1994期');
INSERT INTO `booktype` VALUES ('97', '杂志1995期');
INSERT INTO `booktype` VALUES ('98', '杂志1996期');
INSERT INTO `booktype` VALUES ('99', '杂志1997期');
INSERT INTO `booktype` VALUES ('100', '杂志1998期');
INSERT INTO `booktype` VALUES ('101', '杂志1999期');
