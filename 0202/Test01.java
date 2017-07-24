class Test01{
	public static void main(String[] args){
	// ÀÔ·Â -> Ã³¸®(°¡°ø) -> Ãâ·Â

		int com = 80;
		int eng = 85;
		int math = 90;
		int java = 70;

		int sum = com + eng + math + java;
		double avg = sum / 4.0; // È¤Àº double avg = (double)(sum / 4);
		double avg2 = sum / 7.0;

		double avg3 = Math.ceil(avg2*100)/100.0;
		double avg4 = Math.round(avg2*100)/100.0;
		double avg5 = Math.floor(avg2*100)/100.0;

		System.out.println("=========== ½ÇÇà°á°ú =============");
		System.out.println("Á¡¼ö : "+com+"\t"+eng+"\t"+math+"\t"+java);
		System.out.println("ÃÑÁ¡ : "+sum);
		System.out.println("Æò±Õ1 : "+avg);
		System.out.println("Æò±Õ2 : "+avg2);
		System.out.println("Æò±Õ3 : "+avg3);
		System.out.println("Æò±Õ4 : "+avg4);
		System.out.println("Æò±Õ5 : "+avg5);
	}
}