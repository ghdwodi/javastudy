package com.hb.bm;

import java.util.*;

public class TestMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		System.out.println("1.�� 2.�簢��  >>>");
		int res = scan.nextInt();
		switch (res){
		case 1 :
			c.draw(); break;
		case 2 :
			r.draw(); break;
		}*/
		
		
		// ���� ���ε�
		
		Shape shape = null;
		System.out.println("1.�� 2.�簢��  >>>");
		int res = scan.nextInt();
		switch (res){
		case 1 : shape = new Circle(); break;
		case 2 : shape = new Rectangle(); break;
		}
		shape.draw();
		
		shape.move(100, 200);
	}
}
