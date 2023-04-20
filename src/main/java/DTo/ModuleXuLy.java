package DTo;

import DTo.TaiKhoan;
import GiaodienUI.Menu;
import KetnoiSQL_DAL.config;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    public void chuyenFrame(JFrame mot,JLabel hai)
    {
        mot.setVisible(false);
        Frame frame = new Frame();
        Menu mn = new Menu();
        JLabel jb = new JLabel();
        jb.add(mn);
        mainFrame(jb,hai);
        
    }
    
    public void mainFrame(JLabel F1, JLabel F2){
        JFrame main = new JFrame();
        main.add(F1);
        main.add(F2);
        main.setVisible(true);
    }
    
}

