class Ex01{
	public static void main(String[] args){
	// ���� ������ ?, :
	// ���� -> ���� = ���ǽ� ? ���� ���� ���๮ : ������ ���� ���๮
	// ���ǻ��� : ������ ����, ������ ����� �ڷ����� ���ƾ� �Ѵ�. ���ǽ��� �׻� boolean���̴�.
	// boolean�� -> ����(True, False), �񱳿���(>,<,==,!=,etc...), ������(&&,||,!)
	
	boolean s;
	s = 15==20;
	String res = s ? "�ȳ��ϼ���?" : "Hello?";
	System.out.println(res);

	int res2 = false ? 100+10 : 'A';
	System.out.println(res2);

	// � �� k�� Ȧ������ ¦������ �Ǻ��غ���.

	int k = 40;
	boolean st = (k % 2 == 0);
	String res3 = st ? "¦��" : "Ȧ��";
	System.out.println(res3);

	// � ���� k2�� �빮������ �ҹ������� �������� �Ǻ��غ���.

	char k2;
	k2 = '!';
	boolean st2 = (k2>='A' && k2 <= 'Z');
	boolean st3 = (k2>='a' && k2 <= 'z');
	boolean st4 = (k2>='0' && k2 <= '9');
	String res4 = st2 ? "�빮��" : (st3 ? "�ҹ���" : (st4 ? "����" : "�� ��"));
	System.out.println(res4);

	// � ����� ��������� 90 �̻��̸� A����, 80 �̻��̸� B����, �������� F����

	int avg; boolean grA, grB, grF; String res5;
	avg = 70;
	grA = (avg>=90 && avg<=100);
	grB = (avg<90 && avg>=80);
	grF = (avg<80 && avg>=0);
	res5 = grA ? "A����" : (grB ? "B����" : (grF ? "F����" : "�Է¿���"));
	System.out.println(res5);

	// ������ 1 �Ǵ� 3�̸� ����, 2 �Ǵ� 4�� ����, �������� �ܱ���

	int gender; boolean male, female; String res6;
	gender = 4;
	male = (gender == 1 || gender == 3);
	female = (gender == 2 || gender == 4);
	res6 = male ? "����" : (female ? "����" : "�ܱ���");
	System.out.println(res6);

	// 8�ð������� �ñ� 6,780��, �ʰ����� 1.5�� ����

	double time, basePay, exPayRate, pay; boolean base, ex; String res7;
	time = 10;
	basePay = 6780;
	exPayRate = 1.5;
	base = (time>=0 && time<=8);
	ex = (time>8);
	pay = base ? (time*basePay) : (8*basePay+(time-8)*basePay*exPayRate);
	res7 = "�� "+(int)pay+"��";
	System.out.println(res7);
	}
}