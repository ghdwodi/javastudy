class Ex05{
	public static void main(String[] args){
	// switch�� : ���ڰ��� ������ ���ǰ��� ������ ������� ã�Ƴ� ����� �����Ѵ�.
	// switch (���ڰ�){
	// 	case ���ǰ�1 :	// �����ݷ�(;)�� �ƴ� �ݷ�(:)�ӿ� ������ ��
	//	���๮; break;	// break�� �� ���Ǹ��� �־� �־�� �Ѵ�
	// 	case ���ǰ�2 :	// break�� �����ϸ� ���� break���� ���� ������ ��� �����Ѵ�.
	//	���๮; break;
	// 	case ���ǰ�3 :
	//	���๮; break;
	//	default :	// <- � ���ǵ� �������� ������ �����ϴ� �⺻��
	//	���๮;
	// }

	// ���ڰ�,���ǰ����� long�� ������ ������, ������, String�� �� �� �ִ�.
	// (�񱳿���, ������, boolean���� �� �� ����)

	// char ch�� A, a�̸� ������ī, B,b�̸� �����, C,c�̸� ĳ����, �������� �ѱ�

		char ch = 'C';
		String res1 = "";
		switch (ch){
			/*case 'a': res1 = "������ī"; break;
			case 'A': res1 = "������ī"; break;
			case 'b': res1 = "�����"; break;
			case 'B': res1 = "�����"; break;
			case 'c': res1 = "ĳ����"; break;
			case 'C': res1 = "ĳ����"; break;
			default : res1 = "�ѱ�";*/

			case 'a': 
			case 'A': System.out.println("������ī"); break;
			case 'b': 
			case 'B': System.out.println("�����"); break;
			case 'c': 
			case 'C': System.out.println("ĳ����"); break;
			default : System.out.println("�ѱ�");
			// �پ� �ִ� ���ǳ��� break �ϳ��� ��� ORó�� ó���� ���� �ִ�.
		}
		// System.out.println(res1);
	
	// month�� 3,4,5�� "��", 6,7,8�̸� "����", 9,10,11�̸� "����", 12,1,2�̸� "�ܿ�"

		int month = 3;
		switch(month){
			case 3:
			case 4:
			case 5: System.out.println("��"); break;
			case 6:
			case 7:
			case 8: System.out.println("����"); break;
			case 9:
			case 10:
			case 11: System.out.println("����"); break;
			case 12:
			case 1:
			case 2: System.out.println("�ܿ�"); break;
			default : System.out.println("??");
		}

	// ����� 90 �̻��̸� A����, 80 �̻��̸� B����, 70 �̻��̸� C����, �������� F����

		int avg = 71;
		String res2 = "";
		switch((int)(avg/10)){
			case 10:
			case 9: res2 = "A����"; break;
			case 8: res2 = "B����"; break;
			case 7: res2 = "C����"; break;
			default : res2 = "F����";
		}
		System.out.println(res2);

	// �޴� 1�̸� ī���ī 3500, 2�̸� ī��� 4000, 3�̸� �Ƹ޸�ī�� 3000, 4�̸� �����꽺 3500
	// ������ ���� 10000
	// ģ���� �� �� �Ծ��� �� �ܵ��� �󸶸� �޾ƾ� �ϴ°�?(�ΰ��� 10%)

		int menu, price, num, pay;
		double taxRate;
		String res3 = "";

		menu = 1;
		num = 2;
		pay = 10000;
		taxRate = 0.1;

		switch(menu){
			case 1: res3 = (pay - (int)Math.round(3500*num*(1+taxRate)))+"��"; break;
			case 2: res3 = (pay - (int)Math.round(4000*num*(1+taxRate)))+"��"; break;
			case 3: res3 = (pay - (int)Math.round(3000*num*(1+taxRate)))+"��"; break;
			case 4: res3 = (pay - (int)Math.round(3500*num*(1+taxRate)))+"��"; break;
			default: res3 = "�Է¿���";
		}
		System.out.println(res3);
	}
}