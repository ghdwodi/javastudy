package com.hb.pm;


public class Hw02_main {
	public static void main(String[] args) {
		int times = 0;
		int[] bats = new int[3];	// ����
		int[] pitches = new int[3];	// ��Ī
		Hw02 game = new Hw02();
		
		// ���� + �ߺ��˻�
		while (true){
			// ����
				bats = game.batting();
			// �ߺ� �˻�
				int overlap = game.testBats(bats); // ���� 1�̸� �ߺ�, 0�̸� ����
				if (overlap==1)
				{
					continue;
				} else {
					break;
				}
			}
			
		while(true){
			System.out.println((1+times)+"ȸ!");
			int ball = 0;	// ��
			int strike = 0;	// ��Ʈ����ũ
			// ��Ī �Է�
			pitches = game.pitching();
			
			
			
			// ��Ʈ����ũ ����
			for (int i=0;i<3;i++){
				if (bats[i]==pitches[i]){
					strike++;
				}
			}
					
			// �� ����
			for (int i=0 ; i < bats.length;i++){
				for (int j=0 ; j < pitches.length; j++){
					if (bats[i]==pitches[j]){
						ball++;		// 15ȸ���� �ݺ�
					}
				}
			}
			ball = ball - strike;
			
			// ���
			System.out.println(strike+" ��Ʈ����ũ "+ball+" ��");
			times++;
			
			
			// ���� Ƚ���� 15ȸ�� �ǰų� 3��Ʈ����ũ�� ����
			if (times==15 || strike==3){
				System.out.println("�����մϴ�");
				break;
			}
		}
	}
}
