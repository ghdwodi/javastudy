package com.hb.am;
class Ex02 
{
	// �����ε� : �̸��� ���� �Ű�����, ���ڰ� �ٸ� �޼ҵ尡 ���� �� �����ϴ� ��

	public void getLength(boolean n){
		String str = n+"";
		getLength(str);
	}
	public void getLength(int n){
		String str = n+"";
		getLength(str);
	}
	public void getLength(long n){
		String str = n+"";
		getLength(str);
	}
	public void getLength(float n){
		String str = n+"";
		getLength(str);
	}
	public void getLength(double n){
		String str = n+"";
		getLength(str);
	}
	public void getLength(String n){
		System.out.println("�Է��� �� : "+n);
		System.out.println("�Է��� ���� ���� : "+n.length());
	}
}