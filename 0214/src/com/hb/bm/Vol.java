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

	// up (5 초과 불가)

	public void upVol(){
		if (vol<5)
		{
			vol++;
		} else {
			vol = 5;
		}
	}

	// down (0 미만 불가)

	public void downVol(){
		if (vol>0)
		{
			vol--;
		} else{
			vol = 0;
		}
	}
}
