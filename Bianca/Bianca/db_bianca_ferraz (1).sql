-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 12-Dez-2023 às 12:28
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `db_bianca_ferraz`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente_bjf`
--

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
  `pais_bjf` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente_bjf`
--

INSERT INTO `cliente_bjf` (`idcliente_bjf`, `nome_bjf`, `email_bjf`, `telefone_bjf`, `estadoCivil_bjf`, `profissao_bjf`, `rg_bjf`, `cpf_bjf`, `dataNasc_bjf`, `endereco_bjf`, `estado_bjf`, `cidade_bjf`, `cep_bjf`, `dataRegistro_bjf`, `pais_bjf`) VALUES
(1, 'BIA LINDONA', 'dani', '(22)22222-2222', 'Namorando', 'dani', '1.111.111', '111.111.111-11', '2223-10-22', 'dani', 'dani', 'dani', '11111-111', '1111-11-11', ''),
(5, 'marcos b', 'b', '(99)99999-9999', 'Casado', 'a', '8.888.888', '777.777.777-77', '2002-02-02', 'c', 'e', 'd', '66666-666', '2001-01-01', ''),
(231, 'da', 'da', '(22)22222-2222', 'Casado', 'da', '2.222.222', '222.222.222-22', '2223-10-22', 'da', 'da', 'da', '22222-222', '2223-10-22', 'da'),
(21321, 'dsadasads', 'da', '(32)45252-3452', 'Abandonado', 'daad', '3.213.121', '232.312.132-31', '3325-08-23', 'dada', 'da', 'da', '21332-112', '2235-07-23', 'da');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario_bjf`
--

CREATE TABLE `funcionario_bjf` (
  `idfuncionario_bjf` int(11) NOT NULL,
  `nome_bjf` varchar(50) NOT NULL,
  `email_bjf` varchar(50) NOT NULL,
  `numeroTelefone_bjf` varchar(14) NOT NULL,
  `cpf_bjf` varchar(15) NOT NULL,
  `sexo_bjf` varchar(20) NOT NULL,
  `departamento_bjf` varchar(50) NOT NULL,
  `salario_bjf` decimal(12,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionario_bjf`
--

INSERT INTO `funcionario_bjf` (`idfuncionario_bjf`, `nome_bjf`, `email_bjf`, `numeroTelefone_bjf`, `cpf_bjf`, `sexo_bjf`, `departamento_bjf`, `salario_bjf`) VALUES
(1, 'adasdasd', 'uihjhjhk', '(78)99998-8777', '111.111.111-11', 'M', 'asasa', '100.00'),
(2, 'dddddddddda', 'da', '(21)12312-3212', '123.123.122-32', 'M', 'da', '122.00'),
(4, '2', '3', '1', '5', 'M', '7', '6.00'),
(333, 'BIAI', 'EDUARDA', '67 9996487345', '1083013310', 'M', 'DA O CU', '33333.00'),
(111111, '1111111', 'asasa', '6788999 0', '1111111', 'M', '1', '11.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto_bjf`
--

CREATE TABLE `produto_bjf` (
  `idproduto_bjf` int(11) NOT NULL,
  `nome_bjf` varchar(60) NOT NULL,
  `descricao_bjf` varchar(255) NOT NULL,
  `categoria_bjf` varchar(20) NOT NULL,
  `preco_bjf` decimal(12,2) NOT NULL,
  `quantidade_bjf` int(11) NOT NULL,
  `fornecedor_bjf` varchar(255) NOT NULL,
  `serial_bjf` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `produto_bjf`
--

INSERT INTO `produto_bjf` (`idproduto_bjf`, `nome_bjf`, `descricao_bjf`, `categoria_bjf`, `preco_bjf`, `quantidade_bjf`, `fornecedor_bjf`, `serial_bjf`) VALUES
(1, 'arroz', 'arr', '1', '55.00', 2, '1', '65'),
(2, 'outro produto', 'sad', '2', '3.00', 5, '1', '4'),
(3, 'DDDDDDDDD', 'da', 'da', '12.00', 12, 'da', '12');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto_vendas_bjf`
--

CREATE TABLE `produto_vendas_bjf` (
  `idproduto_vendas_bjf` int(11) NOT NULL,
  `quantidade_bjf` int(11) NOT NULL,
  `valorUnitario_bjf` int(11) NOT NULL,
  `fk_vendas_Bjf` int(11) NOT NULL,
  `fk_nome_produto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produto_vendas_bjf`
--

INSERT INTO `produto_vendas_bjf` (`idproduto_vendas_bjf`, `quantidade_bjf`, `valorUnitario_bjf`, `fk_vendas_Bjf`, `fk_nome_produto`) VALUES
(0, 1, 55, 2, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios_bjf`
--

CREATE TABLE `usuarios_bjf` (
  `idusuarios_bjf` int(11) NOT NULL,
  `nome_bjf` varchar(50) NOT NULL,
  `dataNasc_bjf` date NOT NULL,
  `email_bjf` varchar(50) NOT NULL,
  `cpf_bjf` varchar(15) NOT NULL,
  `sexo_bjf` varchar(20) NOT NULL,
  `ativo_bjf` varchar(1) NOT NULL,
  `senha_bjf` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuarios_bjf`
--

INSERT INTO `usuarios_bjf` (`idusuarios_bjf`, `nome_bjf`, `dataNasc_bjf`, `email_bjf`, `cpf_bjf`, `sexo_bjf`, `ativo_bjf`, `senha_bjf`) VALUES
(0, 'la', '8996-07-27', 'a', '777.777.777-77', 'H', 'S', 'a'),
(3, 'Daniel Carpes', '2005-05-07', 'danicarpes@gmail.com', '034.012.615-10', 'm', 'S', 'danisfoda123'),
(8, 'h', '8895-06-27', 'h', '888.888.888-88', 'm', 'S', 'jhjjhbkjnh'),
(33, 'dani', '2223-10-22', 'dada', '222.222.222-22', 'M', 'S', 'd'),
(100, 'nao sei ', '1111-11-11', 'NAO SEI NADA', '121.211.212-12', 'm', 'S', 'DDDDDD'),
(212, 'da', '2223-10-22', 'da', '222.222.222-22', 'M', 'N', 'da'),
(217, 'clevisley', '2223-10-22', 'clevisley', '222.222.222-22', 'H', 'S', 'clevisley'),
(1222, 'da', '1111-11-11', 'da', '222.222.222-22', 'm', 'S', 'dsds'),
(2222, 'dani', '2223-10-22', 'da', '222.222.222-22', 'H', 'S', 'dani'),
(222222, 'DNAIE', '2223-10-22', 'DANIE', '235.782.368-75', 'H', 'S', '74523645372');

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas_bjf`
--

CREATE TABLE `vendas_bjf` (
  `idvendas_bjf` int(11) NOT NULL,
  `datadaVendas_bjf` date NOT NULL,
  `valorTotal_bjf` decimal(10,2) NOT NULL,
  `fk_cliente_bjf` int(11) NOT NULL,
  `fk_funcionario_bjf` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `vendas_bjf`
--

INSERT INTO `vendas_bjf` (`idvendas_bjf`, `datadaVendas_bjf`, `valorTotal_bjf`, `fk_cliente_bjf`, `fk_funcionario_bjf`) VALUES
(1, '1122-12-12', '0.00', 1, 333),
(2, '2002-02-02', '0.00', 1, 1),
(12, '2323-07-12', '0.00', 5, 4),
(98473, '4691-10-16', '0.00', 5, 111111);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cliente_bjf`
--
ALTER TABLE `cliente_bjf`
  ADD PRIMARY KEY (`idcliente_bjf`);

--
-- Índices para tabela `funcionario_bjf`
--
ALTER TABLE `funcionario_bjf`
  ADD PRIMARY KEY (`idfuncionario_bjf`);

--
-- Índices para tabela `produto_bjf`
--
ALTER TABLE `produto_bjf`
  ADD PRIMARY KEY (`idproduto_bjf`);

--
-- Índices para tabela `produto_vendas_bjf`
--
ALTER TABLE `produto_vendas_bjf`
  ADD PRIMARY KEY (`idproduto_vendas_bjf`),
  ADD KEY `fk_nome_produto_idx` (`fk_nome_produto`),
  ADD KEY `fk_vendas_idx` (`fk_vendas_Bjf`);

--
-- Índices para tabela `usuarios_bjf`
--
ALTER TABLE `usuarios_bjf`
  ADD PRIMARY KEY (`idusuarios_bjf`);

--
-- Índices para tabela `vendas_bjf`
--
ALTER TABLE `vendas_bjf`
  ADD PRIMARY KEY (`idvendas_bjf`),
  ADD KEY `fk_cliente_bjf` (`fk_cliente_bjf`),
  ADD KEY `fk_funcionario_bjf` (`fk_funcionario_bjf`);

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `produto_vendas_bjf`
--
ALTER TABLE `produto_vendas_bjf`
  ADD CONSTRAINT `fk_nome_produto` FOREIGN KEY (`fk_nome_produto`) REFERENCES `produto_bjf` (`idproduto_bjf`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_vendas` FOREIGN KEY (`fk_vendas_Bjf`) REFERENCES `vendas_bjf` (`idvendas_bjf`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `vendas_bjf`
--
ALTER TABLE `vendas_bjf`
  ADD CONSTRAINT `fk_cliente_bjf` FOREIGN KEY (`fk_cliente_bjf`) REFERENCES `cliente_bjf` (`idcliente_bjf`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_funcionario_bjf` FOREIGN KEY (`fk_funcionario_bjf`) REFERENCES `funcionario_bjf` (`idfuncionario_bjf`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
