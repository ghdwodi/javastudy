package com.hb.pm;


public class Hw02_main {
	public static void main(String[] args) {
		int times = 0;
		int[] bats = new int[3];	// 배팅
		int[] pitches = new int[3];	// 피칭
		Hw02 game = new Hw02();
		
		// 배팅 + 중복검사
		while (true){
			// 배팅
				bats = game.batting();
			// 중복 검사
				int overlap = game.testBats(bats); // 값이 1이면 중복, 0이면 정상
				if (overlap==1)
				{
					continue;
				} else {
					break;
				}
			}
			
		while(true){
			System.out.println((1+times)+"회!");
			int ball = 0;	// 볼
			int strike = 0;	// 스트라이크
			// 피칭 입력
			pitches = game.pitching();
			
			
			
			// 스트라이크 판정
			for (int i=0;i<3;i++){
				if (bats[i]==pitches[i]){
					strike++;
				}
			}
					
			// 볼 판정
			for (int i=0 ; i < bats.length;i++){
				for (int j=0 ; j < pitches.length; j++){
					if (bats[i]==pitches[j]){
						ball++;		// 15회까지 반복
					}
				}
			}
			ball = ball - strike;
			
			// 출력
			System.out.println(strike+" 스트라이크 "+ball+" 볼");
			times++;
			
			
			// 게임 횟수가 15회가 되거나 3스트라이크면 종료
			if (times==15 || strike==3){
				System.out.println("감사합니다");
				break;
			}
		}
	}
}
