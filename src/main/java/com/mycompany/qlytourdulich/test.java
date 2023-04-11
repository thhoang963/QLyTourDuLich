
package com.mycompany.qlytourdulich;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachKhachHang dskh = new DanhSachKhachHang();
        int luaChon = 0;
        do {            
            System.out.println("-----MENU----- ");
            System.out.println("""
                               1. Them khach hang vao danh sach
                               2. In danh sach khach hang ra man hinh
                               3. Kiem tra danh sach co rong hay khong
                               4. Lay ra so luong khach hang trong danh sach
                               5. Lam rong danh sach khach hang
                               6. Xoa mot khach hang ra khoi danh sach dua teen ma khach hang 
                               7. Kiem tra khach hang co ton tai trong danh sach hay khong, dua tren ma khach hang 
                               8. Tim kiem tat ca khach hang dua tren ten nhap tu ban phim 
                               9. Xuat ra danh sach khach hang theo ma khach hang
                               0. Thoat khoi chuong trinh
                               Vui long chon chuc nang: """);
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon == 1)
            {
                System.out.println("Nhap ma khach hang: "); String makhachhang = sc.nextLine();
                System.out.println("Nhap ten khach hang: "); String tenkhachhang = sc.nextLine();
                System.out.println("Nhap dia chi: "); String diachi = sc.nextLine();
                System.out.println("Nhap so dien thoai: "); long sodienthoai = sc.nextLong();
                System.out.println("Nhap email: "); String email = sc.nextLine();
                sc.nextLine();
                KhachHang kh = new KhachHang(makhachhang, tenkhachhang, diachi, sodienthoai,email);
                dskh.themKhachHang(kh);
                
            }else if(luaChon == 2)
            {
                
            }else if(luaChon == 3)
            {
                
            }else if(luaChon == 4)
            {
                
            }else if(luaChon == 5)
            {
                
            }else if(luaChon == 6)
            {
                
            }else if(luaChon == 7)
            {
                
            }else if(luaChon == 8)
            {
                
            } else if(luaChon == 9)
            {
                
            }
                
        } while (luaChon != 0);
    }
}
