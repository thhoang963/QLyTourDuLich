package com.mycompany.qlytourdulich;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



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
            System.out.println(khachHang);
        }
    }
    
    //3. Kiem tra danh sach khach hang co rong hay khong
    public boolean kiemTraDanhSachRong()
    {
        return this.danhSach.isEmpty();
    }
    
    //4. Lay ra so luong khach hang trong danh sach
    public int laySoLuongKhachHang()
    {
        return this.danhSach.size();
    }
    //5. lam romg danh sach khach hang
    public void lamRongDanhSach()
    {
        this.danhSach.removeAll(danhSach);
    }
    
    //6. Kiem tra khach hang co ton tai trong danh sach hay khong, dua tren ma khach hang
    public boolean kiemTraTonTai(KhachHang kh)
    {
        return this.danhSach.contains(kh);
    }
    //7. Xoa mot khach hang ra khoi danh sach khach hang dua tren ma khach hang
    public boolean  xoaKhachHang(KhachHang kh)
    {
        return this.danhSach.remove(kh);
    }
    
    //8. Tim kiem tat ca khach hang dua tren Ma khach hang duoc nhap tu ban phim
    public void timKhachHang(String ma)
    {
        for (KhachHang khachHang : danhSach) 
        {
            if(khachHang.getMakh().contains(ma));
            System.out.println(khachHang);
        }
    }
    
    
  
    
}
