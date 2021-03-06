package com.hb.pm;

public class Ex03 {
	private String name, hak;
	private int kor, eng, math, sum;
	private double avg;
	private int rank;
	
	public Ex03() {}

	public Ex03(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		sum = kor + eng + math;
		avg = (int)(sum*100/3.0)/100.0;
		hak();
		rank = 1;
	}
	
	public void hak(){
		if (avg>=90){
			hak = "A학점";
		}else if(avg>=80){
			hak = "B학점";
		}else if(avg>=70){
			hak = "C학점";
		}else if(avg>=60){
			hak = "D학점";
		}else{
			hak = "F학점";
		}
	}
	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	
}
