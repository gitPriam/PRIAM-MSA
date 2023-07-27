-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 27, 2023 at 02:06 AM
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
-- Database: `priam-data`
--

-- --------------------------------------------------------

--
-- Table structure for table `data`
--

CREATE TABLE `data` (
  `id` int(11) NOT NULL,
  `category` int(11) DEFAULT NULL,
  `attribute` varchar(255) DEFAULT NULL,
  `data_conservation` int(11) DEFAULT NULL,
  `dsc_id` int(11) NOT NULL,
  `is_personal` bit(1) DEFAULT NULL,
  `is_portable` bit(1) DEFAULT NULL,
  `source` int(11) DEFAULT NULL,
  `data_type_id` int(11) DEFAULT NULL,
  `pd_category_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data`
--

INSERT INTO `data` (`id`, `category`, `attribute`, `data_conservation`, `dsc_id`, `is_personal`, `is_portable`, `source`, `data_type_id`, `pd_category_id`) VALUES
(2, 1, 'po_ADDRESS1', 13, 1, b'1', b'1', 1, 3, 2),
(3, 1, 'po_ADDRESS2', 13, 1, b'1', b'1', 1, 3, 2),
(5, 1, 'po_CREDITCARDCOMPANY', 13, 1, b'1', b'1', 1, 3, 3),
(6, 1, 'pu_ID', 13, 1, b'1', b'1', 1, 6, 1),
(8, 1, 'pu_EMAIL', 13, 1, b'1', b'1', 1, 6, 2),
(9, 1, 'pu_USERNAME', 13, 1, b'1', b'1', 1, 6, 1),
(10, 1, 'pu_PASSWORD', 12, 1, b'1', b'1', 1, 6, 1),
(11, 1, 'po_ID', 12, 1, b'1', b'1', 1, 3, 1),
(12, 1, 'po_ADDRESSNAME', 12, 1, b'0', b'1', 1, 3, 2),
(13, 1, 'po_CREDITCARDEXPIRYLOCALDATE', 12, 1, b'1', b'1', 1, 3, 3),
(14, 1, 'po_CREDITCARDNUMBER', 12, 1, b'1', b'1', 1, 3, 2),
(15, 1, 'po_ORDERTIME', 12, 1, b'1', b'1', 1, 3, 1),
(16, 1, 'po_TOTALPRICEINCENTS', 12, 1, b'1', b'1', 0, 3, 1),
(17, 1, 'pu_REALNAME', 12, 1, b'1', b'1', 1, 6, 1);

-- --------------------------------------------------------

--
-- Table structure for table `data_type`
--

CREATE TABLE `data_type` (
  `data_type_id` int(11) NOT NULL,
  `data_type_name` varchar(255) DEFAULT NULL,
  `primary_key_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_type`
--

INSERT INTO `data_type` (`data_type_id`, `data_type_name`, `primary_key_name`) VALUES
(1, 'databasemanagemententity', 'dme_ID'),
(2, 'persistencecategory', 'pc_ID'),
(3, 'persistenceorder', 'po_ID'),
(4, 'persistenceorderitem', 'pc_ID'),
(5, 'persistenceproduct', 'pp_ID'),
(6, 'persistenceuser', 'pu_ID');

-- --------------------------------------------------------

--
-- Table structure for table `personal_data_category`
--

CREATE TABLE `personal_data_category` (
  `pd_category_id` int(11) NOT NULL,
  `pd_category_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `personal_data_category`
--

INSERT INTO `personal_data_category` (`pd_category_id`, `pd_category_name`) VALUES
(1, 'Identity'),
(2, 'Contact Information'),
(3, 'Financial Information');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data`
--
ALTER TABLE `data`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKjeqou18j4cw352pkd7p7xj8mc` (`data_type_id`),
  ADD KEY `FKf8iixyubpwg14hg3mjuymr8us` (`pd_category_id`);

--
-- Indexes for table `data_type`
--
ALTER TABLE `data_type`
  ADD PRIMARY KEY (`data_type_id`);

--
-- Indexes for table `personal_data_category`
--
ALTER TABLE `personal_data_category`
  ADD PRIMARY KEY (`pd_category_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_type`
--
ALTER TABLE `data_type`
  MODIFY `data_type_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `data`
--
ALTER TABLE `data`
  ADD CONSTRAINT `FKf8iixyubpwg14hg3mjuymr8us` FOREIGN KEY (`pd_category_id`) REFERENCES `personal_data_category` (`pd_category_id`),
  ADD CONSTRAINT `FKjeqou18j4cw352pkd7p7xj8mc` FOREIGN KEY (`data_type_id`) REFERENCES `data_type` (`data_type_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
