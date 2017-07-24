class Test03{
	public static void main(String[] args){
		// 입력 -> 처리 -> 출력
		// 위와 같은 방식은 객체지향이 아니라 절차지향이라 한다. 문법배울 땐 이렇게 한다.
		int pay = 10000;
		int pri = 3500;
		int num = 2;
		double taxRate = 0.1;
		int tax = (int)Math.round(pri*num*taxRate);
		int total = pri*num+tax;
		int cng = pay - total;

		System.out.println("=========== 실행결과 =============");
		System.out.println("지불한 돈 : "+pay+"\n까페 모카 단가 : "+pri);
		System.out.println("수량 : "+num+"\n부가세 : "+tax);
		System.out.println("상품 총액 : "+total+"\n거스름돈 : "+cng);
	}
}