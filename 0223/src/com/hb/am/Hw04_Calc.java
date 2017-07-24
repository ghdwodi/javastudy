package com.hb.am;

public class Hw04_Calc {
	Hw04_Calc(){
		
	}
	
	// 숫자만 추출해 저장, 숫자 배열을 반환
	
	public int[] numbers(String s){
		
		int su = 1;			// 숫자의 개수
		int su2 = 0;		// 숫자 추출 후 저장하는 배열의 크기
		int su3 = 0;		// 숫자 추출 후 남은 문자열을 자르는 인덱스
		int[] numberArray;	// 숫자를 저장한 배열
		String s2 = s+" ";	// 숫자 추출 전 공백을 하나 추가
		String sNum = "";	// 숫자를 문자열로 저장
		String s3 = s2;
		for (int i = 0; i < s2.length()-1 ; i++) {
			if(!(s2.charAt(i)>='0' && s2.charAt(i)<='9')){
				if(s2.charAt(i+1)>='0' && s2.charAt(i+1)<='9')

				su++;	// 숫자의 개수
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
	
	// 연산자만 뽑아내 저장, 배열을 반환
	
	public String[] operations(String s){
		
		int su = 0;			// 연산자의 개수
		int su2 = 0;		// 연산자 추출 후 저장하는 배열의 크기
		String[] opArray;	// 연산자를 저장한 배열
		String s2 = s+" ";	// 연산자 추출 전 공백을 하나 추가
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
