class Ex06{
	public static void main(String[] args){
	// �� ������ &&, ||(OR, ����, ������), !(NOT, ����)
	// !(not)�� 1����, ������ ���� 6����
	// ����� boolean������ ����

	// &&(AND, ����, ������) : false�� ������ ����� false. �� ������ ������� ������ ����.
	// ���� >= && <= ���� <- ���� ����

		int su1 = 10;
		int su2 = 7;
		boolean res = (su1 >= 7) && (su2 >= 5);
		System.out.println("��� : "+res);
		res = (su1 <= 7) && (su2 >= 5);
		System.out.println("��� : "+res);
		res = (su1 >= 7) && (su2 <= 5);
		System.out.println("��� : "+res);
		res = (su1 <= 7) && (su2 <= 5);
		System.out.println("��� : "+res);

		int num1 = 10;
		int num2 = 20;
		res = ((num1 = num1+12) > num2) && (num1 == (num2 = num2+2));
		System.out.println("res : "+res);
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);

		int num3 = 10;
		int num4 = 20;
		res = ((num3 = num3+12) < num4) && (num3 == (num4 = num4+2));
		System.out.println("res : "+res);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4); // �� ������ false�����Ƿ� �� ������ �������� �ʾҴ�.

	// ||(OR, ����, ������) : true�� ������ ����� true. �� ������ ������� ������ ����.

		int su3 = 10;
		int su4 = 7;
		res = (su3 >= 7) || (su4 >= 5);
		System.out.println("��� : "+res);
		res = (su3 <= 7) || (su4 >= 5);
		System.out.println("��� : "+res);
		res = (su3 >= 7) || (su4 <= 5);
		System.out.println("��� : "+res);
		res = (su3 <= 7) || (su4 <= 5);
		System.out.println("��� : "+res);

		int num5 = 10;
		int num6 = 20;
		res = ((num5 = num5+12) > num6) || (num5 == (num6 = num6+2));
		System.out.println("res : "+res);
		System.out.println("num5 : "+num5);
		System.out.println("num6 : "+num6); // �� ������ true�����Ƿ� �� ������ �������� �ʾҴ�.

		int num7 = 10;
		int num8 = 20;
		res = ((num7 = num7+12) < num8) || (num7 == (num8 = num8+2));
		System.out.println("res : "+res);
		System.out.println("num7 : "+num7);
		System.out.println("num8 : "+num8);
	}
}