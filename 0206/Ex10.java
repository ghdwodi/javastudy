class Ex10{
	public static void main(String[] args){
	// String Ŭ���� : ���ڿ��� ó���� �� �ֵ��� �����ִ� Ŭ����
	// String�� ���� �⺻ �޼ҵ�(����, ���)�� �˾ƺ���

		String jumin = "880915";
		String msg = "���ѹα� �� Korea";
		String msg2 = "Korea";
		String msg3 = "korea";

	// 1. charAt(int index) : char => index�� ��ġ��(�ڸ���). index�� 0���� ����
	// 			  �ش� ��ġ���� �޾� �� ��ġ�� �ִ� ���ڸ� ����

		char ch1 = jumin.charAt(3);
		char ch2 = msg.charAt(5);
		char min = msg.charAt(2);
		char r = msg.charAt(9);
		System.out.println(ch2);
		System.out.println(min);
		System.out.println(r);

	// ���ڿ��� �ҹ��ڸ� �빮�ڷ� �ٲپ� ����

		for (int i=0;i<5;i++){
			// System.out.println(msg2.charAt(i));
			char ch = msg2.charAt(i);
			if (ch>='a' && ch<='z'){
				System.out.print((char)(ch-32));
			} else if (ch>='A' && ch <= 'Z'){
				System.out.print(ch);
			} else{
				System.out.print("?");
			}
		}
		System.out.println();

	// 2. equals, equalsIgnoreCase : ����� boolean������, ���ڿ��� ������ �ƴ��� �Ǻ�
	// equals�� ��ҹ��� ����, equalsIgnoreCase�� ��ҹ��� ���� ���� �Ǻ�
	// String�� eqauls�� �ƴ� �񱳿�����(==)�� ����� ���ϸ� �Ǻ��� �Ұ����ϴ�.
	// String ��ü�� ������ ������ ��������(�ּ�)�� �ٸ��� ������ ==�� ���ϸ� �ٸ��� ���´�.
	// (173������ ����)

		boolean res1 = msg2.equals(msg3);
		boolean res2 = msg2.equalsIgnoreCase(msg3);
		System.out.println(res1);
		System.out.println(res2);

	// 3. indexOf(int ch) : ����� int������, char�� int �Է�
	// 4. indexOf(String str) : ����� int��
	// �ش� ���ڳ� ���ڿ��� �����ϸ� �� ù ��ġ���� ��ȯ, �������� ������ -1 ��ȯ

		String str1 = "abcdabcd��ABCDABCD";
		int result = str1.indexOf("a");
		System.out.println(result);

	// ���� ���ϱ�
		String jum = "871116-1XXXXXX";
		String jum1 = "871116";
		String jum2 = "1XXXXXX";
		char result1 = jum.charAt(7);
		System.out.println(result1);

		int result2 = jum.indexOf("-")+1;
		System.out.println(result2);
		char result3 = jum.charAt(result2);
		System.out.println(result3);

	// 5. lastIndexOf(int ch), lastIndexOf(String str) : ����� int������
	// �ش� ���ڳ� ���ڿ��� ������ ��ġ���� ��ȯ

		int result4 = str1.lastIndexOf("a");
		System.out.println(result4);

	// 6. length() : ����� int. �ش� ���ڿ��� ����(����)�� ���ڷ� ǥ��

		String str2 = "Eternal love";
		int result5 = str2.length();
		System.out.println(str2+"�� ���ڼ� : "+result5);

	// �ٽ� �� �� ���ڿ��� �ҹ��ڸ� �빮�ڷ� �ٲپ� ����

		for (int i=0;i<str2.length();i++){
			char ch = str2.charAt(i);
			if (ch>='a' && ch<='z'){
				System.out.print((char)(ch-32));
			} else if (ch>='A' && ch <= 'Z'){
				System.out.print(ch);
			} else{
				System.out.print(" ");
			}
		}
		System.out.println();

	// 7. replace("���� ���ڿ�", "�ٲ� ���ڿ�") : ����� String��

		String str3 = "���ѹα�";
		String str4 = str3.replace("����","����");
		System.out.println("��� : "+str3+" -> "+str4);
		String str5 = str3.replace("��","�� �� ");
		System.out.println("��� : "+str3+" -> "+str5);
		int result6 = str5.length();
		System.out.println(str5+"�� ���ڼ� : "+result6);

	// 8. substring(������ġ��) : ����� String��
	//    substring(������ġ, ����ġ) : String, �� ��ġ�� �������� ����
	//	(����ġ - ������ġ) : �����ϴ� ������ ��

		String jumin2 = "871116";
		String year = "19"+jumin2.substring(0,2); 
	// �� �� �α��� ����.�� �� ��ġ�� �������� �����Ƿ� ��ġ�� 0~2
		System.out.println(year);

	// 9. toUpperCase(), toLowerCase() : ���� String�� ��� �빮�� / �ҹ��ڷ� ����

		String str7 = "AbCdeFg123�����ٶ�aBCdefG"; // ���ڿ� �ѱ��� ������ ���� �ʴ´�
		String str8 = str7.toUpperCase();
		String str9 = str7.toLowerCase();
		System.out.println(str8+"\n"+str9);

	// 10. trim() : �յ� ���鹮�� ����(�� ���� ���� ������ �������� ���Ѵ�)

		String str10 = "  rjdklfjas 123 ASAFC    ";
		System.out.println(str10+"\t"+str10.length()+"����");
		String str11 = str10.trim();
		System.out.println(str11+"\t\t"+str11.length()+"����");

	// 11. valueOf(���� �ڷ���) : ����� String��. �Է��� �ڷ����� String���� ��ȯ

		boolean b1 = true;
		int num1 = 321;
		long num2 = 412L;
		double do1 = 3.14;
		float do2 = 78.6485f;
		char cha1 = 'A';
		String resultV = String.valueOf(cha1);
		System.out.println(resultV+10);

	// �׳� �ڷ����� +�� ���ڿ��� ���� ���� �ִ�. (String ��ü�� �Һ��̹Ƿ� ���� ����� �ƴϴ�)

		System.out.println(do1+""+10);

	// 12. String���� �� ���� �ڷ����� ���� �ڷ������� �ٲپ� ����
	// Boolean Ŭ������ parseBoolean �޼ҵ� : String "true","false"�� boolean���� ��ȯ
	// "true","false" �̿��� String�� false�� ��ȯ

		String msg101 = "0";
		if (Boolean.parseBoolean(msg101)){
			System.out.println("�ȳ�");
		} else{
			System.out.println("�ȳ����");
		}

	// Integer Ŭ������ parseInt �޼ҵ� : ���� String�� ���� int�� ��ȯ
	// �Ǽ��� ������ ���� �߻�

		String msg102 = "100";
		System.out.println(msg102+10);
		System.out.println(Integer.parseInt(msg102)+10);

	// Double Ŭ������ parseDouble �޼ҵ� : �Ǽ� String�� ���� double�� ��ȯ

		String msg103 = "3.14";
		System.out.println(msg103+10);
		System.out.println(Double.parseDouble(msg103)+10);
	}
}