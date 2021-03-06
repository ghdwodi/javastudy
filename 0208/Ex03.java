import java.util.*;

class Ex03{
	public static void main(String[] args){
	// 클래스 Calender : 날짜 관련 클래스
	// Calender 클래스 역시 java.util을 import해야 한다.
	// Calender 생성

		Calendar now = Calendar.getInstance();

	// 연 월 일 시 분 => get(상수=field명);
		System.out.println(now.get(Calendar.YEAR)+"년");
		System.out.println(now.get(now.YEAR)+"년");
		System.out.println(now.get(Calendar.MONTH)+1+"월");
		System.out.println(now.get(Calendar.DAY_OF_MONTH)+"일");
		System.out.println(now.get(Calendar.DATE)+"일");

		System.out.println(now.get(Calendar.HOUR)+"시");	// 12시간
		System.out.println(now.get(Calendar.HOUR_OF_DAY)+"시");	// 24시간
	// 오전=>0, 오후=>1
		int res = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR);
		if (res==0){
			System.out.println("AM "+hour+"시");
		} else if (res==1) {
			System.out.println("PM "+hour+"시");
		}

		System.out.println(now.get(Calendar.MINUTE)+"분");
		System.out.println(now.get(Calendar.SECOND)+"초");

	// 요일(SUN => 1 ,...,SAT => 7);
		System.out.println(now.get(Calendar.DAY_OF_WEEK)+"요일");
	}
}