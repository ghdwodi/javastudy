package com.hb.cm;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class BookTableModel extends AbstractTableModel {
	BookDAO bd = new BookDAO();
	String[] name = {"BookID","제목","출판사","가격"};
	ArrayList<BookVO> bvo = bd.getSelect();
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return name[column];
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		if (columnIndex == 0){
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		int defaultBookid = bvo.get(rowIndex).getBookid();
		String defaultBookname = bvo.get(rowIndex).getBookname();
		String defaultPublisher = bvo.get(rowIndex).getPublisher();
		int defaultPrice = bvo.get(rowIndex).getPrice();
		BookVO bv = new BookVO();
		bv.setBookid(defaultBookid);
		bv.setBookname(defaultBookname);
		bv.setPublisher(defaultPublisher);
		bv.setPrice(defaultPrice);
		if (columnIndex==1){
			bv.setBookname((String)aValue);
		} else if (columnIndex==2){
			bv.setPublisher((String)aValue);
		} else if (columnIndex==3){
			bv.setPrice(Integer.parseInt((String)aValue));
		}
		bvo.set(rowIndex, bv);
	}

	
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return name.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return bvo.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Object obj = null;
		switch (columnIndex) {
		case 0: obj = bvo.get(rowIndex).getBookid(); break;
		case 1: obj = bvo.get(rowIndex).getBookname(); break;
		case 2: obj = bvo.get(rowIndex).getPublisher(); break;
		case 3: obj = bvo.get(rowIndex).getPrice(); break;
		default:break;
		}
		return obj;
	}
	
	public BookVO getRow(int rowIndex){
		return bvo.get(rowIndex);
	}
}
