import java.util.*;

class Ex05{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	// ��1, ��2, ������ �޾Ƽ� ��� �� ���

		String plus = "+"; String minus = "-"; String multi = "*"; String div = "/";

		System.out.print("\n<��Ģ����>");

		chk :

		while(true){
			System.out.print("\n����1 : ");
			double su1 = scan.nextDouble();
			System.out.print("\n����2 : ");
			double su2 = scan.nextDouble();
			System.out.print("\n������ : ");
			String oper = scan.next();
		// nextLine�� �� ������ ���°�? ����� �� �� ������ �ִ� ���� next�� �޾ƾ� �Ѵ�.

			boolean b1 = oper.equals(plus);
			boolean b2 = oper.equals(minus);
			boolean b3 = oper.equals(multi);
			boolean b4 = oper.equals(div);
			double res = 0;

			if (b1 || b2 || b3 || b4){
				if (b1){
					res = su1 + su2;
				} else if (b2){
					res = su1 - su2;
				} else if (b3){
					res = su1 * su2;
				} else {
					res = su1 / su2;
				}
			System.out.println(su1+" "+oper+" "+su2+" = "+res);
			} else{
			System.out.println("�Է¿���");
			}
			System.out.print("����ұ��?(y/n) : ");
			while(true){
				String ans = scan.next();
				if (ans.equalsIgnoreCase("y")){
					break;
				} else if (ans.equalsIgnoreCase("n")){
					break chk;
				} else{
					System.out.print("�ٽ� �Է��ϼ���.(y/n) : ");
				}
			}
		}
	}
}