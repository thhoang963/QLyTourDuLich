package DTo;

import DTo.TaiKhoan;
import GiaodienUI.Menu;
import GiaodienUI.index;
import GiaodienUI.login;
import KetnoiSQL_DAL.config;
import java.awt.Frame;
import java.awt.PopupMenu;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.management.MBeanAttributeInfo;
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
    public void chuyenFrame(JFrame mot,int flat)
    {
        JFrame main = new Menu();
        
        if (flat == 1) {
            JPanel id = new index();
            main.add(id);
        }
        mot.setVisible(false);
        main.setVisible(true);    
        
        
    }
    public void chuyenFrameMenu(JFrame index,int flat)
    {
        index.removeAll();
        if (flat == 1) {
            JPanel id = new index();
            
            index.add(id);
        }
        index.setVisible(true);    
        
        
    }
    
    public void mainFrame(JLabel F1, JLabel F2){
        JFrame main = new JFrame();
        main.add(F1);
        main.add(F2);
        main.setVisible(true);
    }
}

