class Hw01_main
{
	public static void main(String[] args) 
	{
		int[] lottoRes = new int[6];
		Hw01 test = new Hw01();
		
		while (true)
		{
		// 번호 뽑기
			lottoRes = test.lotto();
		// 중복 검사
			int overlap = test.testLotto(lottoRes); // 값이 1이면 중복, 0이면 정상
			if (overlap==1)
			{
				continue;
			} else {
				break;
			}
		}
		// 출력
		test.printLotto(lottoRes);
	}
}
