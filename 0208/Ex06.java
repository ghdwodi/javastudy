import java.util.*;

class Ex06{
	public static void main(String[] args){
	// ��ǻ�Ͱ� ����, ���� ���� ���� �ְ� ������ �̰��� ���ߴ� ����
	// ���� Ƚ���� ���� Ƚ���� ������ �·��� ���

		int ans = 0;		// ���� Ƚ��
		int times = 0;		// ��ü Ƚ��
		String sol = "";

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		chk :

		while(true){
			boolean q = ran.nextBoolean();	// true = ����, false = ����
			System.out.print("�������? �������?(����/�������� �Է�) : ");
			sol = scan.next();		// ����, ���� ���� String���� ����
			if (sol.equals("����")){
				if (q){
					System.out.println("\n����ؿ�! �����Դϴ�.");
					ans++;
				} else {
					System.out.println("\n�ƽ��׿�! �����Դϴ�.");
				}
			} else if (sol.equals("����")){
				if (q){
					System.out.println("\n�ƽ��׿�! �����Դϴ�.");
				} else {
					System.out.println("\n����ؿ�! �����Դϴ�.");
					ans++;
				}
			} else {
				System.out.println("�ٽ� �Է��� �ּ���\n");
				continue;
			}
			times++;
			System.out.print("\n����ұ��?(y/n) : ");
			while(true){
				String answer = scan.next();
				if (answer.equalsIgnoreCase("y")){
					break;
				} else if (answer.equalsIgnoreCase("n")){
					int wins = Math.round(ans*100/times);
					System.out.println("\n����� : "+wins+"%");
					break chk;
				} else {
					System.out.println("\n�ٽ� �Է��� �ּ���.(y/n) : ");
				}
			}
		}
	}
}