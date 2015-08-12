-- MySQL dump 10.13  Distrib 5.6.19, for linux-glibc2.5 (x86_64)
--
-- Host: localhost    Database: Periodicos
-- ------------------------------------------------------
-- Server version	5.5.43-0ubuntu0.14.04.1

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
-- Table structure for table `PiezaDocumental`
--

DROP TABLE IF EXISTS `PiezaDocumental`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PiezaDocumental` (
  `Id_piezadocumental` int(11) NOT NULL,
  `Id_proyecto` int(11) DEFAULT NULL,
  `Dia` tinyint(4) DEFAULT NULL,
  `Mes` varchar(10) DEFAULT NULL,
  `Año` char(4) DEFAULT NULL,
  `Titulo` varchar(255) DEFAULT NULL,
  `Descripcion` text,
  `Cant_folios` int(3) DEFAULT NULL,
  `Completo` tinyint(1) DEFAULT NULL,
  `Observacion` text,
  `Ruta_documento` varchar(300) DEFAULT NULL,
  `Fecha_hora` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`Id_piezadocumental`),
  KEY `iId_proyecto_idx` (`Id_proyecto`),
  CONSTRAINT `iId_proyecto` FOREIGN KEY (`Id_proyecto`) REFERENCES `Proyecto` (`Id_proyecto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PiezaDocumental`
--

LOCK TABLES `PiezaDocumental` WRITE;
/*!40000 ALTER TABLE `PiezaDocumental` DISABLE KEYS */;
/*!40000 ALTER TABLE `PiezaDocumental` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Proyecto`
--

DROP TABLE IF EXISTS `Proyecto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Proyecto` (
  `Id_proyecto` int(11) NOT NULL AUTO_INCREMENT,
  `Num_stand` varchar(4) NOT NULL,
  `Cuerpo_colum` int(11) NOT NULL,
  `Balda` varchar(4) NOT NULL,
  `Codigo` varchar(20) NOT NULL,
  `Año_inicial` char(4) NOT NULL,
  `Año_final` char(4) NOT NULL,
  `Meses` varchar(88) NOT NULL,
  `Denominacion` varchar(60) NOT NULL,
  `Cant_folios` int(4) NOT NULL,
  `Cant_piezas` int(4) DEFAULT '0',
  `Imagen` blob,
  `Fecha_creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Fecha_cierre` datetime DEFAULT NULL,
  `Cod_trabajador` int(4) NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`Id_proyecto`),
  KEY `Cod_trabajadores_idx` (`Cod_trabajador`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Proyecto`
--

LOCK TABLES `Proyecto` WRITE;
/*!40000 ALTER TABLE `Proyecto` DISABLE KEYS */;
INSERT INTO `Proyecto` VALUES (1,'1',1,'1A','A','2014','2014','ENERO','ASDFH',0,0,NULL,'2015-08-11 18:03:26',NULL,1,1),(2,'+sta',0,'+bal','+codigo+','+yea','+yea','+meses+','+denominacion+',0,0,'+Imagen+','2015-08-12 16:57:15',NULL,0,0),(3,'45',5,'45','54','54','54','Marzo, Setiembre, Marzo, Setiembre','54 ',54,54,'null','2015-08-12 17:08:54',NULL,1,1),(4,'1',2,'2.A','PERI01-15LOSANDES','1990','1992','Marzo, Abril, Noviembre, Marzo, Abril, Noviembre','LOS ANDES ',123,80,'null','2015-08-12 17:16:43',NULL,1,1);
/*!40000 ALTER TABLE `Proyecto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Trabajadores`
--

DROP TABLE IF EXISTS `Trabajadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Trabajadores` (
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
-- Dumping data for table `Trabajadores`
--

LOCK TABLES `Trabajadores` WRITE;
/*!40000 ALTER TABLE `Trabajadores` DISABLE KEYS */;
/*!40000 ALTER TABLE `Trabajadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Usuario`
--

DROP TABLE IF EXISTS `Usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Usuario` (
  `Id_usuario` int(11) NOT NULL,
  `Nombre_usuario` varchar(45) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Passwor` varchar(150) DEFAULT NULL,
  `Trabajadores_Cod_trabajador` int(4) NOT NULL,
  PRIMARY KEY (`Id_usuario`,`Trabajadores_Cod_trabajador`),
  KEY `fk_Usuario_Trabajadores1_idx` (`Trabajadores_Cod_trabajador`),
  CONSTRAINT `fk_Usuario_Trabajadores1` FOREIGN KEY (`Trabajadores_Cod_trabajador`) REFERENCES `Trabajadores` (`Cod_trabajador`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuario`
--

LOCK TABLES `Usuario` WRITE;
/*!40000 ALTER TABLE `Usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `Usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-12 12:51:13
