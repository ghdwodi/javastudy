package com.hb.gm;
class Computer extends Vol
{

	@Override
	public void upVol() {
		if (vol<5)
		{
			vol++;
		} else {
			vol = 5;
		}
		
	}

	@Override
	public void downVol() {
		if (vol>0)
		{
			vol--;
		} else{
			vol = 0;
		}
		
	}
	
}
