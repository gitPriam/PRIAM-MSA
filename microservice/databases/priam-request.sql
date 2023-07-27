-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 27, 2023 at 02:10 AM
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
-- Database: `priam-request`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_request`
--

CREATE TABLE `data_request` (
  `id` int(11) NOT NULL,
  `claim` varchar(255) DEFAULT NULL,
  `claim_date` datetime DEFAULT NULL,
  `data_id` int(11) NOT NULL,
  `data_subject_id` int(11) NOT NULL,
  `is_isolated` bit(1) NOT NULL,
  `new_value` varchar(255) DEFAULT NULL,
  `primary_key_value` varchar(255) DEFAULT NULL,
  `type` varchar(14) DEFAULT NULL,
  `response` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `request_answer`
--

CREATE TABLE `request_answer` (
  `id_answer` int(11) NOT NULL,
  `answer` bit(1) NOT NULL,
  `claim_answer` varchar(255) DEFAULT NULL,
  `claim_date` datetime DEFAULT NULL,
  `data_request_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_request`
--
ALTER TABLE `data_request`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `request_answer`
--
ALTER TABLE `request_answer`
  ADD PRIMARY KEY (`id_answer`),
  ADD KEY `FK27a0saoo9mxxt9wvdjcxf747s` (`data_request_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `request_answer`
--
ALTER TABLE `request_answer`
  ADD CONSTRAINT `FK27a0saoo9mxxt9wvdjcxf747s` FOREIGN KEY (`data_request_id`) REFERENCES `data_request` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
