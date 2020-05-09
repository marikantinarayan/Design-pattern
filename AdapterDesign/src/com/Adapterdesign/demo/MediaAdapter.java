package com.Adapterdesign.demo;

public class MediaAdapter implements Mediaplayer
{
 //step:3
	AdvancedMediaplayer am;
	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("Vlc"))
		{
			am=new Vlcplayer();
			
		}
		else if (audioType.equalsIgnoreCase("Mp4")) {
			am=new Mp4player();
			
		}
		
	}
	@Override
	public void play(String audioType, String fileName) 
	
	{ 
		if (audioType.equalsIgnoreCase("Vlc")) {
			am.playVlc(fileName);
			
		}
		else if (audioType.equalsIgnoreCase("Mp4")) {
			am.playMp4(fileName);
			
		}
		// TODO Auto-generated method stub
		
	}

}
