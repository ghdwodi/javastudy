package com.hb.am;

import javax.swing.table.AbstractTableModel;

public class Ex10_1 extends AbstractTableModel {
	
	// ǥ�� �� �÷����� ���� ��� �Ѵ�.
	String[] name = {"���̵�","�̸�","��й�ȣ","����"};
	
	// ǥ�� �����ʹ� �������迭�� ����
	String[][] data = {
			{"one","ȫ�浿","12","����ģ��"},
			{"two","�̱浿","15","����ģ��"},
			{"three","��浿","22","�׳�ģ��"},
			{"four","��浿","10","��������ģ��"}
	};

	// �迭�� �ڷ����� �ٸ� ��� : �ڷ��� ��ü�� ��ü(Object)�� �����
//	Object[][] data2 = {
//			{"one","ȫ�浿",new Integer(12),"����ģ��"},	// �� �ڷ����� ��ü�� �־���� �ϳ�
//			{"two","�̱浿",15,"����ģ��"},				// JAVA 5.0 ���ĺ��� ����ڽ��� �����Ѵ�
//			{"three","��浿",22,"�׳�ģ��"},
//			{"four","��浿",10,"��������ģ��"}
//	};

	@Override
	// ���� ����
	public int getColumnCount() {
		return name.length;
	}

	@Override
	// ���� ����
	public int getRowCount() {
		return data.length;
	}

	// ���� ä���
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}
	
	// �÷��� �����ϱ�
	@Override
	public String getColumnName(int column) {
		return name[column];
	}
	
	// ���� ������ �� �ֵ��� Ŀ�� �ֱ�
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return (columnIndex !=0) ? true : false;
//		return true;	// ��ü ��ġ��
	}
	
	// �� ���� �����ϰ� �ϱ�
	// (Object aValue : ��ĥ ����, int rowIndex : ��, int columnIndex : ��)
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//		System.out.println(aValue);
//		System.out.println(rowIndex);
//		System.out.println(columnIndex);
		data[rowIndex][columnIndex] = (String) (aValue);
	}
	
}
