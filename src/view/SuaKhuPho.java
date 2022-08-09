package view;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JDialog;
import javax.swing.JScrollBar;

public class SuaKhuPho extends JFrame {

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
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuaKhuPho frame = new SuaKhuPho();
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
	public SuaKhuPho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sửa Khu Phố");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(313, 10, 73, 13);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Lưu");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
		        JOptionPane.showMessageDialog(frame,
		                "Sửa khu phố thành công",
		                "Thông báp",
		                JOptionPane.ERROR_MESSAGE);
			}
		});
		btnNewButton.setBounds(507, 10, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KhuPho1 frameKhuPho1 = new KhuPho1();
				SuaKhuPho frameSuaKhuPho = new SuaKhuPho(); 
				frameSuaKhuPho.setVisible(false);
				frameKhuPho1.setVisible(true);				
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(642, 10, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Mã khu phố");
		lblNewLabel_1.setBounds(33, 54, 95, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên khu phố");
		lblNewLabel_1_1.setBounds(33, 79, 95, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mã hộ dân");
		lblNewLabel_1_2.setBounds(53, 107, 95, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Số nhà");
		lblNewLabel_1_3.setBounds(53, 130, 95, 13);
		contentPane.add(lblNewLabel_1_3);
		
		textField = new JTextField();
		textField.setBounds(122, 51, 149, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(122, 77, 149, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(122, 102, 149, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(122, 127, 149, 36);
		contentPane.add(textField_3);
		
		JButton btnNewButton_2 = new JButton("Lưu");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(132, 173, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Hộ dân trước");
		btnNewButton_2_1.setBounds(10, 218, 118, 21);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Hộ dân sau");
		btnNewButton_2_2.setBounds(153, 218, 118, 21);
		contentPane.add(btnNewButton_2_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(552, 105, 149, 19);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Tuổi");
		lblNewLabel_1_2_1.setBounds(463, 108, 95, 13);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Họ và tên");
		lblNewLabel_1_1_1.setBounds(463, 82, 95, 13);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(552, 80, 149, 19);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(552, 54, 149, 19);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_1_4 = new JLabel("Mã người");
		lblNewLabel_1_4.setBounds(463, 57, 95, 13);
		contentPane.add(lblNewLabel_1_4);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(552, 155, 149, 19);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Tuổi");
		lblNewLabel_1_2_1_1.setBounds(463, 158, 95, 13);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Năm sinh");
		lblNewLabel_1_1_1_1.setBounds(463, 132, 95, 13);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(552, 130, 149, 19);
		contentPane.add(textField_8);
		
		JButton btnNewButton_2_3 = new JButton("Lưu");
		btnNewButton_2_3.setBounds(621, 183, 85, 21);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_1_1 = new JButton("Thành viên trước");
		btnNewButton_2_1_1.setBounds(466, 218, 118, 21);
		contentPane.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_2_1 = new JButton("Thành viên sau");
		btnNewButton_2_2_1.setBounds(609, 218, 118, 21);
		contentPane.add(btnNewButton_2_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 256, 722, 178);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);	
		loaddata();
		loaddata();
		
	}
	private void loaddata() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Mã người");
		model.addColumn("Họ và tên");
		model.addColumn("Tuổi");
		model.addColumn("Năm sinh");
		model.addColumn("Nghề nghiệp");
		
		model.addRow(new Object[] {"NG02", "Nguyễn Thị Thanh Quỳnh", 20, 2000, "Kỹ sư"});
		model.addRow(new Object[] {"NG06", "Nguyễn Thị Thúy Hiền", 17, 2003, "Học sinh"});
		model.addRow(new Object[] {"NG07", "Nguyễn Hải Yến", 21, 2000, "Kỹ sư"});
		
		table.setModel(model);
	}
	
}
