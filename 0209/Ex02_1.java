class Ex02_1 
{
	// ��� �ʵ� : ������ ���
	int su1 = 10;					// ����, �ν��Ͻ�
	static int su2 = 20;			// ����, static
	static final int SU3 = 30;		// �Ϲ����� ��¥ ���(static)
	final int SU4 = 40;				// ������ �������� ���ȭ(instance)

	public void prn(){
		System.out.println("�޼ҵ� ����");
		su1 = su1 + 10;
		su2 = su2 + 10;
//		SU3 = SU3 + 10;				// ����� ���� ������ �� �����Ƿ� ���� �߻�
//		SU4 = SU4 + 10;
		System.out.println(su1);	// jvm�� ȣ���� ���� �޼ҵ尡 �������� ����
		System.out.println(su2);
		System.out.println("�޼ҵ� ��");
	}
	public String prn2(){			// ��ȯ���� String�̹Ƿ� ��ȯ���� �־�� �Ѵ�.
		System.out.println("�޼ҵ� ����");
		String msg = "������ ���� ";
		System.out.println("�޼ҵ� ��");
		return msg;					// ��ȯ�� String
	}
}
