package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class QLSVModel {
	private ArrayList<ThiSinh> dsThiSinh;
	private String luaChon;

	public QLSVModel() {
		this.dsThiSinh = new ArrayList<ThiSinh>(100);
		this.luaChon = "";

	}

	public QLSVModel(ArrayList<ThiSinh> ds) {
		this.dsThiSinh = ds;
		this.luaChon = "";
	}

	/**
	 * @return the luaChon
	 */
	public String getLuaChon() {
		return luaChon;
	}

	/**
	 * @param luaChon the luaChon to set
	 */
	public void setLuaChon(String luaChon) {
		this.luaChon = luaChon;
	}

	/**
	 * @return the dsThiSinh
	 */
	public ArrayList<ThiSinh> getDsThiSinh() {
		return dsThiSinh;
	}

	/**
	 * @param dsThiSinh the dsThiSinh to set
	 */
	public void setDsThiSinh(ArrayList<ThiSinh> dsThiSinh) {
		this.dsThiSinh = dsThiSinh;
	}

	public void insert(ThiSinh thiSinh) {
		this.dsThiSinh.add(thiSinh);
	}

	public void xoa(ThiSinh thiSinh) {
		System.out.println(this.dsThiSinh.remove(thiSinh));

	}

	public void update(ThiSinh thiSinh) {
		this.xoa(thiSinh);
		this.dsThiSinh.add(thiSinh);
	}

}
