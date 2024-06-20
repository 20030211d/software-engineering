-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmt9pm0
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `ssmt9pm0`
--

/*!40000 DROP DATABASE IF EXISTS `ssmt9pm0`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssmt9pm0` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssmt9pm0`;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emailregistercode`
--

DROP TABLE IF EXISTS `emailregistercode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emailregistercode` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `email` varchar(200) NOT NULL COMMENT '邮箱',
  `role` varchar(200) NOT NULL COMMENT '角色',
  `code` varchar(200) NOT NULL COMMENT '验证码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='邮箱验证码';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emailregistercode`
--

LOCK TABLES `emailregistercode` WRITE;
/*!40000 ALTER TABLE `emailregistercode` DISABLE KEYS */;
INSERT INTO `emailregistercode` VALUES (141,'2024-04-16 06:03:45','邮箱1','角色1','验证码1'),(142,'2024-04-16 06:03:45','邮箱2','角色2','验证码2'),(143,'2024-04-16 06:03:45','邮箱3','角色3','验证码3'),(144,'2024-04-16 06:03:45','邮箱4','角色4','验证码4'),(145,'2024-04-16 06:03:45','邮箱5','角色5','验证码5'),(146,'2024-04-16 06:03:45','邮箱6','角色6','验证码6');
/*!40000 ALTER TABLE `emailregistercode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menjindengji`
--

DROP TABLE IF EXISTS `menjindengji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menjindengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueshengxuehao` varchar(200) DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `xiaomen` varchar(200) DEFAULT NULL COMMENT '校门',
  `leixing` varchar(200) DEFAULT NULL COMMENT '类型',
  `dengjishijian` datetime DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='门禁登记';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menjindengji`
--

LOCK TABLES `menjindengji` WRITE;
/*!40000 ALTER TABLE `menjindengji` DISABLE KEYS */;
INSERT INTO `menjindengji` VALUES (121,'2024-04-16 06:03:45','学生学号1','学生姓名1','校门1','入校','2024-04-16 14:03:45'),(122,'2024-04-16 06:03:45','学生学号2','学生姓名2','校门2','入校','2024-04-16 14:03:45'),(123,'2024-04-16 06:03:45','学生学号3','学生姓名3','校门3','入校','2024-04-16 14:03:45'),(124,'2024-04-16 06:03:45','学生学号4','学生姓名4','校门4','入校','2024-4-16 14:03:45'),(125,'2024-04-16 06:03:45','学生学号5','学生姓名5','校门5','入校','2024-04-16 14:03:45'),(126,'2024-04-16 06:03:45','学生学号6','学生姓名6','校门6','入校','2024-04-16 14:03:45');
/*!40000 ALTER TABLE `menjindengji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `menujson` longtext COMMENT '菜单',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='菜单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (1,'2024-04-16 06:03:45','[{\"backMenu\":[{\"child\":[{\"appFrontIcon\":\"cuIcon-circle\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"图书分类\",\"menuJump\":\"列表\",\"tableName\":\"tushufenlei\"}],\"menu\":\"图书分类管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-skin\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"校门\",\"menuJump\":\"列表\",\"tableName\":\"xiaomen\"}],\"menu\":\"校门管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-vipcard\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\",\"导出\",\"导入\"],\"menu\":\"学生\",\"menuJump\":\"列表\",\"tableName\":\"xuesheng\"}],\"menu\":\"学生管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-keyboard\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"图书信息\",\"menuJump\":\"列表\",\"tableName\":\"tushuxinxi\"}],\"menu\":\"图书信息管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-qrcode\",\"buttons\":[\"查看\",\"修改\",\"删除\"],\"menu\":\"图书借阅\",\"menuJump\":\"列表\",\"tableName\":\"tushujieyue\"}],\"menu\":\"图书借阅管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-news\",\"buttons\":[\"查看\",\"修改\",\"删除\",\"审核\",\"开卡\"],\"menu\":\"校园卡申请\",\"menuJump\":\"列表\",\"tableName\":\"xiaoyuankashenqing\"}],\"menu\":\"校园卡申请管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-brand\",\"buttons\":[\"查看\",\"修改\",\"删除\"],\"menu\":\"校园卡派发\",\"menuJump\":\"列表\",\"tableName\":\"xiaoyuankapaifa\"}],\"menu\":\"校园卡派发管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-list\",\"buttons\":[\"查看\",\"修改\",\"删除\"],\"menu\":\"校园卡充值\",\"menuJump\":\"列表\",\"tableName\":\"xiaoyuankachongzhi\"}],\"menu\":\"校园卡充值管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-present\",\"buttons\":[\"查看\",\"修改\",\"删除\"],\"menu\":\"校园卡注销\",\"menuJump\":\"列表\",\"tableName\":\"xiaoyuankazhuxiao\"}],\"menu\":\"校园卡注销管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-pay\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"消费记录\",\"menuJump\":\"列表\",\"tableName\":\"xiaofeijilu\"}],\"menu\":\"消费记录管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-rank\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"医疗记录\",\"menuJump\":\"列表\",\"tableName\":\"yiliaojilu\"}],\"menu\":\"医疗记录管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-full\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"门禁登记\",\"menuJump\":\"列表\",\"tableName\":\"menjindengji\"}],\"menu\":\"门禁登记管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-discover\",\"buttons\":[\"查看\",\"编辑名称\",\"编辑父级\",\"删除\"],\"menu\":\"菜单列表\",\"tableName\":\"menu\"}],\"menu\":\"系统管理\"}],\"frontMenu\":[],\"hasBackLogin\":\"是\",\"hasBackRegister\":\"否\",\"hasFrontLogin\":\"否\",\"hasFrontRegister\":\"否\",\"roleName\":\"管理员\",\"tableName\":\"users\"},{\"backMenu\":[{\"child\":[{\"appFrontIcon\":\"cuIcon-keyboard\",\"buttons\":[\"查看\",\"借阅\"],\"menu\":\"图书信息\",\"menuJump\":\"列表\",\"tableName\":\"tushuxinxi\"}],\"menu\":\"图书信息管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-qrcode\",\"buttons\":[\"查看\",\"修改\",\"删除\"],\"menu\":\"图书借阅\",\"menuJump\":\"列表\",\"tableName\":\"tushujieyue\"}],\"menu\":\"图书借阅管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-news\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"校园卡申请\",\"menuJump\":\"列表\",\"tableName\":\"xiaoyuankashenqing\"}],\"menu\":\"校园卡申请管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-brand\",\"buttons\":[\"查看\",\"删除\",\"充值\",\"注销\"],\"menu\":\"校园卡派发\",\"menuJump\":\"列表\",\"tableName\":\"xiaoyuankapaifa\"}],\"menu\":\"校园卡派发管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-list\",\"buttons\":[\"查看\",\"删除\",\"支付\"],\"menu\":\"校园卡充值\",\"menuJump\":\"列表\",\"tableName\":\"xiaoyuankachongzhi\"}],\"menu\":\"校园卡充值管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-present\",\"buttons\":[\"查看\",\"修改\",\"删除\"],\"menu\":\"校园卡注销\",\"menuJump\":\"列表\",\"tableName\":\"xiaoyuankazhuxiao\"}],\"menu\":\"校园卡注销管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-pay\",\"buttons\":[\"查看\"],\"menu\":\"消费记录\",\"menuJump\":\"列表\",\"tableName\":\"xiaofeijilu\"}],\"menu\":\"消费记录管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-rank\",\"buttons\":[\"查看\"],\"menu\":\"医疗记录\",\"menuJump\":\"列表\",\"tableName\":\"yiliaojilu\"}],\"menu\":\"医疗记录管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-full\",\"buttons\":[\"查看\"],\"menu\":\"门禁登记\",\"menuJump\":\"列表\",\"tableName\":\"menjindengji\"}],\"menu\":\"门禁登记管理\"}],\"frontMenu\":[],\"hasBackLogin\":\"是\",\"hasBackRegister\":\"否\",\"hasFrontLogin\":\"是\",\"hasFrontRegister\":\"是\",\"roleName\":\"学生\",\"tableName\":\"xuesheng\"}]');
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tushufenlei`
--

DROP TABLE IF EXISTS `tushufenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tushufenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tushufenlei` varchar(200) NOT NULL COMMENT '图书分类',
  PRIMARY KEY (`id`),
  UNIQUE KEY `tushufenlei` (`tushufenlei`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='图书分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tushufenlei`
--

LOCK TABLES `tushufenlei` WRITE;
/*!40000 ALTER TABLE `tushufenlei` DISABLE KEYS */;
INSERT INTO `tushufenlei` VALUES (11,'2024-04-16 06:03:45','图书分类1'),(12,'2024-04-16 06:03:45','图书分类2'),(13,'2024-04-16 06:03:45','图书分类3'),(14,'2024-04-16 06:03:45','图书分类4'),(15,'2024-04-16 06:03:45','图书分类5'),(16,'2024-04-16 06:03:45','图书分类6');
/*!40000 ALTER TABLE `tushufenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tushujieyue`
--

DROP TABLE IF EXISTS `tushujieyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tushujieyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jieyuebianhao` varchar(200) DEFAULT NULL COMMENT '借阅编号',
  `tushubianhao` varchar(200) DEFAULT NULL COMMENT '图书编号',
  `tushumingcheng` varchar(200) DEFAULT NULL COMMENT '图书名称',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `jieyuetianshu` int(11) DEFAULT NULL COMMENT '借阅天数',
  `xueshengxuehao` varchar(200) DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `jieyueshijian` datetime DEFAULT NULL COMMENT '借阅时间',
  `beizhu` longtext COMMENT '备注',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `jieyuebianhao` (`jieyuebianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='图书借阅';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tushujieyue`
--

LOCK TABLES `tushujieyue` WRITE;
/*!40000 ALTER TABLE `tushujieyue` DISABLE KEYS */;
INSERT INTO `tushujieyue` VALUES (51,'2022-08-04 06:03:45','1111111111','图书编号1','图书名称1',1,1,'学生学号1','学生姓名1','2022-08-04 14:03:45','备注1',1),(52,'2022-08-04 06:03:45','2222222222','图书编号2','图书名称2',2,2,'学生学号2','学生姓名2','2022-08-04 14:03:45','备注2',2),(53,'2022-08-04 06:03:45','3333333333','图书编号3','图书名称3',3,3,'学生学号3','学生姓名3','2022-08-04 14:03:45','备注3',3),(54,'2022-08-04 06:03:45','4444444444','图书编号4','图书名称4',4,4,'学生学号4','学生姓名4','2022-08-04 14:03:45','备注4',4),(55,'2022-08-04 06:03:45','5555555555','图书编号5','图书名称5',5,5,'学生学号5','学生姓名5','2022-08-04 14:03:45','备注5',5),(56,'2022-08-04 06:03:45','6666666666','图书编号6','图书名称6',6,6,'学生学号6','学生姓名6','2022-08-04 14:03:45','备注6',6);
/*!40000 ALTER TABLE `tushujieyue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tushuxinxi`
--

DROP TABLE IF EXISTS `tushuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tushuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tushubianhao` varchar(200) DEFAULT NULL COMMENT '图书编号',
  `tushumingcheng` varchar(200) NOT NULL COMMENT '图书名称',
  `tushufenlei` varchar(200) DEFAULT NULL COMMENT '图书分类',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `zuozhe` varchar(200) DEFAULT NULL COMMENT '作者',
  `chubanshe` varchar(200) DEFAULT NULL COMMENT '出版社',
  `weizhi` varchar(200) DEFAULT NULL COMMENT '位置',
  `xiangqing` longtext COMMENT '详情',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `tushubianhao` (`tushubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='图书信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tushuxinxi`
--

LOCK TABLES `tushuxinxi` WRITE;
/*!40000 ALTER TABLE `tushuxinxi` DISABLE KEYS */;
INSERT INTO `tushuxinxi` VALUES (41,'2022-08-04 06:03:45','1111111111','图书名称1','图书分类1',1,'upload/tushuxinxi_tupian1.jpg','作者1','出版社1','位置1','详情1','2022-08-04 14:03:45',1),(42,'2022-08-04 06:03:45','2222222222','图书名称2','图书分类2',2,'upload/tushuxinxi_tupian2.jpg','作者2','出版社2','位置2','详情2','2022-08-04 14:03:45',2),(43,'2022-08-04 06:03:45','3333333333','图书名称3','图书分类3',3,'upload/tushuxinxi_tupian3.jpg','作者3','出版社3','位置3','详情3','2022-08-04 14:03:45',3),(44,'2022-08-04 06:03:45','4444444444','图书名称4','图书分类4',4,'upload/tushuxinxi_tupian4.jpg','作者4','出版社4','位置4','详情4','2022-08-04 14:03:45',4),(45,'2022-08-04 06:03:45','5555555555','图书名称5','图书分类5',5,'upload/tushuxinxi_tupian5.jpg','作者5','出版社5','位置5','详情5','2022-08-04 14:03:45',5),(46,'2022-08-04 06:03:45','6666666666','图书名称6','图书分类6',6,'upload/tushuxinxi_tupian6.jpg','作者6','出版社6','位置6','详情6','2022-08-04 14:03:45',6);
/*!40000 ALTER TABLE `tushuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-08-04 06:03:45');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaofeijilu`
--

DROP TABLE IF EXISTS `xiaofeijilu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaofeijilu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiaoyuankahao` varchar(200) DEFAULT NULL COMMENT '校园卡号',
  `xueshengxuehao` varchar(200) DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `zhuanye` varchar(200) DEFAULT NULL COMMENT '专业',
  `xiaofeijine` float DEFAULT NULL COMMENT '消费金额',
  `xiaofeijilu` longtext COMMENT '消费记录',
  `xiaofeishijian` datetime DEFAULT NULL COMMENT '消费时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='消费记录';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaofeijilu`
--

LOCK TABLES `xiaofeijilu` WRITE;
/*!40000 ALTER TABLE `xiaofeijilu` DISABLE KEYS */;
INSERT INTO `xiaofeijilu` VALUES (101,'2022-08-04 06:03:45','校园卡号1','学生学号1','学生姓名1','专业1',1,'消费记录1','2022-08-04 14:03:45'),(102,'2022-08-04 06:03:45','校园卡号2','学生学号2','学生姓名2','专业2',2,'消费记录2','2022-08-04 14:03:45'),(103,'2022-08-04 06:03:45','校园卡号3','学生学号3','学生姓名3','专业3',3,'消费记录3','2022-08-04 14:03:45'),(104,'2022-08-04 06:03:45','校园卡号4','学生学号4','学生姓名4','专业4',4,'消费记录4','2022-08-04 14:03:45'),(105,'2022-08-04 06:03:45','校园卡号5','学生学号5','学生姓名5','专业5',5,'消费记录5','2022-08-04 14:03:45'),(106,'2022-08-04 06:03:45','校园卡号6','学生学号6','学生姓名6','专业6',6,'消费记录6','2022-08-04 14:03:45');
/*!40000 ALTER TABLE `xiaofeijilu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomen`
--

DROP TABLE IF EXISTS `xiaomen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomen` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiaomen` varchar(200) NOT NULL COMMENT '校园服务设施',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='校园服务设施';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomen`
--

LOCK TABLES `xiaomen` WRITE;
/*!40000 ALTER TABLE `xiaomen` DISABLE KEYS */;

/*!40000 ALTER TABLE `xiaomen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaoyuankachongzhi`
--

DROP TABLE IF EXISTS `xiaoyuankachongzhi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaoyuankachongzhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chongzhibianhao` varchar(200) DEFAULT NULL COMMENT '充值编号',
  `xueshengxuehao` varchar(200) DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `xiaoyuankahao` varchar(200) DEFAULT NULL COMMENT '校园卡号',
  `chongzhijine` float DEFAULT NULL COMMENT '充值金额',
  `chongzhishijian` datetime DEFAULT NULL COMMENT '充值时间',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`),
  UNIQUE KEY `chongzhibianhao` (`chongzhibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='校园卡充值';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaoyuankachongzhi`
--

LOCK TABLES `xiaoyuankachongzhi` WRITE;
/*!40000 ALTER TABLE `xiaoyuankachongzhi` DISABLE KEYS */;
INSERT INTO `xiaoyuankachongzhi` VALUES (81,'2022-08-04 06:03:45','1111111111','学生学号1','学生姓名1','校园卡号1',1,'2022-08-04 14:03:45','未支付'),(82,'2022-08-04 06:03:45','2222222222','学生学号2','学生姓名2','校园卡号2',2,'2022-08-04 14:03:45','未支付'),(83,'2022-08-04 06:03:45','3333333333','学生学号3','学生姓名3','校园卡号3',3,'2022-08-04 14:03:45','未支付'),(84,'2022-08-04 06:03:45','4444444444','学生学号4','学生姓名4','校园卡号4',4,'2022-08-04 14:03:45','未支付'),(85,'2022-08-04 06:03:45','5555555555','学生学号5','学生姓名5','校园卡号5',5,'2022-08-04 14:03:45','未支付'),(86,'2022-08-04 06:03:45','6666666666','学生学号6','学生姓名6','校园卡号6',6,'2022-08-04 14:03:45','未支付');
/*!40000 ALTER TABLE `xiaoyuankachongzhi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaoyuankapaifa`
--

DROP TABLE IF EXISTS `xiaoyuankapaifa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaoyuankapaifa` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueshengxuehao` varchar(200) DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `zhuanye` varchar(200) DEFAULT NULL COMMENT '专业',
  `xiaoyuankahao` varchar(200) DEFAULT NULL COMMENT '校园卡号',
  `yajin` int(11) DEFAULT NULL COMMENT '押金',
  `paifariqi` date DEFAULT NULL COMMENT '派发日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xiaoyuankahao` (`xiaoyuankahao`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='校园卡派发';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaoyuankapaifa`
--

LOCK TABLES `xiaoyuankapaifa` WRITE;
/*!40000 ALTER TABLE `xiaoyuankapaifa` DISABLE KEYS */;
INSERT INTO `xiaoyuankapaifa` VALUES (71,'2022-08-04 06:03:45','学生学号1','学生姓名1','专业1','1111111111',1,'2022-08-04'),(72,'2022-08-04 06:03:45','学生学号2','学生姓名2','专业2','2222222222',2,'2022-08-04'),(73,'2022-08-04 06:03:45','学生学号3','学生姓名3','专业3','3333333333',3,'2022-08-04'),(74,'2022-08-04 06:03:45','学生学号4','学生姓名4','专业4','4444444444',4,'2022-08-04'),(75,'2022-08-04 06:03:45','学生学号5','学生姓名5','专业5','5555555555',5,'2022-08-04'),(76,'2022-08-04 06:03:45','学生学号6','学生姓名6','专业6','6666666666',6,'2022-08-04');
/*!40000 ALTER TABLE `xiaoyuankapaifa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaoyuankashenqing`
--

DROP TABLE IF EXISTS `xiaoyuankashenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaoyuankashenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueshengxuehao` varchar(200) DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `zhuanye` varchar(200) DEFAULT NULL COMMENT '专业',
  `shenqingneirong` longtext COMMENT '申请内容',
  `shenqingriqi` date DEFAULT NULL COMMENT '申请日期',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='校园卡申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaoyuankashenqing`
--

LOCK TABLES `xiaoyuankashenqing` WRITE;
/*!40000 ALTER TABLE `xiaoyuankashenqing` DISABLE KEYS */;
INSERT INTO `xiaoyuankashenqing` VALUES (61,'2022-08-04 06:03:45','学生学号1','学生姓名1','专业1','申请内容1','2022-08-04','是',''),(62,'2022-08-04 06:03:45','学生学号2','学生姓名2','专业2','申请内容2','2022-08-04','是',''),(63,'2022-08-04 06:03:45','学生学号3','学生姓名3','专业3','申请内容3','2022-08-04','是',''),(64,'2022-08-04 06:03:45','学生学号4','学生姓名4','专业4','申请内容4','2022-08-04','是',''),(65,'2022-08-04 06:03:45','学生学号5','学生姓名5','专业5','申请内容5','2022-08-04','是',''),(66,'2022-08-04 06:03:45','学生学号6','学生姓名6','专业6','申请内容6','2022-08-04','是','');
/*!40000 ALTER TABLE `xiaoyuankashenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaoyuankazhuxiao`
--

DROP TABLE IF EXISTS `xiaoyuankazhuxiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaoyuankazhuxiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueshengxuehao` varchar(200) DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `zhuanye` varchar(200) DEFAULT NULL COMMENT '专业',
  `xiaoyuankahao` varchar(200) DEFAULT NULL COMMENT '校园卡号',
  `zhuxiaoshijian` datetime DEFAULT NULL COMMENT '注销时间',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='校园卡注销';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaoyuankazhuxiao`
--

LOCK TABLES `xiaoyuankazhuxiao` WRITE;
/*!40000 ALTER TABLE `xiaoyuankazhuxiao` DISABLE KEYS */;
INSERT INTO `xiaoyuankazhuxiao` VALUES (91,'2022-08-04 06:03:45','学生学号1','学生姓名1','专业1','校园卡号1','2022-08-04 14:03:45','备注1'),(92,'2022-08-04 06:03:45','学生学号2','学生姓名2','专业2','校园卡号2','2022-08-04 14:03:45','备注2'),(93,'2022-08-04 06:03:45','学生学号3','学生姓名3','专业3','校园卡号3','2022-08-04 14:03:45','备注3'),(94,'2022-08-04 06:03:45','学生学号4','学生姓名4','专业4','校园卡号4','2022-08-04 14:03:45','备注4'),(95,'2022-08-04 06:03:45','学生学号5','学生姓名5','专业5','校园卡号5','2022-08-04 14:03:45','备注5'),(96,'2022-08-04 06:03:45','学生学号6','学生姓名6','专业6','校园卡号6','2022-08-04 14:03:45','备注6');
/*!40000 ALTER TABLE `xiaoyuankazhuxiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuesheng`
--

DROP TABLE IF EXISTS `xuesheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueshengxuehao` varchar(200) DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `zhuanye` varchar(200) DEFAULT NULL COMMENT '专业',
  `email` varchar(200) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xueshengxuehao` (`xueshengxuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='学生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuesheng`
--

LOCK TABLES `xuesheng` WRITE;
/*!40000 ALTER TABLE `xuesheng` DISABLE KEYS */;
INSERT INTO `xuesheng` VALUES (31,'2022-08-04 06:03:45','学生学号1','学生姓名1','123456','男','13823888881','专业1','773890001@qq.com'),(32,'2022-08-04 06:03:45','学生学号2','学生姓名2','123456','男','13823888882','专业2','773890002@qq.com'),(33,'2022-08-04 06:03:45','学生学号3','学生姓名3','123456','男','13823888883','专业3','773890003@qq.com'),(34,'2022-08-04 06:03:45','学生学号4','学生姓名4','123456','男','13823888884','专业4','773890004@qq.com'),(35,'2022-08-04 06:03:45','学生学号5','学生姓名5','123456','男','13823888885','专业5','773890005@qq.com'),(36,'2022-08-04 06:03:45','学生学号6','学生姓名6','123456','男','13823888886','专业6','773890006@qq.com');
/*!40000 ALTER TABLE `xuesheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yiliaojilu`
--

DROP TABLE IF EXISTS `yiliaojilu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yiliaojilu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiaoyuankahao` varchar(200) DEFAULT NULL COMMENT '校园卡号',
  `xueshengxuehao` varchar(200) DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `yiliaojilu` varchar(200) DEFAULT NULL COMMENT '医疗记录',
  `yiliaofeiyong` varchar(200) DEFAULT NULL COMMENT '医疗费用',
  `dengjishijian` datetime DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='医疗记录';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yiliaojilu`
--

LOCK TABLES `yiliaojilu` WRITE;
/*!40000 ALTER TABLE `yiliaojilu` DISABLE KEYS */;
INSERT INTO `yiliaojilu` VALUES (111,'2022-08-04 06:03:45','校园卡号1','学生学号1','学生姓名1','医疗记录1','医疗费用1','2022-08-04 14:03:45'),(112,'2022-08-04 06:03:45','校园卡号2','学生学号2','学生姓名2','医疗记录2','医疗费用2','2022-08-04 14:03:45'),(113,'2022-08-04 06:03:45','校园卡号3','学生学号3','学生姓名3','医疗记录3','医疗费用3','2022-08-04 14:03:45'),(114,'2022-08-04 06:03:45','校园卡号4','学生学号4','学生姓名4','医疗记录4','医疗费用4','2022-08-04 14:03:45'),(115,'2022-08-04 06:03:45','校园卡号5','学生学号5','学生姓名5','医疗记录5','医疗费用5','2022-08-04 14:03:45'),(116,'2022-08-04 06:03:45','校园卡号6','学生学号6','学生姓名6','医疗记录6','医疗费用6','2022-08-04 14:03:45');
/*!40000 ALTER TABLE `yiliaojilu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-04 14:08:27
