-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mar. 16 juin 2020 à 05:32
-- Version du serveur :  5.7.24
-- Version de PHP :  7.1.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `pidev`
--

-- --------------------------------------------------------

--
-- Structure de la table `event`
--

DROP TABLE IF EXISTS `event`;
CREATE TABLE IF NOT EXISTS `event` (
  `idevent` int(11) NOT NULL AUTO_INCREMENT,
  `nomEvent` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `dateEvent` date NOT NULL,
  `nb_p` int(11) NOT NULL,
  `prix` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `description` longtext COLLATE utf8_unicode_ci,
  `adresse_event` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `type_event` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `image` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idevent`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `event`
--

INSERT INTO `event` (`idevent`, `nomEvent`, `dateEvent`, `nb_p`, `prix`, `description`, `adresse_event`, `type_event`, `image`) VALUES
(4, 'e1', '2020-06-17', 1, 'p1', 'd1', 'ad1', 'Sport', 'im1'),
(6, 'e3', '2020-07-10', 3, 'p3', 'des3', 'ad3', 'Sport', 'im3'),
(7, 'e5', '2020-06-16', 5, 'p5', 'd5', 'a5', 'Excursions', 'im5'),
(8, 'gggg', '2020-06-17', 55, '9', 'gfsdgdf', 'gfb', 'Divertissements', '18-1.jpg'),
(9, 'd', '2020-06-25', 5, 'd', 'd', 'd', 'Culturel', '18-1.jpg'),
(10, 'o', '2020-06-18', 8, 'o', 'o', 'o', 'Sport', '18-1.jpg');

-- --------------------------------------------------------

--
-- Structure de la table `fos_user`
--

DROP TABLE IF EXISTS `fos_user`;
CREATE TABLE IF NOT EXISTS `fos_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(180) COLLATE utf8_unicode_ci NOT NULL,
  `username_canonical` varchar(180) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(180) COLLATE utf8_unicode_ci NOT NULL,
  `email_canonical` varchar(180) COLLATE utf8_unicode_ci NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  `salt` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `last_login` datetime DEFAULT NULL,
  `confirmation_token` varchar(180) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password_requested_at` datetime DEFAULT NULL,
  `roles` varchar(255) COLLATE utf8_unicode_ci NOT NULL COMMENT '(DC2Type:array)',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UNIQ_957A647992FC23A8` (`username_canonical`),
  UNIQUE KEY `UNIQ_957A6479A0D96FBF` (`email_canonical`),
  UNIQUE KEY `UNIQ_957A6479C05FB297` (`confirmation_token`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `fos_user`
--

INSERT INTO `fos_user` (`id`, `username`, `username_canonical`, `email`, `email_canonical`, `enabled`, `salt`, `password`, `last_login`, `confirmation_token`, `password_requested_at`, `roles`) VALUES
(2, 'aaaaa', 'aaaaa', 'aaaaaaaa@aaaaaaa.aa', 'aaaaaaaa@aaaaaaa.aa', 1, NULL, '$2y$13$j0ao5npN7iK21f5ZamBF.eDBBOQmDr4IoxeNKlEkC28tm87sYUc0.', '2020-06-09 13:17:37', NULL, NULL, 'a:0:{}'),
(5, 'azerty', 'azerty', 'azerty@azerty.tn', 'azerty@azerty.tn', 0, NULL, 'azerty', NULL, NULL, NULL, 'admin'),
(6, 'querty', 'querty', 'querty@querty.tn', 'querty@querty.tn', 0, NULL, 'querty', NULL, NULL, NULL, 'admin'),
(7, 'ytreza', 'ytreza', 'ytreza@ytreza.tn', 'ytreza@ytreza.tn', 0, NULL, 'ytreza', NULL, NULL, NULL, 'ytreza'),
(8, 'ee', 'ee', 'ee@ee.tn', 'ee@ee.tn', 0, NULL, 'ee', NULL, NULL, NULL, 'ee'),
(9, 'rr', 'rr', 'rr@rr.tn', 'rr@rr.tn', 0, NULL, 'rr', NULL, NULL, NULL, 'admin'),
(10, 'i', 'i', 'i@i.tn', 'i@i.tn', 0, NULL, 'i', NULL, NULL, NULL, 'i'),
(13, 'nur', 'nur', 'nour.affes@esprit.tn', 'nour.affes@esprit.tn', 0, NULL, 'nur', NULL, NULL, NULL, 'nur');

-- --------------------------------------------------------

--
-- Structure de la table `inscription_event`
--

DROP TABLE IF EXISTS `inscription_event`;
CREATE TABLE IF NOT EXISTS `inscription_event` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `numtel` varchar(30) NOT NULL,
  `nomevent` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `inscription_event`
--

INSERT INTO `inscription_event` (`id`, `username`, `nom`, `prenom`, `numtel`, `nomevent`) VALUES
(3, 'azerty', 'test', 'test', '5526020', 'event'),
(29, 'a', 'a', 'a', '123', 'oiiiii'),
(30, 'a', 'a', 'a', '123', 'oiiiii'),
(31, 'a', 'a', 'a', '123', 'df'),
(32, 'a', 'hh', 'hh', '4', 'df'),
(33, 'e3', 'ytreza', 'p', '99999', 'e3'),
(34, 'e3', 'ytreza', 'p', '77', 'e3'),
(35, 'nur', 'sdsc', 'sdsqd', '95628563', 'e3'),
(36, 'nur', 'nur', 'nur', '555', 'gggg');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
