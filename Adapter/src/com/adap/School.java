package com.adap;

import com.Nari.pilotpen;

public class School
{
	public static void main(String[] args)
	{
		//pilotpen pp=new pilotpen();
		Pen p=new PenAdapter();
		AssignmentWork aw=new AssignmentWork();
		aw.setP(p);
		aw.WriteAssignment("im bit tried to write an assignment");
		
	}

}
