-- MySQL dump 10.13  Distrib 5.6.24, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: periodicos
-- ------------------------------------------------------
-- Server version	5.6.20

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
-- Table structure for table `piezadocumental`
--

DROP TABLE IF EXISTS `piezadocumental`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `piezadocumental` (
  `Id_piezadocumental` int(11) NOT NULL AUTO_INCREMENT,
  `Id_proyecto` int(11) NOT NULL,
  `Dia` tinyint(2) NOT NULL,
  `Mes` varchar(10) NOT NULL,
  `Año` char(4) NOT NULL,
  `Titulo` varchar(255) DEFAULT NULL,
  `Descripcion` varchar(255) NOT NULL,
  `Cant_folios` int(3) NOT NULL,
  `Completo` tinyint(1) NOT NULL,
  `Observacion` varchar(300) NOT NULL,
  `Ruta_documento` varchar(300) DEFAULT NULL,
  `Fecha_hora` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `Tomo` varchar(10) DEFAULT NULL,
  `Numero` varchar(10) DEFAULT NULL,
  `Year` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Id_piezadocumental`,`Id_proyecto`),
  UNIQUE KEY `Id_piezadocumental_UNIQUE` (`Id_piezadocumental`),
  KEY `iId_proyecto_idx` (`Id_proyecto`),
  CONSTRAINT `iId_proyecto` FOREIGN KEY (`Id_proyecto`) REFERENCES `proyecto` (`Id_proyecto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `piezadocumental`
--

LOCK TABLES `piezadocumental` WRITE;
/*!40000 ALTER TABLE `piezadocumental` DISABLE KEYS */;
INSERT INTO `piezadocumental` VALUES (1,1,12,'Julio','1954','akjdf','asdflkasd',21,1,'','null','2015-08-14 17:49:23',NULL,NULL,NULL),(2,9,12,'Abril','1235','asfdawf','asdf',21,1,'ninguno','null','2015-08-14 17:51:58',NULL,NULL,NULL),(3,8,1,'Enero','2000','fañjfñalskjfñlaksdjfñlk','ñaskdlfjañslkdf asdjfñlkasjdfñlkasjdfñlka sfjasñlkdf ñlasdjfñ laskdf',15,0,'','null','2015-08-14 17:57:39',NULL,NULL,NULL),(4,7,5,'Junio','3212','ajñdlfj as dfjña slkjf ñalsjdfñlkasj ñdlfkjasñlkjfñlkasjdñlfkjasñldkf','qweporiuqwpoiurpoqiweuroiquwporiuq weruqwpeoiruqpwoe',15,1,'','null','2015-08-14 17:57:59',NULL,NULL,NULL),(5,10,12,'Marzo','12','12','111ee',21,1,'e12we','null','2015-08-17 14:38:49',NULL,NULL,NULL),(6,11,12,'Febrero','1231','12','12',122,1,'1231','null','2015-08-17 14:58:18',NULL,NULL,NULL);
/*!40000 ALTER TABLE `piezadocumental` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proyecto`
--

DROP TABLE IF EXISTS `proyecto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proyecto` (
  `Id_proyecto` int(11) NOT NULL AUTO_INCREMENT,
  `Num_stand` varchar(10) NOT NULL,
  `Cuerpo_colum` int(11) NOT NULL,
  `Balda` varchar(10) NOT NULL,
  `Codigo` varchar(20) NOT NULL,
  `Año_inicial` char(10) NOT NULL,
  `Año_final` char(10) NOT NULL,
  `Meses` varchar(120) NOT NULL,
  `Denominacion` varchar(60) NOT NULL,
  `Cant_folios` int(4) NOT NULL,
  `Cant_piezas` varchar(20) NOT NULL,
  `Imagen` blob,
  `Fecha_creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Fecha_cierre` datetime DEFAULT NULL,
  `Cod_trabajador` int(4) NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`Id_proyecto`),
  KEY `Cod_trabajadores_idx` (`Cod_trabajador`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proyecto`
--

LOCK TABLES `proyecto` WRITE;
/*!40000 ALTER TABLE `proyecto` DISABLE KEYS */;
INSERT INTO `proyecto` VALUES (1,'1',1,'1A','A','2014','2014','ENERO','ASDFH',0,'0',NULL,'2015-08-11 18:03:26',NULL,1,1),(3,'1',1,'45','54','1955','1992','Marzo, Setiembre, Marzo, Setiembre','54 ',54,'54','null','2015-08-12 17:08:54',NULL,1,1),(4,'1',1,'2.A','PERI01-15LOSANDES','1955','1992','Marzo, Abril, Noviembre, Marzo, Abril, Noviembre','LOS ANDES ',123,'80','null','2015-08-12 17:16:43',NULL,1,1),(5,'1',1,'5','PERI-02','1234','1992','Enero a Diciembre','DIARO EL PERUANO',12,'12','null','2015-08-14 14:26:52',NULL,1,1),(6,'1',2,'1A','PERI-03','1955','1992','Enero a Diciembre','CORREO 1958',1222,'1223','null','2015-08-14 14:49:52','2015-07-18 03:32:27',1,1),(7,'1',2,'1A','PERI-04','1955','1992','Febrero, Agosto, Febrero, Agosto','CORREO',12,'12','null','2015-08-14 14:53:49','2015-07-19 11:02:27',1,1),(8,'1',2,'1A','PERI-05','1955','1992','Agosto, Setiembre, Agosto, Setiembre','NOTAS',1111,'1111','null','2015-08-14 14:55:19','2015-08-18 14:36:20',1,1),(9,'1',2,'1A','PERI-06','1955','1992','Enero, Julio, Setiembre, Enero, Julio, Setiembre','DIARIO LOS ANDES',12,'12','null','2015-08-14 16:52:34','2015-07-18 00:00:00',1,1),(10,'1',2,'1B','PERI-07','1955','1992','Enero, Abril, Setiembre, Enero, Abril, Setiembre','EL PERUANO',12,'15','null','2015-08-14 18:40:23','2015-07-18 00:00:00',1,1),(11,'1',3,'1B','PERI-08','1955','1992','Julio, Julio','LOS ANDES 1955',1231,'1231','null','2015-08-17 14:57:48','2015-07-18 00:00:00',1,1),(15,'1',3,'1B','PERI-09','1955','1992','Febrero, Febrero','LOS ANDES 1978',111,'11','null','2015-08-17 15:57:05','2015-07-19 11:02:10',1,1),(16,'1',3,'1B','PERI-10','1955','1992','Febrero, Febrero','EL SALUSTIANO',5555,'555','null','2015-08-17 15:58:18','2015-07-19 11:52:30',1,1);
/*!40000 ALTER TABLE `proyecto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trabajadores`
--

DROP TABLE IF EXISTS `trabajadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trabajadores` (
  `Cod_trabajador` int(4) NOT NULL,
  `Nombres` varchar(45) DEFAULT NULL,
  `Apellidos` varchar(45) DEFAULT NULL,
  `Dni` char(10) DEFAULT NULL,
  `Sexo` tinyint(1) DEFAULT NULL,
  `Direccion` varchar(100) DEFAULT NULL,
  `Telefono` varchar(12) DEFAULT NULL,
  `Celular` varchar(12) DEFAULT NULL,
  `Cargo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Cod_trabajador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trabajadores`
--

LOCK TABLES `trabajadores` WRITE;
/*!40000 ALTER TABLE `trabajadores` DISABLE KEYS */;
INSERT INTO `trabajadores` VALUES (1,'Leo','Huascope','12345678',0,'a','a','a','a');
/*!40000 ALTER TABLE `trabajadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `Id_usuario` int(11) NOT NULL,
  `Nombre_usuario` varchar(45) DEFAULT NULL,
  `Passwor` varchar(150) DEFAULT NULL,
  `Trabajadores_Cod_trabajador` int(4) NOT NULL,
  PRIMARY KEY (`Id_usuario`,`Trabajadores_Cod_trabajador`),
  KEY `fk_Usuario_Trabajadores1_idx` (`Trabajadores_Cod_trabajador`),
  CONSTRAINT `fk_Usuario_Trabajadores1` FOREIGN KEY (`Trabajadores_Cod_trabajador`) REFERENCES `trabajadores` (`Cod_trabajador`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'leo','leo',1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-20 16:04:51
