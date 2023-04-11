package com.mycompany.qlytourdulich;

import java.util.ArrayList;


public class DanhSachKhachHang {
    private ArrayList<KhachHang>danhSach;

    public DanhSachKhachHang()
    {
        this.danhSach = new ArrayList<KhachHang>(); //cach khai bao 1 arrayList
    }
    
    public DanhSachKhachHang(ArrayList<KhachHang> danhSach) {
        this.danhSach = danhSach;
    }
    
    //1. Them khach hang vao danh sach 
    public void themKhachHang(KhachHang kh)
    {
        this.danhSach.add(kh);    
    }
    
    //2. Them In danh sach sinh vien ra man hinh
    public void inDanhSachKhachHang()
    {
        for (KhachHang khachHang : danhSach) 
        {
            
        }
    }
}
