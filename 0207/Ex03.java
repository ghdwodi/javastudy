import java.util.*;

class Ex03{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	// � ���� �޾Ƽ� Ȧ��, ¦�� �Ǻ��ϱ�

		check :
		while(true){
			System.out.print("\n<Ȧ¦�Ǻ�>\n���ڸ� �Է��� ���ÿ� : ");
			int su = scan.nextInt();
			if (su%2==0){
				System.out.println("¦��");
			} else{
				System.out.println("Ȧ��");
			}
			System.out.print("����Ͻðڽ��ϱ�?(y/n)");
			while(true){
				String ans = scan.next();
				if (ans.equalsIgnoreCase("y")){
					break;
				} else if (ans.equalsIgnoreCase("n")){
					break check;
				} else{
					System.out.print("�ٽ� �Է��Ͻ���.(y/n)");
				}
			}

		}


//		System.out.print("\n<Ȧ¦�Ǻ�>\n���ڸ� �Է��� ���ÿ� : ");
//		int su = scan.nextInt();
//		if (su%2==0){
//			System.out.println("¦��");
//		} else{
//			System.out.println("Ȧ��");
//		}
	}
}