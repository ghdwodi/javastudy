class Ex03_main 
{
	public static void main(String[] args) 
	{
		// �ΰ��� �޼ҵ�� static�̹Ƿ� ��ü ���� ���� ȣ�� ����
		// ȣ��� Ŭ����.�޼ҵ��̸�
		// ��ȯ���� �����Ƿ� ��ȯ���� �´� �ڷ����� ������ ���� ���� �޴´�.
		double res = Ex03.vat(1000);
		System.out.println("vat : "+res);

		// instance �޼ҵ�� Ŭ������ ��ü�� ������ ��� ����
		// �� �޼ҵ忡�� ������ ������ �޼ҵ尡 ������ ������� ����������.
		// �ش� �޼ҵ尡 ������� ������ ������ ��������� �ʴ´�
		Ex03 test = new Ex03();
		int res2 = test.add(2,3);	// �޼ҵ� ȣ�� �� �Ű������� �ڷ����� ������ ��ġ���� ������ �ٸ� �޼ҵ�� ����Ѵ�.
		System.out.println("add��� : "+res2);
		res2 = test.add(2,'a');
		System.out.println("add��� : "+res2);

		res = test.sub(10,20);
		System.out.println("sub��� : "+res);

		test.mul(10, 20);
		test.div(7,3);

	}
}
