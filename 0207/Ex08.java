import java.util.*;

class Ex08{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		label :

		while(true){					// ���ѷ��� ����
			System.out.print("\n���� �Է� : ");
			int su = scan.nextInt();
			String res = "";
			if (su%2==0){
				res = "¦��";
			} else{
				res = "Ȧ��";
			}
			System.out.println("\n����� ������ ���� "+res+"�Դϴ�.");
			System.out.print("����ұ��(y/n)?");
			while(true){
				String str = scan.next();
				if (str.equalsIgnoreCase("y")){
					break;		// ó������
				} else if (str.equalsIgnoreCase("n")) {
					break label;	// ��ü ����
				} else{
					System.out.print("\n�ٽ� �Է��� �ֽʽÿ�(y/n) : ");
				}
			}
		}
	}
}