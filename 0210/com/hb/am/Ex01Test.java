package com.hb.am;
class Ex01Test
{
	public static void main(String[] args) 
	{
		Ex01 animal = new Ex01();

		// 이름, 나이, 생사여부 출력

		String name = animal.getName();
		int age = animal.getAge();
		boolean live = animal.getLive();

		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age+"살");
		System.out.println("생존 : "+live);

		// 이름 -> 펭귄, 나이 -> 2살 로 변경

		animal.setName("펭귄");
		animal.setAge(2);
		String n_Name = animal.getName();
		int n_Age = animal.getAge();
		System.out.println("변경 이후:::::::::::::::::::::::::::::::::");
		System.out.println("이름 : "+n_Name);
		System.out.println("나이 : "+n_Age+"살");
	}
}
