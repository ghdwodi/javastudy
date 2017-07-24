class Ex03_main 
{
	public static void main(String[] args) 
	{
		// 부가세 메소드는 static이므로 객체 생성 전에 호출 가능
		// 호출시 클래스.메소드이름
		// 반환형이 있으므로 반환형에 맞는 자료형의 변수를 만들어서 값을 받는다.
		double res = Ex03.vat(1000);
		System.out.println("vat : "+res);

		// instance 메소드는 클래스를 객체로 만들어야 사용 가능
		// 각 메소드에서 생성한 변수는 메소드가 끝나면 사라지는 지역변수다.
		// 해당 메소드가 실행되지 않으면 변수는 만들어지지 않는다
		Ex03 test = new Ex03();
		int res2 = test.add(2,3);	// 메소드 호출 시 매개변수의 자료형과 갯수가 일치하지 않으면 다른 메소드로 취급한다.
		System.out.println("add결과 : "+res2);
		res2 = test.add(2,'a');
		System.out.println("add결과 : "+res2);

		res = test.sub(10,20);
		System.out.println("sub결과 : "+res);

		test.mul(10, 20);
		test.div(7,3);

	}
}
