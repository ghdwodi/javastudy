import java.util.*;

class Ex02{
	public static void main(String[] args){

	// �̸�, ���� ���� ���� ���� �޾Ƽ� �̸�, ����, ���, ���� ����ϱ�
		Scanner scan = new Scanner(System.in);

		check :

		while(true){
			System.out.print("�̸� : ");
			String name = scan.next();
			System.out.print("���� : ");
			double kor = scan.nextDouble();
			System.out.print("���� : ");
			double eng = scan.nextDouble();
			System.out.print("���� : ");
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
			System.out.println("�̸� : "+name);
			System.out.println("���� : "+sum);
			System.out.println("��� : "+avg);
			System.out.println("���� : "+hak+"����");
			} else{
			System.out.println("�Է¿���");
			}
			System.out.print("����ұ��?(y/n) : ");
			while(true){
				String answer = scan.next();
				if (answer.equalsIgnoreCase("y")){
					break;
				} else if (answer.equalsIgnoreCase("n")){
					break check;
				} else{
					System.out.print("�ٽ� �Է��� �ֽʽÿ�.(y/n) : ");
				}
			}
		}
	}
}