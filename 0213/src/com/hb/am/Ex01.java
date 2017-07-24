package com.hb.am;

public class Ex01 {
	public static void main(String[] args) {
		// �Ͻ��� ��ü ����
		String s1 = "korea";
		String s2 = "korea";
		// ����� ��ü ����
		String s3 = new String("korea");
		String s4 = new String("korea");
		
		// �Ͻ��� ��ü ������ ����� ��ü ������ ���̸� Ȯ���� ����
		// ��ü == ��ü : ������ ���ϴ� ���� �ƴϴ�. ���� �ּҰ��� ���Ѵ�.
		if (s1==s2){
			System.out.println("����");
		}else{
			System.out.println("�ٸ���");
		} // ���ٰ� ���´�.
		  // ���Ǯ(Cinstant Pool)���� s2�� ������ �� s1�� �̹� ��ϵǾ� �����Ƿ� s1�� �ּҸ� �����ϱ⸸ �Ѵ�.
		  // �Ͻ��� ��ü ������ �� �� �̹� ���� ���ڿ��� �ִٸ� ���� �������� �ʰ� ������ ���� ������ �޾ƿ��� �����̴�.
		
		if (s3==s4){
			System.out.println("����");
		}else{
			System.out.println("�ٸ���");
		} // �ٸ��ٰ� ���´�. new��� ���� ����ϸ� �׻� heap�޸𸮿� ������ ������ ã�� ��ü�� ���� �����ϱ� �����̴�.
		
		// format => ������ �����ϰ� �� ���Ŀ� ���߾� �����ϴ� �޼ҵ�
		String s5 = "hanbit";
		String s6 = "hanbit";
		String s7 = String.format("%20s, %s",s5,s6);	// 20�ڸ�, 0�ڸ� ������ ä������.
		System.out.println("s7 = "+s7);	// s5�� �� 6���̹Ƿ� 14����� �Բ� 20�� ����, s6�� 6�ڸ�ŭ�� ������ ����.
		
		// printf => ������ �����ϰ� �� ���Ŀ� ���߾� ����ϴ� �޼ҵ�
		// s -> ���ڿ�, d -> ����, f -> �Ǽ�
		int su = 314;
		float su2 = 3.445f;
		double su3 = 3.5455;
		double su4 = 125.124;
		System.out.printf("%s, %d, %f, %f",s5,su,su2,su3);
		System.out.println();
		System.out.printf("%s, %3d, %.1f, %.1f",s5,su,su2,su3);
		System.out.println();
		System.out.printf("%s, %3d, %.2f, %.2f",s5,su,su2,su3);
		System.out.println();
		System.out.printf("%s,%5d,%.2f,%.2f",s5,su,su2,su3);
		System.out.println();
		System.out.printf("%s, %5d, %.0f, %.0f",s5,su,su2,su3);
		System.out.println();
		System.out.printf("%s, %5d, %.0f, %.0f, %.0f",s5,su,su2,su3,su4);
		
		// split("������") => ���ڿ��� �迭�� �ɰ��� �޼ҵ�
		
		String s8 = "Happy day 2017 02 13";
		String[] s9 = s8.split(" ");	// => ���⸦ �������� ���ø�
		
		// �迭 ����� ������ for������. Ư�� ������ for���� �������.
		// �ϴ� �׳� for���� �Ʒ��� ����		
		System.out.println();
		for (int i = 0; i < s9.length; i++) {
			System.out.println((i+1)+" : "+s9[i]);
		}
		System.out.println("::::::::������ for��::::::::");
		// ������ for���� ������ �Ʒ��� ����
		// for (�迭���ڷ��� ����Һ��� : �迭){}
		for (String k : s9) {	// ���� k�� int i = 0 ���� �迭 ������ �ݺ��ϴ� ������ ���� ����.
			System.out.println(k);
		}
		
		// split("������", limit);
		System.out.println("::::::::::::::::::");
		String [] s10 = s8.split(" ", 3);
		for (String k : s10) {
			System.out.println(k);
		}
	} 
}
