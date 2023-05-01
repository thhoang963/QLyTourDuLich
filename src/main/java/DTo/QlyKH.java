/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTo;

import GiaodienUI.QlyKhachHang;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Cong anh
 */
public class QlyKH {
    public static void main(String[] args) {
        // Sử dụng bố cục mặc định của FlowLayout
JFrame js = new JFrame();
js.setTitle("Quản lý khách hàng");
QlyKhachHang qlkh = new QlyKhachHang();
js.add(qlkh);
js.setLocation(100, 100); // đặt vị trí
js.setSize(680, 600); // đặt kích thước
js.setVisible(true);


    }
}
