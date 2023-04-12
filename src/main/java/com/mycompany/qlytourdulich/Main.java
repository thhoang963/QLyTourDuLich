package com.mycompany.qlytourdulich;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) throws ParseException, SQLException {

//        ChiTietHoaDonVe cthdv = new ChiTietHoaDonVe(100,1000);
//        cthdv.xuat();
//        DiaDiem dd = new DiaDiem("DD001","150","Cao Bang");
//        dd.xuat();
//        DiemVuiChoi dvc = new DiemVuiChoi("DDVC001","Dong Thap","Dong Thap");
//        dvc.xuat();
          config a = new config();
          a.layDL_TK();
    }
}