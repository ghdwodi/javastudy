import java.util.*;

class Hw01{
	public static void main(String[] args){
	// ���� ���ڿ� �� ù ���ڰ� �빮������, �ҹ�������, �������� �Ǻ��ϰ�
	// ��� ���ڿ��� �ҹ��ڷ� ��ȯ�϶�

		Scanner scan = new Scanner(System.in);
		System.out.println("<�ҹ��� ��ȯ ����>");
		chk :

		while(true){
			System.out.print("���ڿ��� �Է��ϼ��� : ");
			String str = scan.next();
			String str2 = "";
			int len = str.length();
			char ch = str.charAt(0);
			if (ch>='a' && ch<='z'){
				System.out.println("ù ���� : �ҹ���");
			} else if (ch>='A' && ch<='Z'){
				System.out.println("ù ���� : �빮��");
			} else if (ch>='0' && ch<='9'){
				System.out.println("ù ���� : ����");
			} else{
				System.out.println("ù ���� : �׿�");
			}

			for (int i=0;i<len;i++){
				if (str.charAt(i)>='A' && str.charAt(i)<='Z'){
					str2 += (char)(str.charAt(i)+32);
				} else{
					str2 += (char)(str.charAt(i));
				}
			}
			System.out.println("��� : "+str2);
			System.out.print("\n����Ͻðڽ��ϱ�?(y/n) : ");
			while(true){
				String ans = scan.next();
				if (ans.equalsIgnoreCase("y")){
					break;
				} else if (ans.equalsIgnoreCase("n")){
					break chk;
				} else{
					System.out.print("�ٽ� �Է��� �ֽʽÿ�.(y/n) : ");
				}
			}
		}
	}
}