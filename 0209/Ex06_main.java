class Ex06_main 
{
	public static void main(String[] args) 
	{
		// ��ü ���� �� static ���� : Ŭ�����̸�.~
//		System.out.print(Ex06.name3+" ");		// static�̶� �ص� ���������� private�̸� ������ �� ����.
		System.out.println(Ex06.age3+"��");

		// ��ü ���� �� ����
		Ex06 test = new Ex06();
		String name2 = test.getName2();
		int age2 = test.getAge2();
		test.setName2("�ٵ���");
		test.setAge2(200);
		System.out.println(test.name+" "+test.age+"��");
		System.out.println(name2+" "+age2+"��");
		name2 = test.getName2();
		age2 = test.getAge2();
		System.out.println(name2+" "+age2+"��");
	}
}
