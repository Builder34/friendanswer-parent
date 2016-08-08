/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.6.28 : Database - friendanswer_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`friendanswer_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `friendanswer_db`;

/*Table structure for table `fa_favor` */

DROP TABLE IF EXISTS `fa_favor`;

CREATE TABLE `fa_favor` (
  `favor_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '点赞id',
  `user_id` int(11) DEFAULT NULL COMMENT '点赞人id',
  `post_id` bigint(20) DEFAULT NULL COMMENT '点赞帖子id',
  `creat_time` datetime DEFAULT NULL COMMENT '点赞时间',
  PRIMARY KEY (`favor_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='点赞表';

/*Data for the table `fa_favor` */

insert  into `fa_favor`(`favor_id`,`user_id`,`post_id`,`creat_time`) values (1,34,1,'2016-08-08 11:44:34');

/*Table structure for table `fa_post` */

DROP TABLE IF EXISTS `fa_post`;

CREATE TABLE `fa_post` (
  `post_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '帖子id',
  `post_title` varchar(255) DEFAULT NULL COMMENT '帖子标题',
  `type_id` int(2) DEFAULT NULL COMMENT '帖子类型；1-经历思考，2-经验知识，3-问答',
  `category_id` int(11) DEFAULT NULL COMMENT '领域分类id',
  `post_content` text COMMENT '帖子内容',
  `poster` varchar(100) DEFAULT NULL COMMENT '发帖人',
  `heat_range` int(11) DEFAULT NULL COMMENT '帖子热度',
  `created_time` datetime DEFAULT NULL COMMENT '建立时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`post_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='帖子表';

/*Data for the table `fa_post` */

insert  into `fa_post`(`post_id`,`post_title`,`type_id`,`category_id`,`post_content`,`poster`,`heat_range`,`created_time`,`update_time`) values (1,'大型分布式网站架构是如何学习的',2,1,'在大型网站架构的演变过程中，集中式的架构设计出于对系统的可扩展性、可维护性以及成本等多方面因素的考虑，逐渐被放弃，转而采用分布式的架构设计。分布式架构的核心思想是采用大量廉价的PC Server，构建一个低成本、高可用、高可扩展、高吞吐的集群系统，以支撑海量的用户访问和数据存储，理论上具备无限的扩展能力。分布式系统的设计，是一门复杂的学问，它涉及到通信协议、远程调用，服务治理，系统安全、存储、搜索、监控、稳定性保障、性能优化、数据分析、数据挖掘等各个领域，对任何一个领域的深入挖掘，都能够编写一本篇幅不亚于本书的专门书籍。本书结合作者在阿里巴巴及TB网的实际工作经历，重点介绍大型分布式系统的架构设计，同时，为避免过度专注于理论而使得内容显得空洞，作者穿插介绍了很多实践的案例，尽量让每一个关键的技术点都落到实处，相信能够帮助读者更好地理解本书的内容。\r\n　　内容大纲\r\n　　全书共5章，章与章之间几乎是相互独立的，没有必然的前后依赖关系，因此，读者可以从任何一个感兴趣的专题开始阅读，但是，每一章的各个小节之间的内容是相互关联的，因此，最好按照原文的先后顺序阅读。\r\n　　第1章主要介绍企业内部SOA（Service Oriented Architecture，即面向服务的体系结构）架构的实现，包括HTTP协议的工作原理，基于TCP协议和基于HTTP协议的RPC实现，如何实现服务的路由和负载均衡，HTTP服务网关的架构。\r\n　　第2章主要介绍如何保障互联网通信的安全性，包括一些常见攻击手段的介绍；常见的安全算法，如数字摘要、对称加密、非对称加密、数字签名、数字证书的原理和使用；常用通信认证方式，包括摘要认证、签名认证，以及基于HTTPS协议的安全通信；另外还介绍了通过OAuth协议的授权过程。\r\n　　第3章介绍一些分布式系统所依赖的基础设施，包括分布式缓存，持久化存储。持久化存储又涵盖了传统的关系型数据库MmySQL，以及近年来开始流行NOSQL数据库如HBase、Redis，消息系统及垂直化搜索引擎等。\r\n　　第4章介绍如何保障系统运行的稳定性，包括在线日志分析、集群监控、流量控制、性能优化，以及常用的Java应用故障排查工具和典型案例。\r\n　　第5章介绍如何对海量数据进行分析，包括数据的采集、离线数据分析、流式数据分析、不同数据源间的数据同步和数据报表等。\r\n　　本书并不假设读者在Java领域有很深的技术水平，但是，结合作者本人的工作经验和使用习惯，书中的大部分案例代码均采用Java来编写，并且运行在Linux环境之上，因此，读者最好对Java环境下的编程有一定的了解，并且熟悉Linux环境下的基本操作，以便能够更加顺利地阅读本书。\r\n　　致谢\r\n　　首先，要感谢我的家人，特别是我的妻子，在我占用大量周末、休假的时间进行写作的时候，能够给予极大的宽容、支持和理解，并对我悉心照顾且承担起了全部的家务，让我能够全身心地投入到写作之中，而无须操心一些家庭琐事，没有你的支持和鼓励，这本书是无法完成的。\r\n　　同时，要感谢阿里巴巴及TB网，给我提供了合适的环境和平台，使自己的技能能够得以施展，并且，身处在一群业界的技术大牛中间，也得到了很多学习和成长的机会。，另外，还要感谢我的主管飞悦对于写作开明的态度，以及一直以来的鼓励与支持，并在日常的工作中给予我的很多帮助。\r\n　　最后，还要感谢博文视点的编辑们，本书能够这么快出版，离不开他们的敬业精神和一丝不苟的工作态度。\r\n　　感悟\r\n　　一年多以前，在接到编辑约稿即将开始动笔之前，自己曾信心满满地认为，应该能够比较顺利地完成这本书，因为写的内容自己都比较熟悉，而且平时工作当中也有一些笔记积累，不是从零开始的。但当真正开始写了以后才知道，理解领悟和用文字表达出来完全是两个层面的事情，日常工作中一些很普遍很常见的设计思路，可能是由一次次失败和挫折得到的经验教训演变而来。很多时候我们只知道how，而忽略了what和why，要解释清楚what、why、how，甚至是why not，并没有想象中的那么容易。当然，通过写作的过程，自己也将这些知识点从头到尾梳理了一遍，对这些知识的认识和理解也更加深入和全面。每次重新回过头来审阅书稿时，都会觉得某些知识点讲述得还不够透彻，需要进行补充，抑或是感觉对某些知识点的叙述不够清晰和有条理，还能够有更好的表述方式。但是，书不能一直写下去，在本书完稿之时，自己并没有想象中那样的兴奋或者放松，写作时的那种“战战兢兢，如履薄冰”的感觉，依然萦绕在心头，每一次落笔，都担心会不会因为自己的疏忽或者理解上的偏差，从而误导读者。由于时间的因素和写作水平的限制，书中难免会有错误和疏漏之处，恳请读者批评和指正。\r\n　　陈康贤\r\n　　2014年5月于杭州',NULL,5,'2016-08-08 11:44:02','2016-08-08 11:44:05');

/*Table structure for table `fa_post_comment` */

DROP TABLE IF EXISTS `fa_post_comment`;

CREATE TABLE `fa_post_comment` (
  `comment_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `previous_id` bigint(20) DEFAULT NULL COMMENT '上一级评论id',
  `post_id` bigint(20) DEFAULT NULL COMMENT '帖子id',
  `user_id` int(11) DEFAULT NULL COMMENT '评论人id',
  `comment_content` text COMMENT '评论内容',
  `comment_time` datetime DEFAULT NULL COMMENT '评论时间',
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='帖子评论表';

/*Data for the table `fa_post_comment` */

insert  into `fa_post_comment`(`comment_id`,`previous_id`,`post_id`,`user_id`,`comment_content`,`comment_time`) values (1,-1,1,34,'很好的经验啊，学习了!','2016-08-08 11:45:22'),(2,-1,1,20,'不错的学习经验，楼主好强大啊！！！','2016-08-08 11:51:37');

/*Table structure for table `fa_star` */

DROP TABLE IF EXISTS `fa_star`;

CREATE TABLE `fa_star` (
  `star_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '收藏id',
  `user_id` int(11) DEFAULT NULL COMMENT '收藏人id',
  `post_id` bigint(20) DEFAULT NULL COMMENT '帖子id',
  `star_time` datetime DEFAULT NULL COMMENT '收藏时间',
  PRIMARY KEY (`star_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='收藏表';

/*Data for the table `fa_star` */

insert  into `fa_star`(`star_id`,`user_id`,`post_id`,`star_time`) values (1,34,1,'2016-08-08 11:45:36');

/*Table structure for table `fa_territory` */

DROP TABLE IF EXISTS `fa_territory`;

CREATE TABLE `fa_territory` (
  `territory_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '领域id',
  `territory_name` varchar(200) DEFAULT NULL COMMENT '领域名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`territory_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='行业领域表';

/*Data for the table `fa_territory` */

/*Table structure for table `fa_territory_category` */

DROP TABLE IF EXISTS `fa_territory_category`;

CREATE TABLE `fa_territory_category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '分类id',
  `category_name` varchar(200) DEFAULT NULL COMMENT '分类名称',
  `territory_id` int(11) DEFAULT NULL COMMENT '行业领域id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='领域分类表';

/*Data for the table `fa_territory_category` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
