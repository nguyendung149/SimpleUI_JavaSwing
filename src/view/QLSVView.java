package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import model.ThiSinh;
import model.Tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import control.QLSVControler;

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class QLSVView extends JFrame {
	public QLSVModel model;
	public JPanel contentPane;
	public JTextField jTextField_maSinhVien;
	public JTable table;
	public JTextField textField_hoTen;
	public JTextField textField_maThiSinh;
	public JTextField textField_ngaySinh;
	public JTextField textField_mon1;
	public JTextField textField_mon2;
	public JTextField textField_mon3;
	public JComboBox comboBox_queQuan_1;
	public JRadioButton rdbtnNu;
	public JRadioButton rdbtnNam;
	public ButtonGroup btn_group;
	public static int count = 0;
	ArrayList<Tinh> listTinh = Tinh.getDSTinh();

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public QLSVView() {

		this.model = new QLSVModel();
		ActionListener ac = new QLSVControler(this);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 774);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu jMenu_File = new JMenu("File");
		jMenu_File.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(jMenu_File);

		JMenuItem jMenuItem_Open = new JMenuItem("Open");
		jMenuItem_Open.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jMenu_File.add(jMenuItem_Open);

		JSeparator separator = new JSeparator();
		jMenu_File.add(separator);

		JMenuItem jMenuItem_Close = new JMenuItem("Close");
		jMenuItem_Close.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jMenu_File.add(jMenuItem_Close);

		JSeparator separator_1 = new JSeparator();
		jMenu_File.add(separator_1);

		JMenuItem jMenuItem_Exit = new JMenuItem("Exit");
		jMenuItem_Exit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jMenu_File.add(jMenuItem_Exit);

		JMenu jMenu_About = new JMenu("About");
		jMenu_About.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(jMenu_About);

		JMenuItem jMenuItem_AboutMe = new JMenuItem("About Me");
		jMenuItem_AboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jMenu_About.add(jMenuItem_AboutMe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel jLabel_queQuan = new JLabel("Quê Quán");
		jLabel_queQuan.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_queQuan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_queQuan.setBounds(30, 22, 93, 45);
		contentPane.add(jLabel_queQuan);

		jTextField_maSinhVien = new JTextField();
		jTextField_maSinhVien.setBounds(520, 24, 199, 47);
		contentPane.add(jTextField_maSinhVien);
		jTextField_maSinhVien.setColumns(10);

		JLabel jLabel_maSinhVien = new JLabel("Mã Sinh Viên");
		jLabel_maSinhVien.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_maSinhVien.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_maSinhVien.setBounds(375, 22, 135, 49);
		contentPane.add(jLabel_maSinhVien);

		JButton btn_tim = new JButton("Tìm");
		btn_tim.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_tim.setBounds(761, 22, 105, 49);
		contentPane.add(btn_tim);

		JComboBox comboBox_queQuan = new JComboBox();
		comboBox_queQuan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_queQuan.setBounds(146, 24, 219, 47);
		contentPane.add(comboBox_queQuan);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 97, 887, 2);
		contentPane.add(separator_2);

		JLabel jLabel_queQuan_1 = new JLabel("Danh sách Thí sinh");
		jLabel_queQuan_1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_queQuan_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_queQuan_1.setBounds(30, 97, 159, 45);
		contentPane.add(jLabel_queQuan_1);

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(new Object[][] { {} },
				new String[] { "M\u00E3 Th\u00ED Sinh", "H\u1ECD T\u00EAn ", "Qu\u00EA qu\u00E1n", "Ngày Sinh",
						"Gi\u00F3i t\u00EDnh", "\u0110i\u1EC3m m\u00F4n 1", "\u0110i\u1EC3m m\u00F4n 2",
						"\u0110i\u1EC3m m\u00F4n 3" }));
		table.setBounds(30, 164, 835, 241);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 147, 867, 190);
		contentPane.add(scrollPane);

		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(0, 347, 887, 2);
		contentPane.add(separator_2_1);

		JLabel jLabel_queQuan_2 = new JLabel("Thông Tin Thí Sinh");
		jLabel_queQuan_2.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_queQuan_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_queQuan_2.setBounds(30, 359, 173, 45);
		contentPane.add(jLabel_queQuan_2);

		JLabel jLabel_hoTen = new JLabel("Họ và Tên");
		jLabel_hoTen.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_hoTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_hoTen.setBounds(58, 457, 135, 49);
		contentPane.add(jLabel_hoTen);

		textField_hoTen = new JTextField();
		textField_hoTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_hoTen.setColumns(10);
		textField_hoTen.setBounds(203, 459, 199, 47);
		contentPane.add(textField_hoTen);

		JLabel jLabel_ID = new JLabel("Mã Thí Sinh");
		jLabel_ID.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_ID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_ID.setBounds(58, 404, 135, 49);
		contentPane.add(jLabel_ID);

		textField_maThiSinh = new JTextField();
		textField_maThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_maThiSinh.setColumns(10);
		textField_maThiSinh.setBounds(203, 406, 199, 47);
		contentPane.add(textField_maThiSinh);

		JLabel jLabel_que = new JLabel("Quê quán");
		jLabel_que.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_que.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_que.setBounds(58, 516, 135, 49);
		contentPane.add(jLabel_que);

		JLabel jLabel_ngaySinh = new JLabel("Ngày Sinh");
		jLabel_ngaySinh.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_ngaySinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_ngaySinh.setBounds(58, 575, 135, 49);
		contentPane.add(jLabel_ngaySinh);

		textField_ngaySinh = new JTextField();
		textField_ngaySinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_ngaySinh.setColumns(10);
		textField_ngaySinh.setBounds(203, 577, 199, 47);
		contentPane.add(textField_ngaySinh);

		comboBox_queQuan_1 = new JComboBox();
		comboBox_queQuan_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_queQuan_1.setBounds(203, 518, 199, 47);
		contentPane.add(comboBox_queQuan_1);
		comboBox_queQuan.addItem(" ");
		comboBox_queQuan_1.addItem(" ");

		for (Tinh tinh : listTinh) {
			comboBox_queQuan.addItem(tinh.getTenTinh());
			comboBox_queQuan_1.addItem(tinh.getTenTinh());

		}
		JLabel jLabel_gioiTinh = new JLabel("Giới tính");
		jLabel_gioiTinh.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_gioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_gioiTinh.setBounds(482, 404, 135, 49);
		contentPane.add(jLabel_gioiTinh);

		rdbtnNu = new JRadioButton("Nữ");
		rdbtnNu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNu.setBounds(741, 404, 103, 49);
		contentPane.add(rdbtnNu);

		rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNam.setBounds(614, 406, 103, 47);
		contentPane.add(rdbtnNam);
		btn_group = new ButtonGroup();
		btn_group.add(rdbtnNam);
		btn_group.add(rdbtnNu);
		JLabel jLabel_mon1 = new JLabel("Môn 1");
		jLabel_mon1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_mon1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_mon1.setBounds(482, 457, 135, 49);
		contentPane.add(jLabel_mon1);

		textField_mon1 = new JTextField();
		textField_mon1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_mon1.setColumns(10);
		textField_mon1.setBounds(627, 459, 199, 47);
		contentPane.add(textField_mon1);

		JLabel jLabel_mon2 = new JLabel("Môn 2");
		jLabel_mon2.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_mon2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_mon2.setBounds(482, 516, 135, 49);
		contentPane.add(jLabel_mon2);

		textField_mon2 = new JTextField();
		textField_mon2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_mon2.setColumns(10);
		textField_mon2.setBounds(627, 518, 199, 47);
		contentPane.add(textField_mon2);

		JLabel jLabel_mon3 = new JLabel("Môn 3");
		jLabel_mon3.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel_mon3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jLabel_mon3.setBounds(482, 575, 135, 49);
		contentPane.add(jLabel_mon3);

		textField_mon3 = new JTextField();
		textField_mon3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_mon3.setColumns(10);
		textField_mon3.setBounds(627, 577, 199, 47);
		contentPane.add(textField_mon3);

		JButton btnThem = new JButton("Thêm");
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThem.addActionListener(ac);
		btnThem.setBounds(83, 660, 85, 34);
		contentPane.add(btnThem);

		JButton btnXoa = new JButton("Xóa");
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnXoa.setBounds(234, 660, 85, 34);
		contentPane.add(btnXoa);
		btnXoa.addActionListener(ac);

		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCapNhat.setBounds(375, 660, 119, 34);
		contentPane.add(btnCapNhat);
		btnCapNhat.addActionListener(ac);

		JButton btnLuu = new JButton("Lưu");
		btnLuu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLuu.setBounds(561, 660, 85, 34);
		contentPane.add(btnLuu);
		btnLuu.addActionListener(ac);

		JButton btnHuyBo = new JButton("Hủy bỏ");
		btnHuyBo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHuyBo.setBounds(726, 660, 100, 34);
		contentPane.add(btnHuyBo);
		btnHuyBo.addActionListener(ac);
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setBounds(0, 648, 887, 2);
		contentPane.add(separator_2_1_1);

		this.setVisible(true);
	}

	public  ThiSinh getThiSinh() {
		int maSinhVien = Integer.valueOf(this.textField_maThiSinh.getText());
		String tenThiSinh = this.textField_hoTen.getText();
		Tinh queQuan = new Tinh(this.comboBox_queQuan_1.getSelectedIndex() + 1,
				(String) this.comboBox_queQuan_1.getSelectedItem());
		Date ngaySinh = new Date(this.textField_ngaySinh.getText());
		Enumeration<AbstractButton> ds = this.btn_group.getElements();
		String gioiTinh_text = "";
		while (ds.hasMoreElements()) {
			AbstractButton button = ds.nextElement();
			if (button.getModel().isSelected()) {
				gioiTinh_text = button.getText();
			}
		}
		boolean gioiTinh;
		if (gioiTinh_text.equals("Nam")) {
			gioiTinh = true;
		} else {
			gioiTinh = false;
		}
		float diemMon1 = Float.valueOf(this.textField_mon1.getText());
		float diemMon2 = Float.valueOf(this.textField_mon2.getText());
		float diemMon3 = Float.valueOf(this.textField_mon3.getText());
		ThiSinh ts = new ThiSinh(maSinhVien, tenThiSinh, queQuan, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
		return ts;
	}

	public ThiSinh getThiSinh(DefaultTableModel dt) {
		int i_row = table.getSelectedRow();
		int maSinhVien = Integer.valueOf((String)(dt.getValueAt(i_row, 0)));
		String tenThiSinh = (String) dt.getValueAt(i_row, 1);
		Tinh queQuan = null;
		for (Tinh tinh : listTinh) {
			if (tinh.getTenTinh().equals((String) dt.getValueAt(i_row, 2))) {
				queQuan = new Tinh(tinh.getMaTinh() + 1, (String) dt.getValueAt(i_row, 2));
			}
		}
		Date ngaySinh = new Date((String) dt.getValueAt(i_row, 3));
		String thongTinGioiTinh = (String) dt.getValueAt(i_row, 4);
		boolean gioiTinh = (thongTinGioiTinh.equals("Nam")) ? true : false;
		float diemMon1 = Float.valueOf((String) dt.getValueAt(i_row, 5));
		float diemMon2 = Float.valueOf((String) dt.getValueAt(i_row, 6));
		float diemMon3 = Float.valueOf((String) dt.getValueAt(i_row, 7));

		ThiSinh ts = new ThiSinh(maSinhVien, tenThiSinh, queQuan, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
		return ts;
	}

	public void xoaForm() {
		// TODO Auto-generated method stub
		textField_hoTen.setText("");
		textField_maThiSinh.setText(" ");
		textField_mon1.setText(" ");
		textField_mon2.setText(" ");
		textField_mon3.setText(" ");
		textField_ngaySinh.setText(" ");
		comboBox_queQuan_1.setSelectedIndex(-1);
		btn_group.clearSelection();

	}

	public void themThiSinh(ThiSinh ts) {
		// TODO Auto-generated method stub
		this.model.insert(ts);
		count++;
		DefaultTableModel dt = (DefaultTableModel) table.getModel();

		dt.addRow(new Object[] { ts.getMaThiSinh() + "", ts.getTenThiSinh() + "", ts.getQueQuan().getTenTinh(),
				(ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/"
						+ (ts.getNgaySinh().getYear() + 1900)),
				ts.isGioiTinh() ? "Nam" : "Nữ", ts.getDiemMon1() + "", ts.getDiemMon2() + "", ts.getDiemMon3() + "" });

	}

	public void capNhatThiSinh(ThiSinh ts) {
		// TODO Auto-generated method stub
		this.model.update(ts);
		DefaultTableModel dt = (DefaultTableModel) table.getModel();
		dt.removeRow(table.getSelectedRow());
		dt.addRow(new Object[] { ts.getMaThiSinh() + "", ts.getTenThiSinh() + "", ts.getQueQuan().getTenTinh(),
				(ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/"
						+ (ts.getNgaySinh().getYear() + 1900)),
				ts.isGioiTinh() ? "Nam" : "Nữ", ts.getDiemMon1() + "", ts.getDiemMon2() + "", ts.getDiemMon3() + "" });
	}

	public void hienThiThongTinThiSinhDaChon() {
		// TODO Auto-generated method stub
		DefaultTableModel dt = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		ThiSinh ts = this.getThiSinh(dt);
		this.model.xoa(ts);
		textField_maThiSinh.setText(ts.getMaThiSinh() + "");
		textField_hoTen.setText(ts.getTenThiSinh());
		comboBox_queQuan_1.setSelectedIndex(ts.getQueQuan().getMaTinh() - 1);
		textField_ngaySinh.setText(ts.getNgaySinh().getDate() + "/" + (ts.getNgaySinh().getMonth() + 1) + "/"
				+ (ts.getNgaySinh().getYear() + 1900));
		btn_group.setSelected(ts.isGioiTinh() ? rdbtnNam.getModel() : rdbtnNu.getModel(), true);
		textField_mon1.setText(ts.getDiemMon1() + "");
		textField_mon2.setText(ts.getDiemMon2() + "");
		textField_mon3.setText(ts.getDiemMon3() + "");

	}

	public void xoaThiSinh() {
		// TODO Auto-generated method stub
		int i_row = table.getSelectedRow();
		DefaultTableModel dt = (DefaultTableModel) table.getModel();
		int i = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa không", "Delete",
				JOptionPane.YES_NO_OPTION);
		if (i == JOptionPane.YES_OPTION) {
			dt.removeRow(i_row);
			this.model.xoa(this.getThiSinh(dt));
		}
		ArrayList<ThiSinh> ds = this.model.getDsThiSinh();
		for (ThiSinh thiSinh : ds) {
			System.out.println(thiSinh);
		}

	}
}
