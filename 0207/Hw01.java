import java.util.*;

class Hw01{
	public static void main(String[] args){
	// 받은 문자열 중 첫 글자가 대문자인지, 소문자인지, 숫자인지 판별하고
	// 모든 문자열을 소문자로 반환하라

		Scanner scan = new Scanner(System.in);
		System.out.println("<소문자 변환 문제>");
		chk :

		while(true){
			System.out.print("문자열을 입력하세요 : ");
			String str = scan.next();
			String str2 = "";
			int len = str.length();
			char ch = str.charAt(0);
			if (ch>='a' && ch<='z'){
				System.out.println("첫 글자 : 소문자");
			} else if (ch>='A' && ch<='Z'){
				System.out.println("첫 글자 : 대문자");
			} else if (ch>='0' && ch<='9'){
				System.out.println("첫 글자 : 숫자");
			} else{
				System.out.println("첫 글자 : 그외");
			}

			for (int i=0;i<len;i++){
				if (str.charAt(i)>='A' && str.charAt(i)<='Z'){
					str2 += (char)(str.charAt(i)+32);
				} else{
					str2 += (char)(str.charAt(i));
				}
			}
			System.out.println("결과 : "+str2);
			System.out.print("\n계속하시겠습니까?(y/n) : ");
			while(true){
				String ans = scan.next();
				if (ans.equalsIgnoreCase("y")){
					break;
				} else if (ans.equalsIgnoreCase("n")){
					break chk;
				} else{
					System.out.print("다시 입력해 주십시오.(y/n) : ");
				}
			}
		}
	}
}