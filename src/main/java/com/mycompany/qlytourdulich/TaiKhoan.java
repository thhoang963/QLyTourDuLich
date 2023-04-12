package com.mycompany.qlytourdulich;

import java.util.ArrayList;


public class TaiKhoan {
    private String matk;
    private String matkhau;
    private int manv;
    private String quyentruycap;
    
    public TaiKhoan() {
    }

    public TaiKhoan(String matk, String matkhau, int manv, String quyentruycap) {
        this.matk = matk;
        this.matkhau = matkhau;
        this.manv = manv;
        this.quyentruycap = quyentruycap;
    }

    public String getMatk() {
        return matk;
    }

    public void setMatk(String matk) {
        this.matk = matk;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public int getManv() {
        return manv;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public String getQuyentruycap() {
        return quyentruycap;
    }

    public void setQuyentruycap(String quyentruycap) {
        this.quyentruycap = quyentruycap;
    }



    @Override
    public String toString() {
        return "TaiKhoan{" + "quyentruycap=" + quyentruycap + '}';
    }

    
        
}
