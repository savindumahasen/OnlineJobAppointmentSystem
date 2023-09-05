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
-- Table structure for table `registration`
--

DROP TABLE IF EXISTS `registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registration` (
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `confirmpassword` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registration`
--

LOCK TABLES `registration` WRITE;
/*!40000 ALTER TABLE `registration` DISABLE KEYS */;
INSERT INTO `registration` VALUES ('Akash','Suraweera','akash@gmail.com','600','600'),('Akesh','Bandara','akesh@gmail.com','akesh@123','akesh@123'),('Anarkali','Waniganeththi','anar123@gmail.com','anar123','anar123'),('Anula','Basnayaka','anula@gmail.com','anula@345','anula@345'),('Anushka','Wimalasena','anushka@gmail.com','anushka@123','anushka@123'),('Arunodhya','Bandara','arunodhya@gmail.com','aru@123','aru@123'),('Asitha','Sandaruwan','asitha@gmail.com','900','900'),('Athula','Wimalasena','athu@gmail.com','athu@123','athu@123'),('Awantha','Fernando','awantha@gmail.com','900','900'),('Gamini','Karunathilaka','gaimini@gmail.com','GA123','GA123'),('Gajindu','Bandara','gajindu@gmail.com','Gajindu@123','Gajindu@123'),('Hashana','Wimaasena','hashana@gmail.com','190','190'),('Hashini','Wimaasena','hashini@gmail.com','hashini@123','hashini@123'),('Himalika','Ruhunuhewa','himalika@gmail.com','234','234'),('Lakshan','Amarathunga','lakshan123@gmail.com','lakshan@100','lakshan@100'),('Ravindu','Amarasingha','ravindu@gmail.com','ravindu@123','ravindu@123'),('Saantha','Gamage','saantha@gmail.com','saantha@123','saantha@123'),('Sandun','Warnakoolasooriya','sandun@gmail.com','sandun@123','sandun@123'),('Vihaga','Koojana','vihaga@gmail.com','vihaga@123','vihaga@123'),('Wimansa','Hewawitharana','wimansa@345','890','890'),('Yasitha','Nuwan','yasus@gmail.com','123','123');
/*!40000 ALTER TABLE `registration` ENABLE KEYS */;
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
