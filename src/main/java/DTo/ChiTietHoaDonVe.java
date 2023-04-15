package DTo;

import java.util.Scanner;

public class ChiTietHoaDonVe {
    private int soluongve;
    private long tienve;

    public ChiTietHoaDonVe(int soluongve, long tienve) {
        this.soluongve = soluongve;
        this.tienve = tienve;
    }

    ChiTietHoaDonVe() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getSoluongve() {
        return soluongve;
    }

    public void setSoluongve(int soluongve) {
        this.soluongve = soluongve;
    }

    public long getTienve() {
        return tienve;
    }

    public void setTienve(long tienve) {
        this.tienve = tienve;
    }

    @Override
    public String toString() {
        return "ChiTietHoaDonVe{" +
                "soluongve=" + soluongve +
                ", tienve=" + tienve +
                '}';
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong ve: ");
        soluongve = sc.nextInt();
        System.out.println("Nhap tien ve: ");
        tienve = sc.nextLong();
    }

    public void xuat() {
        System.out.println("So luong ve: " + soluongve);
        System.out.println("Tien ve: " + tienve);
    }
}