class Ex09{
	public static void main(String[] args){
	// continue�� : ����ݺ������� continue�� �Ʒ� ���๮�� skip�� �� ���� ������ ����
	// for���� ��� ���� ���������� ����
	// while���� ��� ���� ���ǽ����� ���� <- ���ǽ� ���� �������� �־�� ���ѷ��� ����

	// 0~10 ���
		for (int i=0;i<11;i++){
			System.out.print(i+" ");
		}
		System.out.println(":::::::::::::::::");

	// 0~10 ��� (i=3�� �� continue)
		for (int i=0;i<11;i++){
			if (i==3) continue;
			System.out.print(i+" ");
		}
		System.out.println(":::::::::::::::::");

	// while���� ���
	// while�������� for���� ���� continue�� ���� ��ٷο� ���� ����.
		int k=-1;
		while (k<10){
			k++;
			if (k==3) continue;
			System.out.print(k+" ");
		}
		System.out.println(":::::::::::::::::");

	// continue���� �̿��� ¦�� ���
		for (int i=0;i<11;i++){
			if (i%2!=0) continue;
			System.out.print(i+" ");
		}
		System.out.println(":::::::::::::::::");

	// continue label��
	// ���� for���� continue���� ���� for���� ���������� �̵��Ѵ�.
	// continue label���� label�� ���� �ܺ� for���� ���������� �̵��Ѵ�.
		con_label:
		for (int i=1;i<4;i++){
			for (int j=1;j<6;j++){
				if (j==2) continue con_label;
				// if (i==2) continue;
				System.out.print("(i="+i+",j="+j+") ");
			}
			System.out.println();
		}
	}
}