package com.hb.bm;

public class Vol {
	private int vol = 0;

	// setter

	public void setVol(int v){
		vol = v;
	}


	// getter

	public int getVol(){
		return vol;
	}

	// up (5 �ʰ� �Ұ�)

	public void upVol(){
		if (vol<5)
		{
			vol++;
		} else {
			vol = 5;
		}
	}

	// down (0 �̸� �Ұ�)

	public void downVol(){
		if (vol>0)
		{
			vol--;
		} else{
			vol = 0;
		}
	}
}
