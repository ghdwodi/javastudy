class Test04{
	public static void main(String[] args){
		int num = 3781;
		int ans1 = num / 1000;
		int ans2 = (num % 1000) / 100;
		int ans3 = (num % 100) / 10;
		int ans4 = num % 10;

		System.out.println("=========== ������ =============");
		System.out.println("������ : "+num+"\nõ�� �ڸ� : "+ans1);
		System.out.println("���� �ڸ� : "+ans2+"\n���� �ڸ� : "+ans3);
		System.out.println("���� �ڸ� : "+ans4);
	}
}