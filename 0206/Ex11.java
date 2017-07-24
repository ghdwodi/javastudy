class Ex11{
	public static void main(String[] args){
	// 문자열의 모든 알파벳을 대문자로 바꾸고, 그것을 String으로 반환해보자.

		int strLen;
		String str = "Hey hey let's go 닌자 fire!";
		strLen = str.length();
		String srtRes = "";

		for (int i=0;i<strLen;i++){
			char ch = str.charAt(i);
			if (ch>='a' && ch<='z'){
				srtRes += (char)((int)ch-32);
			} else{
				srtRes += ch;
			}
		}
		System.out.println(srtRes);

	// 주민등록번호에서 생년월일과 성별 반환하기

		String jumin = "871116-1XXXXXX";
		int year = 1900 + Integer.parseInt(jumin.substring(0,2));
		int month = Integer.parseInt(jumin.substring(2,4));
		int day = Integer.parseInt(jumin.substring(4,6));
		int gender = Integer.parseInt(jumin.substring(7,8));

		String gen;

		if (gender==1 || gender==3){
			gen = "남성";
		} else if (gender==2 || gender==4){
			gen = "여성";
		} else {
			gen = "외국인";
		}
		System.out.println(year+"년 "+month+"월 "+day+"일 "+gen);

	}
}