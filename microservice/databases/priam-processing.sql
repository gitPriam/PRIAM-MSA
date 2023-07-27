-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 27, 2023 at 07:58 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `priam-processing`
--

-- --------------------------------------------------------

--
-- Table structure for table `gdpr_datausage`
--

CREATE TABLE `gdpr_datausage` (
  `id` bigint(20) NOT NULL,
  `c` bit(1) NOT NULL,
  `d` bit(1) NOT NULL,
  `data_id` int(11) NOT NULL,
  `personal_status` bit(1) NOT NULL,
  `r` bit(1) NOT NULL,
  `u` bit(1) NOT NULL,
  `processing_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gdpr_datausage`
--

INSERT INTO `gdpr_datausage` (`id`, `c`, `d`, `data_id`, `personal_status`, `r`, `u`, `processing_id`) VALUES
(1, b'1', b'1', 8, b'1', b'0', b'0', 1),
(2, b'1', b'1', 12, b'1', b'1', b'1', 1),
(3, b'1', b'1', 2, b'1', b'1', b'1', 2),
(4, b'1', b'0', 8, b'1', b'1', b'0', 2);

-- --------------------------------------------------------

--
-- Table structure for table `gdpr_mesure`
--

CREATE TABLE `gdpr_mesure` (
  `mesureid` int(11) NOT NULL,
  `category` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `gdpr_processing`
--

CREATE TABLE `gdpr_processing` (
  `id` bigint(20) NOT NULL,
  `category` int(11) DEFAULT NULL,
  `creation_date` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `updating_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gdpr_processing`
--

INSERT INTO `gdpr_processing` (`id`, `category`, `creation_date`, `name`, `type`, `updating_date`) VALUES
(1, 1, '2023-05-11 15:22:38', 'advertisement', 1, NULL),
(2, 1, '2023-07-11 15:32:56', 'Order', 1, '2023-05-31 15:22:38');

-- --------------------------------------------------------

--
-- Table structure for table `gdpr_processing_mesure`
--

CREATE TABLE `gdpr_processing_mesure` (
  `processingid` bigint(20) NOT NULL,
  `mesureid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `gdpr_processing_purposes`
--

CREATE TABLE `gdpr_processing_purposes` (
  `processing_id` bigint(20) NOT NULL,
  `purposes_purposeid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gdpr_processing_purposes`
--

INSERT INTO `gdpr_processing_purposes` (`processing_id`, `purposes_purposeid`) VALUES
(1, 1),
(1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `gdpr_purpose`
--

CREATE TABLE `gdpr_purpose` (
  `purposeid` int(11) NOT NULL,
  `description` varchar(255) NOT NULL,
  `type` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gdpr_purpose`
--

INSERT INTO `gdpr_purpose` (`purposeid`, `description`, `type`) VALUES
(1, 'purpose 1', 1),
(2, 'purpose2', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gdpr_datausage`
--
ALTER TABLE `gdpr_datausage`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK64r8t4w99e9mh390eon022cyb` (`processing_id`);

--
-- Indexes for table `gdpr_mesure`
--
ALTER TABLE `gdpr_mesure`
  ADD PRIMARY KEY (`mesureid`);

--
-- Indexes for table `gdpr_processing`
--
ALTER TABLE `gdpr_processing`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `gdpr_processing_mesure`
--
ALTER TABLE `gdpr_processing_mesure`
  ADD KEY `FK9deg4j4jwxoab94etxf3nopdb` (`mesureid`),
  ADD KEY `FK28bo64s21g5cbmk9mhij0qc6e` (`processingid`);

--
-- Indexes for table `gdpr_processing_purposes`
--
ALTER TABLE `gdpr_processing_purposes`
  ADD UNIQUE KEY `UK_k2urnhegr72gdddxmcg4pvbc6` (`purposes_purposeid`),
  ADD KEY `FKdacqyj5ljebrpeib0hmvsufyv` (`processing_id`);

--
-- Indexes for table `gdpr_purpose`
--
ALTER TABLE `gdpr_purpose`
  ADD PRIMARY KEY (`purposeid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `gdpr_datausage`
--
ALTER TABLE `gdpr_datausage`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `gdpr_mesure`
--
ALTER TABLE `gdpr_mesure`
  MODIFY `mesureid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `gdpr_processing`
--
ALTER TABLE `gdpr_processing`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `gdpr_purpose`
--
ALTER TABLE `gdpr_purpose`
  MODIFY `purposeid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `gdpr_datausage`
--
ALTER TABLE `gdpr_datausage`
  ADD CONSTRAINT `FK64r8t4w99e9mh390eon022cyb` FOREIGN KEY (`processing_id`) REFERENCES `gdpr_processing` (`id`);

--
-- Constraints for table `gdpr_processing_mesure`
--
ALTER TABLE `gdpr_processing_mesure`
  ADD CONSTRAINT `FK28bo64s21g5cbmk9mhij0qc6e` FOREIGN KEY (`processingid`) REFERENCES `gdpr_processing` (`id`),
  ADD CONSTRAINT `FK9deg4j4jwxoab94etxf3nopdb` FOREIGN KEY (`mesureid`) REFERENCES `gdpr_mesure` (`mesureid`);

--
-- Constraints for table `gdpr_processing_purposes`
--
ALTER TABLE `gdpr_processing_purposes`
  ADD CONSTRAINT `FK1c0kmly53kyiwu1ytqy80nett` FOREIGN KEY (`purposes_purposeid`) REFERENCES `gdpr_purpose` (`purposeid`),
  ADD CONSTRAINT `FKdacqyj5ljebrpeib0hmvsufyv` FOREIGN KEY (`processing_id`) REFERENCES `gdpr_processing` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
