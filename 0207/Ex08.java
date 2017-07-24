import java.util.*;

class Ex08{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		label :

		while(true){					// 무한루프 시작
			System.out.print("\n정수 입력 : ");
			int su = scan.nextInt();
			String res = "";
			if (su%2==0){
				res = "짝수";
			} else{
				res = "홀수";
			}
			System.out.println("\n당신이 선택한 수는 "+res+"입니다.");
			System.out.print("계속할까요(y/n)?");
			while(true){
				String str = scan.next();
				if (str.equalsIgnoreCase("y")){
					break;		// 처음으로
				} else if (str.equalsIgnoreCase("n")) {
					break label;	// 전체 종료
				} else{
					System.out.print("\n다시 입력해 주십시오(y/n) : ");
				}
			}
		}
	}
}