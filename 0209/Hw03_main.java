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
			// ��ȣ �̱�			
				lottos = test.lotto();
			// �ߺ� �˻�
				int overlap = test.testLotto(lottos); // ���� 1�̸� �ߺ�, 0�̸� ����
				if (overlap==1)
				{
					continue;
				} else {
					
					break;
				}			
			}
			lottoRes[i]=lottos;
		}
		// ���
		System.out.println("<<�ζ� �ڵ� 5����>>");
		test.printLotto(lottoRes);
	}
}
