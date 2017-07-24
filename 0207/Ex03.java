import java.util.*;

class Ex03{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	// 어떤 수를 받아서 홀수, 짝수 판별하기

		check :
		while(true){
			System.out.print("\n<홀짝판별>\n숫자를 입력해 보시오 : ");
			int su = scan.nextInt();
			if (su%2==0){
				System.out.println("짝수");
			} else{
				System.out.println("홀수");
			}
			System.out.print("계속하시겠습니까?(y/n)");
			while(true){
				String ans = scan.next();
				if (ans.equalsIgnoreCase("y")){
					break;
				} else if (ans.equalsIgnoreCase("n")){
					break check;
				} else{
					System.out.print("다시 입력하시지.(y/n)");
				}
			}

		}


//		System.out.print("\n<홀짝판별>\n숫자를 입력해 보시오 : ");
//		int su = scan.nextInt();
//		if (su%2==0){
//			System.out.println("짝수");
//		} else{
//			System.out.println("홀수");
//		}
	}
}