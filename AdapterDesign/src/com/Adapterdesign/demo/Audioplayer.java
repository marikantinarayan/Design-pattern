package com.Adapterdesign.demo;

public class Audioplayer implements Mediaplayer
{
	//step:4
	MediaAdapter media;

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("Mp3")) {
			System.out.println("Playing Mp3 file .name"+fileName);
			
		}
		else if (audioType.equalsIgnoreCase("Vlc")||audioType.equalsIgnoreCase("Mp4")) {
			media=new MediaAdapter(audioType);
			media.play(audioType, fileName);
		}
		else {
			System.out.println("Invalid media ."+audioType+"format not supported");
		}
		// TODO Auto-generated method stub
		
	}

}
