class Ex01{
	public static void main(String[] args){
	// ���θ�� : �ڵ� �� ��ȯ. ���� �ڷ����� ū �ڷ������� ��ȯ. ����, �����ս� ����.
			
		long su1 = 10;
		int num1 = 20;
		su1 = num1; // long�� = int�� ���θ��
		System.out.println(su1);

		char ch = 'a';
		num1 = ch; // char�� = int�� ���θ�� (int > char)
		System.out.println(num1);

		float su2 = su1;
		System.out.println(su2);

	// ���� : ���� �� ��ȯ(ĳ����).
	// ū �ڷ����� ���� �ڷ������� ��ȯ�� ���� ������ ���ִ� ���� ��ȯ. ���� �ս� ���ɼ� ����.

		int su3 = 129;
		// byte num2 = su3; <- int�� byte�� ������� �� ����.
		// �ڷ��� ������ = (�����ڷ���)(������);
		byte num2 = (byte)(su3);
		System.out.println(num2);
		// su3 = 129�̹Ƿ� float�� ������ �ʰ�. ���� �� ���� ���Ƽ� ���� �߻�.

		int num3 = 65;
		// char ch2 = num3; <- int > char �̹Ƿ� ���� �߻�.
		char ch2 = (char)(num3);
		System.out.println(ch2); // ASCII code 65 = 'A' �� ���.
	}
}