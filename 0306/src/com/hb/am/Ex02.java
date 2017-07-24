package com.hb.am;

// 임계영역 : 멀티스레드에서 공통으로 사용되는 영역
// 현재 실행 중인 스레드가 순식간에 다른 스레드에게 제어권을 빼앗긴다.
// 이러한 경우 실시간 처리에서 문제가 발생할 수 있다.
// 동기화 처리를 통해 이를 해결할 수 있다.
// synchronized 예약어를 사용하여 동기화한 블록은 하나의 스레드만 진입할 수 있다.
// 해당 스레드가 임계영역에서 작업을 끝낼 때까지 다른 스레드는 무조건 대기하게 된다.

public class Ex02 implements Runnable {
	int x;
	@Override
	// 임계 영역
	public synchronized void run() { // synchronized 예약어로 메소드를 동기화한다.
		// TODO Auto-generated method stub
		for (int i=0; i<100; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+x);
			++x;
			// 동기화하지 않으면 여러 스레드가 동시다발적으로 들어오므로 x값이 일관성없이 더해진다.
		}
	}
	
	public static void main(String[] args) {
		Ex02 test = new Ex02();
		
		new Thread(test, "Dog").start();
		new Thread(test, "Cat").start();
		new Thread(test, "Tiger").start();
		new Thread(test, "Racoon").start();
		new Thread(test, "Penguin").start();
		new Thread(test, "Lion").start();
	}
}
