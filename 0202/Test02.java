class Test02{
	public static void main(String[] args){
		int num = 3;
		int sqr = num*num;
		int triSqr = sqr*num;
		//int triSqr = (int)(Math.pow(num,3));
		System.out.println("=========== 실행결과 =============");
		System.out.print("정수값 : "+num+"\n제곱 : "+sqr+"\n세제곱 : "+triSqr);
	}
}