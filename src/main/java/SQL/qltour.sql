SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;



CREATE TABLE `taikhoan` (
  `tentaikhoan` text NOT NULL,
  `matkhau` text NOT NULL,
  `manv` int(11) NOT NULL,
  `loaitk` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

CREATE TABLE `khachHang` (
  `makh` int(11) NOT NULL PRIMARY KEY,
  `tenkhachhang` text NOT NULL,
  `diachi` text,
  `sdt` int(10) NOT NULL,
  `email` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

CREATE TABLE `nhanVien` (
  `manv` int(11) NOT NULL PRIMARY KEY,
  `tennhanvien` text NOT NULL,
  `diachi` text,
  `chucVu` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

CREATE TABLE `huongdanVien` (
  `manv` int(11),
  `matour` int(11)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

INSERT INTO `taikhoan` (`tentaikhoan`, `matkhau`, `manv`, `loaitk`) VALUES
('admin', '123456', 1, 'admin');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
