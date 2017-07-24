package com.hb.pm;

import java.util.*;

public class Ex02Test {
	public static void main(String[] args) {
		Ex02 t1 = new Ex02();
		t1.setName("물");
		t1.setPrice(500);
		Ex02 t2 = new Ex02("이온음료", 900);
		Ex02 t3 = new Ex02("커피음료",1000);
		Ex02 t4 = new Ex02("탄산음료", 800);
		
		// t1, t2, t3, t4 를 배열에 넣어 보자.
		// 자료형[] 이름 = new 자료형[배열크기];
		// 그렇다면 t1~t4의 자료형은 무엇으로 봐야 하나?
		// t1~t4는 Ex02클래스로 만든 객체이다.
		// 이러한 객체를 배열에 넣을 때는 해당 클래스가 자료형이 된다.
		// 이러한 자료형을 참조자료형이라 한다.
		// 이러한 배열을 참조배열, 객체배열이라 한다.
		
		Ex02[] arr = new Ex02[4];
		arr[0] = t1;
		arr[1] = t2;
		arr[2] = t3;
		arr[3] = t4;
		
//		Ex02[] arr2 = {t1,t2,t3,t4}; // 보통 실무에서는 이렇게 만든다.
		
//		System.out.println(t1);
//		System.out.println(arr[0].getPrice());
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert Coin! : ");
		int coin = scan.nextInt();
/*		if (t1.getPrice()<=coin){
			System.out.println(t1.getName());
		}
		if (t2.getPrice()<=coin){
			System.out.println(t2.getName());
		}
		if (t4.getPrice()<=coin){
			System.out.println(t3.getName());
		}
		if (t4.getPrice()<=coin){
			System.out.println(t4.getName());
		}*/
		for (int i = 0; i < 4; i++) {
			if (arr[i].getPrice()<=coin){
				System.out.print(arr[i].getName()+" ");
			}
		}
		System.out.println();
		System.out.print("선택하시오 : ");
		String str = scan.next();
		int  output = 0;
/*		if (str.equalsIgnoreCase("물")){
			output = coin - t1.getPrice();
		} else if (str.equalsIgnoreCase("이온음료")){
			output = coin - t2.getPrice();
		} else if (str.equalsIgnoreCase("커피음료")){
			output = coin - t3.getPrice();
		} else if (str.equalsIgnoreCase("탄산음료")){
			output = coin - t4.getPrice();
		}*/
		for (int i = 0; i < arr.length; i++) {
			if (str.equalsIgnoreCase(arr[i].getName())){
				System.out.println(arr[i].getName()+"(을)를 선택하셨습니다.");
				output = coin - arr[i].getPrice();
				System.out.println("잔돈 : "+output+"원\n감사합니다.");
				break;
			}
		}
	}
}
