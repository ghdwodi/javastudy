import java.util.*;

class Ex16{
	public static void main(String[] args){
	// �ߺ��� ã��
		int su[] = {10,4,5,9,1,2,3};
		int res = 0;

		for (int i=0;i<su.length-1;i++){
			for(int j=i+1;j<su.length;j++){
				if (su[i]==su[j]){
					res=1;	// ����ġ ������ �ϴ� ����
				}
			}
		}
		if (res==1){
			System.out.println("�ߺ��� ����");
		} else{
			System.out.println("�ߺ��� ����");
		}
	}
}