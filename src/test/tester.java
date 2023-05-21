package test;

import java.util.ArrayList;

import javax.swing.UIManager;

import model.QLSVModel;
import model.ThiSinh;
import view.QLSVView;

public class tester {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			new QLSVView();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
