class Ex08{
	public static void main(String[] args){
	// break�� : ���� �ݺ��� Ż��

	// 0~10���� ���
		for (int i=0;i<11;i++){
			System.out.print(i+" ");
		}
		System.out.println();

	// 0~3������ ���
		for (int i=0;i<11;i++){
			if (i==4) break;
			System.out.print(i+" ");
		}
		System.out.println();

	// while������ 0~10���� ���

		int k=0;
		while(k<11){
			System.out.print(k+" ");
			k++;
		}
	// while���� break�� 0~10���� ���

		System.out.println();
		int k2=0;
		while(k2<11){
			if (k2==4) break;
			System.out.print(k2+" ");
			k2++;
		}

		System.out.println(); // ���ǽ��� �ƿ� true�� �൵ �ȴ�.
		int k3=0;
		while(true){
			if (k3==4) break;
			System.out.print(k3+" ");
			k3++;
		}
		System.out.println();

	// ���� for�������� break label��
	// ���� �ݺ����� �ϳ��� label�� ���� �� �� ���� �������´�.
		System.out.println("::::::::::::::break label ����::::::::::::::");
		chk : // ���̺� ����
		for (int i=1;i<4;i++){
			for (int j=1;j<6;j++){
				if (j==4) break chk;
				System.out.print("i="+i+", j="+j+" ");
			}
			System.out.println();
		}
		System.out.println(":::::::::::::::::::"); // label ��ü�� Ż�������Ƿ� �ٹٲ޾���
	}
}