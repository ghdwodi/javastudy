class Ex02{
	public static void main(String[] args){
		// String : class�� �ڷ������� ����ϴ� ��ǥ���� ���� �ڷ����̴�.
		// ���� �⺻ �ڷ���ó�� ����Ѵ�.
		String str = "�氡�氡";
		System.out.println(str);
		// String�� + �����ڸ� ����� �� �ִ�. (���ڿ����ڷ� ���)
		String str2 = "10";
		int su1 = 10;
		System.out.println(str2+su1); // ����� ���ڿ��̹Ƿ� '1õ1��'�� �ƴ϶� �ϰ��ϰ�'.
		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println("��� : "+str2+10);
		System.out.println("��� : "+su1+100); // "��� : " <- String�̹Ƿ� ���θ�� �߻�.
		System.out.println("��� : "+(su1+100)); // ��ȣ�� �߿伺
		System.out.println(su1+100+"�� �����."); // ���ʺ��� �����ϹǷ� int�� ���� ���
	}
}