class Ex02_main 
{
	public static void main(String[] args) 
	{
	// 객체 생성 전에는 static 호출이 가능하다. 인스턴스는 호출할 수 없다.
	// static 호출 방법 : 클래스이름.변수이름, 클래스이름.메소드이름

//		System.out.println(Ex02_1.su1); // static이 아니라서 참조 불가능
		System.out.println(Ex02_1.su2);
		System.out.println(Ex02_1.SU3);
	
	// 클래스를 객체 생성
	// 클래스이름 참조변수 = new 생성자;
	// 해당 클래스의 생성자를 만들지 않은 경우 기본 생성자를 이용해야 한다.
	// 기본 생성자 = 클래스이름();
	// Ex02_1 클래스를 객체 생성해 보자.
		Ex02_1 test = new Ex02_1();
		int res = test.su1;
		System.out.println(res);
		System.out.println(test.su2);
		System.out.println(test.SU3);
		System.out.println(test.SU4);
		System.out.println("메소드 호출 전");
		test.prn();							// 메소드를 호출해 실행. prn은 void이므로 값을 가지고 돌아가지 않는다.
		String mg = test.prn2();
		System.out.println(mg);
		System.out.println("메소드 호출 후");
	}
}
