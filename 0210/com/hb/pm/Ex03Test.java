package com.hb.pm;

import java.util.Scanner;

public class Ex03Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex03[] arr = new Ex03[5];
		
		// �Է�
		
		String name = "";
		int kor = 0, eng = 0, math = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�̸� : ");
			name = scan.next();
			System.out.print("���� : ");
			kor = scan.nextInt();
			System.out.print("���� : ");
			eng = scan.nextInt();
			System.out.print("���� : ");
			math = scan.nextInt();
			arr[i] = new Ex03(name, kor, eng, math);
		}
		
		// ����
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i==j){
					continue;
				} else if(arr[i].getSum()<=arr[j].getSum()){
					int rank = arr[i].getRank();
					rank++;
					arr[i].setRank(rank);
				}
			}
		}
		
		// ����
		
		for (int i = 0; i < arr.length-1; i++) {
			Ex03 im;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].getSum()<arr[j].getSum()){
					im = arr[i];
					arr[i]=arr[j];
					arr[j]=im;
				}
			}
		}
		
		// ���
		
		System.out.println("�̸�\t����\t���\t����\t����");
		System.out.println("------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName()+"\t");
			System.out.print(arr[i].getSum()+"\t");
			System.out.print(arr[i].getAvg()+"\t");
			System.out.print(arr[i].getHak()+"\t");
			System.out.print(arr[i].getRank()+"\t");
			System.out.println();
		}
	}
}
