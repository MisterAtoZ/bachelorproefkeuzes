-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Gegenereerd op: 11 jun 2018 om 12:21
-- Serverversie: 10.1.32-MariaDB
-- PHP-versie: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bpkeuzes`
--

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `bp`
--

CREATE TABLE `bp` (
  `titel` varchar(140) NOT NULL,
  `beschrijving` varchar(400) NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Gegevens worden geëxporteerd voor tabel `bp`
--

INSERT INTO `bp` (`titel`, `beschrijving`, `ID`) VALUES
('Ledmatrix', 'Een ledmatrix programeren', 15),
('Backtracking algoritme ', 'Een backtracking algoritme maken', 16),
('Verdeel en heers algoritme ', 'Een verdeel en heers algoritme maken dat beter werkt dan een brute force algoritme', 17),
('Greedy algoritme ', 'Een greedy algoritme maken.', 18),
('Een sql database maken', 'Een sql database maken voor bachelorproeven de bachelorproeven toe te wijzen.', 19),
('Research naar PV-installatie', 'Levensduur van photovoltaïsche zonnepanelen testen door stress toe te dienen aan zonnepanelen.', 20),
('Optische detectie van de concentratie van micro- en nanodeeltjes in een vloeistof', 'Een apparaat maken om de concentratie van micro- en nanodeeltjes in een vloeistof te bepalen aan de hand van optische detectie.', 21),
('SQL-structuur maken voor een eetdag', 'Een database maken om voor een eetdag al de bestellingen toe te voegen en te kunnen bekijken', 24),
('App maken voor toledo', 'Met deze app moet toledo gebruikt kunnen worden.', 25);

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `docent`
--

CREATE TABLE `docent` (
  `ID` int(11) NOT NULL,
  `naam` varchar(40) NOT NULL,
  `paswoord` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Gegevens worden geëxporteerd voor tabel `docent`
--

INSERT INTO `docent` (`ID`, `naam`, `paswoord`) VALUES
(2, 'admin', 'admin1'),
(3, 'docent', 'docent1');

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `keuze`
--

CREATE TABLE `keuze` (
  `student` varchar(40) NOT NULL,
  `proef` varchar(140) NOT NULL,
  `punten` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Gegevens worden geëxporteerd voor tabel `keuze`
--

INSERT INTO `keuze` (`student`, `proef`, `punten`) VALUES
('an', 'SQL-structuur maken voor een eetdag', 18),
('bas', 'Greedy algoritme ', 14),
('ben', 'Verdeel en heers algoritme ', 0),
('hans', 'Research naar PV-installatie', 14),
('peter', 'Research naar PV-installatie', 14),
('piet', 'Een sql database maken', 17),
('willie', 'Optische detectie van de concentratie van micro- en nanodeeltjes in een vloeistof', 13);

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `keuzestudent`
--

CREATE TABLE `keuzestudent` (
  `student` varchar(40) NOT NULL,
  `keuze1` varchar(140) NOT NULL,
  `keuze2` varchar(140) NOT NULL,
  `keuze3` varchar(140) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Gegevens worden geëxporteerd voor tabel `keuzestudent`
--

INSERT INTO `keuzestudent` (`student`, `keuze1`, `keuze2`, `keuze3`) VALUES
('an', 'SQL-structuur maken voor een eetdag', 'App maken voor toledo', 'Ledmatrix'),
('bas', 'Een sql database maken', 'Greedy algoritme ', 'Research naar PV-installatie'),
('ben', 'Optische detectie van de concentratie van micro- en nanodeeltjes in een vloeistof', 'Research naar PV-installatie', 'Verdeel en heers algoritme '),
('hans', 'Research naar PV-installatie', 'Greedy algoritme ', 'Ledmatrix'),
('jan', 'App maken voor toledo', 'Een sql database maken', 'SQL-structuur maken voor een eetdag'),
('karel', 'Backtracking algoritme ', 'Optische detectie van de concentratie van micro- en nanodeeltjes in een vloeistof', 'Ledmatrix'),
('peter', 'Een sql database maken', 'Research naar PV-installatie', 'Backtracking algoritme '),
('piet', 'Optische detectie van de concentratie van micro- en nanodeeltjes in een vloeistof', 'Research naar PV-installatie', 'Een sql database maken'),
('willie', 'Optische detectie van de concentratie van micro- en nanodeeltjes in een vloeistof', 'Backtracking algoritme ', 'Verdeel en heers algoritme ');

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `student`
--

CREATE TABLE `student` (
  `ID` int(11) NOT NULL,
  `naam` varchar(40) NOT NULL,
  `paswoord` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Gegevens worden geëxporteerd voor tabel `student`
--

INSERT INTO `student` (`ID`, `naam`, `paswoord`) VALUES
(24, 'jos', 'jos1'),
(25, 'ben', 'ben1'),
(26, 'piet', 'piet1'),
(27, 'peter', 'peter1'),
(28, 'bas', 'bas1'),
(29, 'willie', 'willie1'),
(30, 'hans', 'hans1'),
(31, 'karel', 'karel1'),
(32, 'jan', 'jan1'),
(33, 'an', 'an1');

--
-- Indexen voor geëxporteerde tabellen
--

--
-- Indexen voor tabel `bp`
--
ALTER TABLE `bp`
  ADD PRIMARY KEY (`ID`);

--
-- Indexen voor tabel `docent`
--
ALTER TABLE `docent`
  ADD PRIMARY KEY (`ID`);

--
-- Indexen voor tabel `keuze`
--
ALTER TABLE `keuze`
  ADD PRIMARY KEY (`student`,`proef`);

--
-- Indexen voor tabel `keuzestudent`
--
ALTER TABLE `keuzestudent`
  ADD PRIMARY KEY (`student`);

--
-- Indexen voor tabel `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT voor geëxporteerde tabellen
--

--
-- AUTO_INCREMENT voor een tabel `bp`
--
ALTER TABLE `bp`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT voor een tabel `docent`
--
ALTER TABLE `docent`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT voor een tabel `student`
--
ALTER TABLE `student`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
