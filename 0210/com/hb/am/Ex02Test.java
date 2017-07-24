package com.hb.am;
class Ex02Test
{
	public static void main(String[] args) 
	{
		Ex02 test = new Ex02();
		test.getLength("정글의 왕자 레오");
		test.getLength(567.055);
		test.getLength(3.1415f);
		test.getLength(56.99);
		test.getLength(false);
		test.getLength(65535L);
	}
}
