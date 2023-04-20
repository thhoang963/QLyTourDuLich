/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KetnoiSQL_DAL;


import DTo.TaiKhoan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class config {

    private final String url = "jdbc:mysql://localhost:3306/qltour?useUnicode=yes&characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true";
    private final String user = "root";
    private final String password = "";

    public void CheckConnect() {
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Thành công");
            System.out.println(con.getCatalog());
        } catch (SQLException ex) {
            Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<TaiKhoan> layDL_TK() throws SQLException {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con = DriverManager.getConnection(url, user, password);

        // Thực hiện truy vấn và lấy kết quả
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM taikhoan");
        
        ArrayList<TaiKhoan> danhSachTaiKhoan = new ArrayList<>();
        
        while (rs.next()) {            
            TaiKhoan taikhoan = new TaiKhoan();
            taikhoan.setMatk(rs.getString("tentaikhoan"));
            taikhoan.setMatkhau(rs.getString("matkhau"));
            taikhoan.setManv(rs.getInt("manv"));
            taikhoan.setQuyentruycap(rs.getString("loaitk"));
            danhSachTaiKhoan.add(taikhoan);
        }
        return danhSachTaiKhoan;
    }
   
}
