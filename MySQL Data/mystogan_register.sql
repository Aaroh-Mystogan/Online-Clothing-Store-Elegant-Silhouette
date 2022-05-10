-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: mystogan
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
-- Table structure for table `register`
--

DROP TABLE IF EXISTS `register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `register` (
  `First_name` char(20) NOT NULL,
  `Last_name` char(20) DEFAULT NULL,
  `Username` varchar(20) NOT NULL,
  `Email` varchar(35) DEFAULT NULL,
  `Phone_no` varchar(10) DEFAULT NULL,
  `Password` varchar(15) NOT NULL,
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `register`
--

LOCK TABLES `register` WRITE;
/*!40000 ALTER TABLE `register` DISABLE KEYS */;
INSERT INTO `register` VALUES ('aa','aa','aa','aa','aa','aa'),('Satyam','Verma','Arion_XD','sat.yum@gmail.com','8587579099','Arion'),('Annabeth','','Athena','Athena@yahoo.com','6583285499','Anna'),('Yash','Bobde','Babede','Bobad.Yash@gmail.com','7787585099','Mysterio'),('Chandra','Prakash','Chand','chand.prak@gmail.com','9589575099','Chandu'),('chandu','chandu','chandu','chandugmail','123456789','chandu'),('Aaroh','Verma','DBMS_BEST','av@gmail.com','1234567890','letmepass'),('fgj','fgj','fgj','fgj','fhj','fhj'),('Sarthak','Sharma','Hustler','Sadak.CR@gmail.com','7787579099','HustleCR'),('Ayush','Sharma','KabOOMM0077','ayush.s.sharm@gmail.com','8958973895','BoomBoy'),('Aaroh','Verma','Mystogan','aroh.verma@gmail.com','9589575073','Mysto'),('Percy','Morgan','Poseidon','Percy.jack@gmail.com','7783485099','Percy');
/*!40000 ALTER TABLE `register` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-10 22:26:05
