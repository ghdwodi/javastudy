class Ex06{
	public static void main(String[] args){
	// while�� -> for���� ����
	// �ʱ��;
	// while(���ǽ�){
	//	// ���ǽ��� ���̸� ����
	//	������;
	// }
	// ���ǽ��� ������ ������ �ΰ� if���� break�� ó���ϴ� ��ĵ� �ִ�.

	// 0���� 10���� ����ϱ�
		int i = 0;
		while (i<11){
			System.out.print(i+" ");
			i++;
		}

	// 0���� 10���� ¦�� ����ϱ�
		System.out.print("\n¦��\n");
		int j = 0;
		while (j<11){
			if (j%2==0){
				System.out.print(j+" ");
			}
			j++;
		}

	// ������ 5�� ����ϱ�
		System.out.println("\n\n<5��>");
		int k = 1;
		while (k<10){
			System.out.print("5 X "+k+" = "+(5*k)+"\n");
			k++;
		}
	// a~z���� ���
		System.out.println("\n<���ĺ�>");
		int l = 'a';
		while (l<('z'+1)){
			System.out.print((char)l+" ");
			l++;
		}

	// 0~10������ ������
		int su1 = 1;
		int res1 = 0;
		while (su1<11){
			res1 = res1 + su1;
			su1++;
		}
		System.out.println("\n<������> :"+res1);

	// 7!
		int su2 = 1;
		int res2 = 1;
		while (su2<8){
			res2 = res2*su2;
			su2++;
		}
		System.out.println("\n7! = "+res2);

	// 0~10���� Ȧ���� ��, ¦���� �� ���ϱ�
		int su3 = 0;
		int res_o = 0;
		int res_e = 0;
		while (su3<11){
			if (su3%2==0){
				res_e = res_e + su3;
			} else{
				res_o = res_o + su3;
			}
			su3++;
		}
		System.out.println("\n<Ȧ����> :"+res_o);
		System.out.println("\n<¦����> :"+res_e);
	}
}