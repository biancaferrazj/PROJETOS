CREATE DATABASE  IF NOT EXISTS `db_bianca_ferraz` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `db_bianca_ferraz`;
-- MariaDB dump 10.19  Distrib 10.4.28-MariaDB, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: db_bianca_ferraz
-- ------------------------------------------------------
-- Server version	10.4.28-MariaDB

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
-- Table structure for table `cliente_bjf`
--

DROP TABLE IF EXISTS `cliente_bjf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente_bjf` (
  `idcliente_bjf` int(11) NOT NULL,
  `nome_bjf` varchar(50) NOT NULL,
  `email_bjf` varchar(50) NOT NULL,
  `telefone_bjf` varchar(14) NOT NULL,
  `estadoCivil_bjf` varchar(50) NOT NULL,
  `profissao_bjf` varchar(50) NOT NULL,
  `rg_bjf` varchar(20) NOT NULL,
  `cpf_bjf` varchar(20) NOT NULL,
  `dataNasc_bjf` date NOT NULL,
  `endereco_bjf` varchar(50) NOT NULL,
  `estado_bjf` varchar(50) NOT NULL,
  `cidade_bjf` varchar(50) NOT NULL,
  `cep_bjf` varchar(50) NOT NULL,
  `dataRegistro_bjf` date NOT NULL,
  `pais_bjf` varchar(50) NOT NULL,
  PRIMARY KEY (`idcliente_bjf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente_bjf`
--

LOCK TABLES `cliente_bjf` WRITE;
/*!40000 ALTER TABLE `cliente_bjf` DISABLE KEYS */;
INSERT INTO `cliente_bjf` VALUES (1,'BIA LINDONA','dani','(22)22222-2222','Namorando','dani','1.111.111','111.111.111-11','2223-10-22','dani','dani','dani','11111-111','1111-11-11',''),(5,'marcos b','b','(99)99999-9999','Casado','a','8.888.888','777.777.777-77','2002-02-02','c','e','d','66666-666','2001-01-01',''),(231,'daraba','da','(22)22222-2222','Abandonado','da','2.222.222','222.222.222-22','2223-10-22','da','da','da','22222-222','2223-10-22','da'),(21321,'dsadasads','da','(32)45252-3452','Abandonado','daad','3.213.121','232.312.132-31','3325-08-23','dada','da','da','21332-112','2235-07-23','da');
/*!40000 ALTER TABLE `cliente_bjf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario_bjf`
--

DROP TABLE IF EXISTS `funcionario_bjf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionario_bjf` (
  `idfuncionario_bjf` int(11) NOT NULL,
  `nome_bjf` varchar(50) NOT NULL,
  `email_bjf` varchar(50) NOT NULL,
  `numeroTelefone_bjf` varchar(14) NOT NULL,
  `cpf_bjf` varchar(15) NOT NULL,
  `sexo_bjf` varchar(20) NOT NULL,
  `departamento_bjf` varchar(50) NOT NULL,
  `salario_bjf` decimal(12,2) NOT NULL,
  PRIMARY KEY (`idfuncionario_bjf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario_bjf`
--

LOCK TABLES `funcionario_bjf` WRITE;
/*!40000 ALTER TABLE `funcionario_bjf` DISABLE KEYS */;
INSERT INTO `funcionario_bjf` VALUES (1,'adasdasd','uihjhjhk','(78)99998-8777','111.111.111-11','M','asasa',100.00),(2,'dddddddddda','da','(21)12312-3212','123.123.122-32','M','da',122.00),(4,'agente 002','3','(1 )     -    ','5  .   .   -  ','M','7',6.00),(333,'BIAI','EDUARDA','67 9996487345','1083013310','M','DA O CU',33333.00),(111111,'1111111','asasa','6788999 0','1111111','M','1',11.00);
/*!40000 ALTER TABLE `funcionario_bjf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto_bjf`
--

DROP TABLE IF EXISTS `produto_bjf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produto_bjf` (
  `idproduto_bjf` int(11) NOT NULL,
  `nome_bjf` varchar(60) NOT NULL,
  `descricao_bjf` varchar(255) NOT NULL,
  `categoria_bjf` varchar(20) NOT NULL,
  `preco_bjf` decimal(12,2) NOT NULL,
  `quantidade_bjf` int(11) NOT NULL,
  `fornecedor_bjf` varchar(255) NOT NULL,
  `serial_bjf` varchar(45) NOT NULL,
  PRIMARY KEY (`idproduto_bjf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto_bjf`
--

LOCK TABLES `produto_bjf` WRITE;
/*!40000 ALTER TABLE `produto_bjf` DISABLE KEYS */;
INSERT INTO `produto_bjf` VALUES (1,'arroz','arr','1',55.00,2,'1','65'),(2,'outro produto','sad','2',3.00,5,'1','4'),(3,'Dusth','da','da',12.00,12,'da','12');
/*!40000 ALTER TABLE `produto_bjf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto_vendas_bjf`
--

DROP TABLE IF EXISTS `produto_vendas_bjf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produto_vendas_bjf` (
  `idproduto_vendas_bjf` int(11) NOT NULL AUTO_INCREMENT,
  `quantidade_bjf` int(11) NOT NULL,
  `valorUnitario_bjf` decimal(10,2) NOT NULL,
  `fk_vendas_Bjf` int(11) NOT NULL,
  `fk_nome_produto` int(11) NOT NULL,
  PRIMARY KEY (`idproduto_vendas_bjf`),
  KEY `fk_nome_produto_idx` (`fk_nome_produto`),
  KEY `fk_vendas_idx` (`fk_vendas_Bjf`),
  CONSTRAINT `fk_nome_produto` FOREIGN KEY (`fk_nome_produto`) REFERENCES `produto_bjf` (`idproduto_bjf`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_vendas` FOREIGN KEY (`fk_vendas_Bjf`) REFERENCES `vendas_bjf` (`idvendas_bjf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto_vendas_bjf`
--

LOCK TABLES `produto_vendas_bjf` WRITE;
/*!40000 ALTER TABLE `produto_vendas_bjf` DISABLE KEYS */;
INSERT INTO `produto_vendas_bjf` VALUES (1,1,55.00,2,1),(2,1,3.00,98473,2);
/*!40000 ALTER TABLE `produto_vendas_bjf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios_bjf`
--

DROP TABLE IF EXISTS `usuarios_bjf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios_bjf` (
  `idusuarios_bjf` int(11) NOT NULL,
  `nome_bjf` varchar(50) NOT NULL,
  `dataNasc_bjf` date NOT NULL,
  `email_bjf` varchar(50) NOT NULL,
  `cpf_bjf` varchar(15) NOT NULL,
  `sexo_bjf` varchar(20) NOT NULL,
  `ativo_bjf` varchar(1) NOT NULL,
  `senha_bjf` varchar(20) NOT NULL,
  PRIMARY KEY (`idusuarios_bjf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios_bjf`
--

LOCK TABLES `usuarios_bjf` WRITE;
/*!40000 ALTER TABLE `usuarios_bjf` DISABLE KEYS */;
INSERT INTO `usuarios_bjf` VALUES (0,'lala','8996-07-27','lala@gmail.com','777.777.777-77','H','S','a'),(3,'Daniel Carpes','2005-05-07','danicarpes@gmail.com','034.012.615-10','m','S','danisfoda123'),(8,'h','8895-06-27','h','888.888.888-88','m','S','jhjjhbkjnh'),(33,'dani','2223-10-22','dada','222.222.222-22','M','S','d'),(100,'nao sei ','1111-11-11','NAO SEI NADA','121.211.212-12','m','S','DDDDDD'),(212,'da','2223-10-22','da','222.222.222-22','M','N','da'),(217,'clevisley','2223-10-22','clevisley','222.222.222-22','H','S','clevisley'),(1222,'da','1111-11-11','da','222.222.222-22','m','S','dsds'),(2222,'dani','2223-10-22','da','222.222.222-22','H','S','dani'),(222222,'DNAIE','2223-10-22','DANIE','235.782.368-75','H','S','74523645372');
/*!40000 ALTER TABLE `usuarios_bjf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendas_bjf`
--

DROP TABLE IF EXISTS `vendas_bjf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendas_bjf` (
  `idvendas_bjf` int(11) NOT NULL,
  `datadaVendas_bjf` date NOT NULL,
  `valorTotal_bjf` decimal(10,2) NOT NULL,
  `fk_cliente_bjf` int(11) NOT NULL,
  `fk_funcionario_bjf` int(11) NOT NULL,
  PRIMARY KEY (`idvendas_bjf`),
  KEY `fk_cliente_bjf` (`fk_cliente_bjf`),
  KEY `fk_funcionario_bjf` (`fk_funcionario_bjf`),
  CONSTRAINT `fk_cliente_bjf` FOREIGN KEY (`fk_cliente_bjf`) REFERENCES `cliente_bjf` (`idcliente_bjf`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_funcionario_bjf` FOREIGN KEY (`fk_funcionario_bjf`) REFERENCES `funcionario_bjf` (`idfuncionario_bjf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendas_bjf`
--

LOCK TABLES `vendas_bjf` WRITE;
/*!40000 ALTER TABLE `vendas_bjf` DISABLE KEYS */;
INSERT INTO `vendas_bjf` VALUES (1,'1122-12-12',0.00,1,333),(2,'2002-02-02',0.00,1,1),(12,'2323-07-12',0.00,5,4),(98473,'4691-10-16',0.00,5,111111);
/*!40000 ALTER TABLE `vendas_bjf` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-16 16:06:53
