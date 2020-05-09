package com.adap;

import com.Nari.pilotpen;

public class PenAdapter implements Pen
{
	pilotpen pp =new pilotpen();

	@Override
	public void write(String str) {
		
		pp.marks(str);
		// TODO Auto-generated method stub
		
	}
	

}
