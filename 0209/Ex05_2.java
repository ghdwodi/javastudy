class Ex05_2 
{
	int sum = 0;
	double avg = 0;
	String grade = "";
	// �հ� �޼ҵ� : ����, ����, ���� ������ �հ� (��ȯ�� ����)
	public void sumM(int kor, int eng, int math){
		sum = kor + eng + math;
		avgM(sum);
	}
	// ��� �޼ҵ� : �հ踦 �̿��� ��� ��� (��ȯ�� ����)
	public void avgM(int sum){
		avg = (int)(sum*100 / 3.0)/100.0;
		gradeM(avg);
	}
	// ���� �޼ҵ� : ������� ���� ��� (��ȯ�� ����)
	public void gradeM(double avg){
		if (avg >= 90)
		{
			grade = "A����";
		} else if (avg >= 80)
		{
			grade = "B����";
		} else if (avg >= 70)
		{
			grade = "C����";
		} else if (avg >= 60)
		{
			grade = "D����";
		} else {
			grade = "F����";
		}
	}
	// �̸�, �հ�, ���� ����� ��� �޼ҵ� (��ȯ�� ����)
	public void printM(String name){
		System.out.println(name+"\t"+sum+"\t"+avg+"\t"+grade);
	}
}
