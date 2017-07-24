package com.hb.am;

public class Ex05_main {
	public static void main(String[] args) {
		Ex05_1 test = new Ex05_1();
		test.prn();
		test.prn2(new TestInner() {
			
			@Override
			public void prnData() {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
