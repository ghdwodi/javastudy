class Ex03{
	public static void main(String[] args){
	// ���� if~else��
	// if(���ǽ�){���� ���� ���๮;} else{������ ���� ���๮;}

	// ����(su)�� 60 �̻��̸� �հ�, �ƴϸ� ���հ�

		int su = 70;
		String res1;
		if (su>=60){
			res1 = "�հ�";
		} else{
			res1 = "���հ�";
		}
		System.out.println(res1);

	// ������ 1 �Ǵ� 3�̸� ����, 2 �Ǵ� 4�� ����, �������� �ܱ���

		int gender = 4;
		String res2;
		if (gender==1 || gender==3){
			res2 = "����";
		} else{
			if (gender==2 || gender==4){
				res2 = "����";
			} else{
				res2 = "�ܱ���";
			}
		}
		System.out.println(res2);

	// ��1�� ��2�� ���Ͽ� ū ���� ���

		int num1 = 50;
		int num2 = 50;
		String res3 = "";
		if (num1 > num2){
			res3 += num1;
		} else{
			if (num2 > num1){
				res3 += num2;
			} else {
				res3 = "����";
			}
		}
		System.out.println(res3);
	}
}