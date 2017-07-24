class Ex03{
	public static void main(String[] args){
	// 구구단 2번
		System.out.print("\n");
		for (int i=2;i<10;i++){
			System.out.print("<"+i+"단>\n");
			for (int j=1;j<10;j++){
				System.out.print(i+" X "+j+" = "+i*j+"\t");
			}
			System.out.print("\n");			
		}
	}
}