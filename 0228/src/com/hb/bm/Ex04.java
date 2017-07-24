package com.hb.bm;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex04 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] su =  new int[6];
		Set<Integer> set = new TreeSet<>();
		
/*		for (int i = 0; i < su.length; i++) {
			su[i] = ran.nextInt(45)+1;
			if(!set.add(su[i])) i--;
		}*/
		
		for (int i = 0; i < 6; i++) {
			if(!set.add(ran.nextInt(45)+1)) i--;
		}
		System.out.println(set);
	}
}
