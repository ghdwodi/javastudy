class Ex05 
{
	// �հ� �޼ҵ� : ����, ����, ���� ������ �հ� (��ȯ�� ����)
	public int sumM(int kor, int eng, int math){
		int sum = kor + eng + math;
		return sum;
	}
	// ��� �޼ҵ� : �հ踦 �̿��� ��� ��� (��ȯ�� ����)
	public double avgM(int sum){
		double avg = (int)(sum*100 / 3.0)/100.0;
		return avg;
	}
	// ���� �޼ҵ� : ������� ���� ��� (��ȯ�� ����)
	public String gradeM(double avg){
		String grade = "";
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
		return grade;

	}
	// �̸�, �հ�, ���� ����� ��� �޼ҵ� (��ȯ�� ����)
	public void printM(String name, int sum, double avg, String grade){
		System.out.println(name+"\t"+sum+"\t"+avg+"\t"+grade);
	}
}
