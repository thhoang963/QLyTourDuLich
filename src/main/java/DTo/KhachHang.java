package DTo;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class KhachHang implements Comparable<KhachHang>{
    private String makh;
    private String tenkh;
    private String diachi;
    private long sdt;
    private String email;
    
 

    public KhachHang(KhachHang x)
    {
        makh = x.makh;
        tenkh = x.tenkh;
        diachi = x.diachi;
        sdt = x.sdt;
    }

    public KhachHang(String makh, String tenkh, String diachi, long sdt, String email) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
    }

    KhachHang(String maKhachHang) {
            this.makh= maKhachHang;
    }

    

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public long getSdt() {
        return sdt;
    }

    public void setSdt(long sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "makh=" + makh + ", tenkh=" + tenkh + ", diachi=" + diachi + ", sdt=" + sdt + ", email=" + email + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(makh,tenkh,diachi,sdt,email);
    }
    
    @Override
    public int compareTo(KhachHang o) {
        return this.makh.compareTo(o.makh);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        KhachHang other = (KhachHang) obj;
        return Objects.equals(makh, other.makh);
    }
    
    
    
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khach hang: ");
        makh = sc.nextLine();
        System.out.println("Nhap ten khach hang: ");
        tenkh= sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diachi = sc.nextLine();
        System.out.println("Nhap SDT: ");
        sdt = sc.nextLong();
        System.out.println("Nhap email: ");
        email = sc.nextLine();       
    }
    
    public void xuat()
    {
        System.out.println("Ma khach hang la: "+this.makh);
        System.out.println("Ten khach hang la: "+this.makh);
        System.out.println("Dia chi la: "+this.makh);
        System.out.println("So dien thoai la: "+this.makh);
        System.out.println("Email la: "+this.makh);
    }
    
    private ArrayList<KhachHang>danhSach;

    public KhachHang()
    {
        this.danhSach = new ArrayList<KhachHang>(); //cach khai bao 1 arrayList
    }
    
    public KhachHang(ArrayList<KhachHang> danhSach) {
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
