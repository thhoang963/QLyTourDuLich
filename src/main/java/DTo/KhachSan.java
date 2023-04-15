package DTo;

import java.util.Objects;
import java.util.Scanner;

public class KhachSan {
    private String maks;
    private String tenks;
    private int tienks;
    private String sdt;

    public KhachSan(String maks, String tenks, int tienks, String sdt) {
        this.maks = maks;
        this.tenks = tenks;
        this.tienks = tienks;
        this.sdt = sdt;
    }

    public String getMaks() {
        return maks;
    }

    public void setMaks(String maks) {
        this.maks = maks;
    }

    public String getTenks() {
        return tenks;
    }

    public void setTenks(String tenks) {
        this.tenks = tenks;
    }

    public int getTienks() {
        return tienks;
    }

    public void setTienks(int tienks) {
        this.tienks = tienks;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "KhachSan{" + "maks=" + maks + ", tenks=" + tenks + ", tienks=" + tienks + ", sdt=" + sdt + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.maks);
        hash = 29 * hash + Objects.hashCode(this.tenks);
        hash = 29 * hash + this.tienks;
        hash = 29 * hash + Objects.hashCode(this.sdt);
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
        final KhachSan other = (KhachSan) obj;
        if (this.tienks != other.tienks) {
            return false;
        }
        if (!Objects.equals(this.maks, other.maks)) {
            return false;
        }
        if (!Objects.equals(this.tenks, other.tenks)) {
            return false;
        }
        return Objects.equals(this.sdt, other.sdt);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khach san: ");
        maks = sc.nextLine();
        System.out.println("Nhap ten khach san: ");
        tenks = sc.nextLine();
        System.out.println("Nhap gia tien: ");
        tienks = sc.nextInt();
        sc.nextLine(); // bỏ qua kí tự '\n'
        System.out.println("Nhap so dien thoai: ");
        sdt = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ma khach san: " + maks);
        System.out.println("Ten khach san: " + tenks);
        System.out.println("Gia tien: " + tienks);
        System.out.println("So dien thoai: " + sdt);
    }
}