package com.mycompany.qlytourdulich;

import java.util.Objects;
import java.util.Scanner;


public class PhuongTien {
    private String mapt;
    private String loaipt;
    private String bienso;
    private long tongsocho;
    private long sochocondu;

    public PhuongTien(String mapt, String loaipt, String bienso, long tongsocho, long sochocondu) {
        this.mapt = mapt;
        this.loaipt = loaipt;
        this.bienso = bienso;
        this.tongsocho = tongsocho;
        this.sochocondu = sochocondu;
    }

    public String getMapt() {
        return mapt;
    }

    public void setMapt(String mapt) {
        this.mapt = mapt;
    }

    public String getLoaipt() {
        return loaipt;
    }

    public void setLoaipt(String loaipt) {
        this.loaipt = loaipt;
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public long getTongsocho() {
        return tongsocho;
    }

    public void setTongsocho(long tongsocho) {
        this.tongsocho = tongsocho;
    }

    public long getSochocondu() {
        return sochocondu;
    }

    public void setSochocondu(long sochocondu) {
        this.sochocondu = sochocondu;
    }

    @Override
    public String toString() {
        return "PhuongTien{" + "mapt=" + mapt + ", loaipt=" + loaipt + ", bienso=" + bienso + ", tongsocho=" + tongsocho + ", sochocondu=" + sochocondu + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.mapt);
        hash = 29 * hash + Objects.hashCode(this.loaipt);
        hash = 29 * hash + Objects.hashCode(this.bienso);
        hash = 29 * hash + (int) (this.tongsocho ^ (this.tongsocho >>> 32));
        hash = 29 * hash + (int) (this.sochocondu ^ (this.sochocondu >>> 32));
        return hash;
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
        final PhuongTien other = (PhuongTien) obj;
        if (this.tongsocho != other.tongsocho) {
            return false;
        }
        if (this.sochocondu != other.sochocondu) {
            return false;
        }
        if (!Objects.equals(this.mapt, other.mapt)) {
            return false;
        }
        if (!Objects.equals(this.loaipt, other.loaipt)) {
            return false;
        }
        return Objects.equals(this.bienso, other.bienso);
    }
    
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phuong tien: ");
        mapt = sc.nextLine();
        System.out.println("Nhap ten phuong tien: ");
        loaipt= sc.nextLine();
        System.out.println("Nhap bien so: ");
        bienso = sc.nextLine();
        System.out.println("Nhap tong so cho: ");
        tongsocho = sc.nextLong();
        System.out.println("Nhap so cho con du: ");
        sochocondu = sc.nextLong();       
    }
    
    public void xuat()
    {
        System.out.println("Ma phuong tien la: "+this.mapt);
        System.out.println("Ten phuong tien la: "+this.loaipt);
        System.out.println("Bien so la: "+this.bienso);
        System.out.println("Tong so cho la: "+this.tongsocho);
        System.out.println("So cho con du la: "+this.sochocondu);
    }
}    
    

