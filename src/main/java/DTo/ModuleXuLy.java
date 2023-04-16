package DTo;

import DTo.TaiKhoan;
import KetnoiSQL_DAL.config;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ModuleXuLy {


    config setup = new config();
    public  boolean login(String matk, String matkhau) throws SQLException
    {
        ArrayList<TaiKhoan> danhSachTaiKhoan = setup.layDL_TK();
        TaiKhoan input = new TaiKhoan(matk,matkhau);
        for (int i = 0; i < danhSachTaiKhoan.size(); i++) {
            if (danhSachTaiKhoan.get(i).getMatk().equals(input.getMatk())==true) {
                if(danhSachTaiKhoan.get(i).getMatkhau().equals(input.getMatkhau())==true){
                    return true;
                }
                
        }
    }
        return false;
    }
    public void chuyenFrame(JFrame mot,JFrame hai)
    {
        mot.setVisible(false);
        hai.setVisible(true);
    }
    
}

