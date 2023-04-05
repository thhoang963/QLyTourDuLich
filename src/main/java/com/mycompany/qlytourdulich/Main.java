package com.mycompany.qlytourdulich;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat a = a new SimpleDateFormat("dd/mm/yyyy");
        ChiTietHoaDonVe cthdv = new ChiTietHoaDonVe(100,1000);
        cthdv.xuat();
        DiaDiem dd = new DiaDiem("DD001","150","Cao Bang");
        dd.xuat();
        DiemVuiChoi dvc = new DiemVuiChoi("DDVC001","Dong Thap","Dong Thap");
        dvc.xuat();
        String i = "20/02/2003";
        Date j = a.parse(i);
        HoaDon hd = new HoaDon("ds","đá",2000,j);
        hd.xuat();
    }
}