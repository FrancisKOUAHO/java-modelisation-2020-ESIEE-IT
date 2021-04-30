-- Database export via SQLPro (https://www.sqlprostudio.com/allapps.html)
-- Exported by noariuchiha at 30-04-2021 14:04.
-- WARNING: This file may contain descructive statements such as DROPs.
-- Please ensure that you are running the script at the proper location.


-- BEGIN TABLE acces
DROP TABLE IF EXISTS acces;
CREATE TABLE `acces` (
  `id` int(11) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `login` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `statut` varchar(20) NOT NULL,
  `age` int(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Inserting 3 rows into acces
-- Insert batch #1
INSERT INTO acces (id, prenom, login, password, statut, age) VALUES
(1, 'Francis', 'Francis', 'FrancisK', 'Etudiant', 26),
(2, 'Salim', 'Salim', 'SalimB', 'Prof', 22),
(3, 'Jacky', 'Jacky', 'JackyT', 'Admin', 21);

-- END TABLE acces

-- BEGIN TABLE acteurs
DROP TABLE IF EXISTS acteurs;
CREATE TABLE `acteurs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Table acteurs contains no data. No inserts have been genrated.
-- Inserting 0 rows into acteurs


-- END TABLE acteurs

-- BEGIN TABLE acteurs_personnages
DROP TABLE IF EXISTS acteurs_personnages;
CREATE TABLE `acteurs_personnages` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `acteurs_id` int(11) NOT NULL,
  `personnages_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `acteurs_id` (`acteurs_id`),
  KEY `personnages_id` (`personnages_id`),
  CONSTRAINT `acteurs_personnages_ibfk_1` FOREIGN KEY (`acteurs_id`) REFERENCES `acteurs` (`id`),
  CONSTRAINT `acteurs_personnages_ibfk_2` FOREIGN KEY (`personnages_id`) REFERENCES `personnages` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Table acteurs_personnages contains no data. No inserts have been genrated.
-- Inserting 0 rows into acteurs_personnages


-- END TABLE acteurs_personnages

-- BEGIN TABLE films
DROP TABLE IF EXISTS films;
CREATE TABLE `films` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `titre` varchar(20) NOT NULL,
  `anneeDeSortie` varchar(20) NOT NULL,
  `numeroEpisode` int(20) NOT NULL,
  `cout` double NOT NULL,
  `recette` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- Inserting 13 rows into films
-- Insert batch #1
INSERT INTO films (id, titre, anneeDeSortie, numeroEpisode, cout, recette) VALUES
(1, 'Star Wars IV', '1977', 4, 12589.12, 12359.12),
(2, 'Star Wars V', '1980', 5, 12589.12, 122359.12),
(3, 'Star Wars VI', '1983', 6, 124589.12, 122359.12),
(4, 'Star Wars I', '1999', 1, 123589.12, 12259.12),
(5, 'Star Wars II', '2002', 2, 14589.12, 12359.12),
(6, 'Star Wars III', '2005', 3, 123589.12, 12259.12),
(7, 'Star Wars VII', '2015', 4, 123589.12, 122359.12),
(8, 'Star Wars VIII', '2017', 5, 124589.12, 12359.12),
(9, 'Star Wars IX', '2019', 6, 124589.12, 122359.12),
(10, 'Jurassic Park I', '1993', 6, 12589.12, 12359.12),
(11, 'Jurassic Park II', '1997', 6, 12389.12, 122359.12),
(12, 'Jurassic Park II', '2001', 6, 12389.12, 12359.12),
(13, 'Jurassic World', '2015', 6, 123589.12, 122359.12);

-- END TABLE films

-- BEGIN TABLE films_acteurs
DROP TABLE IF EXISTS films_acteurs;
CREATE TABLE `films_acteurs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `films_id` int(11) NOT NULL,
  `acteurs_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `films_id` (`films_id`),
  KEY `acteurs_id` (`acteurs_id`),
  CONSTRAINT `films_acteurs_ibfk_1` FOREIGN KEY (`films_id`) REFERENCES `films` (`id`),
  CONSTRAINT `films_acteurs_ibfk_2` FOREIGN KEY (`acteurs_id`) REFERENCES `acteurs` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Table films_acteurs contains no data. No inserts have been genrated.
-- Inserting 0 rows into films_acteurs


-- END TABLE films_acteurs

-- BEGIN TABLE personnages
DROP TABLE IF EXISTS personnages;
CREATE TABLE `personnages` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Table personnages contains no data. No inserts have been genrated.
-- Inserting 0 rows into personnages


-- END TABLE personnages

-- BEGIN TABLE statut
DROP TABLE IF EXISTS statut;
CREATE TABLE `statut` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Inserting 4 rows into statut
-- Insert batch #1
INSERT INTO statut (id, nom) VALUES
(1, 'Etudiant'),
(2, 'Prof'),
(3, 'Admin'),
(4, 'Visiteur');

-- END TABLE statut

