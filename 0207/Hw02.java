import java.util.*;

class Hw02{
	public static void main(String[] args){
	// �޴� 1�̸� ī���ī 3500, 2�̸� ī��� 4000, 3�̸� �Ƹ޸�ī�� 3000, 4�̸� �����꽺 3500
	// ������ ���� 10000
	// ģ���� �� �� �Ծ��� �� �ܵ��� �󸶸� �޾ƾ� �ϴ°�?(�ΰ��� 10%)
		Scanner scan = new Scanner(System.in);

		chk :
		while(true){
			String name = "";
			int menu, price, num, pay, total, change;
			double vatRate = 0.1;

			System.out.print("�޴�(1. ī���ī, 2.ī���, 3.�Ƹ޸�ī��, 4.�����꽺) : ");
			while(true){
				menu = scan.nextInt();
				if(menu>=1 && menu<=4){
					break;
				} else{
					System.out.print("�ٽ� �Է��Ͻʽÿ�(1. ī���ī, 2.ī���, 3.�Ƹ޸�ī��, 4.�����꽺) : ");
				}
			}
			System.out.print("���� : ");
			num = scan.nextInt();

			System.out.print("���Ҿ� : ");
			pay = scan.nextInt();

			if (menu==1){
				price = 3500;
				name = "ī���ī";
			} else if (menu==2){
				price = 4000;
				name = "ī���";
			} else if (menu==3){
				price = 3000;
				name = "�Ƹ޸�ī��";
			} else {
				price = 3500;
				name = "�����꽺";
			}

			total = (int)(price*num*(1+vatRate));
			change = pay - total;

			System.out.println("�޴� : "+name+"\n�� "+num+"��");
			System.out.println("���Ҿ� : "+pay+"��\n�Ѿ� : "+total+"��");
			System.out.println("�Ž����� : "+change+"��");

			System.out.print("\n����Ͻðڽ��ϱ�?(y/n) : ");
			while(true){
				String ans = scan.next();
				if (ans.equalsIgnoreCase("y")){
					break;
				} else if (ans.equalsIgnoreCase("n")){
					break chk;
				} else {
					System.out.print("�ٽ� �Է��Ͻʽÿ�.(y/n) : ");
				}
			}
		}
	}
}