import java.util.*;

class Ex07{
	public static void main(String[] args){
	// ���������� ����
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int wins = 0;
		int drow = 0;
		int q = 0;
		int times = 0;
		String userAns = "";

		chk:

		while(true){

			q = ran.nextInt(3);	// 0:���� 1:���� 2:��
			System.out.print("����, ����, �� �� �ϳ��� �Է��ϼ��� : ");
			userAns = scan.next();
			if (userAns.equals("����")){
				if (q==0){
					System.out.println("���� VS ���� : ���º�!");
					drow++;
				} else if (q==1){
					System.out.println("���� VS ���� : ��!");
				} else {
					System.out.println("���� VS �� : ��!");
					wins++;
				}
			} else if (userAns.equals("����")){
				if (q==0){
					System.out.println("���� VS ���� : ��!");
					wins++;
				} else if (q==1){
					System.out.println("���� VS ���� : ���º�!");
					drow++;
				} else {
					System.out.println("���� VS �� : ��!");
				}
			} else if (userAns.equals("��")){
				if (q==0){
					System.out.println("�� VS ���� : ��!");
				} else if (q==1){
					System.out.println("�� VS ���� : ��!");
					wins++;
				} else {
					System.out.println("�� VS �� : ���º�!");
					drow++;
				}
			} else {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
			times++;

			System.out.print("\n����ұ��?(y/n) : ");

			while(true){
				String answer = scan.next();
				if (answer.equalsIgnoreCase("y")){
					break;
				} else if (answer.equalsIgnoreCase("n")){
					double winsRate = (int)(wins*100/times);
					System.out.println("\n"+wins+"�� "+drow+"�� "+(times-wins-drow)+"��");
					System.out.println("�·� : "+winsRate+"%");
					break chk;
				} else {
					System.out.print("�ٽ� �Է��ϼ���.(y/n) : ");
				}
			}
		}
	}
}