//import java.util.Scanner;
import java.util.*; // java.util�� ��� Ŭ������ �ҷ��´�(�ӵ� ���̰� ������ ��ü�� �ǹ̾���)

class Ex01{
	public static void main(String[] args){
	// Ű���� I/O(��ǲ, �ƿ�ǲ)
	// Ŭ���� Scanner : java.lang�� �������� �����Ƿ� import�ؾ� �Ѵ�.

	// ǥ�� �Է���ġ(Ű����)�� �Է��� �����͸� scan�� ����
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� : "); // �Է¹��� �ڷῡ ���� ���� ���
	// String name = scan.next();
	// �Է��� scan�� �ڷ����� ����, �и��� ����(scan.nextXXX)
		String name2 = scan.nextLine() ;
	// �׳� next�� ���⸦ �ν����� ���ϹǷ� �� ���� ������ �����ϴ� �޼ҵ� nextLine�� ���.

		System.out.print("���� : ");
		int age = scan.nextInt(); // scan������ ��� �ԷµǹǷ� ��� �ٸ� ������ �������ش�.

		System.out.print("Ű : ");
		double height = scan.nextDouble();

		System.out.print("�����Դϱ�? : ");
		boolean res = scan.nextBoolean();

		if (res){
			System.out.println("�̸� : "+name2);
			System.out.println("���� : "+age);
			System.out.println("Ű : "+height);
		} else{
			System.out.println("������!");
		}

	
	}
}