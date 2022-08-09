package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HoSo2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HoSo2 frame = new HoSo2();
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
	public HoSo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hà Thanh Tùng");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(23, 23, 292, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sinh viên");
		lblNewLabel_1.setBounds(23, 58, 84, 26);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Thoát");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HoSo2 frameHoSo2 = new HoSo2();
				KhuPho1 frameKhuPho1 = new KhuPho1(); 
				frameKhuPho1.setVisible(true);
				frameHoSo2.setVisible(false);				
				dispose();
			}
		});
		btnNewButton.setBounds(268, 47, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Công việc: Xây dựng chức năng quản lý cá nhân");
		lblNewLabel_2.setBounds(23, 114, 403, 13);
		contentPane.add(lblNewLabel_2);
	}
}
