package com.hb.cm;

public class Ex06_thread extends Thread {
	Ex06_JFrame snow;
	int x = -50; int y = -50;
	public Ex06_thread() {}
	public Ex06_thread(Ex06_JFrame snow){
		this.snow = snow;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int ran = (int)(Math.random()*2)+1;
		while(y < snow.can.getHeight()){
			y += ran;
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			snow.can.repaint();
		}
	}

}
