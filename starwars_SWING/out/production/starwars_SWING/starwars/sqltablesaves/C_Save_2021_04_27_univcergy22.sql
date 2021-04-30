-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le : mar. 27 avr. 2021 à 14:10
-- Version du serveur :  5.7.31
-- Version de PHP : 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `univcergy22`
--

-- --------------------------------------------------------

--
-- Structure de la table `acces`
--

CREATE TABLE `acces` (
  `id` int(11) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `login` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `statut` varchar(20) NOT NULL,
  `age` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `acces`
--

INSERT INTO `acces` (`id`, `prenom`, `login`, `password`, `statut`, `age`) VALUES
(1, 'Tom', 'tomahawk', 'indien', 'Etudiant', 22),
(2, 'Pierre', 'Pierrot', 'delalune', 'Prof', 44),
(3, 'Michel', 'lamere', 'sonchat', 'Admin', 69),
(4, 'Robin', 'Locksley', 'desbois', 'Etudiant', 23);

-- --------------------------------------------------------

--
-- Structure de la table `acteurs`
--

CREATE TABLE `acteurs` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `acteurs_personnages`
--

CREATE TABLE `acteurs_personnages` (
  `id` int(11) NOT NULL,
  `acteurs_id` int(11) NOT NULL,
  `personnages_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `films`
--

CREATE TABLE `films` (
  `id` int(11) NOT NULL,
  `titre` varchar(20) NOT NULL,
  `anneeDeSortie` varchar(20) NOT NULL,
  `numeroEpisode` int(20) NOT NULL,
  `cout` double NOT NULL,
  `recette` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `films`
--

INSERT INTO `films` (`id`, `titre`, `anneeDeSortie`, `numeroEpisode`, `cout`, `recette`) VALUES
(1, 'Star Wars IV', '1977', 4, 1234589.12, 122359.12),
(2, 'Star Wars V', '1980', 5, 1234589.12, 122359.12),
(3, 'Star Wars VI', '1983', 6, 1234589.12, 122359.12),
(4, 'Star Wars I', '1999', 1, 1234589.12, 122359.12),
(5, 'Star Wars II', '2002', 2, 1234589.12, 122359.12),
(6, 'Star Wars III', '2005', 3, 1234589.12, 122359.12),
(7, 'Star Wars VII', '2015', 4, 1234589.12, 122359.12),
(8, 'Star Wars VIII', '2017', 5, 1234589.12, 122359.12),
(9, 'Star Wars IX', '2019', 6, 1234589.12, 122359.12),
(10, 'Jurassic Park I', '1993', 6, 1234589.12, 122359.12),
(11, 'Jurassic Park II', '1997', 6, 1234589.12, 122359.12),
(12, 'Jurassic Park II', '2001', 6, 1234589.12, 122359.12),
(13, 'Jurassic World', '2015', 6, 1234589.12, 122359.12);

-- --------------------------------------------------------

--
-- Structure de la table `films_acteurs`
--

CREATE TABLE `films_acteurs` (
  `id` int(11) NOT NULL,
  `films_id` int(11) NOT NULL,
  `acteurs_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `personnages`
--

CREATE TABLE `personnages` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `statut`
--

CREATE TABLE `statut` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `statut`
--

INSERT INTO `statut` (`id`, `nom`) VALUES
(1, 'Etudiant'),
(2, 'Prof'),
(3, 'Admin'),
(4, 'Visiteur');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `acces`
--
ALTER TABLE `acces`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `acteurs`
--
ALTER TABLE `acteurs`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `acteurs_personnages`
--
ALTER TABLE `acteurs_personnages`
  ADD PRIMARY KEY (`id`),
  ADD KEY `acteurs_id` (`acteurs_id`),
  ADD KEY `personnages_id` (`personnages_id`);

--
-- Index pour la table `films`
--
ALTER TABLE `films`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `films_acteurs`
--
ALTER TABLE `films_acteurs`
  ADD PRIMARY KEY (`id`),
  ADD KEY `films_id` (`films_id`),
  ADD KEY `acteurs_id` (`acteurs_id`);

--
-- Index pour la table `personnages`
--
ALTER TABLE `personnages`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `statut`
--
ALTER TABLE `statut`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `acteurs`
--
ALTER TABLE `acteurs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `acteurs_personnages`
--
ALTER TABLE `acteurs_personnages`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `films`
--
ALTER TABLE `films`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT pour la table `films_acteurs`
--
ALTER TABLE `films_acteurs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `personnages`
--
ALTER TABLE `personnages`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `statut`
--
ALTER TABLE `statut`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `acteurs_personnages`
--
ALTER TABLE `acteurs_personnages`
  ADD CONSTRAINT `acteurs_personnages_ibfk_1` FOREIGN KEY (`acteurs_id`) REFERENCES `acteurs` (`id`),
  ADD CONSTRAINT `acteurs_personnages_ibfk_2` FOREIGN KEY (`personnages_id`) REFERENCES `personnages` (`id`);

--
-- Contraintes pour la table `films_acteurs`
--
ALTER TABLE `films_acteurs`
  ADD CONSTRAINT `films_acteurs_ibfk_1` FOREIGN KEY (`films_id`) REFERENCES `films` (`id`),
  ADD CONSTRAINT `films_acteurs_ibfk_2` FOREIGN KEY (`acteurs_id`) REFERENCES `acteurs` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
