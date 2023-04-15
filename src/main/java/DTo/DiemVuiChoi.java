package DTo;

import java.util.Objects;
import java.util.Scanner;


public class DiemVuiChoi {
    private String maddvc;
    private String tenddvc;
    private String cacdiadiemthuoctour;

    public DiemVuiChoi(String maddvc, String tenddvc, String cacdiadiemthuoctour) {
        this.maddvc = maddvc;
        this.tenddvc = tenddvc;
        this.cacdiadiemthuoctour = cacdiadiemthuoctour;
    }

    DiemVuiChoi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMaddvc() {
        return maddvc;
    }

    public void setMaddvc(String maddvc) {
        this.maddvc = maddvc;
    }

    public String getTenddvc() {
        return tenddvc;
    }

    public void setTenddvc(String tenddvc) {
        this.tenddvc = tenddvc;
    }

    public String getCacdiadiemthuoctour() {
        return cacdiadiemthuoctour;
    }

    public void setCacdiadiemthuoctour(String cacdiadiemthuoctour) {
        this.cacdiadiemthuoctour = cacdiadiemthuoctour;
    }

    @Override
    public String toString() {
        return "DiemVuiChoi{" + "maddvc=" + maddvc + ", tenddvc=" + tenddvc + ", cacdiadiemthuoctour=" + cacdiadiemthuoctour + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.maddvc);
        hash = 89 * hash + Objects.hashCode(this.tenddvc);
        hash = 89 * hash + Objects.hashCode(this.cacdiadiemthuoctour);
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
        final DiemVuiChoi other = (DiemVuiChoi) obj;
        if (!Objects.equals(this.maddvc, other.maddvc)) {
            return false;
        }
        if (!Objects.equals(this.tenddvc, other.tenddvc)) {
            return false;
        }
        return Objects.equals(this.cacdiadiemthuoctour, other.cacdiadiemthuoctour);
    }
    
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap dia diem vui choi: ");
        maddvc = sc.nextLine();
        System.out.println("Ten dia diem vui choi: ");
        tenddvc = sc.nextLine();
        System.out.println("Cac dia diem thuoc tour: ");
        cacdiadiemthuoctour = sc.nextLine(); 
    }

    void xuat() {
        System.out.println("Dia diem vui choi la: "+this.maddvc);
        System.out.println("Ten dia diem vui choi: "+this.tenddvc);
        System.out.println("Thuoc dia diem tour: "+this.cacdiadiemthuoctour);
    }
}
    
    

