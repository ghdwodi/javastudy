class Hw01_main
{
	public static void main(String[] args) 
	{
		int[] lottoRes = new int[6];
		Hw01 test = new Hw01();
		
		while (true)
		{
		// ��ȣ �̱�
			lottoRes = test.lotto();
		// �ߺ� �˻�
			int overlap = test.testLotto(lottoRes); // ���� 1�̸� �ߺ�, 0�̸� ����
			if (overlap==1)
			{
				continue;
			} else {
				break;
			}
		}
		// ���
		test.printLotto(lottoRes);
	}
}
