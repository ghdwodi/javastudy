class Ex10{
	public static void main(String[] args){
	// String 클래스 : 문자열을 처리할 수 있도록 도와주는 클래스
	// String이 가진 기본 메소드(동작, 기능)를 알아보자

		String jumin = "880915";
		String msg = "대한민국 ♥ Korea";
		String msg2 = "Korea";
		String msg3 = "korea";

	// 1. charAt(int index) : char => index는 위치값(자리값). index는 0부터 시작
	// 			  해당 위치값을 받아 그 위치에 있는 문자를 추출

		char ch1 = jumin.charAt(3);
		char ch2 = msg.charAt(5);
		char min = msg.charAt(2);
		char r = msg.charAt(9);
		System.out.println(ch2);
		System.out.println(min);
		System.out.println(r);

	// 문자열의 소문자를 대문자로 바꾸어 보자

		for (int i=0;i<5;i++){
			// System.out.println(msg2.charAt(i));
			char ch = msg2.charAt(i);
			if (ch>='a' && ch<='z'){
				System.out.print((char)(ch-32));
			} else if (ch>='A' && ch <= 'Z'){
				System.out.print(ch);
			} else{
				System.out.print("?");
			}
		}
		System.out.println();

	// 2. equals, equalsIgnoreCase : 결과는 boolean형으로, 문자열이 같은지 아닌지 판별
	// equals는 대소문자 구분, equalsIgnoreCase는 대소문자 구분 없이 판별
	// String을 eqauls가 아닌 비교연산자(==)를 사용해 비교하면 판별이 불가능하다.
	// String 객체를 생성할 때마다 참조변수(주소)가 다르기 때문에 ==로 비교하면 다르게 나온다.
	// (173페이지 참조)

		boolean res1 = msg2.equals(msg3);
		boolean res2 = msg2.equalsIgnoreCase(msg3);
		System.out.println(res1);
		System.out.println(res2);

	// 3. indexOf(int ch) : 결과는 int형으로, char형 int 입력
	// 4. indexOf(String str) : 결과는 int형
	// 해당 문자나 문자열이 존재하면 그 첫 위치값을 반환, 존재하지 않으면 -1 반환

		String str1 = "abcdabcd★ABCDABCD";
		int result = str1.indexOf("a");
		System.out.println(result);

	// 성별 구하기
		String jum = "871116-1XXXXXX";
		String jum1 = "871116";
		String jum2 = "1XXXXXX";
		char result1 = jum.charAt(7);
		System.out.println(result1);

		int result2 = jum.indexOf("-")+1;
		System.out.println(result2);
		char result3 = jum.charAt(result2);
		System.out.println(result3);

	// 5. lastIndexOf(int ch), lastIndexOf(String str) : 결과는 int형으로
	// 해당 문자나 문자열의 마지막 위치값을 반환

		int result4 = str1.lastIndexOf("a");
		System.out.println(result4);

	// 6. length() : 결과는 int. 해당 문자열의 길이(갯수)를 숫자로 표현

		String str2 = "Eternal love";
		int result5 = str2.length();
		System.out.println(str2+"의 글자수 : "+result5);

	// 다시 한 번 문자열의 소문자를 대문자로 바꾸어 보자

		for (int i=0;i<str2.length();i++){
			char ch = str2.charAt(i);
			if (ch>='a' && ch<='z'){
				System.out.print((char)(ch-32));
			} else if (ch>='A' && ch <= 'Z'){
				System.out.print(ch);
			} else{
				System.out.print(" ");
			}
		}
		System.out.println();

	// 7. replace("원래 문자열", "바꿀 문자열") : 결과는 String형

		String str3 = "대한민국";
		String str4 = str3.replace("대한","大韓");
		System.out.println("결과 : "+str3+" -> "+str4);
		String str5 = str3.replace("한","한 ★ ");
		System.out.println("결과 : "+str3+" -> "+str5);
		int result6 = str5.length();
		System.out.println(str5+"의 글자수 : "+result6);

	// 8. substring(시작위치값) : 결과는 String형
	//    substring(시작위치, 끝위치) : String, 끝 위치는 포함하지 않음
	//	(끝위치 - 시작위치) : 추출하는 문자의 수

		String jumin2 = "871116";
		String year = "19"+jumin2.substring(0,2); 
	// 맨 앞 두글자 추출.맨 뒤 위치는 포함하지 않으므로 위치는 0~2
		System.out.println(year);

	// 9. toUpperCase(), toLowerCase() : 지정 String을 모두 대문자 / 소문자로 변경

		String str7 = "AbCdeFg123가나다라aBCdefG"; // 숫자와 한글은 영향을 받지 않는다
		String str8 = str7.toUpperCase();
		String str9 = str7.toLowerCase();
		System.out.println(str8+"\n"+str9);

	// 10. trim() : 앞뒤 공백문자 제거(단 문자 사이 공백은 제거하지 못한다)

		String str10 = "  rjdklfjas 123 ASAFC    ";
		System.out.println(str10+"\t"+str10.length()+"글자");
		String str11 = str10.trim();
		System.out.println(str11+"\t\t"+str11.length()+"글자");

	// 11. valueOf(각종 자료형) : 결과는 String형. 입력한 자료형을 String으로 변환

		boolean b1 = true;
		int num1 = 321;
		long num2 = 412L;
		double do1 = 3.14;
		float do2 = 78.6485f;
		char cha1 = 'A';
		String resultV = String.valueOf(cha1);
		System.out.println(resultV+10);

	// 그냥 자료형에 +로 문자열을 붙일 수도 있다. (String 자체는 불변이므로 좋은 방법은 아니다)

		System.out.println(do1+""+10);

	// 12. String으로 된 각종 자료형을 실제 자료형으로 바꾸어 보자
	// Boolean 클래스의 parseBoolean 메소드 : String "true","false"를 boolean으로 변환
	// "true","false" 이외의 String은 false로 반환

		String msg101 = "0";
		if (Boolean.parseBoolean(msg101)){
			System.out.println("안녕");
		} else{
			System.out.println("안녕못해");
		}

	// Integer 클래스의 parseInt 메소드 : 정수 String을 실제 int로 변환
	// 실수가 들어오면 오류 발생

		String msg102 = "100";
		System.out.println(msg102+10);
		System.out.println(Integer.parseInt(msg102)+10);

	// Double 클래스의 parseDouble 메소드 : 실수 String을 실제 double로 변환

		String msg103 = "3.14";
		System.out.println(msg103+10);
		System.out.println(Double.parseDouble(msg103)+10);
	}
}