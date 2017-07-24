package com.hb.pm;

import java.util.Set;
import java.util.TreeSet;

public class Lotto_number {
	int[] lotto = new int[6];
	Set<Integer> lottoSet = new TreeSet<>();

	public Set<Integer> Lotto_number(){
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			if (!lottoSet.add(lotto[i])) i--;
		}
		return lottoSet;
	}
}
