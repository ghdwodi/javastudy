import java.util.*;

class Hw02{
	public static void main(String[] args){
	// 메뉴 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000, 4이면 과일쥬스 3500
	// 지불한 돈은 10000
	// 친구와 두 잔 먹었을 때 잔돈은 얼마를 받아야 하는가?(부가세 10%)
		Scanner scan = new Scanner(System.in);

		chk :
		while(true){
			String name = "";
			int menu, price, num, pay, total, change;
			double vatRate = 0.1;

			System.out.print("메뉴(1. 카페모카, 2.카페라떼, 3.아메리카노, 4.과일쥬스) : ");
			while(true){
				menu = scan.nextInt();
				if(menu>=1 && menu<=4){
					break;
				} else{
					System.out.print("다시 입력하십시오(1. 카페모카, 2.카페라떼, 3.아메리카노, 4.과일쥬스) : ");
				}
			}
			System.out.print("개수 : ");
			num = scan.nextInt();

			System.out.print("지불액 : ");
			pay = scan.nextInt();

			if (menu==1){
				price = 3500;
				name = "카페모카";
			} else if (menu==2){
				price = 4000;
				name = "카페라떼";
			} else if (menu==3){
				price = 3000;
				name = "아메리카노";
			} else {
				price = 3500;
				name = "과일쥬스";
			}

			total = (int)(price*num*(1+vatRate));
			change = pay - total;

			System.out.println("메뉴 : "+name+"\n총 "+num+"잔");
			System.out.println("지불액 : "+pay+"원\n총액 : "+total+"원");
			System.out.println("거스름돈 : "+change+"원");

			System.out.print("\n계속하시겠습니까?(y/n) : ");
			while(true){
				String ans = scan.next();
				if (ans.equalsIgnoreCase("y")){
					break;
				} else if (ans.equalsIgnoreCase("n")){
					break chk;
				} else {
					System.out.print("다시 입력하십시오.(y/n) : ");
				}
			}
		}
	}
}