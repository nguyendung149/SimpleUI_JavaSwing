package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import model.ThiSinh;
import model.Tinh;
import view.QLSVView;

public class QLSVControler implements ActionListener {
	private QLSVView view;

	public QLSVControler(QLSVView view) {
		// TODO Auto-generated constructor stub
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cm = e.getActionCommand();
		if (cm.equals("Thêm")) {
			this.view.xoaForm();
			this.view.model.setLuaChon("Thêm");
		} else if (cm.equals("Lưu")) {
			try {
				ThiSinh ts = this.view.getThiSinh();
				if(this.view.model.getLuaChon().equals("")||this.view.model.getLuaChon().equals("Thêm")) {
					this.view.themThiSinh(ts);
				}else if(this.view.model.getLuaChon().equals("Cập nhật")) {
					
					this.view.capNhatThiSinh(ts);
					
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(cm.equals("Cập nhật")) {
			this.view.model.setLuaChon("Cập nhật");
			this.view.hienThiThongTinThiSinhDaChon();
			
			
			
			
		}else if(cm.equals("Xóa")) {
			this.view.model.setLuaChon("Xóa");
			this.view.xoaThiSinh();
		}

	}

}
