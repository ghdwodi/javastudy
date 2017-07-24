package com.hb.am;

public class Hw04 {
	public static void main(String[] args) {
		int su;
		String s = "1000+10*50+112+7+88+999+1+2+3+4+5";
		String s2 = s+" ";


		String sNum = "";
		String s3 = s2;
		su = 1;
		for (int i = 0; i < s2.length()-1 ; i++) {
			if(!(s2.charAt(i)>='0' && s2.charAt(i)<='9')){
				if(s2.charAt(i+1)>='0' && s2.charAt(i+1)<='9')

				su++;	// 숫자의 개수
			}
		}
		int su2 = 0;
		int su3 = 0;
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

		System.out.println(su2);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}		
	}
}
