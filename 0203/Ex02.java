class Ex02{
	public static void main(String[] args){
	// �ܼ� if�� : ���� ����, ���� ��츸 ����. ������ ���� if�� ��ü�� ����.
	// ���� : if(���ǽ�) {���๮��} -> ���๮�� �ϳ��� ���� �߰�ȣ ���� ����.
	// ����(sum)�� 60 �̻��̸� �հ�
		int sum = 59;
		String res1 = "";
		if (sum>=60){
			res1 = "�հ�";
		}
		System.out.println(res1);
	// ����(sum)�� 60 �̻��̸� �հ�, �ƴϸ� ���հ�

		String res2 = "���հ�";
		if (sum>=60){
		res2 = "�հ�";
		}
		System.out.println(res2);

	// � �� k�� Ȧ������ ¦������ �Ǻ��غ���.

		int k; String res3;
		k = 4;
		res3 = "Ȧ��";
		if (k%2==0){
			res3 = "¦��";
		}
		System.out.println(res3);

	// � ���� k2�� �빮������ �ҹ������� �������� �Ǻ��غ���.

		char k2; String res4;
		k2 = 'A';
		res4 = "�빮�ھƴ�";
		if (k2>='A' && k2<='Z'){
			res4 = "�빮��";
		}
		System.out.println(res4);

	// 8�ð������� �ñ� 6,780��, �ʰ����� 1.5�� ����

		double time, basePay, exPayRate, pay;
		String res5;
		time = 0;
		basePay = 6780;
		exPayRate = 1.5;
		pay = 0;
		if (time<=8){
			pay = time*basePay;
		}
		if (time>8){
			pay = 8*basePay+(time-8)*basePay*exPayRate;
		}
		res5 = "�� "+(int)pay+"��";
		System.out.println(res5);
	}
}