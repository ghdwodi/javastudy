class Ex5{
	public static void main(String[] args){

	// ������ : �⺻�� int��
	// byte < short < int < long
	// byte : -128 ~ 127

	byte su = 127;
	// System.out.println(su+1); <- ���� ������ �����̹Ƿ� ������ �߻����� ����.
	byte su2 = -128;
	// byte result = su+su2; <- byte���� ���ص� '���� ���'�� �׻� int�̱� ������ ���� �߻�
	int result = su+su2;
	System.out.println(result);

	// long���� ���� �ڿ� L �Ǵ� l �� ���δ�. (���� ��������)
	long num1 = 1234L;
	long num2 = 214; // int�� �� ū �ڷ����� long���� ��ȯ. ���θ���̶� �Ѵ�.(p.64)
	long sum = num1+num2;
	System.out.println(sum);

	// �Ǽ��� : �⺻�� double��
	// flaot < double
	float pi = 3.14f; // long���� �޸� �ݵ�� F�� f�� �ٿ� �����ؾ� �Ѵ�.(�����Ұ�)
	// long�� ���� ���θ���� �Ͼ���� float�� double�� ���ؼ� �����Ƿ� �Ͼ�� �ʴ´�.
	System.out.println(pi);
	}
}