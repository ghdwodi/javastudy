import java.util.*;

class Ex06{
	public static void main(String[] args){
	// 컴퓨터가 높음, 낮음 값을 갖고 있고 유저가 이것을 맞추는 게임
	// 게임 횟수와 맞춘 횟수를 저장해 승률을 출력

		int ans = 0;		// 맞춘 횟수
		int times = 0;		// 전체 횟수
		String sol = "";

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		chk :

		while(true){
			boolean q = ran.nextBoolean();	// true = 높음, false = 낮음
			System.out.print("높을까요? 낮을까요?(높음/낮음으로 입력) : ");
			sol = scan.next();		// 높음, 낮음 값을 String으로 받음
			if (sol.equals("높음")){
				if (q){
					System.out.println("\n대단해요! 정답입니다.");
					ans++;
				} else {
					System.out.println("\n아쉽네요! 오답입니다.");
				}
			} else if (sol.equals("낮음")){
				if (q){
					System.out.println("\n아쉽네요! 오답입니다.");
				} else {
					System.out.println("\n대단해요! 정답입니다.");
					ans++;
				}
			} else {
				System.out.println("다시 입력해 주세요\n");
				continue;
			}
			times++;
			System.out.print("\n계속할까요?(y/n) : ");
			while(true){
				String answer = scan.next();
				if (answer.equalsIgnoreCase("y")){
					break;
				} else if (answer.equalsIgnoreCase("n")){
					int wins = Math.round(ans*100/times);
					System.out.println("\n정답률 : "+wins+"%");
					break chk;
				} else {
					System.out.println("\n다시 입력해 주세요.(y/n) : ");
				}
			}
		}
	}
}