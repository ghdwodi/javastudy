import java.util.*;

class Ex05{
	public static void main(String[] args){
	// ������ � �����
	// Calendar�� �̿��� ���� ��¥�� ���Ѵ�
	// Math.random()�̳� Random()�� �̿��� ���%���� �����

		Calendar now = Calendar.getInstance();

	// ��, ��, ��

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DATE);

	// ��� % ���ϱ�

		Random ran = new Random();
		int su = ran.nextInt(101);
		int su2 = (int)(ran.nextDouble()*101);
		int su3 = (int)(Math.random()*101);

		System.out.println(year+"�� "+month+"�� "+day+"�� ����� �");
		System.out.println("������ ������ : "+su+"%");
		System.out.println("������ ������ : "+su2+"%");
		System.out.println("������ ������� : "+su3+"%");
	}
}