package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class ThemKhuPho extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemKhuPho frame = new ThemKhuPho();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ThemKhuPho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));	

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã khu phố");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(10, 10, 100, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tên khu phố");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(10, 33, 100, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mã hộ dân");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2.setBounds(20, 56, 90, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Số nhà");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setBounds(20, 79, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mã người");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4.setBounds(30, 102, 80, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Họ và tên");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_5.setBounds(30, 125, 80, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblTui = new JLabel("Tuổi");
		lblTui.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTui.setBounds(30, 149, 80, 13);
		contentPane.add(lblTui);
		
		JLabel lblNmSinh = new JLabel("Năm sinh");
		lblNmSinh.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNmSinh.setBounds(30, 172, 80, 13);
		contentPane.add(lblNmSinh);
		
		JLabel lblNghNghip = new JLabel("Nghề nghiệp");
		lblNghNghip.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNghNghip.setBounds(30, 195, 80, 13);
		contentPane.add(lblNghNghip);
		
		textField = new JTextField();
		textField.setBounds(94, 7, 119, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(94, 33, 119, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(94, 56, 119, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(94, 79, 119, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(94, 99, 119, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(94, 122, 119, 19);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(94, 146, 119, 19);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(94, 169, 119, 19);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(94, 192, 119, 19);
		contentPane.add(textField_8);
		
		JButton btnNewButton = new JButton("Tiếp tục nhập thành viên ");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(63, 219, 187, 21);
		contentPane.add(btnNewButton);
		
		JButton btnTipTcNhp = new JButton("Tiếp tục nhập hộ dân ");
		btnTipTcNhp.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnTipTcNhp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTipTcNhp.setBounds(100, 254, 187, 21);
		contentPane.add(btnTipTcNhp);
		
		JButton btnHonThnhNhp = new JButton("Hoàn thành nhập khu phố");
		btnHonThnhNhp.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnHonThnhNhp.setBounds(10, 301, 187, 21);
		contentPane.add(btnHonThnhNhp);
		
		JButton btnThot = new JButton("Thoát");
		btnThot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KhuPho1 frameKhuPho1 = new KhuPho1();
				ThemKhuPho frameThemKhuPho = new ThemKhuPho(); 
				frameThemKhuPho.setVisible(false);
				frameKhuPho1.setVisible(true);				
				dispose();
			}
		});
		btnThot.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnThot.setBounds(213, 301, 74, 21);
		contentPane.add(btnThot);
		
		JLabel lblNewLabel_6 = new JLabel("Thông tin vừa nhập");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(349, 10, 169, 13);
		contentPane.add(lblNewLabel_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(349, 44, 281, 271);
		contentPane.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
	}
}
