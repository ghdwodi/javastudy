package com.hb.am;

import javax.swing.table.AbstractTableModel;

public class Ex10_1 extends AbstractTableModel {
	
	// 표에 들어갈 컬럼명을 먼저 써야 한다.
	String[] name = {"아이디","이름","비밀번호","구분"};
	
	// 표의 데이터는 이차원배열로 들어간다
	String[][] data = {
			{"one","홍길동","12","옆집친구"},
			{"two","이길동","15","앞집친구"},
			{"three","김길동","22","그냥친구"},
			{"four","고길동","10","웬수같은친구"}
	};

	// 배열의 자료형이 다른 경우 : 자료형 자체를 객체(Object)로 만든다
//	Object[][] data2 = {
//			{"one","홍길동",new Integer(12),"옆집친구"},	// 각 자료형을 객체로 넣어줘야 하나
//			{"two","이길동",15,"앞집친구"},				// JAVA 5.0 이후부터 오토박싱을 지원한다
//			{"three","김길동",22,"그냥친구"},
//			{"four","고길동",10,"웬수같은친구"}
//	};

	@Override
	// 열의 갯수
	public int getColumnCount() {
		return name.length;
	}

	@Override
	// 행의 갯수
	public int getRowCount() {
		return data.length;
	}

	// 내용 채우기
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}
	
	// 컬럼명 적용하기
	@Override
	public String getColumnName(int column) {
		return name[column];
	}
	
	// 셀을 편집할 수 있도록 커서 넣기
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return (columnIndex !=0) ? true : false;
//		return true;	// 전체 고치기
	}
	
	// 셀 수정 가능하게 하기
	// (Object aValue : 고칠 내용, int rowIndex : 행, int columnIndex : 열)
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//		System.out.println(aValue);
//		System.out.println(rowIndex);
//		System.out.println(columnIndex);
		data[rowIndex][columnIndex] = (String) (aValue);
	}
	
}
