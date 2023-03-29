
import java.util.Date;
import java.util.Scanner;

public class Ve {
    public String mave;
    public Date ngaytaove;
    public Date hansudung;
    public long giavegiamgia;
    
    public Ve(Ve x)
    {
        
    }

    public Ve(String mave, Date ngaytaove, Date hansudung, long giavegiamgia) {
        this.mave = mave;
        this.ngaytaove = ngaytaove;
        this.hansudung = hansudung;
        this.giavegiamgia = giavegiamgia;
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

    @Override
    public String toString() {
        return "Ve{" + "mave=" + mave + ", ngaytaove=" + ngaytaove + ", hansudung=" + hansudung + ", giavegiamgia=" + giavegiamgia + '}';
    }
    
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ma ve: ");
        mave = sc.nextLine();
        Date date1 = new Date();
        System.out.println("Nhap ngay tao ve: "+date1);
        Date date2 = new Date();
        System.out.println("Nhap han su dung: "+date2);
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
