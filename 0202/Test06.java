class Test06{
	public static void main(String[] args){
		double hCm = 162.56;
		double hInch = hCm / 2.54;
		int hFeet = (int)(hInch / 12);
		int hInchResult = (int)Math.round(hInch % 12);

		System.out.println("=========== 실행결과 =============");
		System.out.println(hCm+"cm는 "+hFeet+"피트 "+hInchResult+"인치이다.");
	}
}