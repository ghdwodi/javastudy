class Ex04{
	public static void main(String[] args){
	// ���� if��
	// if(���ǽ� 1) {
	// 	���ǽ� 1�� ���̸� �����ϴ� ����
	// } else if(���ǽ� 2){
	// 	���ǽ� 1�� �����̰� ���ǽ� 2�� ���̸� �����ϴ� ����
	// } else if(���ǽ� 3){
	// 	���ǽ� 1~2�� �����̰� ���ǽ� 3�� ���̸� �����ϴ� ����
	// } else{
	// 	���ǽ� 1~3�� ��� �����̸� �����ϴ� ����
	// }


	// � ����� ��������� 90 �̻��̸� A����, 80 �̻��̸� B����, 70 �̻��̸� C����, �������� F����

		double avg;
		boolean grA, grB, grC, grF;
		String res1;
		avg = 85;
		grA = (avg>=90 && avg<=100);
		grB = (avg<90 && avg>=80);
		grC = (avg<80 && avg>=70);
		grF = (avg<70 && avg>=0);

		if (grA){
			res1 = "A����";
		} else if (grB){
			res1 = "B����";
		} else if (grC){
			res1 = "C����";
		} else if (grF){
			res1 = "F����";
		} else{
			res1 = "�Է¿���";
		}
		System.out.println(res1);

	// char ch�� A, a�̸� ������ī, B,b�̸� �����, C,c�̸� ĳ����, �������� �ѱ�

		char ch;
		String res2;
		ch = 66;

		if (ch=='A' || ch=='a'){
			res2 = "������ī";
		} else if (ch=='B' || ch=='b'){
			res2 = "�����";
		} else if (ch=='C' || ch=='c'){
			res2 = "ĳ����";
		} else{
			res2 = "�ѱ�";
		}
		System.out.println(res2);

	// char ch2�� �빮��, ����, �ҹ��� ���� �Ǻ�

		char ch2;
		String res3;

		ch2 = '!';

		if (ch2>='a' && ch2<='z'){
			res3 = "�ҹ���";
		} else if (ch2>='A' && ch2<='Z'){
			res3 = "�빮��";
		} else if (ch2>='0' && ch2<='9'){
			res3 = "����";
		} else{
			res3 = "�� ��";
		}
		System.out.println(res3);
		

	// �޴� 1�̸� ī���ī 3500, 2�̸� ī��� 4000, 3�̸� �Ƹ޸�ī�� 3000, 4�̸� �����꽺 3500
	// ������ ���� 10000
	// ģ���� �� �� �Ծ��� �� �ܵ��� �󸶸� �޾ƾ� �ϴ°�?(�ΰ��� 10%)

		int menu, price, num, pay, totalPrice, change;
		double taxRate;
		String name = "";
		String res4 = "";

		menu = 2;
		price = 0;
		num = 2;
		pay = 10000;
		taxRate = 0.1;
		if (menu>=1 && menu <= 4){
			if (menu==1){
				price = 3500;
				name = "ī���ī";
			} else if (menu==2){
				price = 4000;
				name = "ī���";
			} else if (menu==3){
				price = 3000;
				name = "�Ƹ޸�ī��";
			} else{
				price = 3500;
				name = "�����꽺";
			}
		totalPrice = (int)Math.round(price*num*(1+taxRate));
		change = pay - totalPrice;
		res4 = (name+" "+num+"��\n���Ҿ� "+pay+
		"��\n������ "+totalPrice+"��\n�Ž����� "+(int)change+"��");
		} else {
		res4 = "�Է¿���";
		}
		System.out.println(res4);
	}
}