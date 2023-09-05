-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: job_appointment
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appointment` (
  `appointmentID` int NOT NULL AUTO_INCREMENT,
  `consultantfirstname` varchar(45) DEFAULT NULL,
  `consultantlastname` varchar(45) DEFAULT NULL,
  `consultantemail` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `jobseekeremail` varchar(45) DEFAULT NULL,
  `jobseekerfirstname` varchar(45) DEFAULT NULL,
  `jobseekerlastname` varchar(45) DEFAULT NULL,
  `appointmentdate` varchar(45) DEFAULT NULL,
  `appointmenttime` varchar(45) DEFAULT NULL,
  `jobfield` varchar(405) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`appointmentID`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointment`
--

LOCK TABLES `appointment` WRITE;
/*!40000 ALTER TABLE `appointment` DISABLE KEYS */;
INSERT INTO `appointment` VALUES (16,'Lakindu',NULL,NULL,'England',NULL,'Saman',NULL,'2023-08-21','22:29','Agriculture, Food, and Natural Resources','accepted'),(17,'Lakindu','Abekoon','lakindu@gmail.com','England','saman@gmail.com','Saman','Silva','2023-08-21','22:29','Agriculture, Food, and Natural Resources','false'),(18,'vihaga','Koojana','vihagakoojana@gmail.com','Australia','sanduni@gmail.com','Sanduni','Gamage','2023-08-22','16:28','Agriculture, Food, and Natural Resources','false'),(19,'Nilukshi','Anandan','nilu123@gmail.com','Australia','buvindu@gmail.com','Buvindu','Weerawardhana','2023-08-21','22:01','Agriculture, Food, and Natural Resources','false'),(20,'viraj','Perera','viraj@gmail.com','England','buwanaka@gmail.com','Buwanaka','Siriwardhana','2023-08-15','14:27','Arts, Audio/Video Technology, and Communication','false'),(21,'Surain','Jayasingha','suran@gmail.com','England','subadhra@gmail.com','Subadhra','Batagalle','2023-08-24','06:40','Arts, Audio/Video Technology, and Communication','false'),(22,'Surain','Jayasingha','suran@gmail.com','England','subadhra@gmail.com','Subadhra','Batagalle','2023-08-24','06:40','Arts, Audio/Video Technology, and Communication','false'),(23,'waruna','Jayasooriya','waruna@gmail.com','Australia','chimeshika@gmail.com','Chimeshika','Bandara','2023-08-29','21:22','Agriculture, Food, and Natural Resources','false'),(24,'Surain','Jayasingha','suran@gmail.com','England','saranga@gmail.com','Saranga','Ruwanthi','2023-08-24','06:40','Arts, Audio/Video Technology, and Communication','false'),(26,'Bathiya','Arthanayaka','bathiya@gmail.com','Australia','athula@gmail.com','Athula','Adikari','2023-08-09','14:59','Business and Finance','false'),(27,'sandun','Waniganeththi','sandun456@gmail.com','England','himalika@gmail.com','Himalika','Ruhunuhewa','2023-08-29','22:55','Education and Training','false'),(28,'Danushka','Gunathilaka','danushka@gmail.com','Australia','dinush@gmail.com','Dinusha','Wijewicrama','2023-08-15','09:32','Health Science','false'),(29,'Charith','Dharmadasa','dharmadasa@gmail.com','England','indunil@gmail.com','Indunil','wejemanna','2023-08-24','06:01','Government and Public Administration','false'),(30,'Charith','Dharmadasa','dharmadasa@gmail.com','England','naleen@gmail.com','Naleen','Diayas','2023-08-24','06:01','Government and Public Administration','false'),(31,'Charith','Dharmadasa','dharmadasa@gmail.com','England','naleen@gmail.com','Naleen','Diayas','2023-08-24','06:01','Government and Public Administration','false'),(32,'Nilukshi','Anandan','nilu123@gmail.com','Australia','anil@gmail.com','Anil','Kularathne','2023-08-21','22:01','Agriculture, Food, and Natural Resources','false'),(33,'Bathiya','Arthanayaka','bathiya@gmail.com','Australia','nihas@gmail.com','Nihas','Akalanka','2023-08-09','14:59','Business and Finance','false'),(34,'Dinesh','Subasingha','dineshsubasingha@gmail.com','England','laksith@gmail.com','Laksith','Gamage','2023-08-28','22:29','Agriculture, Food, and Natural Resources','false'),(35,'Danushka','Gunathilaka','danushka@gmail.com','Australia','anushka@gmail.com','Anushka','Gamage','2023-08-15','09:32','Health Science','false'),(36,'Matheesh','Pathirana','matheeshpathirana@gmail.com','England','avishka@gmail.com','Avishka','Fernando','2023-08-10','09:32','Education and Training','false'),(67,'sandun',NULL,'savindu@gmail.com','Australia','sandun@gmail.com','Savindu','warnakoolasooriya','2023-12-22','13.10','Buisness','accepted'),(68,'sandun',NULL,'savindu@gmail.com','Australia','sandun@gmail.com','Savindu','warnakoolasooriya','2023-12-22','13.10','Buisness','accepted'),(69,'sandun',NULL,'savindu@gmail.com','Australia','sandun@gmail.com','Savindu','warnakoolasooriya','2023-12-22','13.10','Buisness','accepted'),(71,'sandun',NULL,'savindu@gmail.com','Australia','sandun@gmail.com','Savindu','warnakoolasooriya','2023-12-22','13.10','Buisness','accepted'),(72,'sandun',NULL,'savindu@gmail.com','Australia','sandun@gmail.com','Savindu','warnakoolasooriya','2023-12-22','13.10','Buisness','accepted'),(73,'sandun',NULL,'savindu@gmail.com','Australia','sandun@gmail.com','Savindu','Gamage','2023-12-22','13.10','Buisness','accepted'),(74,'sandun',NULL,'savindu@gmail.com','Australia','sandun@gmail.com','Mahasen','warnakoolasooriya','2023-12-22','12.10','Buisness','accepted'),(75,'sandun',NULL,'savindu@gmail.com','Australia','sandun@gmail.com','Mahasen','warnakoolasooriya','2023-12-22','12.10','Buisness','accepted'),(76,'Avishani',NULL,NULL,'Australia',NULL,'Dilini',NULL,'2023-08-07','12:18','Agriculture, Food, and Natural Resources','accepted'),(77,'sandun',NULL,'savindu@gmail.com','Australia','sandun@gmail.com','Savindu','Gamage','2023-12-22','13.10','Buisness','accepted'),(78,'sandun',NULL,'savindu@gmail.com','Australia','','Lavan','Gamage','2023-12-22','13.10','Buisness','accepted'),(79,'sandun',NULL,'savindu@gmail.com','Australia',NULL,'Lavan','Gamage','2023-12-22','13.10','Buisness','accepted'),(80,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(81,'sandun',NULL,'savindu@gmail.com','Australia','sandun@gmail.com','Mahasen','warnakoolasooriya','2023-12-22','12.10','Buisness','accepted');
/*!40000 ALTER TABLE `appointment` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-05 19:46:13
