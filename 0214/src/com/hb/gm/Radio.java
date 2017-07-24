package com.hb.gm;
class Radio extends Vol
{

	@Override
	public void upVol() {
		if (vol<9)
		{
			vol = vol + 2;
		} else {
			vol = 10;
		}
		
	}

	@Override
	public void downVol() {
		if (vol>0)
		{
			vol = vol - 2;
		} else{
			vol = 0;
		}
		
	}
	
	
}
