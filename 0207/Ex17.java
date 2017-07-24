import java.util.*;

class Ex17{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		chk :
		while(true){
			int su[] = new int[6];
			int res = 0;
			for(int i=0;i<su.length;i++){
				System.out.print((i+1)+"번째 숫자를 입력하십시오 : ");
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
					System.out.println("중복값이 있습니다. 다시 입력하십시오.");
					break;
				} else{
					System.out.println("중복값 없이 제대로 입력되었습니다.");
					break chk;
				}
			}
		}
	}
}