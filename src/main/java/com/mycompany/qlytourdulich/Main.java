package com.mycompany.qlytourdulich;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        ChiTietHoaDonVe cthdv = new ChiTietHoaDonVe(100,1000);
        cthdv.xuat();
        DiaDiem dd = new DiaDiem("DD001","150","Cao Bang");
        dd.xuat();
        DiemVuiChoi dvc = new DiemVuiChoi("DDVC001","Dong Thap","Dong Thap");
        dvc.xuat();
        HoaDon hd = new HoaDon("ds","đá",2000,"20/09/2003");
        hd.xuat();
    }
}