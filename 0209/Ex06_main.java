class Ex06_main 
{
	public static void main(String[] args) 
	{
		// 객체 생성 전 static 접근 : 클래스이름.~
//		System.out.print(Ex06.name3+" ");		// static이라 해도 접근제한이 private이면 접근할 수 없다.
		System.out.println(Ex06.age3+"살");

		// 객체 생성 후 접근
		Ex06 test = new Ex06();
		String name2 = test.getName2();
		int age2 = test.getAge2();
		test.setName2("바둑이");
		test.setAge2(200);
		System.out.println(test.name+" "+test.age+"살");
		System.out.println(name2+" "+age2+"살");
		name2 = test.getName2();
		age2 = test.getAge2();
		System.out.println(name2+" "+age2+"살");
	}
}
