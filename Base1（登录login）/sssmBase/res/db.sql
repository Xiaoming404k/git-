DROP TABLE IF EXISTS `_sys_user`;
CREATE TABLE `_sys_user` (
  `uuid` varchar(50) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delete_time` datetime DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `locked` bit(1) DEFAULT NULL,
  `available` bit(1) DEFAULT NULL,
  `priority` int(11) DEFAULT NULL,
  `create_user` varchar(50) DEFAULT NULL,
  `update_user` varchar(50) DEFAULT NULL,
  `delete_user` varchar(50) DEFAULT NULL,
  `user_code` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `user_type` varchar(50) DEFAULT NULL,
  `receiver` bit(1) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `role_id` varchar(400) DEFAULT NULL,
  `user_group` varchar(50) DEFAULT NULL,
  `company` varchar(50) DEFAULT NULL,
  `vendor_code` varchar(50) DEFAULT NULL COMMENT '厂商代码',
  `tel` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `_sys_user` VALUES ('c3db06d3-c12b-4430-a66f-8a137459db0d', 'admin', null, null, null, '', '', '', '1', null, null, null, '10001', 'admin', 'e10adc3949ba59abbe56e057f20f883e', '2021-10-18 17:04:06', null, '内部采购', '', '6521825@qq.com', 'c3db06d3-c12b-4430-a66f-8a137459dbgw', '1', '优驰软件', '5432', '112');

DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号主键',
  `product_no` int(11) DEFAULT NULL COMMENT '产品编号',
  `product_name` varchar(50) DEFAULT NULL COMMENT '产品名称',
  `product_type` varchar(50) DEFAULT NULL COMMENT '产品类型',
  `status` int(11) DEFAULT NULL COMMENT '状态，1：有效，2：无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;


INSERT INTO `t_product` VALUES ('3', '1002', '米11', '手机', '2');
INSERT INTO `t_product` VALUES ('7', '10001', '米9', '手机', '1');
INSERT INTO `t_product` VALUES ('11', '33', '33', '3', '2');
INSERT INTO `t_product` VALUES ('12', '10032', 'xx', 'x', '1');
INSERT INTO `t_product` VALUES ('13', '10032', 'xx', 'x', '1');
INSERT INTO `t_product` VALUES ('14', '10032', 'xx', 'x', '1');
INSERT INTO `t_product` VALUES ('15', '10032', 'xx', 'x', '1');
