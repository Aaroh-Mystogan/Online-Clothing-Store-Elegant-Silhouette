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
-- Table structure for table `mens_wear`
--

DROP TABLE IF EXISTS `mens_wear`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mens_wear` (
  `Item_code` varchar(5) NOT NULL,
  `Type` varchar(10) DEFAULT NULL,
  `Item_name` varchar(25) DEFAULT NULL,
  `Price` varchar(10) DEFAULT NULL,
  `size` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`Item_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mens_wear`
--

LOCK TABLES `mens_wear` WRITE;
/*!40000 ALTER TABLE `mens_wear` DISABLE KEYS */;
INSERT INTO `mens_wear` VALUES ('MW001','shirt','round neck','1000','S'),('MW002','shirt','round neck','1200','L'),('MW003','shirt','collar neck','1200','S'),('MW004','shirt','collar neck','1400','L'),('MW005','T-shirt','collar neck','1600','S'),('MW006','T-shirt','collar neck','1600','L'),('MW007','Pant','jeans','1600','S'),('MW008','Pant','jeans','2000','L'),('MW009','Pant','Trouser','1800','S'),('MW010','Pant','Trouser','2000','L'),('MW011','Lower','Full','1100','S'),('MW012','Lower','Full','1300','L'),('MW013','Lower','Shorts','900','S'),('MW014','Lower','Shorts','1100','L');
/*!40000 ALTER TABLE `mens_wear` ENABLE KEYS */;
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
