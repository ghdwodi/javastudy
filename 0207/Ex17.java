import java.util.*;

class Ex17{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		chk :
		while(true){
			int su[] = new int[6];
			int res = 0;
			for(int i=0;i<su.length;i++){
				System.out.print((i+1)+"��° ���ڸ� �Է��Ͻʽÿ� : ");
				su[i] = scan.nextInt();
			}

			for(int i=0;i<su.length-1;i++){
				for(int j=i+1;j<su.length-1;j++){
					if (su[i]==su[j]){
						res=1;
					}
				}
			}
			while(true){
				if (res==1){
					System.out.println("�ߺ����� �ֽ��ϴ�. �ٽ� �Է��Ͻʽÿ�.");
					break;
				} else{
					System.out.println("�ߺ��� ���� ����� �ԷµǾ����ϴ�.");
					break chk;
				}
			}
		}
	}
}