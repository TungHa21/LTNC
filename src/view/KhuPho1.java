package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Scrollbar;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import java.awt.Font;

public class KhuPho1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KhuPho1 frame = new KhuPho1();
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
	public KhuPho1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 364);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Navigate");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Thêm khu phố       Alt+C   ");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mntmNewMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				KhuPho1 frameKhuPho1 = new KhuPho1();
				ThemKhuPho frameThemKhuPho = new ThemKhuPho(); 
				frameThemKhuPho.setVisible(true);
				frameKhuPho1.setVisible(false);				
				dispose();
				
			}			
			
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Admin");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Tung          Shift+T");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KhuPho1 frameKhuPho1 = new KhuPho1();
				HoSo2 frameHoSo2 = new HoSo2(); 
				frameHoSo2.setVisible(true);
				frameKhuPho1.setVisible(false);
				dispose();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_1_1 = new JMenuItem("Tuan          Shift+N");
		mntmNewMenuItem_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mntmNewMenuItem_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KhuPho1 frameKhuPho1 = new KhuPho1();
				HoSo3 frameHoSo3 = new HoSo3(); 
				frameHoSo3.setVisible(true);
				frameKhuPho1.setVisible(false);
				dispose();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1_1);
		
		JMenuItem mntmNewMenuItem_1_2 = new JMenuItem("Minh          Shift+M");
		mntmNewMenuItem_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mntmNewMenuItem_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KhuPho1 frameKhuPho1 = new KhuPho1();
				HoSo1 frameHoSo1 = new HoSo1(); 
				frameHoSo1.setVisible(true);
				frameKhuPho1.setVisible(false);
				dispose();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1_2);
		
		JMenu mnNewMenu_2 = new JMenu("Exit");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Thoát          Shift+X");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KhuPho1 frameKhuPho1 = new KhuPho1(); 
				ViDu frameDangNhap = new ViDu();
				frameDangNhap.setVisible(true);
				frameKhuPho1.setVisible(false);								
				dispose();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Thêm khu phố");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KhuPho1 frameKhuPho1 = new KhuPho1();
				ThemKhuPho frameThemKhuPho = new ThemKhuPho(); 
				frameThemKhuPho.setVisible(true);
				frameKhuPho1.setVisible(false);				
				dispose();
			}
		});
		btnNewButton.setBounds(20, 37, 154, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Nhập mã khu phố để xem, sửa hoặc xóa");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(10, 14, 231, 13);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(280, 11, 231, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Sửa");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThemKhuPho frameSuaKhuPho = new ThemKhuPho();
				KhuPho1 frameKhuPho1 = new KhuPho1(); 
				frameSuaKhuPho.setVisible(true);
				frameKhuPho1.setVisible(false);				
				dispose();
			}
		});
		btnNewButton_1.setBounds(618, 14, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Xem");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(618, 58, 85, 21);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Xóa");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1_2.setBounds(739, 14, 85, 21);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Làm mới");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1_3.setBounds(739, 58, 85, 21);
		contentPane.add(btnNewButton_1_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 96, 803, 188);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
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

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
