-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 06, 2019 at 01:54 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nextgenpos`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `CustomerId` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Money` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`CustomerId`, `Name`, `Money`) VALUES
(1, 'John Doe', 9.40001),
(2, 'Aurel', 9974.1),
(3, 'Hila', 16.4);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `productID` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `category` varchar(100) NOT NULL,
  `unitate` varchar(10) NOT NULL,
  `price` float NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`productID`, `name`, `category`, `unitate`, `price`, `quantity`) VALUES
(1, 'Kit Kat', 'Ciocolata', '4g', 1.5, 94),
(2, 'Orbit', 'Guma', '84g', 2.8, 33),
(3, 'Lay\'s', 'Chips', '240g', 3.65, 207),
(4, 'Borsec', 'Apa', '2000ml', 2.8, 56),
(5, 'Jacobs', 'Cafea', '100g', 15.6, 88),
(6, 'Fanta', 'Suc', '2500ml', 5.3, 11),
(7, 'Fanta', 'Suc', '500ml', 2.2, 13),
(8, 'Coca Cola', 'Suc', '2500ml', 5.7, 35),
(9, 'Coca Cola', 'Suc', '500ml', 2, 12),
(10, 'Milka Ciocolata cu Alune', 'Ciocolata', '200g', 4.45, 341),
(11, 'Milka Ciocolata cu Lapte', 'Ciocolata', '200g', 4.45, 105),
(12, 'Timisoreana Doza', 'Bere', '500ml', 2.29, 231),
(13, 'Timisoreana', 'Bere', '2500ml', 6.69, 67),
(14, 'J&B', 'Whiskey', '500ml', 54, 32),
(15, 'Jack Daniel', 'Whiskey', '500ml', 89, 132),
(16, 'Paine Feliata', 'Paine', '1000g', 4.3, 10),
(17, 'Marlboro Rosu Scurt', 'Tigari', '20/1', 17.5, 200),
(18, 'Kent 8 Lung', 'Tigari', '20/1', 17.5, 36),
(19, 'Neurmarkt', 'Bere', '1000ml', 4, 345);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`CustomerId`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`productID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `CustomerId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `productID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
