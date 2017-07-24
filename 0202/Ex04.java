class Ex04{
	public static void main(String[] args){
	// 증감연산자 ++, -- : 1씩 증가, 감소. 위치에 따라 연산이 달라진다.
	// ++ 변수 : 해당 변수값을 먼저 1 증가시키고 나머지 연산 수행(우선순위 최상)
	// 변수 ++ : 다른 모든 연산을 모두 수행한 후 마지막(;)에 1 증가시킨다(우선순위 최하)

		int su1 = 10;
		int su2 = 10;

		System.out.println("su1 : "+ ++su1);
		System.out.println("su2 : "+ su2++);
		System.out.println("su1 : "+ su1);
		System.out.println("su2 : "+ su2);
	}
}