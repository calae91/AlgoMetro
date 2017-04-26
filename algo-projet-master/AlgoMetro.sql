-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 26, 2017 at 04:13 PM
-- Server version: 5.7.16-0ubuntu0.16.04.1
-- PHP Version: 7.0.8-0ubuntu0.16.04.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `AlgoMetro`
--

-- --------------------------------------------------------

--
-- Table structure for table `chemin`
--

CREATE TABLE `chemin` (
  `Id` int(255) NOT NULL,
  `start` int(255) NOT NULL,
  `finish` int(255) NOT NULL,
  `time` int(255) NOT NULL,
  `Ligne` int(255) NOT NULL,
  `Nom` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `chemin`
--

INSERT INTO `chemin` (`Id`, `start`, `finish`, `time`, `Ligne`, `Nom`) VALUES
(1, 2, 1, 41, 1, 'Château de Vincennes vers Bérault'),
(2, 1, 2, 41, 2, 'Bérault vers Chateau de Vincennes');

-- --------------------------------------------------------

--
-- Table structure for table `LigneSensA`
--

CREATE TABLE `LigneSensA` (
  `Id` int(255) NOT NULL,
  `Nom` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `LigneSensA`
--

INSERT INTO `LigneSensA` (`Id`, `Nom`) VALUES
(1, 'Château de Vincennes'),
(2, 'La Défense');

-- --------------------------------------------------------

--
-- Table structure for table `Stations`
--

CREATE TABLE `Stations` (
  `Id` int(255) NOT NULL,
  `Nom` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Stations`
--

INSERT INTO `Stations` (`Id`, `Nom`) VALUES
(1, 'Chateau de Vincennes'),
(2, 'Berault'),
(3, 'Saint-Mande - Tourelle'),
(4, 'Porte de Vincennes'),
(5, 'Reuilly - Diderot'),
(6, 'Gare de Lyon'),
(7, 'Bastille'),
(8, 'Saint-Paul'),
(9, 'Hôtel de Ville'),
(10, 'Châtelet'),
(11, 'Louvre-Rivoli'),
(12, 'Palais Royal - Musée du Louvre'),
(13, 'Tuileries'),
(14, 'Concorde'),
(15, 'champs-Elysées - Clemenceau'),
(16, 'Franklin D. Roosevelt'),
(17, 'George V'),
(18, 'Charles de Gaulle - Etoile'),
(19, 'Argentine'),
(20, 'Porte Maillot'),
(21, 'Les Sablons'),
(22, 'Pont de Neuilly'),
(23, 'Esplanade de la Défense'),
(24, 'La Défense');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chemin`
--
ALTER TABLE `chemin`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `LigneSensA`
--
ALTER TABLE `LigneSensA`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `Stations`
--
ALTER TABLE `Stations`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chemin`
--
ALTER TABLE `chemin`
  MODIFY `Id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `LigneSensA`
--
ALTER TABLE `LigneSensA`
  MODIFY `Id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `Stations`
--
ALTER TABLE `Stations`
  MODIFY `Id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
