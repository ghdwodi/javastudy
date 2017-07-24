class Ex05{
	public static void main(String[] args){
	// 4x4 영행렬 표시해보기
		for(int i=1;i<5;i++){
			for(int j=1;j<5;j++){
				System.out.print("0 ");
			}
		System.out.print("\n");
		}
		System.out.print("\n");
	// 좌->우 대각선행렬
		for(int i=1;i<5;i++){
			for(int j=1;j<5;j++){
				int l;
				if (i==j){
					l=1;
				} else{		// else가 빠지면 결과가 다르게 나온다(직접해보기)
					l=0;
				}
				System.out.print(l+" ");
			}
		System.out.print("\n");
		}
	}
}