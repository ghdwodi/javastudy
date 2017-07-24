import java.util.*;

class Ex05{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	// 수1, 수2, 연산자 받아서 계산 후 출력

		String plus = "+"; String minus = "-"; String multi = "*"; String div = "/";

		System.out.print("\n<사칙연산>");

		chk :

		while(true){
			System.out.print("\n숫자1 : ");
			double su1 = scan.nextDouble();
			System.out.print("\n숫자2 : ");
			double su2 = scan.nextDouble();
			System.out.print("\n연산자 : ");
			String oper = scan.next();
		// nextLine은 왜 오류가 나는가? 출력할 때 뒷 내용이 있는 경우는 next로 받아야 한다.

			boolean b1 = oper.equals(plus);
			boolean b2 = oper.equals(minus);
			boolean b3 = oper.equals(multi);
			boolean b4 = oper.equals(div);
			double res = 0;

			if (b1 || b2 || b3 || b4){
				if (b1){
					res = su1 + su2;
				} else if (b2){
					res = su1 - su2;
				} else if (b3){
					res = su1 * su2;
				} else {
					res = su1 / su2;
				}
			System.out.println(su1+" "+oper+" "+su2+" = "+res);
			} else{
			System.out.println("입력오류");
			}
			System.out.print("계속할까요?(y/n) : ");
			while(true){
				String ans = scan.next();
				if (ans.equalsIgnoreCase("y")){
					break;
				} else if (ans.equalsIgnoreCase("n")){
					break chk;
				} else{
					System.out.print("다시 입력하세요.(y/n) : ");
				}
			}
		}
	}
}