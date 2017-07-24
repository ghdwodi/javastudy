import java.util.*;

class Ex04{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	// 알바시간 받아서 임금 계산 : 8시간까지 6870원, 초과하면 1.5배
		System.out.print("<임금계산>");

		check :

		while(true){
			System.out.print("\n근무시간 : ");
			int hour = scan.nextInt();
			int pay = 0;
			if (hour<0){
				System.out.println("입력오류");
			} else{
				if (hour<=8){
					pay = hour * 6870;
				} else{
					pay = (8 * 6870) + (int)((hour-8)*1.5*6870);
				}
				System.out.println("임금 : "+pay+"원");
			}
			System.out.print("\n계속하시겠습니까?(y/n) : ");
			while(true){
				String ans = scan.next();
				if (ans.equalsIgnoreCase("y")){
					break;
				} else if (ans.equalsIgnoreCase("n")){
					break check;
				} else{
					System.out.print("다시 입력하십시오.(y/n) : ");
				}
			}
		}
	}
}