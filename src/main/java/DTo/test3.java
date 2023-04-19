
package DTo;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhuongTien dspt = new PhuongTien();
        int luaChon = 0;
        do {            
            System.out.println("-----MENU----- ");
            System.out.println("""
                               1. Them phuong tien vao danh sach
                               2. In danh sach phuong tien ra man hinh
                               3. Kiem tra danh sach co rong hay khong
                               4. Lay ra so luong phuong tien trong danh sach
                               5. Lam rong danh sach phuong tien 
                               6. Kiem tra phuong tien co ton tai trong danh sach hay khong, dua tren ma phuong tien
                               7. Xoa mot phuong tien ra khoi danh sach dua tren ma phuong tien
                               8. Tim kiem tat ca phuong tien dua tren ma nhap tu ban phim 
                               0. Thoat khoi chuong trinh
                               Vui long chon chuc nang: """);
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon == 1)
            {
                //1, Them phuong tien vao danh sach
                System.out.println("Nhap ma phuong tien: "); String maphuongtien = sc.nextLine();
                System.out.println("Nhap ten phuong tien: "); String tenphuongtien = sc.nextLine();
                System.out.println("Nhap bien so: "); String bso = sc.nextLine();
                System.out.println("Nhap tong so cho: "); long tongcho = sc.nextLong();
                System.out.println("Nhap so cho con du: "); long sochodu = sc.nextLong();
                sc.nextLine();
                PhuongTien pt = new PhuongTien(maphuongtien, tenphuongtien, bso, tongcho,sochodu);
                dspt.themPhuongTien(pt);
                
            }else if(luaChon == 2)
            {
                //2. In danh sach ra man hinh
                dspt.inDanhSachPhuongTien();
                
            }else if(luaChon == 3)
            {
                //3. Kiem tra danh sach phuong tien co rong hay khong
                System.out.println("Danh sach rong: "+dspt.kiemTraDanhSachRong());
                
            }else if(luaChon == 4)
            {
                //4. Lay ra so luong phuong tien trong danh sach
                System.out.println("So luong hien tai: "+dspt.laySoLuongPhuongTien());
            }else if(luaChon == 5)
            {
                //5. Lam rong danh sach phuong tien
                dspt.lamRongDanhSach();
                
            }else if(luaChon == 6)
            {
                //6. Kiem tra phuong tien co ton tai trong danh sach hay khong, dua tren ma phuong tien
                System.out.println("Nhap ma phuong tien: ");  String maphuongtien = sc.nextLine();
                PhuongTien pt = new PhuongTien(maphuongtien);
                System.out.println("Kiem tra phuong tien co trong danh sach: "+dspt.kiemTraTonTai(pt));
                
            }else if(luaChon == 7)
            {
                //7.  Xoa mot phuong tien ra khoi danh sach dua tren ma phuong tien
                System.out.println("Nhap ma phuong tien: ");  String maphuongtien= sc.nextLine();
                PhuongTien pt = new PhuongTien(maphuongtien);
                System.out.println("Xoa phuong tien trong danh sach: "+dspt.xoaPhuongTien(pt));
            }else if(luaChon == 8)
            {
                //8. Tim kiem tat ca phuong tien dua tren Ma phuong tien duoc nhap tu ban phim
                System.out.println("Nhap ma phuong tien: "); String maphuongtien = sc.nextLine();
                System.out.println("Ket qua tim kiem: ");
                dspt.timPhuongTien(maphuongtien);
            } 
            
        } while (luaChon != 0);
    }
}
