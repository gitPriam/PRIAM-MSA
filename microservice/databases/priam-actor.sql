-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 26, 2023 at 06:32 PM
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
-- Database: `priam-actor`
--

-- --------------------------------------------------------

--
-- Table structure for table `country`
--

CREATE TABLE `country` (
  `countryName` varchar(100) NOT NULL,
  `minorAge` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `datasubject`
--

CREATE TABLE `datasubject` (
  `dataSubjectID` int(11) NOT NULL,
  `user_id` int(11) NOT NULL DEFAULT 0,
  `userName` varchar(40) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `dsCategory` varchar(40) DEFAULT NULL,
  `tutor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `data_subject`
--

CREATE TABLE `data_subject` (
  `id` int(11) NOT NULL,
  `age` int(11) NOT NULL,
  `id_ref` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `ds_category_dsc_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_subject`
--

INSERT INTO `data_subject` (`id`, `age`, `id_ref`, `password`, `username`, `ds_category_dsc_id`) VALUES
(2, 20, '507', '$2a$10$nTQGt/A3frfvEf.3oNc0e.QNB3CcnBxwsRgnowQm88KUZ3voXcJbi', 'user0', 1),
(3, 20, '508', '$2a$10$zVxZmFUsinxzgap1ZO8IHusk5ycepkjSNnYwZgcnFvcbxJk1bfKRu', 'user1', 1),
(4, 20, '509', '$2a$10$f4DFwQjy4Ys2yiQjzEr/2uyQTF0oxTiBf9KXX3OmZXtkWgGEjPixW', 'user2', 1),
(5, 20, '510', '$2a$10$QV3Pp5WQtk9wE5vcUDER/OvxjvhAFbKo5ZMXc7FlNGfAa0mUZ1Zv6', 'user3', 1),
(6, 20, '511', '$2a$10$Qn/KSTLj5kq2B6TJXhmatOEf2SWKSlp9.cbeAjJGhWrH1PwqlUseG', 'user4', 1),
(7, 20, '512', '$2a$10$fj.FzLptFUJ6gwtBOM/lse1F0qJQsIBeLZnSH.OEeQErlyLWa/yG.', 'user5', 1),
(8, 20, '513', '$2a$10$4yAJ5nH3MTsPv/eTqqs7U.4VTaoxobRV11O6ixjo6F7Z4u7tJjSRq', 'user6', 1),
(9, 20, '514', '$2a$10$o6J29DzhmoV7JyKgXRjvou43t4sC38R17DA9CrWsMssAv742tjdVa', 'user7', 1),
(10, 20, '515', '$2a$10$EPNo7SCa3bQDUhcB4xqjaelht9XZ8evzk8WNfUZhfvV.pD.1VxMRi', 'user8', 1),
(11, 20, '516', '$2a$10$gDa8006j/DCne90hcHlGyuX7zoGxmdFGNUmJCgQbpWEwx4k1wQbGq', 'user9', 1),
(12, 20, '517', '$2a$10$HR6plkx1QcscUFyLc0.QTO3LHbQ52zSu7iu1nCpU2BZD8JKYHMsH.', 'user10', 1),
(13, 20, '518', '$2a$10$maY5oxfrClK0.ISWeAtZS.aLElEkyLr6ac6xeVB1bdKx5JnPzbdbG', 'user11', 1),
(14, 20, '519', '$2a$10$9ZvE761R2fzFensCZh07aekDw0xZSz4zJGYgLsJdyrbcvyurChaCy', 'user12', 1),
(15, 20, '520', '$2a$10$ZBMxMHbjkqyRnGYzQOlXAeBWrz8hRnKRm0dOnkTtDALMqFENl4bsS', 'user13', 1),
(16, 20, '521', '$2a$10$lJL3m9cifad5UB/h0kswN.biTeXSDLiDOwS/aJTACOVRubtLgR1Ru', 'user14', 1),
(17, 20, '522', '$2a$10$TifFmsyUDLUnzH2gGID4hubgrrCESN74E82shfbaXWl5gZ7eX8ia2', 'user15', 1),
(18, 20, '523', '$2a$10$Gz44fBQmPivy4Nrii7GDFuC8PHJFrdPFM4eowmD2jJyCXe.rXAkw6', 'user16', 1),
(19, 20, '524', '$2a$10$GGpky82sukBa9K5dleYfyeNvjt.fjjm.Kts4OD/aUGH35oywqehZe', 'user17', 1),
(20, 20, '525', '$2a$10$qXesg9Wrj3nZ.Ri166ykXeXXrWiJSGut6UP.2xF7sB60kQXSWot8.', 'user18', 1),
(21, 20, '526', '$2a$10$qd.lX9oC2k4NPQ6lqrhSHeesC8vHcroRvfzlzYGkIUqlQfFsJXtl2', 'user19', 1),
(22, 20, '527', '$2a$10$uHdJZ/il8ArLdmIoKy1MX.0lbCCs2QZE4aXfwrgu/kWtmQS7.K9m.', 'user20', 1),
(23, 20, '528', '$2a$10$qTQaXZUeKP3EZK0NDtXpk.1q58v/bI7A/fgscfGG3noYy2rlHwfLK', 'user21', 1),
(24, 20, '529', '$2a$10$t.xH4swYIprjdyMolvwmBOiegSlBMyg952XmwP4sOc//ZDqDYdNTm', 'user22', 1),
(25, 20, '530', '$2a$10$EtMvzcxFY4Hdo5Pz8mBgtuc61Yj4KJssblAgDzDQNLwHu4XZtTqT.', 'user23', 1),
(26, 20, '531', '$2a$10$hJvbsBXfSXv3Yzz8uibr1e9..6H78yu43.DLbAWWMtrbrpDjGQSKK', 'user24', 1),
(27, 20, '532', '$2a$10$6N09dmeRQZsW6t64BCFW.eYClXOhazI.rmJcS0eTPHOB57W5YM6US', 'user25', 1),
(28, 20, '533', '$2a$10$5eiyc0vbBPMmkCPKYhWUOOKU5bQxJ3vi9kp08r4Z13Lmkz50AUKiy', 'user26', 1),
(29, 20, '534', '$2a$10$rXuEvxFjqEbUy2nHB6230eOiiPUKHhi1IVOhwPDfJcwEA.zcV.tdm', 'user27', 1),
(30, 20, '535', '$2a$10$nouFeRJEzuPbRWmf6tDILOGEfX3.g0/FTxbJmBkByhSR2Xu.GhnZi', 'user28', 1),
(31, 20, '536', '$2a$10$UGnC7ylHgke7C9bAvaWmgeein3/kH7BJ7scPylz5IS4mkNL/31EXy', 'user29', 1),
(32, 20, '537', '$2a$10$yhTGnOL8GzAutcTwmVdVMuHqEmBA7cQ7szgj6.wGj81BLQr3ePx1O', 'user30', 1),
(33, 20, '538', '$2a$10$BmxaLDknOXMCn1rp9GUM6uzlLaSpLFBDF5/xHol2YlsCnx4r8p7/W', 'user31', 1),
(34, 20, '539', '$2a$10$yT296OxU1lpz46GOoOpKUO4z11pS7J4Y192LNx2p38SPqfLVvUUS6', 'user32', 1),
(35, 20, '540', '$2a$10$pVIVL5XDqzwBQ37UdoCZhOr1wIo/uX.9uwdNl9WocodN0Kj/9I8SK', 'user33', 1),
(36, 20, '541', '$2a$10$tL6Xf/DVhgZtXgMvAFz8HukN/IC1U15A4cCNcZkU6GJ78TyXAg62y', 'user34', 1),
(37, 20, '542', '$2a$10$Dnem9szgFqnmUFFj0DWH.O78hGSIzVPaw0LsxoDr17zVWHhXb47Z6', 'user35', 1),
(38, 20, '543', '$2a$10$rk1Q.pC/E4jVHdEjcGhQte8XEZdY6g8NUFa8KpE0KaAVDF.lczGEe', 'user36', 1),
(39, 20, '544', '$2a$10$4H6PGrKWMf7L8vywHGFCXu9/XYb0d9XWuzsbYgGR0MFRxu9lSbA3q', 'user37', 1),
(40, 20, '545', '$2a$10$I081qPKhXMkrlT.l/XJGluIEszZJm2kUstqugoFQvamSvzaC3bsGu', 'user38', 1),
(41, 20, '546', '$2a$10$VGt5nA9DmsNLT0y73Y6hJ.KP84XVJOGIb5jQFrAZ0QKRZQrzjQSlu', 'user39', 1),
(42, 20, '547', '$2a$10$Bl5JgrvjPrJ.5WrJ9BEoZOX8pSEKc4wZoqPhbmHzEO8RSN./5Fq56', 'user40', 1),
(43, 20, '548', '$2a$10$gCeSCE5Ws66bAexeabUa1./3PZJ.LN766OufKuSv.S45iwvT.K3Ge', 'user41', 1),
(44, 20, '549', '$2a$10$irdfVioNCmMFio3oglMkZe/duIg3HDl7mnbVzLahFFPByaTAxjSMS', 'user42', 1),
(45, 20, '550', '$2a$10$1ZAozRxWK2hqyNWF0JqmlugbOPyUNJDZF1shgr9EZk7N2dAeIGmMa', 'user43', 1),
(46, 20, '551', '$2a$10$K2HknclLoYjWRUcXDeH7a.NlSOM2I.v.facxyuOUwxF1IyScYNLJS', 'user44', 1),
(47, 20, '552', '$2a$10$Pzm3.y9VAlHMS6ZzBwAqeuupA8y4pFdTOMAz7jQaxBqe5cQllLQpq', 'user45', 1),
(48, 20, '553', '$2a$10$pLAxEuHO5EQE6y35XpIK.ukFsUePuNFcS/skfs8O/5WmmhNmA89LS', 'user46', 1),
(49, 20, '554', '$2a$10$yQAcl24ldWFqcNZQQaTbCerKdu9gyUm0Ac14iPWw8mOK49bFaC7dO', 'user47', 1),
(50, 20, '555', '$2a$10$Wh5d/fkDzPZLa8.d7nlyf.C7WOyrfGDUhUo.IoKJDj9p41VYC5qwe', 'user48', 1),
(51, 20, '556', '$2a$10$X3p2ZAj.sc.E4rclKJ/6mu0AS3v8JX4S9JuG4EEOArBIQCoozzs3K', 'user49', 1),
(52, 20, '557', '$2a$10$hvllwU0Vs/RO9TJUQBI7MuFjTgMMkQ.Vjv17ByWDdgSS2Yhpq8gwq', 'user50', 1),
(53, 20, '558', '$2a$10$kuTIk3WMEjUkpPBz1rCVy.UGAsPXIgr3TJG63ewEMkT8Q8abj9wAG', 'user51', 1),
(54, 20, '559', '$2a$10$kEFY1g6wjKtx/bSNNejQvu9BIQRZF.KbOSHGJQkK.8R3JQ579qRhm', 'user52', 1),
(55, 20, '560', '$2a$10$zek1ouHNbhkA09dFGMwFf.2mIFOQdTMWkIVYgz3J7.Lzoe.rn5Vxq', 'user53', 1),
(56, 20, '561', '$2a$10$1VepWBI2KFfLg1HhA4kQEuRRkzmOadGDbS2h43.zJuwZnneyCYbf6', 'user54', 1),
(57, 20, '562', '$2a$10$5SfAet6IdgH32lNtVv0IfOcf/GbzArw5gSM2Ktng00w9cSvXMo.cy', 'user55', 1),
(58, 20, '563', '$2a$10$owNR7UjVVOSyoZ3jHRHvdeOA7pSs8hT5fss8U7MX7iWqV6AUL4TAa', 'user56', 1),
(59, 20, '564', '$2a$10$sW2tUhzF0NIMdWdW7odJvuUCUHV4TWjn1jDJwhgnjdjT7R81VvsIi', 'user57', 1),
(60, 20, '565', '$2a$10$IS1G3rlAid1dh1puyrVPD.K.VSH2AEGdWxHmtIYMNY/VDh/3sv15y', 'user58', 1),
(61, 20, '566', '$2a$10$f8nQIBgQ3/y21diMzHqCCOsSfEO/BLeM.wZ1pvh8NkyL8HYPqjN6q', 'user59', 1),
(62, 20, '567', '$2a$10$TcOjh3D4jVFPKKMV72n./uDyRUGJP4YJDCtcb8VUVvE.OwRPmchXS', 'user60', 1),
(63, 20, '568', '$2a$10$ErOWYrW49V42pBa.p0E7HeBKrhOc.XJwFRUNmHPPqQAhfylrv9fWq', 'user61', 1),
(64, 20, '569', '$2a$10$euPmqSvg9ueuzqaPxqhOVev8eKRsuhmEkxlKRtUXqLekag00h5bV6', 'user62', 1),
(65, 20, '570', '$2a$10$zLe5jsO1zHx/hD2vDGgvO.IlRyly2IqQKn.arkWLalVNqvWCf.Kse', 'user63', 1),
(66, 20, '571', '$2a$10$M6PKopLtlVo7yYbBLw0Ga.1rSbILuZg954CUC84YKS72VeIKASZny', 'user64', 1),
(67, 20, '572', '$2a$10$pGQgeUiS8042Hr.KOnhQ7u4L67Jyten9xzhWIrtf74kwkMNry8gOC', 'user65', 1),
(68, 20, '573', '$2a$10$KiQWMmtQd3so0bR5O6YJhuqHCBYQ6l6T3fH9oyoBRpBAnon7j4U8C', 'user66', 1),
(69, 20, '574', '$2a$10$HhOsbWAFrIu0bV8tfPIha.YJK0xV7FksnoOYcpL6h0fDy71zwYsg.', 'user67', 1),
(70, 20, '575', '$2a$10$p8aCWqfLU7OSPid08tZ2Pew0rbpWU1cQLPhC3xxhqah51wkw09oAK', 'user68', 1),
(71, 20, '576', '$2a$10$5HNEHgklTdE.v0oiRHcbfeGkHO0mwRVMGiZHRt/lubz9nj4y0uAzm', 'user69', 1),
(72, 20, '577', '$2a$10$EbYFBQJhO.KbJJg5899B3eyeiiBBSqU27L4r/qxay4RE1nCnpF47O', 'user70', 1),
(73, 20, '578', '$2a$10$Cfu0A37OSNgEieNw.l9TtODHI43PaT5QHA6VEupBEVzmaAIGbfBgG', 'user71', 1),
(74, 20, '579', '$2a$10$rl9ohLoxHS6yPVnWM7tgz.xt3ljYio3hcQ21L7jVrRqli7Gq99LPO', 'user72', 1),
(75, 20, '580', '$2a$10$9hGfGaybDlVMH2lgwvKQcub8b6M5XgAXEsXpfl0IdeqB/VIAh9Zy2', 'user73', 1),
(76, 20, '581', '$2a$10$UePObvwYpx1rIBG9RU7hxuenNrJths4hY8mAgA.getsfXIkD5K.ja', 'user74', 1),
(77, 20, '582', '$2a$10$KcfhF2qeJNxsZzs6CDEjueka61GNTyaxLgOT0oU.U2y6v7DvYOs6S', 'user75', 1),
(78, 20, '583', '$2a$10$nQDKvxb9zrdNumoXdmg8g.qXvbXAZzdABP8fxAYKnwSyZO9bs.PE.', 'user76', 1),
(79, 20, '584', '$2a$10$ejz5zDdxG6v5b7k3E/Pv7uucQhZUXtanUxUrb86cqIo1SDpFXo2B2', 'user77', 1),
(80, 20, '585', '$2a$10$5flKpOilMiRxASZIxhN7NuMjfD1u9ChWzwBuQWi/a0VGSh83JIyry', 'user78', 1),
(81, 20, '586', '$2a$10$WKOcp2p15G1rdbN0XKHSeOML.M4vhcd84gYdFFVOC9c5tVTstLxeC', 'user79', 1),
(82, 20, '587', '$2a$10$ws59UpisYXnyeB8pagQBZeZx/gWae1FQ.6EAwRLvozTIE2QxDgDPm', 'user80', 1),
(83, 20, '588', '$2a$10$auKmywaCuEd2zi7SiSBFgeDqU1ccYd5Dh91FZ9Uc3T/uQOv9OmyVy', 'user81', 1),
(84, 20, '589', '$2a$10$NoWL0umPLW7CEm7j4uQj2Ov1aewTnuUYaWip3wB3.6TGCtSigsvri', 'user82', 1),
(85, 20, '590', '$2a$10$SvbayKqCw4eVxie7I69eoOfrf6jfxerIFy.OY5ydjBgxTxdn8nPKa', 'user83', 1),
(86, 20, '591', '$2a$10$BkXyPYOOAxb29hTs/pA7Qu/2GYrM.o20iLOe00sMRGRbhf7tn9bx2', 'user84', 1),
(87, 20, '592', '$2a$10$XgG.UFPTm7UZbkflbEob/ec85gSGs1xS5XeklAVBoV/qB2F/Y76Du', 'user85', 1),
(88, 20, '593', '$2a$10$/8AWqeH6rXH4WKNmRjMOUOMMJCVuwjVrYXpRQDUeU65OSEVsu9vQy', 'user86', 1),
(89, 20, '594', '$2a$10$wnr6fQpSKBMynku5sbokiOoMWCQ9EwPH6q6G3MdsTudckj9gFU6h2', 'user87', 1),
(90, 20, '595', '$2a$10$7D55iWVS/xTwqwQWvgcAK.Lem50CO3KSZixtHOpqvQZhwx3H6KgHe', 'user88', 1),
(91, 20, '596', '$2a$10$93LsJJtqMILlO/pWSU553e17Pgtbq3hTwJ9EX8oE/vCDktCMPF0/i', 'user89', 1),
(92, 20, '597', '$2a$10$AkHzXjGRnHIq3tJPqy/5CO4hq1orJg.3ENS8MQLylkj/dqcQ0GMei', 'user90', 1),
(93, 20, '598', '$2a$10$pRohWxQ1I9sSZ5/7gh1EqeTv5OEoRwTI66jkHwk3eRqjeG.paibnm', 'user91', 1),
(94, 20, '599', '$2a$10$MalM4nXwlZyW9WrXtRFAROvU11eUCwnPrYXnFUF2NKLd4PUXmYrsq', 'user92', 1),
(95, 20, '600', '$2a$10$y41xkYKgpdFo0jqN70x3nu8DkwXd3rG.M0.6MCEjKgPUF88XYRwCi', 'user93', 1),
(96, 20, '601', '$2a$10$mZWVUy6KDVgnNoqx1kuSDO9LUdWGDPeNHj2MgcKSpru.uqIHhiDMG', 'user94', 1),
(97, 20, '602', '$2a$10$GW7LnUmflNdYzOBCIUxB0.6nNffKtQjIDum8Dh2rBm6Uze1Xec0F6', 'user95', 1),
(98, 20, '603', '$2a$10$joKN00V5aXshfUlfYyWxBuFEBnVIpUeSAq5you8Lo363I6b7WNDIO', 'user96', 1),
(99, 20, '604', '$2a$10$S3b.6Qs0RV4GCLXx8gAijOdxXJNVxthaw3poHGatznD4lfLZzNHQa', 'user97', 1),
(100, 20, '605', '$2a$10$YoCLkcQ6OP9dF.w1f7wIaufGJaLBaCN6xnCLbtpCHw.uOT4tJPezS', 'user98', 1),
(101, 20, '606', '$2a$10$wE9Tn./8TwcptCQev.32Jumi6sDPJUHWce0f1Tb5amikQH7Zhccou', 'user99', 1);

-- --------------------------------------------------------

--
-- Table structure for table `dpo`
--

CREATE TABLE `dpo` (
  `dpID` int(11) NOT NULL,
  `dpName` varchar(40) NOT NULL,
  `username` varchar(25) DEFAULT NULL,
  `dpAdress` varchar(250) NOT NULL,
  `dpPostalCode` varchar(40) DEFAULT NULL,
  `city` varchar(40) DEFAULT NULL,
  `dpPhone` varchar(40) DEFAULT NULL,
  `dpEmail` varchar(40) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `dscategory`
--

CREATE TABLE `dscategory` (
  `dsc_id` int(11) NOT NULL,
  `dsc_name` varchar(255) DEFAULT NULL,
  `location_id` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dscategory`
--

INSERT INTO `dscategory` (`dsc_id`, `dsc_name`, `location_id`) VALUES
(1, 'persistenceuser', 'pu_ID');

-- --------------------------------------------------------

--
-- Table structure for table `provider`
--

CREATE TABLE `provider` (
  `providerID` int(11) NOT NULL,
  `prName` varchar(40) NOT NULL,
  `username` varchar(25) DEFAULT NULL,
  `prAdress` varchar(250) NOT NULL,
  `prPostalCode` varchar(40) DEFAULT NULL,
  `city` varchar(40) DEFAULT NULL,
  `prPhone` varchar(40) DEFAULT NULL,
  `prEmail` varchar(40) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `secondaryactor`
--

CREATE TABLE `secondaryactor` (
  `secondaryActorID` int(11) NOT NULL,
  `saType` varchar(40) DEFAULT NULL CHECK (`saType` in ('DataConsumer','DataProcessor','ThirdParty')),
  `saName` varchar(40) NOT NULL,
  `saAdress` varchar(250) NOT NULL,
  `saPostalCode` varchar(40) DEFAULT NULL,
  `city` varchar(40) DEFAULT NULL,
  `saPhone` varchar(40) DEFAULT NULL,
  `saEmail` varchar(40) DEFAULT NULL,
  `garanties` varchar(255) DEFAULT NULL,
  `saCategory` int(11) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `secondaryactorcategory`
--

CREATE TABLE `secondaryactorcategory` (
  `saCategoryID` int(11) NOT NULL,
  `saCategoryName` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tutor`
--

CREATE TABLE `tutor` (
  `tutorID` int(11) NOT NULL,
  `tutorName` varchar(40) NOT NULL,
  `username` varchar(25) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `country`
--
ALTER TABLE `country`
  ADD PRIMARY KEY (`countryName`);

--
-- Indexes for table `datasubject`
--
ALTER TABLE `datasubject`
  ADD PRIMARY KEY (`dataSubjectID`),
  ADD KEY `const1` (`dsCategory`),
  ADD KEY `const2` (`user_id`);

--
-- Indexes for table `data_subject`
--
ALTER TABLE `data_subject`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK759pytbn72ug2f6vn2uu6hdus` (`ds_category_dsc_id`);

--
-- Indexes for table `dpo`
--
ALTER TABLE `dpo`
  ADD PRIMARY KEY (`dpID`),
  ADD KEY `country` (`country`);

--
-- Indexes for table `dscategory`
--
ALTER TABLE `dscategory`
  ADD PRIMARY KEY (`dsc_id`);

--
-- Indexes for table `provider`
--
ALTER TABLE `provider`
  ADD PRIMARY KEY (`providerID`),
  ADD KEY `country` (`country`);

--
-- Indexes for table `secondaryactor`
--
ALTER TABLE `secondaryactor`
  ADD PRIMARY KEY (`secondaryActorID`),
  ADD KEY `saCategory` (`saCategory`),
  ADD KEY `country` (`country`);

--
-- Indexes for table `secondaryactorcategory`
--
ALTER TABLE `secondaryactorcategory`
  ADD PRIMARY KEY (`saCategoryID`);

--
-- Indexes for table `tutor`
--
ALTER TABLE `tutor`
  ADD PRIMARY KEY (`tutorID`),
  ADD KEY `country` (`country`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_subject`
--
ALTER TABLE `data_subject`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102;

--
-- AUTO_INCREMENT for table `dpo`
--
ALTER TABLE `dpo`
  MODIFY `dpID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `provider`
--
ALTER TABLE `provider`
  MODIFY `providerID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `secondaryactor`
--
ALTER TABLE `secondaryactor`
  MODIFY `secondaryActorID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `secondaryactorcategory`
--
ALTER TABLE `secondaryactorcategory`
  MODIFY `saCategoryID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tutor`
--
ALTER TABLE `tutor`
  MODIFY `tutorID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `data_subject`
--
ALTER TABLE `data_subject`
  ADD CONSTRAINT `FK759pytbn72ug2f6vn2uu6hdus` FOREIGN KEY (`ds_category_dsc_id`) REFERENCES `dscategory` (`dsc_id`);

--
-- Constraints for table `dpo`
--
ALTER TABLE `dpo`
  ADD CONSTRAINT `dpo_ibfk_1` FOREIGN KEY (`country`) REFERENCES `country` (`countryName`);

--
-- Constraints for table `provider`
--
ALTER TABLE `provider`
  ADD CONSTRAINT `provider_ibfk_1` FOREIGN KEY (`country`) REFERENCES `country` (`countryName`);

--
-- Constraints for table `secondaryactor`
--
ALTER TABLE `secondaryactor`
  ADD CONSTRAINT `secondaryactor_ibfk_1` FOREIGN KEY (`saCategory`) REFERENCES `secondaryactorcategory` (`saCategoryID`),
  ADD CONSTRAINT `secondaryactor_ibfk_2` FOREIGN KEY (`country`) REFERENCES `country` (`countryName`);

--
-- Constraints for table `tutor`
--
ALTER TABLE `tutor`
  ADD CONSTRAINT `tutor_ibfk_1` FOREIGN KEY (`country`) REFERENCES `country` (`countryName`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
