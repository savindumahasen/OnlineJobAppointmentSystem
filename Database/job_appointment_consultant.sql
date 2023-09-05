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
-- Table structure for table `consultant`
--

DROP TABLE IF EXISTS `consultant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consultant` (
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `jobfield` varchar(205) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consultant`
--

LOCK TABLES `consultant` WRITE;
/*!40000 ALTER TABLE `consultant` DISABLE KEYS */;
INSERT INTO `consultant` VALUES ('Avishani','Weerakoon','Australia','avi@gmail.com','Agriculture, Food, and Natural Resources','2023-08-07','12:18'),('Bathiya','Arthanayaka','Australia','bathiya@gmail.com','Business and Finance','2023-08-09','14:59'),('Danushka','Gunathilaka','Australia','danushka@gmail.com','Health Science','2023-08-15','09:32'),('Charith','Dharmadasa','England','dharmadasa@gmail.com','Government and Public Administration','2023-08-24','06:01'),('Dilini','Nimesha','Australia','dilini@gmail.com','Agriculture, Food, and Natural Resources','2023-09-10','13:05'),('Dinesh','Subasingha','England','dineshsubasingha@gmail.com','Agriculture, Food, and Natural Resources','2023-08-28','22:29'),('Dulika','Ruhunuhewa','Australia','dulika@gmail.com','Agriculture, Food, and Natural Resources','2023-09-27','01:23'),('Gawesh','Bowaththa','Australia','gawesh@gmail.com','Agriculture, Food, and Natural Resources','2023-10-06','10:29'),('Gayathri','Umayanga','England','gayathri@gmail.com','Agriculture, Food, and Natural Resources','2023-09-26','14:45'),('Kushan','Wellalage','England','kush@gmail.com','Agriculture, Food, and Natural Resources','2023-09-18','06:56'),('Lakindu','Abekoon','England','lakindu@gmail.com','Agriculture, Food, and Natural Resources','2023-08-21','22:29'),('Lionel','Puskpakumara','Australia','lionel@gmail.com','Agriculture, Food, and Natural Resources','2023-10-04','12:19'),('Matheesh','Pathirana','England','matheeshpathirana@gmail.com','Education and Training','2023-08-10','09:32'),('Nalaka','Karunarathne','England','nalaka@gmail.com','Business and Finance','2023-08-25','19:16'),('Natasha','Perera','England','natasha@gmail.com','Agriculture, Food, and Natural Resources','2023-09-28','12:41'),('Nayana','Weerasingha','England','nayana@gmail.com','Education and Training','2023-08-10','08:21'),('Nilukshi','Anandan','Australia','nilu123@gmail.com','Agriculture, Food, and Natural Resources','2023-08-21','22:01'),('Nimal','Jayasooriya','America','nimal123@gmail.com','Architecture and Construction','2023-08-30','13:47'),('Nimalika','Dilrukshi','Australia','nimali@gmail.com','Health Science','2023-09-19','19:55'),('Nimantha','Rnathunga','England','nimantha@gmail.com','Agriculture, Food, and Natural Resources','2023-09-13','03:15'),('Nirosha','Virajini','Australia','nirosha@gmail.com','Agriculture, Food, and Natural Resources','2023-09-23','22:34'),('Nisal','Bandara','England','nisal@gmail.com','Business and Finance','2023-09-20','00:36'),('Pasindu','Akalanka','England','pasindu@gmail.com','Business and Finance','2023-09-20','04:21'),('prihan','perera','England','prihan@gmail.com','Business and Finance','2023-09-25','14:38'),('Rmanai','Weerawansha','Australia','ramani@gmail.com','Health Science','2023-09-17','01:51'),('Samantha','Ruhunuhewa','England','samantha@gmail.com','Agriculture, Food, and Natural Resources','2023-09-21','14:45'),('sandun','Waniganeththi','England','sandun456@gmail.com','Education and Training','2023-08-29','22:55'),('suresh','Maraliyaddha','Australia','sura@gmail.com','Agriculture, Food, and Natural Resources','2023-09-27','04:33'),('Surain','Jayasingha','England','suran@gmail.com','Arts, Audio/Video Technology, and Communication','2023-08-24','06:40'),('Tharaka','Amarawansha','Australia','tharaka@gmail.com','Agriculture, Food, and Natural Resources','2023-09-27','03:15'),('Thejana','Amarawansha','England','thejana@gmail.com','Business and Finance','2023-04-24','14:31'),('Thenaka','Akalanka','England','thenaka@gmail.com','Business and Finance','2023-04-05','11:27'),('Thilini','Amarawansha','Australia','thilini@gmail.com','Agriculture, Food, and Natural Resources','2023-09-10','13:05'),('vihaga','Koojana','Australia','vihagakoojana@gmail.com','Agriculture, Food, and Natural Resources','2023-08-22','16:28'),('viraj','Perera','England','viraj@gmail.com','Arts, Audio/Video Technology, and Communication','2023-08-15','14:27'),('virangi','Weerakatiya','Australia','virangi@gmail.com','Health Science','2022-07-14','17:55'),('Wanindu','Hasaranga','America','wanindu@gmail.com','Government and Public Administration','2023-08-12','22:44'),('waruna','Jayasooriya','Australia','waruna@gmail.com','Agriculture, Food, and Natural Resources','2023-08-29','21:22');
/*!40000 ALTER TABLE `consultant` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-05 19:46:14
