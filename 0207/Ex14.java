import java.util.*;

class Ex14{
	public static void main(String[] args){
	// 키보드를 통해 나라이름을 입력받아 배열에 넣기
	// 배열 내용 출력하기
		Scanner scan = new Scanner(System.in);
		String[] str = new String[5];
		for(int i=0;i<str.length;i++){
			System.out.print("나라 이름을 입력하세요 : ");
			String nation = scan.next();
			str[i] = nation;
		}
		System.out.println("\n<입력한 나라들>");
		for(int i=0;i<str.length;i++){
			String res = str[i];
			System.out.print("["+res+"] ");
		}

	}
}