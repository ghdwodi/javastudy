class Ex06{
	public static void main(String[] args){
	// for��
	// for (�ʱ��; ���ǽ�; ������){���๮��;}
	// for���� ���ѷ����� ������ ��
	// �ʱ�Ŀ��� ���� ������ for�� �������� �����Ѵ�
	// �̷� ������ ���������� �Ѵ�(���Ǿ� : ��������)

	// 0���� 10���� ����غ���
		System.out.println("0���� 10����");
		for (int i=0; i<=10; i=i+1){
			System.out.println("i = "+i);
		}
	// 0���� 10���� ¦���� ����غ���
		System.out.println("\n0���� 10���� ¦����");
		for (int i=0; i<=10; i=i+1){
			if(i%2==0){
				System.out.println("i = "+i);
			}
		}

	// ������ �ۿ��� �����ϴ� ���
		int j;

		System.out.println("\n�������� j�� ����");
		for (j=0; j<=10;j++){
		}			// ���δ� ��� ������ j�� ��� ���� ����
		System.out.println("j = "+j);

	// ������ 5��
		System.out.println("\n������ 5��");
		for (int i=1;i<=9;i++){
			if (i==1 || i==3 || i==6 || i==7 || i==8){
				System.out.println("5 ���ϱ� "+i+"�� "+(5*i));
			} else{
				System.out.println("5 ���ϱ� "+i+"�� "+(5*i));
			}
		}

	// a~z���� ����ϱ�
		System.out.println("\n���ĺ�");
		for (char i='a';i<='z';i++){
			System.out.print(i+" ");
		}

	// a~z���� ����ϱ� (int)
		System.out.println("\n\n���ĺ�(int�� ����)");
		for (int i='A';i<='Z';i=i+1){
			System.out.print((char)i+" ");
		}

	// 0 ~ 10 ���� ������ ���ϱ�
		System.out.println("\n\n������");
		int res = 0;
		for (int i=0;i<=10;i++){
			res = res+i;
		}
		System.out.println("�հ� : "+res);

	// 1 ~ 10 ���� Ȧ���� �հ� ¦���� ���� ���� ���ϱ�
		System.out.println("\nȦ¦ ��");
		int res2 = 0;
		int res3 = 0;
		for (int i=1;i<=10;i++){
			if (i%2==0){
				res2 = res2 + i;
			} else{
				res3 = res3 + i;
			}
		}
		System.out.println("¦���� : "+res2+"\nȦ���� : "+res3);
	// 7!
		int input = 7;
		int res4 = 1;
		for (int i=1;i<=input;i=i+1){
			res4 = res4*i;
		}
		System.out.println("\n"+input+"! = "+res4);
	}
}