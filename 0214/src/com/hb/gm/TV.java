package com.hb.gm;
class TV extends Vol
{

	@Override
	public void upVol() {
		if (vol<18)
		{
			vol = vol + 3;
		} else {
			vol = 20;
		}
		
	}

	@Override
	public void downVol() {
		if (vol>0)
		{
			vol = vol -3;
		} else{
			vol = 0;
		}
		
	}
	
}
