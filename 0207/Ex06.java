import java.util.*;

class Ex06{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	// �ֹι�ȣ(000000-0) �޾Ƽ� ����, ���� ���(1,2�� 1900����, 3,4�� 2000����)

		System.out.print("\n<����, ���� ���>");

		chk :

		while(true){
			System.out.print("\n�ֹι�ȣ �Է�(���� : 000000-0) : ");
			String jumin = scan.next();
			String year = jumin.substring(0,2);
			char gen = jumin.charAt(7);
			int year2 = Integer.parseInt(year);
			int birth = 0;
			String gender2 = "";
		
			if (gen=='2' || gen=='4'){
				gender2 += "����";
			} else if (gen=='1' || gen=='3'){
				gender2 += "����";
			} else{
				gender2 += "�ܱ���";
			}

			System.out.println("���� : "+gender2);

			if (gen=='1' || gen=='2'){
				birth = year2 + 1900;
				if (birth<=2016){
					System.out.println("���� : "+(2016-birth)+"��");
				} else{
					System.out.println("�Է¿���");
				}
			} else if (gen=='3' || gen=='4'){
				birth = year2 + 2000;
				if (birth<=2016){
					System.out.println("���� : "+(2016-birth)+"��");
				} else{
					System.out.println("�Է¿���");
				}
			} else{
				System.out.println("���� : �ܱ����̶� ���Ұ�");
			}
			System.out.print("����ұ��?(y/n) : ");
			while(true){
				String ans = scan.next();
				if (ans.equalsIgnoreCase("y")){
					break;
				} else if (ans.equalsIgnoreCase("n")){
					break chk;
				} else{
					System.out.print("�ٽ� �Է��� �ּ���.(y/n) : ");
				}
			}
		}
	}
}