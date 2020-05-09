package com.phone;

public class shop 
{
	public static void main(String[] args) 
	{
		//phone p= new phone("Android",2,"Qualcom",5.5,3100);
		phone p= new phonebulider().setOs("Android").setRam(2).setBattery(3200).setProcessor("Qualcom") .setScreensize(4.5).getphone();
		System.out.println(p);
		
		
		
	}

}
