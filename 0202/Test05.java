class Test05{
	public static void main(String[] args){
		int time = 3662;
		int hour = time/(60*60);
		int min = (time%(60*60))/60;
		int sec = time%60;

		System.out.println("=========== 실행결과 =============");
		System.out.println(time+"초는 "+hour+"시간 "+min+"분 "+sec+"초이다.");
	}
}