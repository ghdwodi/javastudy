class Test04{
	public static void main(String[] args){
		int num = 3781;
		int ans1 = num / 1000;
		int ans2 = (num % 1000) / 100;
		int ans3 = (num % 100) / 10;
		int ans4 = num % 10;

		System.out.println("=========== 실행결과 =============");
		System.out.println("정수값 : "+num+"\n천의 자리 : "+ans1);
		System.out.println("백의 자리 : "+ans2+"\n십의 자리 : "+ans3);
		System.out.println("일의 자리 : "+ans4);
	}
}