import java.util.*;

class Ex01{
	public static void main(String[] args){
	// �������� ����
		int su[] = {2,1,2,10,4,4,3,7,8,6};
		int su1;
		for (int i=0;i<su.length-1;i++){
			for(int j=i+1;j<su.length;j++){
				su1 = su[j];
				if (su[i]>su[j]){
					su[j] = su[i];
					su[i] = su1;
				}
			}
		}
		for (int i=0;i<su.length;i++){
			System.out.print(su[i]+" ");
		}

	// Arrays Ŭ������ sort �޼ҵ带 ����� ����
	// Arrays Ŭ���� API�� ����ϱ� ���ؼ��� java.util�� import�ؾ� �Ѵ�

		int su2[] = {2,1,3,10,5,4,3,7,8,6};
		Arrays.sort(su2);
		System.out.println("\n:::::::::::::::::::::");
		for (int i=0;i<su2.length;i++){
			System.out.print(su2[i]+" ");
		}
	}
}