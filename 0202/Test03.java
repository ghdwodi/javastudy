class Test03{
	public static void main(String[] args){
		// �Է� -> ó�� -> ���
		// ���� ���� ����� ��ü������ �ƴ϶� ���������̶� �Ѵ�. ������� �� �̷��� �Ѵ�.
		int pay = 10000;
		int pri = 3500;
		int num = 2;
		double taxRate = 0.1;
		int tax = (int)Math.round(pri*num*taxRate);
		int total = pri*num+tax;
		int cng = pay - total;

		System.out.println("=========== ������ =============");
		System.out.println("������ �� : "+pay+"\n���� ��ī �ܰ� : "+pri);
		System.out.println("���� : "+num+"\n�ΰ��� : "+tax);
		System.out.println("��ǰ �Ѿ� : "+total+"\n�Ž����� : "+cng);
	}
}