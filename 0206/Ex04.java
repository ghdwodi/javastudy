class Ex04{
	public static void main(String[] args){
	// 구구단 3번
		for (int i=2;i<10;i++){
			System.out.print("<"+i+"단>\t\t");
		}
		System.out.println("\n");
		for (int i=1;i<10;i++){
			for (int j=2;j<10;j++){
				System.out.print(j+" X "+i+" = "+i*j+"\t");
			}
			System.out.println("\n");			
		}
	}
}