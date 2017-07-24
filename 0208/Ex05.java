import java.util.*;

class Ex05{
	public static void main(String[] args){
	// 오늘의 운세 만들기
	// Calendar를 이용해 오늘 날짜를 구한다
	// Math.random()이나 Random()을 이용해 운수%값을 만들기

		Calendar now = Calendar.getInstance();

	// 연, 월, 일

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DATE);

	// 행운 % 구하기

		Random ran = new Random();
		int su = ran.nextInt(101);
		int su2 = (int)(ran.nextDouble()*101);
		int su3 = (int)(Math.random()*101);

		System.out.println(year+"년 "+month+"월 "+day+"일 당신의 운세");
		System.out.println("오늘의 금전운 : "+su+"%");
		System.out.println("오늘의 먹을복 : "+su2+"%");
		System.out.println("오늘의 사고위험 : "+su3+"%");
	}
}