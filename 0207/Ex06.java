import java.util.*;

class Ex06{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	// 주민번호(000000-0) 받아서 성별, 나이 출력(1,2면 1900년대생, 3,4면 2000년대생)

		System.out.print("\n<성별, 나이 출력>");

		chk :

		while(true){
			System.out.print("\n주민번호 입력(형식 : 000000-0) : ");
			String jumin = scan.next();
			String year = jumin.substring(0,2);
			char gen = jumin.charAt(7);
			int year2 = Integer.parseInt(year);
			int birth = 0;
			String gender2 = "";
		
			if (gen=='2' || gen=='4'){
				gender2 += "여성";
			} else if (gen=='1' || gen=='3'){
				gender2 += "남성";
			} else{
				gender2 += "외국인";
			}

			System.out.println("성별 : "+gender2);

			if (gen=='1' || gen=='2'){
				birth = year2 + 1900;
				if (birth<=2016){
					System.out.println("나이 : "+(2016-birth)+"세");
				} else{
					System.out.println("입력오류");
				}
			} else if (gen=='3' || gen=='4'){
				birth = year2 + 2000;
				if (birth<=2016){
					System.out.println("나이 : "+(2016-birth)+"세");
				} else{
					System.out.println("입력오류");
				}
			} else{
				System.out.println("나이 : 외국인이라 계산불가");
			}
			System.out.print("계속할까요?(y/n) : ");
			while(true){
				String ans = scan.next();
				if (ans.equalsIgnoreCase("y")){
					break;
				} else if (ans.equalsIgnoreCase("n")){
					break chk;
				} else{
					System.out.print("다시 입력해 주세요.(y/n) : ");
				}
			}
		}
	}
}