-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 16, 2023 at 04:37 PM
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
-- Database: `lab`
--

-- --------------------------------------------------------

--
-- Table structure for table `alat_ruangan`
--

CREATE TABLE `alat_ruangan` (
  `id_alat` int(20) NOT NULL,
  `id_ruangan` int(20) UNSIGNED NOT NULL,
  `nama_alat` varchar(100) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `alat_ruangan`
--

INSERT INTO `alat_ruangan` (`id_alat`, `id_ruangan`, `nama_alat`, `jumlah`) VALUES
(9, 1, 'Komputer', 5),
(10, 1, 'Keyboard', 5),
(11, 1, 'Mouse', 5),
(12, 1, 'Kursi', 5),
(13, 1, 'Meja', 5),
(14, 2, 'Komputer', 8),
(15, 2, 'Keyboard', 8),
(16, 2, 'Mouse', 8),
(17, 2, 'Kursi', 8),
(18, 2, 'Meja', 8),
(19, 2, 'TV', 1);

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `id_dosen` int(20) UNSIGNED NOT NULL,
  `nidn` varchar(100) NOT NULL,
  `nama_dosen` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`id_dosen`, `nidn`, `nama_dosen`, `username`, `password`) VALUES
(1, '170187654321', 'Swono Sibagariang', 'pakswono', 'pak'),
(2, '171187654321', 'Mira Chandra Kirana', 'bumira', 'bu'),
(3, '172187654321', 'Dwi Amalia Purnamasari', 'budwi', 'bu');

-- --------------------------------------------------------

--
-- Table structure for table `kerusakan`
--

CREATE TABLE `kerusakan` (
  `id_rusak` int(20) UNSIGNED NOT NULL,
  `id_ruangan` int(20) UNSIGNED DEFAULT NULL,
  `detail_rusak` text NOT NULL,
  `detail_perbaikan` text DEFAULT NULL,
  `foto` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kerusakan`
--

INSERT INTO `kerusakan` (`id_rusak`, `id_ruangan`, `detail_rusak`, `detail_perbaikan`, `foto`) VALUES
(10, 1, 'tes', 'Solved', ''),
(11, 2, 'Tombol Keyboard Rusak', 'Solved', ''),
(14, 2, 'Komputer Kena Air', 'Solved', ''),
(15, 2, 'pc tidak mau menyala', 'mengganti ram', ''),
(17, 1, 'tes', NULL, ''),
(18, 1, 'tes', NULL, ''),
(19, 1, 'tes', NULL, ''),
(20, 2, 'tes1', NULL, ''),
(21, 1, 'tes2', NULL, ''),
(23, 2, 'Pc tidak menyala', 'mengganti ram', '');

-- --------------------------------------------------------

--
-- Table structure for table `kerusakan_sparepart`
--

CREATE TABLE `kerusakan_sparepart` (
  `id_kerusakan` int(11) UNSIGNED NOT NULL,
  `id_sparepart` int(11) UNSIGNED NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kerusakan_sparepart`
--

INSERT INTO `kerusakan_sparepart` (`id_kerusakan`, `id_sparepart`, `jumlah`) VALUES
(10, 1, 5),
(10, 1, 5),
(10, 4, 4),
(15, 4, 1),
(15, 4, 1),
(15, 4, 2),
(23, 4, 2),
(23, 4, 5);

--
-- Triggers `kerusakan_sparepart`
--
DELIMITER $$
CREATE TRIGGER `stok` AFTER INSERT ON `kerusakan_sparepart` FOR EACH ROW BEGIN
UPDATE sparepart SET jumlah_sp=jumlah_sp-new.jumlah WHERE id_sparepart=new.id_sparepart;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `laboran`
--

CREATE TABLE `laboran` (
  `id_laboran` int(20) UNSIGNED NOT NULL,
  `nip` varchar(50) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `laboran`
--

INSERT INTO `laboran` (`id_laboran`, `nip`, `username`, `password`) VALUES
(1, '1187654321', 'lab', 'lab');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `id_mahasiswa` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `nim` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`id_mahasiswa`, `nama`, `nim`, `username`, `password`) VALUES
(3, 'Rizky Putra Rusadi', '3312101002', 'rizky', 'ky'),
(4, 'Yandra Muslim', '3312101019', 'yan', 'mus');

-- --------------------------------------------------------

--
-- Table structure for table `peminjam`
--

CREATE TABLE `peminjam` (
  `id_pinjam` int(20) UNSIGNED NOT NULL,
  `id_ruangan` int(20) UNSIGNED DEFAULT NULL,
  `id_dosen` int(20) UNSIGNED DEFAULT NULL,
  `id_mahasiswa` int(11) NOT NULL,
  `tanggal_pinjam` varchar(50) NOT NULL,
  `waktu_pinjam` varchar(100) NOT NULL,
  `waktu_balik` varchar(100) DEFAULT NULL,
  `persetujuan_dosen` varchar(100) DEFAULT NULL,
  `persetujuan_laboran` varchar(100) DEFAULT NULL,
  `status_ruangan` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peminjam`
--

INSERT INTO `peminjam` (`id_pinjam`, `id_ruangan`, `id_dosen`, `id_mahasiswa`, `tanggal_pinjam`, `waktu_pinjam`, `waktu_balik`, `persetujuan_dosen`, `persetujuan_laboran`, `status_ruangan`) VALUES
(9, 2, 3, 3, '2022-06-08', '15:00:00', '16:00:00', 'ACCEPT', 'ACCEPT', NULL),
(10, 1, 1, 4, '2022-06-19', '15:00:00', '17:00:00', '', '', ''),
(11, 1, 1, 3, '2022-06-24', '15:00:00', '16:00:00', '', '', ''),
(15, 2, 3, 3, '2022-06-24', '11:00:00', '12:00:00', 'ACCEPT', 'ACCEPT', ''),
(17, 2, 1, 3, '2022-06-25', '09:00:00', '10:00:00', '', '', ''),
(21, 2, 1, 3, '2022-06-30', '12:00:00', '13:00:00', '', '', ''),
(24, 2, 2, 4, '2022-06-29', '12:00:00', '13:00:00', '', '', ''),
(25, 2, 3, 3, '2022-06-29', '16:00:00', '17:00:00', '', '', ''),
(26, 1, 3, 3, '2022-06-29', '17:00:00', '18:00:00', '', '', ''),
(27, 2, 1, 3, '2022-06-30', '14:00:00', '15:00:00', '', '', ''),
(28, 2, 3, 3, '2022-06-30', '16:00:00', '17:00:00', '', '', ''),
(29, 2, 3, 3, '2022-07-04', '12:00:00', '13:00:00', '', '', ''),
(30, 2, 2, 3, '2022-07-12', '12:00:00', '13:00:00', 'ACCEPT', 'ACCEPT', ''),
(32, 2, 3, 3, '2022-07-15', '14:00:00', '17:00:00', '', '', ''),
(33, 2, 2, 3, '2022-07-13', '15:00:00', '16:00:00', 'ACCEPT', 'ACCEPT', '');

-- --------------------------------------------------------

--
-- Table structure for table `ruangan`
--

CREATE TABLE `ruangan` (
  `id_ruangan` int(20) UNSIGNED NOT NULL,
  `id_laboran` int(10) UNSIGNED DEFAULT NULL,
  `no_ruangan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ruangan`
--

INSERT INTO `ruangan` (`id_ruangan`, `id_laboran`, `no_ruangan`) VALUES
(1, 1, 701),
(2, 1, 702);

-- --------------------------------------------------------

--
-- Table structure for table `sparepart`
--

CREATE TABLE `sparepart` (
  `id_sparepart` int(20) UNSIGNED NOT NULL,
  `nama_sp` varchar(100) NOT NULL,
  `jumlah_sp` int(20) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sparepart`
--

INSERT INTO `sparepart` (`id_sparepart`, `nama_sp`, `jumlah_sp`) VALUES
(1, 'Harddisk External', 45),
(2, 'Motherboard', 30),
(3, 'Power Supply', 30),
(4, 'Memori/Ram', 9),
(5, 'Processor', 20);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alat_ruangan`
--
ALTER TABLE `alat_ruangan`
  ADD PRIMARY KEY (`id_alat`),
  ADD KEY `alat_ruangan` (`id_ruangan`);

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`id_dosen`);

--
-- Indexes for table `kerusakan`
--
ALTER TABLE `kerusakan`
  ADD PRIMARY KEY (`id_rusak`),
  ADD KEY `id_ruangan` (`id_ruangan`);

--
-- Indexes for table `kerusakan_sparepart`
--
ALTER TABLE `kerusakan_sparepart`
  ADD KEY `PK_kerusakan` (`id_kerusakan`),
  ADD KEY `pk_sparepart` (`id_sparepart`);

--
-- Indexes for table `laboran`
--
ALTER TABLE `laboran`
  ADD PRIMARY KEY (`id_laboran`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`id_mahasiswa`);

--
-- Indexes for table `peminjam`
--
ALTER TABLE `peminjam`
  ADD PRIMARY KEY (`id_pinjam`),
  ADD KEY `fk_id_dosen` (`id_dosen`),
  ADD KEY `id_ruangan` (`id_ruangan`),
  ADD KEY `id_mahasiswa_pk` (`id_mahasiswa`);

--
-- Indexes for table `ruangan`
--
ALTER TABLE `ruangan`
  ADD PRIMARY KEY (`id_ruangan`),
  ADD KEY `fk_id_laboran` (`id_laboran`);

--
-- Indexes for table `sparepart`
--
ALTER TABLE `sparepart`
  ADD PRIMARY KEY (`id_sparepart`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `alat_ruangan`
--
ALTER TABLE `alat_ruangan`
  MODIFY `id_alat` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `dosen`
--
ALTER TABLE `dosen`
  MODIFY `id_dosen` int(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `kerusakan`
--
ALTER TABLE `kerusakan`
  MODIFY `id_rusak` int(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `laboran`
--
ALTER TABLE `laboran`
  MODIFY `id_laboran` int(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  MODIFY `id_mahasiswa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `peminjam`
--
ALTER TABLE `peminjam`
  MODIFY `id_pinjam` int(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT for table `ruangan`
--
ALTER TABLE `ruangan`
  MODIFY `id_ruangan` int(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `sparepart`
--
ALTER TABLE `sparepart`
  MODIFY `id_sparepart` int(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `alat_ruangan`
--
ALTER TABLE `alat_ruangan`
  ADD CONSTRAINT `fk_alat_ruangan` FOREIGN KEY (`id_ruangan`) REFERENCES `ruangan` (`id_ruangan`) ON DELETE CASCADE;

--
-- Constraints for table `kerusakan`
--
ALTER TABLE `kerusakan`
  ADD CONSTRAINT `pk_id_ruangan` FOREIGN KEY (`id_ruangan`) REFERENCES `ruangan` (`id_ruangan`) ON DELETE SET NULL;

--
-- Constraints for table `kerusakan_sparepart`
--
ALTER TABLE `kerusakan_sparepart`
  ADD CONSTRAINT `kerusakan_sparepart_ibfk_1` FOREIGN KEY (`id_kerusakan`) REFERENCES `kerusakan` (`id_rusak`) ON DELETE CASCADE,
  ADD CONSTRAINT `kerusakan_sparepart_ibfk_2` FOREIGN KEY (`id_sparepart`) REFERENCES `sparepart` (`id_sparepart`) ON DELETE CASCADE;

--
-- Constraints for table `peminjam`
--
ALTER TABLE `peminjam`
  ADD CONSTRAINT `fk_id_dosen` FOREIGN KEY (`id_dosen`) REFERENCES `dosen` (`id_dosen`) ON DELETE SET NULL,
  ADD CONSTRAINT `id_mahasiswa_pk` FOREIGN KEY (`id_mahasiswa`) REFERENCES `mahasiswa` (`id_mahasiswa`) ON DELETE CASCADE,
  ADD CONSTRAINT `peminjam_ibfk_1` FOREIGN KEY (`id_ruangan`) REFERENCES `ruangan` (`id_ruangan`) ON DELETE SET NULL;

--
-- Constraints for table `ruangan`
--
ALTER TABLE `ruangan`
  ADD CONSTRAINT `fk_id_laboran` FOREIGN KEY (`id_laboran`) REFERENCES `laboran` (`id_laboran`) ON DELETE SET NULL;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
