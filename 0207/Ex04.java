import java.util.*;

class Ex04{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	// �˹ٽð� �޾Ƽ� �ӱ� ��� : 8�ð����� 6870��, �ʰ��ϸ� 1.5��
		System.out.print("<�ӱݰ��>");

		check :

		while(true){
			System.out.print("\n�ٹ��ð� : ");
			int hour = scan.nextInt();
			int pay = 0;
			if (hour<0){
				System.out.println("�Է¿���");
			} else{
				if (hour<=8){
					pay = hour * 6870;
				} else{
					pay = (8 * 6870) + (int)((hour-8)*1.5*6870);
				}
				System.out.println("�ӱ� : "+pay+"��");
			}
			System.out.print("\n����Ͻðڽ��ϱ�?(y/n) : ");
			while(true){
				String ans = scan.next();
				if (ans.equalsIgnoreCase("y")){
					break;
				} else if (ans.equalsIgnoreCase("n")){
					break check;
				} else{
					System.out.print("�ٽ� �Է��Ͻʽÿ�.(y/n) : ");
				}
			}
		}
	}
}