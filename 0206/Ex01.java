class Ex01{
	public static void main(String[] args){
	// 이중 for문 연습
	// 구구단 1번
		for (int i=2;i<10;i++){
			System.out.println(i+"단 시작");

			for (int j=1;j<10;j++){
				System.out.println(i+" 곱하기 "+j+"은(는) "+i*j);
			}

			System.out.println(i+"단 끝\n");
		}
	}
}