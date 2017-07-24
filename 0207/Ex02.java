import java.util.*;

class Ex02{
	public static void main(String[] args){

	// 이름, 국어 영어 수학 점수 받아서 이름, 총점, 평균, 학점 출력하기
		Scanner scan = new Scanner(System.in);

		check :

		while(true){
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("국어 : ");
			double kor = scan.nextDouble();
			System.out.print("영어 : ");
			double eng = scan.nextDouble();
			System.out.print("수학 : ");
			double math = scan.nextDouble();

			char hak = 'a';
			if (kor<=100 && kor>=0 && eng<=100 && eng>=0 && math<=100 && math>=0){
				double sum = kor + eng + math;
				Double avg = ((int)sum*100 / 3)/100.0;
				if (avg>=90 && avg<=100){
					hak = 'A';
				} else if (avg<90 && avg>=80){
					hak = 'B';
				} else if (avg<80 && avg>=70){
					hak = 'C';
				} else{
					hak = 'F';
				}
			System.out.println("이름 : "+name);
			System.out.println("총점 : "+sum);
			System.out.println("평균 : "+avg);
			System.out.println("학점 : "+hak+"학점");
			} else{
			System.out.println("입력오류");
			}
			System.out.print("계속할까요?(y/n) : ");
			while(true){
				String answer = scan.next();
				if (answer.equalsIgnoreCase("y")){
					break;
				} else if (answer.equalsIgnoreCase("n")){
					break check;
				} else{
					System.out.print("다시 입력해 주십시오.(y/n) : ");
				}
			}
		}
	}
}