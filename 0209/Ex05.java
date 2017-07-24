class Ex05 
{
	// 합계 메소드 : 국어, 영어, 수학 점수의 합계 (반환형 존재)
	public int sumM(int kor, int eng, int math){
		int sum = kor + eng + math;
		return sum;
	}
	// 평균 메소드 : 합계를 이용해 평균 계산 (반환형 존재)
	public double avgM(int sum){
		double avg = (int)(sum*100 / 3.0)/100.0;
		return avg;
	}
	// 학점 메소드 : 평균으로 학점 계산 (반환형 존재)
	public String gradeM(double avg){
		String grade = "";
		if (avg >= 90)
		{
			grade = "A학점";
		} else if (avg >= 80)
		{
			grade = "B학점";
		} else if (avg >= 70)
		{
			grade = "C학점";
		} else if (avg >= 60)
		{
			grade = "D학점";
		} else {
			grade = "F학점";
		}
		return grade;

	}
	// 이름, 합계, 학점 계산결과 출력 메소드 (반환형 없음)
	public void printM(String name, int sum, double avg, String grade){
		System.out.println(name+"\t"+sum+"\t"+avg+"\t"+grade);
	}
}
