class Ex05{
	public static void main(String[] args){
	// �񱳿����ڴ� ������ �������� �Ѵ�.
	// ex) a < b : a�� b���� �۴�(O), b�� a���� ũ��(X)
	// ���ǻ��� : String�� ==�� ���� �� ����.(���� �߻�)
	// char�� �ڵ尪(����)�� ����ǹǷ� == ������ ��� ����.
	// ����� ������ boolean������ ����. ���ǽĿ� ���� ����Ѵ�.

		int su1 = 20;
		int su2 = 30;
		boolean res1 = su1 > su2;

		System.out.println("��� : "+res1);

		char ch1 = 'A';
		char ch2 = 'a';
		boolean res2 = ch1 > ch2;
		System.out.println("��� : "+res2);

		// ��ҹ��� �Ǻ��ϱ�
		char k = 'P';
		boolean res3 = k >= 'A' && k <= 'Z'; // �빮��
		boolean res4 = k >= 'a' && k <= 'z'; // �ҹ���

		System.out.println(k+"�� �빮���ΰ�? : "+res3+"\n�ƴϸ� "+k+"�� �ҹ����ΰ�? : "+res4);
	}
}