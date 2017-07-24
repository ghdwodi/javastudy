import java.util.*;

class Hw01 
{
	// ��ȣ �̱� : 1~45 ���� ���� 6�� �迭 ����
	public int[] lotto(){
		Random ran = new Random();
		int[] lotto = new int[6];
		for (int i=0;i<6;i++)
		{
			lotto[i] = Math.abs(ran.nextInt() % 44) + 1;
		}
		Arrays.sort(lotto);
		return lotto;
	}
	// �ߺ��˻�

	public int testLotto(int lottoRes[]){
		int test=0;
		for (int i=0;i<lottoRes.length-1 ;i++ )
		{
			for (int j=i+1;j<lottoRes.length ;j++ )
			{
				if (lottoRes[i]==lottoRes[j])
				{
					test = 1;
				}
			}
		}
		return test;
	}

	// ���
	public void printLotto(int lottoRes[]){
		System.out.print("��÷ ��� : ");

		for (int i=0;i<6;i++)
		{
			System.out.print("("+lottoRes[i]+")");
		}
		System.out.println();
	}
}
