package com.Adapterdesign.demo;

public class Vlcplayer implements AdvancedMediaplayer
{//step:2

	@Override
	public void playVlc(String fileName) {
		System.out.println("playing vlc file .Name"+fileName);
	// TODO Auto-generated method stub		
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		
	}

}
