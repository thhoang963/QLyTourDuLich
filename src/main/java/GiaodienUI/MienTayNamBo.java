package GiaodienUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.*;
public class MienTayNamBo extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField_3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MienTayNamBo frame = new MienTayNamBo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MienTayNamBo() {
		super("Tour Miền Tây Nam Bộ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1047, 763);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		getContentPane().setBackground(new Color(240, 240, 240));
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("ĐIỂM ĐI");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(31, 96, 85, 28);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ĐIỂM ĐẾN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(31, 151, 85, 28);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SỐ NGÀY");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(31, 204, 85, 28);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NGÀY ĐI");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(31, 257, 85, 28);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("SỐ NGƯỜI");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(31, 311, 85, 28);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("DÒNG TOUR");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(31, 369, 85, 28);
		getContentPane().add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(163, 259, 353, 28);
		getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("Gửi");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(286, 656, 98, 21);
		getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox(new Object[]{});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Du Lịch", "Tour trọn gói", "Tour gia đình"}));
		comboBox.setBounds(163, 37, 353, 28);
		getContentPane().add(comboBox);
		
		JLabel lblNewLabel_8 = new JLabel("LOẠI HÌNH TOUR");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(31, 37, 122, 28);
		getContentPane().add(lblNewLabel_8);
		
		JComboBox comboBox_1 = new JComboBox(new Object[]{});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"TP.HỒ CHÍ MINH", "NHA TRANG", "CẦN THƠ","BUÔN MÊ THUẬT", "VINH", "RẠCH GIÁ","--Tất Cả--"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox_1.setBounds(163, 96, 353, 28);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox(new Object[]{});
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"CẦN THƠ", "LONG AN", "TIỀN GIANG","BẾN TRE", "VĨNH LONG", "TRA VINH","--Tất Cả--"}));
		comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox_1_1.setBounds(163, 151, 353, 28);
		contentPane.add(comboBox_1_1);
		ButtonGroup gr = new ButtonGroup();
		ButtonGroup gr1 = new ButtonGroup();
		ButtonGroup gr2 = new ButtonGroup();
		ButtonGroup gr3 = new ButtonGroup();
		ButtonGroup gr4 = new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("1 người");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_3.setBounds(163, 316, 103, 21);
		//contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("2-5 người");
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_4.setBounds(298, 316, 103, 21);
	//	contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("6-9 người");
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_5.setBounds(428, 316, 103, 21);
	//	contentPane.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("3-5 ngày");
		rdbtnNewRadioButton_1.setBounds(298, 207, 71, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("5+ ngày ");
		rdbtnNewRadioButton_2.setBounds(428, 207, 75, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1-3 ngày");
		rdbtnNewRadioButton.setBounds(163, 207, 71, 23);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		gr.add(rdbtnNewRadioButton);
		gr.add(rdbtnNewRadioButton_2);
		gr.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("1 người");
		rdbtnNewRadioButton_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_6.setBounds(163, 316, 103, 21);
		contentPane.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("2-5 người ");
		rdbtnNewRadioButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_7.setBounds(298, 316, 103, 21);
		contentPane.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("5+ người");
		rdbtnNewRadioButton_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_8.setBounds(428, 316, 103, 21);
		contentPane.add(rdbtnNewRadioButton_8);
		gr1.add(rdbtnNewRadioButton_6);
		gr1.add(rdbtnNewRadioButton_7);
		gr1.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_6_1 = new JRadioButton("CAO CẤP");
		rdbtnNewRadioButton_6_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_6_1.setBounds(163, 374, 103, 21);
		contentPane.add(rdbtnNewRadioButton_6_1);
		
		JRadioButton rdbtnNewRadioButton_6_2 = new JRadioButton("TIÊU CHUẨN");
		rdbtnNewRadioButton_6_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_6_2.setBounds(298, 374, 103, 21);
		contentPane.add(rdbtnNewRadioButton_6_2);
		
		JRadioButton rdbtnNewRadioButton_6_3 = new JRadioButton("GIÁ TỐT");
		rdbtnNewRadioButton_6_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_6_3.setBounds(428, 374, 103, 21);
		contentPane.add(rdbtnNewRadioButton_6_3);
		gr2.add(rdbtnNewRadioButton_6_1);
		gr2.add(rdbtnNewRadioButton_6_2);
		gr2.add(rdbtnNewRadioButton_6_3);
		
		JLabel lblNewLabel_5_1 = new JLabel("VẬN CHUYỂN");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(31, 437, 85, 28);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("TÌNH TRẠNG");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5_2.setBounds(31, 500, 85, 28);
		contentPane.add(lblNewLabel_5_2);
		
		JRadioButton rdbtnNewRadioButton_7_1 = new JRadioButton("MÁY BAY");
		rdbtnNewRadioButton_7_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_7_1.setBounds(163, 442, 103, 21);
		contentPane.add(rdbtnNewRadioButton_7_1);
		
		JRadioButton rdbtnNewRadioButton_7_2 = new JRadioButton("Ô TÔ");
		rdbtnNewRadioButton_7_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_7_2.setBounds(298, 442, 103, 21);
		contentPane.add(rdbtnNewRadioButton_7_2);
		gr3.add(rdbtnNewRadioButton_7_1);
		gr3.add(rdbtnNewRadioButton_7_2);
		
		JRadioButton rdbtnNewRadioButton_8_1 = new JRadioButton("KHUYỄN MÃI");
		rdbtnNewRadioButton_8_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_8_1.setBounds(163, 505, 103, 21);
		contentPane.add(rdbtnNewRadioButton_8_1);
		
		JRadioButton rdbtnNewRadioButton_8_2 = new JRadioButton("CÒN CÓ");
		rdbtnNewRadioButton_8_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton_8_2.setBounds(298, 504, 103, 21);
		contentPane.add(rdbtnNewRadioButton_8_2);
		gr4.add(rdbtnNewRadioButton_8_1);
		gr4.add(rdbtnNewRadioButton_8_2);
	
	}
}
