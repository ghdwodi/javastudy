class Ex07{
	public static void main(String[] args){
	// do-while�� -> while������ �޸� �ϴ� �� �� ������ �� ������ ��������.
	// �װ� �ٴ�. ��� while���� ���� �׸��̴�.
	// �ʱ��;
	// do{
	//	���๮;
	//	������;
	// } while (���ǽ�); <- ;�� �ٿ��� �Ѵٴ� ���� ������ ��

	// 0~10 ���

		int i=0;
		do{
			System.out.print(i+" ");
			i++;
		} while(i<11);

	// 0~10 ¦�� ���

		System.out.println("\n¦��");
		int j=0;
		do{
			if (j%2==0){
				System.out.print(j+" ");
			}
			j++;
		} while(j<11);

	// ������ 5��

		System.out.println("\n<5��>");
		int su1=1;
		do{
			System.out.print("5 X "+su1+"= "+su1*5+"\n");
			su1++;
		} while(su1<6);

	// a~z ���

		System.out.println("\n<���ĺ�>");
		int ch1='a';
		do{
			System.out.print((char) ch1+" ");
			ch1++;
		} while(ch1<('z'+1));

	// 0~10 ������

		int su2=0;
		int res=0;
		do{
			res = res + su2;
			su2++;
		} while(su2<11);
		System.out.println("\n<������> : "+res);

	// 7!

		int su3=1;
		int resfac=1;
		do{
			resfac = resfac*su3;
			su3++;
		} while(su3<8);
		System.out.println("\n7! = "+resfac);

	// 0~10 Ȧ����, ¦����

		int su4=1;
		int res_odd=0;
		int res_eve=0;
		do{
			if (su4%2==0){
				res_eve = res_eve + su4;
			} else{
				res_odd = res_odd + su4;
			}
			su4++;
		} while(su4<11);
		System.out.println("¦���� = "+res_eve+" Ȧ���� = "+res_odd);
	}
}