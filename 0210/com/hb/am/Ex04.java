package com.hb.am;
class Ex04 
{
	// this : 클래스 안에서 객체 자기자신을 지칭하는 예약어
	//		  클래스를 객체로 만들 때 생성된 주소값을 의미
	// 지역변수와 멤버변수의 이름이 같을 때 멤버변수에 this를 붙인다.
	// this() : 생성자 내에서 오버로딩 된 다른 생성자를 호출할 때 사용한다.
	//			생성자의 첫 행에 정의하지 않으면 컴파일 오류가 발생한다.

	private String name = "둘리";
	private int age = 10;


	// 기본 생성자

	public Ex04(){
//		this("한빛");		// this()를 이용해 아래 생성자를 호출한 것
		System.out.println("생성자(기본) : "+this);		// 자기 자신의 주소값을 출력한다
	}

	public Ex04(String n){
		this();				// this()를 이용해 위 생성자를 호출한 것
		name = n;
		System.out.println("생성자(기본아님) : "+this);	// 자기 자신의 주소값을 출력한다
	}

	// getter

	public String getName(){
		return name;
	}

	// this를 이용해 정확하게 표현한 setter
	
	public void setName(String name){	// 이 줄의 name은 지역변수
		this.name = name;				// 멤버변수 name에 입력받은 값 name(지역변수)을 집어넣는다.
	}									// this를 이용해 멤버변수를 선언해야 같은 이름의 지역변수 name과 구분할 수 있다.
}
