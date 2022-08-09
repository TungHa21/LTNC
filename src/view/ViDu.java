package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ViDu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private final ButtonGroup LevelUser = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViDu frame = new ViDu();
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
	public ViDu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LoginStatusLabel = new JLabel("");
		LoginStatusLabel.setForeground(new Color(255, 0, 0));
		LoginStatusLabel.setBounds(119, 227, 275, 13);
		contentPane.add(LoginStatusLabel);
		
		JButton btnNewButton = new JButton("Đăng nhập");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tkhoan = textField.getText();
				String mkhau = String.valueOf(passwordField.getPassword());
				
				//check với database để xác nhận đăng nhập
				if(tkhoan.equals("123") && mkhau.equals("123")) {
					ViDu frameDangnhap = new ViDu();
					KhuPho1 frameKhuPho = new KhuPho1(); 
					frameKhuPho.setVisible(true);
					frameDangnhap.setVisible(false);
					dispose();
				}
				else {
					LoginStatusLabel.setText("Đăng nhập thất bại, vui lòng nhập lại!");
				}
			}
		});
		btnNewButton.setBounds(150, 198, 133, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Tài khoản");
		lblNewLabel.setBounds(64, 50, 87, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setBounds(64, 96, 87, 31);
		contentPane.add(lblMtKhu);
		
		textField = new JTextField();
		textField.setBounds(134, 56, 197, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Quản trị ");
		LevelUser.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(103, 148, 93, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNgiDng = new JCheckBox("Người dùng");
		LevelUser.add(chckbxNgiDng);
		chckbxNgiDng.setBounds(258, 148, 138, 21);
		contentPane.add(chckbxNgiDng);
		
		JLabel lblNewLabel_1 = new JLabel("Phần mềm quản lý khu phố - Tác giả: Hà Thanh Tùng");
		lblNewLabel_1.setBounds(97, 10, 297, 13);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(134, 102, 197, 19);
		contentPane.add(passwordField);
		
	}
}
