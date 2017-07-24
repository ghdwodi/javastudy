package com.hb.am;

// 동기화 중 강제로 멈추게 하는 메소드 : wait()
// wait()된 스레드는 notify()를 사용하지 않으면 더 이상 실행하지 않는다.
// wait와 notify는 동기화 중에만 사용할 수 있다.
public class Ex04 implements Runnable {
	int x;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			++x;
			System.out.println(Thread.currentThread().getName()+" : "+x+", i : "+i);
			if (x==50 || x==100){
				try {
					wait();	// 현재 스레드는 대기 상태에 들어간다.
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				notify();	// 대기 상태에 있던 스레드가 다시 준비 상태로 들어간다.
			}
		}
	}
}
