import java.util.*;

class Ex07{
	public static void main(String[] args){
	// 가위바위보 게임
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int wins = 0;
		int drow = 0;
		int q = 0;
		int times = 0;
		String userAns = "";

		chk:

		while(true){

			q = ran.nextInt(3);	// 0:가위 1:바위 2:보
			System.out.print("가위, 바위, 보 중 하나를 입력하세요 : ");
			userAns = scan.next();
			if (userAns.equals("가위")){
				if (q==0){
					System.out.println("가위 VS 가위 : 무승부!");
					drow++;
				} else if (q==1){
					System.out.println("가위 VS 바위 : 패!");
				} else {
					System.out.println("가위 VS 보 : 승!");
					wins++;
				}
			} else if (userAns.equals("바위")){
				if (q==0){
					System.out.println("바위 VS 가위 : 승!");
					wins++;
				} else if (q==1){
					System.out.println("바위 VS 바위 : 무승부!");
					drow++;
				} else {
					System.out.println("바위 VS 보 : 패!");
				}
			} else if (userAns.equals("보")){
				if (q==0){
					System.out.println("보 VS 가위 : 패!");
				} else if (q==1){
					System.out.println("보 VS 바위 : 승!");
					wins++;
				} else {
					System.out.println("보 VS 보 : 무승부!");
					drow++;
				}
			} else {
				System.out.println("다시 입력하세요.");
				continue;
			}
			times++;

			System.out.print("\n계속할까요?(y/n) : ");

			while(true){
				String answer = scan.next();
				if (answer.equalsIgnoreCase("y")){
					break;
				} else if (answer.equalsIgnoreCase("n")){
					double winsRate = (int)(wins*100/times);
					System.out.println("\n"+wins+"승 "+drow+"무 "+(times-wins-drow)+"패");
					System.out.println("승률 : "+winsRate+"%");
					break chk;
				} else {
					System.out.print("다시 입력하세요.(y/n) : ");
				}
			}
		}
	}
}