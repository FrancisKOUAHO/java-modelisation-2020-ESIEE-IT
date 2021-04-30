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

INSERT INTO `films`(`id`,`titre`, `anneeDeSortie`, `numeroEpisode`, `cout`, `recette`) VALUES

(1,"Star Wars IV","1977",4,1234589.12,122359.12),
(2,"Star Wars V","1980",5,1234589.12,122359.12),
(3,"Star Wars VI","1983",6,1234589.12,122359.12),
(4,"Star Wars I","1999",1,1234589.12,122359.12),
(5,"Star Wars II","2002",2,1234589.12,122359.12),
(6,"Star Wars III","2005",3,1234589.12,122359.12),
(7,"Star Wars VII","2015",4,1234589.12,122359.12),
(8,"Star Wars VIII","2017",5,1234589.12,122359.12),
(9,"Star Wars IX","2019",6,1234589.12,122359.12),
(10,"Jurassic Park I","1993",6,1234589.12,122359.12),
(11,"Jurassic Park II","1997",6,1234589.12,122359.12),
(12,"Jurassic Park II","2001",6,1234589.12,122359.12),
(13,"Jurassic World","2015",6,1234589.12,122359.12)
;

--
-- Structure de la table `films_acteurs`
--

CREATE TABLE `films_acteurs` (
  `id` int(11) NOT NULL,
  `films_id` int(11) NOT NULL,
  `acteurs_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Structure de la table `acteurs`
--

CREATE TABLE `acteurs` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Structure de la table `acteurs_personnages`
--

CREATE TABLE `acteurs_personnages` (
  `id` int(11) NOT NULL,
  `acteurs_id` int(11) NOT NULL,
  `personnages_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Structure de la table `personnages`
--

CREATE TABLE `personnages` (
  `id` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `films`
--
ALTER TABLE `films`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `films_acteurs`
--
ALTER TABLE `films_acteurs`
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
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `personnages`
--
ALTER TABLE `personnages`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `films`
--
ALTER TABLE `films`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `films_acteurs`
--
ALTER TABLE `films_acteurs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;


--
-- AUTO_INCREMENT pour la table `acteurs`
--
ALTER TABLE `acteurs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

--
-- AUTO_INCREMENT pour la table `acteurs_personnages`
--
ALTER TABLE `acteurs_personnages`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

--
-- AUTO_INCREMENT pour la table `personnages`
--
ALTER TABLE `personnages`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;


--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `films_acteurs`
--
ALTER TABLE `films_acteurs`
  ADD FOREIGN KEY (`films_id`) REFERENCES `films` (`id`),
  ADD FOREIGN KEY (`acteurs_id`) REFERENCES `acteurs` (`id`);

--
-- Contraintes pour la table `acteurs_personnages`
--
ALTER TABLE `acteurs_personnages`
  ADD FOREIGN KEY (`acteurs_id`) REFERENCES `acteurs` (`id`),
  ADD FOREIGN KEY (`personnages_id`) REFERENCES `personnages` (`id`);