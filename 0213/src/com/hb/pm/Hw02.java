package com.hb.pm;

import java.util.*;

public class Hw02 {
	private int[] pitches = new int[3];
	private int[] bats = new int[3];	// ����
	Random rans = new Random();
	Scanner scan = new Scanner(System.in);
		
	// ��Ī
	
	public int[] pitching(){
		int i=0;
		while(true){
			System.out.print((i+1)+"��° ����!(0~9) : ");
			int pitch = scan.nextInt();
			if (pitch>9 || pitch<0){
				System.out.println("�ٽ� ��������.");
				continue;
			} else {
				pitches[i] = pitch;
				i++;
			}
			if (i==3) break;
		}
		return pitches;
	}
	
	// ����
	
	public int[] batting(){
		for (int i=0; i< bats.length;i++) {
			bats[i] = (int)(rans.nextDouble()*10);
		}
		return bats;
	}
	
	// �ߺ� �˻�
	
	public int testBats(int bats[]){
		int test=0;
		for (int i=0;i<bats.length-1 ;i++ )
		{
			for (int j=i+1;j<bats.length ;j++ )
			{
				if (bats[i]==bats[j])
				{
					test = 1;
				}
			}
		}
		return test;
	}	
}

