package com.hb.am;

public class Hw04_Calc {
	Hw04_Calc(){
		
	}
	
	// ���ڸ� ������ ����, ���� �迭�� ��ȯ
	
	public int[] numbers(String s){
		
		int su = 1;			// ������ ����
		int su2 = 0;		// ���� ���� �� �����ϴ� �迭�� ũ��
		int su3 = 0;		// ���� ���� �� ���� ���ڿ��� �ڸ��� �ε���
		int[] numberArray;	// ���ڸ� ������ �迭
		String s2 = s+" ";	// ���� ���� �� ������ �ϳ� �߰�
		String sNum = "";	// ���ڸ� ���ڿ��� ����
		String s3 = s2;
		for (int i = 0; i < s2.length()-1 ; i++) {
			if(!(s2.charAt(i)>='0' && s2.charAt(i)<='9')){
				if(s2.charAt(i+1)>='0' && s2.charAt(i+1)<='9')

				su++;	// ������ ����
			}
		}
		
		String[] nums = new String[su];
		
		for (int i = 0; i < s2.length()-1 ; i++) {
			
			if(s2.charAt(i)>='0' && s2.charAt(i)<='9'){
				if(!(s2.charAt(i+1)>='0' && s2.charAt(i+1)<='9')){
					sNum = s3.substring(su3, i+1);
					nums[su2] = sNum;
					su2++;
				}
			}
			
			if (!(s2.charAt(i)>='0' && s2.charAt(i)<='9')){
				if(s2.charAt(i+1)>='0' && s2.charAt(i+1)<='9'){
					su3 = i+1;
				}
			}			
		}
		
		numberArray = new int[su2];
		for (int i = 0; i < nums.length; i++) {
			numberArray[i] = Integer.parseInt(nums[i]);
		}
		return numberArray;
	}
	
	// �����ڸ� �̾Ƴ� ����, �迭�� ��ȯ
	
	public String[] operations(String s){
		
		int su = 0;			// �������� ����
		int su2 = 0;		// ������ ���� �� �����ϴ� �迭�� ũ��
		String[] opArray;	// �����ڸ� ������ �迭
		String s2 = s+" ";	// ������ ���� �� ������ �ϳ� �߰�
		for (int i = 0; i < s2.length()-1 ; i++) {
			if (s2.charAt(i)=='+' || s2.charAt(i)=='-'
					|| s2.charAt(i)=='*' || s2.charAt(i)=='/'){
				su++;
			}
		}
		
		opArray = new String[su];
		
		for (int i = 0; i < s2.length()-1 ; i++) {
			if(s2.charAt(i)=='+' || s2.charAt(i)=='-' 
					|| s2.charAt(i)=='*' || s2.charAt(i)=='/'){
				opArray[su2] = s2.charAt(i)+"";
				su2++;
			}
		}
		return opArray;
	}
	
}
