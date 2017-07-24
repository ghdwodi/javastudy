class Hw03_main
{
	public static void main(String[] args) 
	{
		int[][] lottoRes = new int[5][];
		int[] lottos = new int[6];
		Hw03 test = new Hw03();
		
		for (int i=0;i<5;i++){
			while (true)
			{			
			// 번호 뽑기			
				lottos = test.lotto();
			// 중복 검사
				int overlap = test.testLotto(lottos); // 값이 1이면 중복, 0이면 정상
				if (overlap==1)
				{
					continue;
				} else {
					
					break;
				}			
			}
			lottoRes[i]=lottos;
		}
		// 출력
		System.out.println("<<로또 자동 5연속>>");
		test.printLotto(lottoRes);
	}
}
