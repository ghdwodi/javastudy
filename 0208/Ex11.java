import java.util.*;

class Ex11{
	/*Ex11(){
	}*/
	public static void main(String[] args){
	// 등수 매기기
	// 다중배열 선언, 입력

		Scanner scan = new Scanner(System.in);
		Ex11 ma = new Ex11();

		String name = "";
		String hak = "";
		int kor, eng, math, sum, rank;
		double avg;

		String [][] str = new String[5][5];

		System.out.println(str);

		for (int i=0;i<str.length;i++){
			System.out.print("이름 : ");
			name = scan.next();
			System.out.print("국어 : ");
			kor = scan.nextInt();
			System.out.print("영어 : ");
			eng = scan.nextInt();
			System.out.print("수학 : ");
			math = scan.nextInt();
			sum = kor + eng + math;
			avg = ((int)(sum*10/3))/10.0;
			rank = 1;
			if (avg>=90){
				hak = "A학점";
			} else if (avg>=80){
				hak = "B학점";
			} else if (avg>=70){
				hak = "C학점";
			} else{
				hak = "D학점";
			}
			
			
						
		}

	// 랭킹 매기기

		for (int i=0;i<str.length;i++){
			int ranki = 1;
			for (int j=0;j<str.length;j++){
				int sumi = Integer.parseInt(str [i][1]);
				int sumj = Integer.parseInt(str [j][1]);
				if (i==j){
					continue;
				} else {
					if (sumi <= sumj){
						ranki++;
					}
				}
				str [i][4] = ranki+"";
			}
		}


	// 정렬하기

		String[] im = new String[5];

		for (int i=0;i<str.length-1;i++){
			for (int j=i+1;j<str.length;j++){
				int sumi = Integer.parseInt(str[i][1]);
				int sumj = Integer.parseInt(str[j][1]);
				if (sumi<sumj){
					im = str[i];
					str[i] = str[j];
					str[j] = im;
				}
			}
		}

	// 출력하기
		System.out.println("이름\t총점\t평균\t학점\t순위\n------------------------------------");

		for (int i=0;i<str.length;i++){
			for (int j=0;j<str[i].length;j++){
				System.out.print(str[i][j]+"\t");
			}
			System.out.println();
		}

	}
	public void earAlien(String[][] str, String name, int sum, double avg, String hak, int rank, int i){
		str[i][0] = name;
		str[i][1] = sum+"";
		str[i][2] = avg+"";
		str[i][3] = hak;
		str[i][4] = rank+"";
	}
}