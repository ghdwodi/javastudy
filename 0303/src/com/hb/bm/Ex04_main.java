package com.hb.bm;

public class Ex04_main {
	public static void main(String[] args) {
		Ex01 test1 = new Ex01();
		Ex02 test2 = new Ex02();
		Ex03 test3 = new Ex03();
		
		// Thread를 상속받은 클래스는 바로 start() 메소드를 사용할 수 있다.
//		test1.start();	// Ex01 클래스는 Runnable 인터페이스를 상속받았을 뿐이므로 불가능하다.
		
		// 인터페이스를 상속받은 클래스를 타겟으로 만들려면 아래와 같이 한다.
		// start()를 실행하면 타겟인 test1의 rus()이 실행된다.
		Thread t1 = new Thread(test1);
		t1.start();
		
		// 익명 스레드
		new Thread(new Ex02()).start();
		new Thread(new Ex03()).start();
		
		// 익명 내부 클래스 <= 안드로이드에서 많이 사용하는 방법
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i = 0;
				while(true){
					i++;
					System.out.println("★ ★ ★ ★ ★ ★ ★ ★ ★  : "+Thread.currentThread().getName()+" : "+i);
					if (i==20) break;
				}				
			}
		}).start();
		
	}
}
