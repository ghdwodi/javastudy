package com.hb.am;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random random = new Random();
		int[] su = new int[6];
		
		for (int i=0;i<su.length;i++){
			su[i] = Math.abs(random.nextInt())%45+1;	// 1~45
			// 첫 번째 값은 중복검사 없이 무조건 저장
			// 두 번째 값부터는 중복검사 후 중복되면 다시 난수 생성
			if (i>=1){
				for(int j=0;j<i;j++){
					if (su[i]==su[j]){
						su[i] = Math.abs(random.nextInt())%45+1;
						j=-1;
					}
				}
			}
		}
		Arrays.sort(su);
		for (int k : su) {
			System.out.println(k+" ");
		}
	}
}
