class Ex10{
	public static void main(String[] args){
	// 등수 매기기
	// 다중배열 선언, 입력

		String [][] str = new String[5][5];
		String [] st1 = {"hong","270","90","A","2"};
		String [] st2 = {"lee","210","70","C","4"};
		String [] st3 = {"park","180","60","F","5"};
		String [] st4 = {"kim","300","100","A","1"};
		String [] st5 = {"noh","240","80","B","3"};

		str[0] = st1;
		str[1] = st2;
		str[2] = st3;
		str[3] = st4;
		str[4] = st5;

	// 정렬하기

		String[] im = new String[5];

		for (int i=0;i<str.length-1;i++){
			for (int j=i+1;j<str.length;j++){
				int sumi = Integer.parseInt(str[i][1]);
				int sumj = Integer.parseInt(str[j][1]);
				if (sumi<sumj){
					im = str[i];
					str[i] = str[j];
					str[j] = im;
				}
			}
		}

	// 출력하기
		System.out.println("이름\t총점\t평균\t학점\t순위\n------------------------------------");

		for (int i=0;i<str.length;i++){
			for (int j=0;j<str[i].length;j++){
				System.out.print(str[i][j]+"\t");
			}
			System.out.println();
		}

	}
}