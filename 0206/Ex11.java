class Ex11{
	public static void main(String[] args){
	// ���ڿ��� ��� ���ĺ��� �빮�ڷ� �ٲٰ�, �װ��� String���� ��ȯ�غ���.

		int strLen;
		String str = "Hey hey let's go ���� fire!";
		strLen = str.length();
		String srtRes = "";

		for (int i=0;i<strLen;i++){
			char ch = str.charAt(i);
			if (ch>='a' && ch<='z'){
				srtRes += (char)((int)ch-32);
			} else{
				srtRes += ch;
			}
		}
		System.out.println(srtRes);

	// �ֹε�Ϲ�ȣ���� ������ϰ� ���� ��ȯ�ϱ�

		String jumin = "871116-1XXXXXX";
		int year = 1900 + Integer.parseInt(jumin.substring(0,2));
		int month = Integer.parseInt(jumin.substring(2,4));
		int day = Integer.parseInt(jumin.substring(4,6));
		int gender = Integer.parseInt(jumin.substring(7,8));

		String gen;

		if (gender==1 || gender==3){
			gen = "����";
		} else if (gender==2 || gender==4){
			gen = "����";
		} else {
			gen = "�ܱ���";
		}
		System.out.println(year+"�� "+month+"�� "+day+"�� "+gen);

	}
}