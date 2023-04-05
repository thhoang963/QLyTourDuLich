package com.mycompany.qlytourdulich;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ve {
    public String mave;
    public Date ngaytaove;
    public Date hansudung;
    public long giavegiamgia;
    public int gio;

    public Ve(Ve x) {
        mave = x.mave;
        ngaytaove = x.ngaytaove;
        hansudung = x.hansudung;
        giavegiamgia = x.giavegiamgia;
        gio = x.gio;
    }

    public Ve(String mave, Date ngaytaove, Date hansudung, long giavegiamgia, int gio) {
        this.mave = mave;
        this.ngaytaove = ngaytaove;
        this.hansudung = hansudung;
        this.giavegiamgia = giavegiamgia;
        this.gio = gio;
    }

    public String getMave() {
        return mave;
    }

    public void setMave(String mave) {
        this.mave = mave;
    }

    public Date getNgaytaove() {
        return ngaytaove;
    }

    public void setNgaytaove(Date ngaytaove) {
        this.ngaytaove = ngaytaove;
    }

    public Date getHansudung() {
        return hansudung;
    }

    public void setHansudung(Date hansudung) {
        this.hansudung = hansudung;
    }

    public long getGiavegiamgia() {
        return giavegiamgia;
    }

    public void setGiavegiamgia(long giavegiamgia) {
        this.giavegiamgia = giavegiamgia;
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    @Override
    public String toString() {
        return "Ve{" + "mave=" + mave + ", ngaytaove=" + ngaytaove + ", hansudung=" + hansudung + ", giavegiamgia=" + giavegiamgia + ", gio=" + gio + '}';
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma ve: ");
        mave = sc.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Nhap ngay tao ve(dd/MM/yyyy): ");
        String date1Str = sc.nextLine();
        try {
            ngaytaove = format.parse(date1Str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Nhap han su dung(dd/MM/yyyy): ");
        String date2Str = sc.nextLine();
        try {
            hansudung = format.parse(date2Str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Nhap gia ve giam gia: ");
        giavegiamgia = sc.nextLong();
    }
    
    public void xuat()
    {
        System.out.println("Ma ve la: "+this.mave);
        System.out.println("Ngay tao ve la: "+this.ngaytaove);
        System.out.println("Han su dung: "+this.hansudung);
        System.out.println("Gia ve giam gia la: "+this.giavegiamgia);
   
    }
}
