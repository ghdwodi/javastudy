import java.util.*;

class Ex02{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		int[] rank = new int[5];

		for(int i=0;i<name.length;i++){
			System.out.print("이름 : ");
			name[i] = scan.next();
			System.out.print("국어 : ");
			kor[i] = scan.nextInt();
			System.out.print("영어 : ");
			eng[i] = scan.nextInt();
			System.out.print("수학 : ");
			math[i] = scan.nextInt();
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = ((int)(sum[i]*10/3))/10.0;
			if (avg[i]>=90){
				hak[i] = "A학점";
			} else if (avg[i]>=80){
				hak[i] = "B학점";
			} else if (avg[i]>=70){
				hak[i] = "C학점";
			} else{
				hak[i] = "D학점";
			}
			rank[i] = 1;
		}

		for(int i=0;i<name.length;i++){
			for(int j=0;j<name.length;j++){
				if (i==j){
					continue;
				} else{
					if (sum[i]<=sum[j]){
						rank[i]++;
					}
				}
			}			
		}

		// 총점 순으로 정렬하기

		String im_name = "";
		int im_sum = 0;
		double im_avg = 0.0;
		String im_hak = "";
		int im_rank = 0;

		for (int i=0;i<name.length-1;i++){
			for (int j=i+1;j<name.length;j++){
				if (sum[i]<sum[j]){
					im_name = name[i];
					name[i] = name[j];
					name[j] = im_name;
					im_sum = sum[i];
					sum[i] = sum[j];
					sum[j] = im_sum;
					im_avg = avg[i];
					avg[i] = avg[j];
					avg[j] = im_avg;
					im_hak = hak[i];
					hak[i] = hak[j];
					hak[j] = im_hak;
					im_rank = rank[i];
					rank[i] = rank[j];
					rank[j] = im_rank;
				}
			}
		}

		System.out.println();
		System.out.println("이름\t총점\t평균\t학점\t순위\n-------------------------------------");
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]+"\t"+sum[i]+"\t"+avg[i]+"\t"+hak[i]+"\t"+rank[i]+"등");
		}
	}
}