class Test06{
	public static void main(String[] args){
		double hCm = 162.56;
		double hInch = hCm / 2.54;
		int hFeet = (int)(hInch / 12);
		int hInchResult = (int)Math.round(hInch % 12);

		System.out.println("=========== ������ =============");
		System.out.println(hCm+"cm�� "+hFeet+"��Ʈ "+hInchResult+"��ġ�̴�.");
	}
}