CREATE DATABASE  IF NOT EXISTS `projetoweb` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `projetoweb`;
-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: projetoweb
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.34-MariaDB

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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `idusers` int(11) NOT NULL AUTO_INCREMENT,
  `nomeuser` varchar(45) NOT NULL,
  `emailuser` varchar(45) NOT NULL,
  `senhauser` varchar(45) NOT NULL,
  `idadeuser` int(11) NOT NULL,
  `cpfuser` varchar(15) NOT NULL,
  PRIMARY KEY (`idusers`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Artur Lansoni','artur@gmail.com','senha',10,'436.948.076-08\n'),(3,'Manuela Sophia ','joao@gmail.com','1qw2',23,'034.743.027-95\n'),(5,'Marcos Osvaldo ','benicioarthurluiz@whgames.com.br\r ','TlOo0W6CSk\n',43,'830.719.894-15\n'),(6,'Valentina Eloá Sophie ','valentinae@gmia.com','q8w5e2d',80,'282.539.117-42\n'),(7,'Marcelo Vinicius Diego Pires','marceloviniciusdiie@gmail.com','8TRhTpO4Yt',52,'224.570.931-47\n'),(8,'Helena Sebastiana ','anthonyvictorassis@moppe.com','rz3FGhm0MM\n',35,'491.653.212-00\n'),(9,' Antonio da Silva','antonio@gmail.com','q7w89r5d',54,'957.136.248-95'),(10,'Pedro Costa','pedroc@email.com','p7l5e59s',30,'957.821.658-42'),(11,'Gustavo Daniel','dangus@outlook.com','asenha7t5e',15,'124.745.478-15'),(12,'Guilherme Campos','guicamp@emai.com','1020304050',20,'684.955.148-52'),(13,'Jenifer Fulano','ajsja@gmail.com','1a12w',3,'123.456.789-11'),(14,'Joaquim ','jo@outlook.com','aaaa',1,'111.111.111-11'),(15,'Andre Dias','andre@hotmail.com','aq6w3e3',65,'246.895.328-64'),(16,'Renan dos Reis','renan@aula.com','aq5q5e3a',35,'123.463.085-15'),(17,'Yuri Silva ','yuri@gmail.com','1aa3q5',20,'386.235.924-33'),(18,'Jonathan Lima','jona@gmail.com','',18,'356.286.595-85');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'projetoweb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-21 13:38:03
