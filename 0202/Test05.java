class Test05{
	public static void main(String[] args){
		int time = 3662;
		int hour = time/(60*60);
		int min = (time%(60*60))/60;
		int sec = time%60;

		System.out.println("=========== ������ =============");
		System.out.println(time+"�ʴ� "+hour+"�ð� "+min+"�� "+sec+"���̴�.");
	}
}