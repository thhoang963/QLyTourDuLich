package com.mycompany.qlytourdulich;


import java.util.Objects;
import java.util.Scanner;

public class KhachHang implements Comparable<KhachHang>{
    private String makh;
    private String tenkh;
    private String diachi;
    private long sdt;
    private String email;
    
    public KhachHang()
    {
        
    }

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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.makh);
        hash = 41 * hash + Objects.hashCode(this.tenkh);
        hash = 41 * hash + Objects.hashCode(this.diachi);
        hash = 41 * hash + (int) (this.sdt ^ (this.sdt >>> 32));
        hash = 41 * hash + Objects.hashCode(this.email);
        return hash;
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
        final KhachHang other = (KhachHang) obj;
        if (this.sdt != other.sdt) {
            return false;
        }
        if (!Objects.equals(this.makh, other.makh)) {
            return false;
        }
        if (!Objects.equals(this.tenkh, other.tenkh)) {
            return false;
        }
        if (!Objects.equals(this.diachi, other.diachi)) {
            return false;
        }
        return Objects.equals(this.email, other.email);
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
}
