import java.util.*;

class Ex14{
	public static void main(String[] args){
	// Ű���带 ���� �����̸��� �Է¹޾� �迭�� �ֱ�
	// �迭 ���� ����ϱ�
		Scanner scan = new Scanner(System.in);
		String[] str = new String[5];
		for(int i=0;i<str.length;i++){
			System.out.print("���� �̸��� �Է��ϼ��� : ");
			String nation = scan.next();
			str[i] = nation;
		}
		System.out.println("\n<�Է��� �����>");
		for(int i=0;i<str.length;i++){
			String res = str[i];
			System.out.print("["+res+"] ");
		}

	}
}