package DTo;

import KetnoiSQL_DAL.config;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModuleXuLy {
    config setup = new config();
    public boolean login(String matk, String matkhau,int manv, String loaitk) throws SQLException
    {
        ArrayList<Account> danhSachTaiKhoan = setup.layDL_TK();
        Account input = new Account(matk,matkhau,manv,loaitk);
        for (int i = 0; i < danhSachTaiKhoan.size(); i++) {
            if (danhSachTaiKhoan.get(i).equals(input)== true) {
                return true;
        }
    }
        return false;
}
}
