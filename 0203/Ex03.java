class Ex03{
	public static void main(String[] args){
	// 단일 if~else문
	// if(조건식){참일 때의 실행문;} else{거짓일 때의 실행문;}

	// 총점(su)이 60 이상이면 합격, 아니면 불합격

		int su = 70;
		String res1;
		if (su>=60){
			res1 = "합격";
		} else{
			res1 = "불합격";
		}
		System.out.println(res1);

	// 성별이 1 또는 3이면 남성, 2 또는 4면 여성, 나머지는 외국인

		int gender = 4;
		String res2;
		if (gender==1 || gender==3){
			res2 = "남성";
		} else{
			if (gender==2 || gender==4){
				res2 = "여성";
			} else{
				res2 = "외국인";
			}
		}
		System.out.println(res2);

	// 수1과 수2를 비교하여 큰 수를 출력

		int num1 = 50;
		int num2 = 50;
		String res3 = "";
		if (num1 > num2){
			res3 += num1;
		} else{
			if (num2 > num1){
				res3 += num2;
			} else {
				res3 = "같다";
			}
		}
		System.out.println(res3);
	}
}