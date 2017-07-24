import java.util.*;

class Hw03 
{
	// 번호 뽑기 : 1~45 정수 난수 6개 배열 생성
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
	// 중복검사

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

	// 출력
	public void printLotto(int lottoRes[][]){
		for (int j=0;j<5;j++){
			System.out.print((j+1)+"차 : ");
			for (int i=0;i<6;i++)
			{
				System.out.print("("+lottoRes[j][i]+")\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
