class Test01{
	public static void main(String[] args){
	// �Է� -> ó��(����) -> ���

		int com = 80;
		int eng = 85;
		int math = 90;
		int java = 70;

		int sum = com + eng + math + java;
		double avg = sum / 4.0; // Ȥ�� double avg = (double)(sum / 4);
		double avg2 = sum / 7.0;

		double avg3 = Math.ceil(avg2*100)/100.0;
		double avg4 = Math.round(avg2*100)/100.0;
		double avg5 = Math.floor(avg2*100)/100.0;

		System.out.println("=========== ������ =============");
		System.out.println("���� : "+com+"\t"+eng+"\t"+math+"\t"+java);
		System.out.println("���� : "+sum);
		System.out.println("���1 : "+avg);
		System.out.println("���2 : "+avg2);
		System.out.println("���3 : "+avg3);
		System.out.println("���4 : "+avg4);
		System.out.println("���5 : "+avg5);
	}
}