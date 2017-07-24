package com.hb.gm;

public abstract class Vol {
	protected int vol = 0;

	// setter

	public void setVol(int v){
		vol = v;
	}


	// getter

	public int getVol(){
		return vol;
	}

	// up

	public abstract void upVol();

	// down

	public abstract void downVol();
}
