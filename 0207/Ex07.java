import java.util.*;

class Ex07{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(true){					// ���ѷ��� ����
			System.out.print("���� �Է� : ");
			int su = scan.nextInt();
			String res = "";
			if (su%2==0){
				res = "¦��";
			} else{
				res = "Ȧ��";
			}
			System.out.println("����� ������ ���� "+res+"�Դϴ�.");

			System.out.print("����ұ��(y/n)?");
			String str = scan.next();
			if (str.equalsIgnoreCase("n")) break;	// n�̸� ���ѷ��� Ż��
		}
	}
}