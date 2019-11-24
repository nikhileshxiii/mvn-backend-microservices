CREATE DATABASE  IF NOT EXISTS `testdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `testdb`;
-- MySQL dump 10.13  Distrib 5.7.27, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: testdb
-- ------------------------------------------------------
-- Server version	5.7.27

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
-- Table structure for table `image`
--

DROP TABLE IF EXISTS `image`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `image` (
  `id` int(11) NOT NULL,
  `gallery_id` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `image`
--

LOCK TABLES `image` WRITE;
/*!40000 ALTER TABLE `image` DISABLE KEYS */;
INSERT INTO `image` VALUES (1,1,'Treehouse of Horror V','https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760'),(2,2,'The Town','https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272'),(3,3,'The Last Traction Hero','https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112'),(4,4,'Meg Image1','https://www.imdb.com/title/tt4779682/mediaviewer/rm2105506304'),(5,4,'Meg Postor','https://www.imdb.com/title/tt4779682/mediaviewer/rm1793159168'),(6,4,'Meg Postor2','https://www.imdb.com/title/tt4779682/mediaviewer/rm1979403776'),(7,1,'Treehouse of Horror V','https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760'),(8,2,'The Town','https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272'),(9,3,'The Last Traction Hero','https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112'),(10,4,'Meg Image1','https://www.imdb.com/title/tt4779682/mediaviewer/rm2105506304'),(11,4,'Meg Postor','https://www.imdb.com/title/tt4779682/mediaviewer/rm1793159168'),(12,4,'Meg Postor2','https://www.imdb.com/title/tt4779682/mediaviewer/rm1979403776');
/*!40000 ALTER TABLE `image` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-20 20:51:25
