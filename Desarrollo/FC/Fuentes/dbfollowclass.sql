CREATE DATABASE  IF NOT EXISTS `dbfollowclass` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `dbfollowclass`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: dbfollowclass
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso` (
  `id_curso` int NOT NULL,
  `nombre` varchar(45) DEFAULT NULL COMMENT 'TRIAL',
  `docente` varchar(45) DEFAULT NULL COMMENT 'TRIAL',
  `facultad` varchar(45) DEFAULT NULL COMMENT 'TRIAL',
  `escuela` varchar(45) DEFAULT NULL COMMENT 'TRIAL',
  `plan` varchar(45) DEFAULT NULL COMMENT 'TRIAL',
  `periodo_academico` varchar(45) DEFAULT NULL COMMENT 'TRIAL',
  `cantidad_semanas` int DEFAULT '16' COMMENT 'TRIAL',
  `ciclo` int DEFAULT NULL COMMENT 'TRIAL',
  `tipo` varchar(45) DEFAULT NULL COMMENT 'TRIAL',
  `creditos` int DEFAULT NULL COMMENT 'TRIAL',
  `aprobado` int DEFAULT NULL,
  `hora_inicio` time DEFAULT NULL,
  `hora_fin` time DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  PRIMARY KEY (`id_curso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='TRIAL';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES (2,'ALGORÍTMICA I','Mota Alva, Lazaro Florian','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,3,'O',4,NULL,NULL,NULL,NULL),(3,'ESTADÍSTICA','Depaz Apestegui, Rosario','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,3,'O',3,NULL,NULL,NULL,NULL),(4,'FÍSICA ELECTRÓNICA','Mejía Santillán, Mirian Esther','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,3,'O',3,NULL,NULL,NULL,NULL),(5,'INGENIERÍA ECONÓMICA','Reátegui Sánchez, Lleyni','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,3,'O',3,NULL,NULL,NULL,NULL),(6,'INTRODUCCIÓN AL DESARROLLO DE SOFTWARE','Romero Naupari, Pablo Jesus','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,3,'O',3,NULL,NULL,NULL,NULL),(7,'MATEMÁTICA BÁSICA','Chavez Machado, Elfren','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,3,'O',4,NULL,NULL,NULL,NULL),(8,'ORGANIZACIÓN Y ADMINISTRACIÓN','Chavez Herrera, Carlos Ernesto','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,3,'O',3,NULL,NULL,NULL,NULL),(9,'REDACCIÓN Y TÉCNICAS COMUNICACIÓN EFECTIVA II','Mamani Quispe, Luis Alberto','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,2,'O',3,NULL,NULL,NULL,NULL),(13,'ECONOMÍA PARA LA GESTIÓN','Pinglo Ramirez, Miguel Ángel','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',16,5,'O',3,NULL,'14:00:00','18:00:00','2022-07-07'),(14,'INGENIERÍA DE REQUISITOS','Prudencio Vidal, Javier Antonio','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',16,5,'O',4,NULL,'08:00:00','13:00:00','2022-07-10'),(15,'GESTIÓN DE LA CONFIGRACIÓN','Rodriguez Rodriguez, Ciro','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,6,'O',3,NULL,NULL,NULL,NULL),(16,'ESTRUCTURA DE DATOS','Salinas Azaña, Gilberto Aníbal','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',16,5,'O',4,NULL,'08:00:00','13:00:00','2022-07-08'),(17,'GARANTÍA DE SOFTWARE','Collantes Inga, Zoila Mercedes','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,9,'O',3,NULL,NULL,NULL,NULL),(18,'GERENCIA DE TECNOLOGÍA DE LA INFORMACIÓN','Machado Vicente, Joel Fernando','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,9,'O',3,NULL,NULL,NULL,NULL),(19,'GESTIÓN DE MANTENIMIENTO DEL SOFTWARE','Inga López, Wilder Alex','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,9,'O',3,NULL,NULL,NULL,NULL),(20,'GESTIÓN DE RIESGO DEL SOFTWARE','Machado Vicente, Joel Fernando','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,9,'O',3,NULL,NULL,NULL,NULL),(21,'INTERNET DE LAS COSAS','Limachi Cartolin, Yury','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,9,'O',3,NULL,NULL,NULL,NULL),(22,'TALLER DE CONSTRUCCIÓN DE SOFTWARE MÓVIL','Petrlik Azabache, Ivan Carlo','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,9,'O',3,NULL,NULL,NULL,NULL),(23,'SOFTWARE INTELIGENTE','Calderon Vilca, Hugo David','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,9,'O',3,NULL,NULL,NULL,NULL),(24,'AUTOMATIZACIÓN Y CONTROL DE SOFTWARE','Vasquez Reyes, Eduardo Angel','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,8,'O',3,NULL,NULL,NULL,NULL),(25,'INTELIGENCIA DE NEGOCIOS','Cancho Rodriguez, Ernesto David','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,8,'O',3,NULL,NULL,NULL,NULL),(26,'METODOLOGÍA DELA INVESTIGACIÓN','Wong Portillo, Lenis Rossi','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,8,'O',2,NULL,NULL,NULL,NULL),(27,'MINERÍA DE DATOS','Calderón Vilca, Hugo David','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,8,'O',3,NULL,NULL,NULL,NULL),(28,'PROGRAMACIÓN CONCURRENTE Y PARALELA','Petrlik Azabache, Ivan Carlo','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,8,'O',3,NULL,NULL,NULL,NULL),(29,'SEGURIDAD DEL SOFTWARE','Collantes Inga, Zoila Mercedes','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,8,'O',3,NULL,NULL,NULL,NULL),(30,'TALLER DE CONSTRUCCIÓN DE SOFTWARE WEB','Alarcón Loayza, Luis Alberto','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,8,'O',3,NULL,NULL,NULL,NULL),(31,'VERIFICACIÓN Y VALIDACIÓN DE SOFTWARE','Inga López, Wilder Alex','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,8,'O',3,NULL,NULL,NULL,NULL),(32,'ARQUITECTURA DE SOFTWARE','Cordero Sánchez, Hugo Rafael','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,7,'O',4,NULL,NULL,NULL,NULL),(33,'BASE DE DATOS II','Gamarra Moreno, Juan','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,7,'O',4,NULL,NULL,NULL,NULL),(34,'EXPERIENCIA DE USUARIO Y USABILIDAD','Reyes Huamán, Anita Marlene','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,7,'O',3,NULL,NULL,NULL,NULL),(35,'GESTIÓN DE PROYECTO DE SOFTWARE','Bartra More, Arturo Alejandro','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,7,'O',3,NULL,NULL,NULL,NULL),(36,'INTELIGENCIA ARTIFICIAL','Gamarra Moreno, Juan','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,7,'O',3,NULL,NULL,NULL,NULL),(37,'MÉTODOS FORMALES PARA PRUEBAS','Bartra More, Arturo Alejandro','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,7,'O',3,NULL,NULL,NULL,NULL),(38,'REDES Y TRANSMISIÓN DE DATOS','Ugaz Cachay, Winston Ignacio','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,7,'O',3,NULL,NULL,NULL,NULL),(39,'ASEGURAMIENTO DE LA CALIDAD DEL SOFTWARE','Huapaya Chumpitaz, Mario Agustin','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,6,'O',3,NULL,NULL,NULL,NULL),(40,'BASE DE DATOS I','Murakami de la Cruz, Sumiko Elizabeth','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,6,'O',4,NULL,NULL,NULL,NULL),(41,'DISEÑO DE SOFTWARE','Menéndez Mueras, Rosa','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,6,'O',4,NULL,NULL,NULL,NULL),(42,'FORMACIÓN DE EMPRESAS DE SOFTWARE','Bayona Oré, Luz Sussy','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,6,'O',3,NULL,NULL,NULL,NULL),(43,'INTERACCIÓN HOMBRE COMPUTADOR','Moreno Sucre, Fanny Analy','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,6,'O',3,NULL,NULL,NULL,NULL),(44,'SISTEMAS OPERATIVOS','Vasquez Reyes, Eduardo Angel','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,6,'O',3,NULL,NULL,NULL,NULL),(45,'ANÁLISIS Y DISEÑO DE ALGORITMOS','Prudencio Vidal, Javier Antonio','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',16,5,'O',3,NULL,'08:00:00','13:00:00','2022-07-09'),(46,'ARQUITECTURA DE COMPUTADORAS','Fermin Perez, Felix Armando','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',16,5,'O',4,NULL,'08:00:00','12:00:00','2022-07-08'),(47,'CALIDAD DE SOFTWARE','Bartra More, Arturo Alejandro','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',16,5,'O',4,NULL,'17:00:00','22:00:00','2022-07-12'),(48,'COMPUTACIÓN VISUAL','Trujillo Trejo, Ledgard','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',16,5,'O',3,NULL,'18:00:00','22:00:00','2022-07-07'),(49,'ESTRUCTURA DE DATOS','Salinas Azaña, Salinas Anibal','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',16,5,'O',4,NULL,'08:00:00','13:00:00','2022-07-10'),(52,'ALGORÍTMICA II','Zavaleta Campos, Jorge Luis','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,4,'O',4,NULL,NULL,NULL,NULL),(53,'CONTABILIDAD PARA LA GESTIÓN','Mercado Philco Fausto Franklin','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,4,'O',3,NULL,NULL,NULL,NULL),(54,'INNOVACIÓN, TECNOLOGÍA Y EMPRENDIMIENTO','Bayona Oré, Luz Sussy','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,4,'O',3,NULL,NULL,NULL,NULL),(55,'MATEMÁTICA DISCRETA','Flores Lopez, Oscar Mauricio','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,4,'O',3,NULL,NULL,NULL,NULL),(56,'PROBABILIDADES','Huaroto Sumari, Justa Caridad','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,4,'O',3,NULL,NULL,NULL,NULL),(57,'PROCESOS DE SOFTWARE','Pantoja Collantes, Jorge Santiago','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,4,'O',3,NULL,NULL,NULL,NULL),(58,'SISTEMAS DIGITALES','Flores Lopez, Oscar Mauricio','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,4,'O',3,NULL,NULL,NULL,NULL),(59,'INVESTIGACIÓN FORMATIVA','Nuñez, Medrano, Elizabeth Jessica','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,2,'O',3,NULL,NULL,NULL,NULL),(60,'REALIDAD NACIONAL Y MUNDIAL','Valle Castro, Deissy Elizabeth','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,2,'O',2,NULL,NULL,NULL,NULL),(61,'CÁLCULO II','Zorrilla Masías, Henry','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,2,'O',4,NULL,NULL,NULL,NULL),(62,'FÍSICA I','Rocha Cabrera, Ronald David','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,2,'O',4,NULL,NULL,NULL,NULL),(63,'QUÍMICA GENERAL','Gómez Galvez, Susana Teresa','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,2,'O',4,NULL,NULL,NULL,NULL),(64,'INTRODUCCIÓN A LAS CIENCIAS E INGENIERÍAS','Villaverde Medrano, Hugo','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,2,'O',2,NULL,NULL,NULL,NULL),(65,'REDACCIÓN Y TÉCNICAS COMUNICACIÓN EFECTIVA I','Nuñez, Medrano, Elizabeth Jessica','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,1,'O',3,NULL,NULL,NULL,NULL),(66,'MÉTODOS DE ESTUDIOS UNIVERSITARIOS','Nuñez, Medrano, Elizabeth Jessica','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,1,'O',2,NULL,NULL,NULL,NULL),(67,'DESARROLLO PERSONAL Y LIDERAZGO','Chincaro Egusquiza, Lucy Cristina','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,1,'O',2,NULL,NULL,NULL,NULL),(68,'CÁLCULO I','','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,1,'O',4,NULL,NULL,NULL,NULL),(69,'BIOLOGÍA PARA CIENCIAS E INGENIERÍA','Arias Ramirez, Angela Renee','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,1,'O',4,NULL,NULL,NULL,NULL),(70,'ÁLGEBRA Y GEOMETRÍA ANALÍTICA','Bocanegra Rodriguez, Lito Edinson','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,1,'O',4,NULL,NULL,NULL,NULL),(71,'MEDIO AMBIENTE Y DESARROLLO SOSTENIBLE','Valle Castro, Deissy Elizabeth','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018','2022-1',NULL,1,'O',3,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiante` (
  `id_estudiante` int NOT NULL AUTO_INCREMENT,
  `nombre_apellido` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `facultad` varchar(45) DEFAULT NULL,
  `escuela` varchar(45) DEFAULT NULL,
  `plan` varchar(45) DEFAULT NULL,
  `ciclo` int DEFAULT NULL,
  PRIMARY KEY (`id_estudiante`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` VALUES (1,'Bianca Romero','bianca.romero@unmsm.edu.pe','123456','Ingeniería de Sistemas e Informática','Ingeniería de Software','2018',5),(2,'fadsf','addsfsd','134','Ciencias Físicas','Arte.','2015',NULL),(3,'Oscar Salazar','oscar.Salazar@unmsm.edu.pe','159','Ciencias Biológicas','Conservación y Restauración.','2015',NULL),(4,'Jose','jose.cesar@unmsm.edu.pe','123','Ciencias Biológicas','Bibliotecología y Ciencias de la Información.','2015',NULL),(5,'Bianca','bianca@gmail.com','123456','Ciencias Matemáticas','Bibliotecología y Ciencias de la Información.','Seleccionar',NULL),(6,'adrianqq','adrian@unmsm.edu.pe','CONTRA','Ingeniería de Sistemas e Informática','Ingeniería Software','5',NULL),(7,'adrian','adrian@pe','CONTRA','Ingeniería de Sistemas e Informática','Ingeniería Software','2018',NULL),(8,'adriann','adrian@po','CONTRA','Ingeniería de Sistemas e Informática','Ingeniería Software','2018',5),(9,'favio','favio.@sdas','123','Ingeniería de Sistemas e Informática','Ingeniería Software','2018',5),(10,'a','a','a','Ingeniería de Sistemas e Informática','Ingeniería Software','2018',5),(11,'x','x','x','Ingeniería de Sistemas e Informática','Ingeniería Software','2018',5),(12,'m','m','m','Ingeniería de Sistemas e Informática','Ingeniería Software','2018',5),(13,'alumno','alumno','alumno','Ingeniería de Sistemas e Informática','Ingeniería Software','2018',5);
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tareas`
--

DROP TABLE IF EXISTS `tareas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tareas` (
  `id_tarea` int NOT NULL AUTO_INCREMENT,
  `titulo` varchar(45) NOT NULL,
  `fecha` date NOT NULL,
  `hora_inicio` time NOT NULL,
  `hora_fin` time NOT NULL,
  `color_r` int NOT NULL DEFAULT '255',
  `color_g` int NOT NULL DEFAULT '255',
  `color_b` int NOT NULL DEFAULT '255',
  `descripcion` varchar(200) DEFAULT NULL,
  `id_estudiante` int NOT NULL,
  `repeticiones` int DEFAULT NULL,
  PRIMARY KEY (`id_tarea`),
  KEY `fk_tarea_estudiante_id_idx` (`id_estudiante`),
  CONSTRAINT `fk_tarea_estudiante_id` FOREIGN KEY (`id_estudiante`) REFERENCES `estudiante` (`id_estudiante`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tareas`
--

LOCK TABLES `tareas` WRITE;
/*!40000 ALTER TABLE `tareas` DISABLE KEYS */;
INSERT INTO `tareas` VALUES (5,'tarea','2022-07-05','11:00:00','12:30:00',204,255,153,'aasdafafafasf',1,2),(6,'Tarea ','2022-07-12','12:00:00','13:30:00',204,204,0,'assdgdsfg',1,1),(7,'Examen Final','2022-08-15','08:00:00','12:00:00',255,51,102,'aaaaaaaaaaaaaaaa',9,2),(8,'Presentar avance','2022-07-31','15:00:00','16:00:00',0,204,204,'afae2143we',9,5),(9,'Examen parcial','2022-08-01','15:00:00','18:00:00',102,102,255,'aaaaaaaaaasdasfa',9,2),(10,'v','2022-07-29','08:00:00','09:00:00',51,255,0,'ku',10,NULL),(11,'v','2022-08-05','08:00:00','09:00:00',51,255,0,'ku',10,NULL),(12,'v','2022-08-12','08:00:00','09:00:00',51,255,0,'ku',10,NULL),(13,'dsk','2022-09-02','20:00:00','21:00:00',204,102,0,'mfhg',11,1),(14,'aaaa','2022-09-10','20:00:00','21:00:00',255,102,0,'gdshbfgjh',11,NULL),(15,'aaaa','2022-09-17','20:00:00','21:00:00',255,102,0,'gdshbfgjh',11,NULL),(16,'aaaa','2022-09-24','20:00:00','21:00:00',255,102,0,'gdshbfgjh',11,NULL),(17,'qwer','2022-08-03','10:00:00','11:00:00',255,0,153,'dfghjkl',12,NULL),(18,'qwer','2022-08-10','10:00:00','11:00:00',255,0,153,'dfghjkl',12,NULL),(19,'qwer','2022-08-17','10:00:00','11:00:00',255,0,153,'dfghjkl',12,NULL),(20,'dddd','2022-08-03','10:00:00','11:00:00',102,204,255,'tfyj,lk',13,3);
/*!40000 ALTER TABLE `tareas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'dbfollowclass'
--

--
-- Dumping routines for database 'dbfollowclass'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-01  1:42:12
