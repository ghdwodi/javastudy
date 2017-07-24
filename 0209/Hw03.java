import java.util.*;

class Hw03 
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
	public void printLotto(int lottoRes[][]){
		for (int j=0;j<5;j++){
			System.out.print((j+1)+"�� : ");
			for (int i=0;i<6;i++)
			{
				System.out.print("("+lottoRes[j][i]+")\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
