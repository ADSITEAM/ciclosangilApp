/*
Navicat MySQL Data Transfer

Source Server         : Conexion
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : ciclosangil

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2017-11-16 11:15:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ciclistas`
-- ----------------------------
DROP TABLE IF EXISTS `ciclistas`;
CREATE TABLE `ciclistas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `n_documento` varchar(15) DEFAULT NULL,
  `tipo_documento` int(11) DEFAULT NULL,
  `nombres` varchar(60) DEFAULT NULL,
  `apellidos` varchar(60) DEFAULT NULL,
  `fecha_nacimiento` varchar(30) DEFAULT NULL,
  `lugar_nacimiento` varchar(25) DEFAULT NULL,
  `colegio` varchar(30) DEFAULT NULL,
  `jornada` int(11) DEFAULT NULL,
  `rh` int(11) DEFAULT NULL,
  `eps` int(11) DEFAULT NULL,
  `direccion` varchar(20) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `nombre_madre` varchar(60) DEFAULT NULL,
  `nombre_padre` varchar(60) DEFAULT NULL,
  `modalidad` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_RH` (`rh`),
  KEY `fk_eps` (`eps`),
  CONSTRAINT `fk_RH` FOREIGN KEY (`rh`) REFERENCES `rh` (`id`),
  CONSTRAINT `fk_eps` FOREIGN KEY (`eps`) REFERENCES `eps` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of ciclistas
-- ----------------------------
INSERT INTO `ciclistas` VALUES ('1', '1100974502', '1', 'Nicolás Mateo', 'Arias Pulido', '16-03-1999', 'San Gil', 'Sena', '1', '1', '1', 'Cra 9 # 4-69', 'nmarias38@misena.edu.co', '3187094963', 'Luz Marina Pulido Sandoval', 'Teobaldo Arias Quintero', 'Ruta');
INSERT INTO `ciclistas` VALUES ('2', '99031612180', '0', 'Johan Sebastian', 'Galvis', '06-11-2001', 'San Gil', 'Corpotec', '3', '3', '2', 'San Martin', 'js@mail.com', '3213123', 'Consuelo Quintero', 'Omar Galvis', 'Ruta');
INSERT INTO `ciclistas` VALUES ('3', '1234567', '1', 'Didier', 'Herrera Mejia', '06-09-1999', 'Paramo', 'Sena', '1', '1', '1', 'Cra 9 # 3 -45', 'didier@misena.edu.co', '31289083', 'Maria Mejia', 'Jose Herrera', 'Ruta');
INSERT INTO `ciclistas` VALUES ('5', '213123', '1', 'Robinson David', 'Galvis', '12-06-1999', 'Simacota', 'SENA', '1', '2', '8', 'asdas', 'dasdsad', '32133', 'dsadsadd', 'dasdsa', 'dasdasdsa');
INSERT INTO `ciclistas` VALUES ('6', '10001234567', '0', 'Ferley Esteban', 'Arias Pulido', '14-11-2002', 'San Gil', 'Colegio San José de Guanentá', '2', '4', '1', 'Cra 9 # 4-69', 'ferley225@gmail.com', '3128904567', 'Luz Marina Pulido Sandoval', 'Teobaldo Arias Pulido', 'Ruta');
INSERT INTO `ciclistas` VALUES ('7', '1100974502', '1', 'Nicolás MAteo', 'Arias Pulido', '16-03-1999', 'San Gil', 'SENA', '1', '2', '6', 'Cra 9 # 4-69', 'nmarias38@misena.edu.co', '3187094963', 'Luz Marina Pulido Sandoval', 'Teobaldo Arias Quintero', 'Ruta');
INSERT INTO `ciclistas` VALUES ('8', '21312312312', '1', 'Didier José', 'Galvis Lopez', '14-06-1995', 'Cabrera', 'Universidad Javeriana', '2', '6', '21', 'Cra 12 # 6-25', 'dejose@misena.edu.co', '3129078909', 'Maria Camila Lopez Lopez', 'Robinson David Galvis', 'Ruta');

-- ----------------------------
-- Table structure for `eps`
-- ----------------------------
DROP TABLE IF EXISTS `eps`;
CREATE TABLE `eps` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of eps
-- ----------------------------
INSERT INTO `eps` VALUES ('1', 'ASOCIACIÓN MUTUAL SER ESS ');
INSERT INTO `eps` VALUES ('2', 'CCF DE LA GUAJIRA');
INSERT INTO `eps` VALUES ('3', 'AMBUQ ARS');
INSERT INTO `eps` VALUES ('4', 'COOSALUD EPS ');
INSERT INTO `eps` VALUES ('5', 'COMFACOR ');
INSERT INTO `eps` VALUES ('6', 'COMFAORIENTE');
INSERT INTO `eps` VALUES ('7', 'COMFASUCRE');
INSERT INTO `eps` VALUES ('8', 'CCF CAJACOPI ATLÁNTICO');
INSERT INTO `eps` VALUES ('9', 'EMDISALUD E.S.S. ');
INSERT INTO `eps` VALUES ('10', 'ECOOPSOS ESS');
INSERT INTO `eps` VALUES ('11', 'COMFAMILIAR CARTAGENA ');
INSERT INTO `eps` VALUES ('12', 'ASMET SALUD');
INSERT INTO `eps` VALUES ('13', 'COMPARTA');
INSERT INTO `eps` VALUES ('14', 'SAVIA SALUD EPS');
INSERT INTO `eps` VALUES ('15', 'SALUDVIDA E.P.S. S.A.');
INSERT INTO `eps` VALUES ('16', 'COMFABOY');
INSERT INTO `eps` VALUES ('17', 'COMFAMILIAR CHOCO');
INSERT INTO `eps` VALUES ('18', 'CAPITAL SALUD EPS');
INSERT INTO `eps` VALUES ('19', 'COMFACUNDI');
INSERT INTO `eps` VALUES ('20', 'A.R.S. CONVIDA');
INSERT INTO `eps` VALUES ('21', 'CAFESALUD EPS');
INSERT INTO `eps` VALUES ('22', 'COMFAMILIAR HUILA');
INSERT INTO `eps` VALUES ('23', 'CAPRESOCA E.P.S.');
INSERT INTO `eps` VALUES ('24', 'EMSSANAR ESS');
INSERT INTO `eps` VALUES ('25', 'CCF DE NARINO');
INSERT INTO `eps` VALUES ('26', 'EPS SURAMERICANA S.A.');
INSERT INTO `eps` VALUES ('27', 'SANITAS S.A. E.P.S. ');
INSERT INTO `eps` VALUES ('28', 'ALIANSALUD EPS S.A. ');
INSERT INTO `eps` VALUES ('29', 'NUEVA EPS');
INSERT INTO `eps` VALUES ('30', 'COMPENSAR E.P.S.');
INSERT INTO `eps` VALUES ('31', 'SALUD TOTAL S.A. EPS');
INSERT INTO `eps` VALUES ('32', 'EPS FAMISANAR LTDA');
INSERT INTO `eps` VALUES ('33', 'COOMEVA E.P.S. S.A. ');
INSERT INTO `eps` VALUES ('34', 'SERV. OCCI. DE SALUD SOS EPS');
INSERT INTO `eps` VALUES ('35', 'COMFENALCO VALLE E.P.S. ');
INSERT INTO `eps` VALUES ('36', 'CRUZ BLANCA EPS S.A.');

-- ----------------------------
-- Table structure for `rh`
-- ----------------------------
DROP TABLE IF EXISTS `rh`;
CREATE TABLE `rh` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `RH` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of rh
-- ----------------------------
INSERT INTO `rh` VALUES ('1', 'O-');
INSERT INTO `rh` VALUES ('2', 'O+');
INSERT INTO `rh` VALUES ('3', 'A-');
INSERT INTO `rh` VALUES ('4', 'A+');
INSERT INTO `rh` VALUES ('5', 'B-');
INSERT INTO `rh` VALUES ('6', 'B+');
INSERT INTO `rh` VALUES ('7', 'AB-');
INSERT INTO `rh` VALUES ('8', 'AB+');

-- ----------------------------
-- Table structure for `usuarios`
-- ----------------------------
DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `username` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of usuarios
-- ----------------------------
