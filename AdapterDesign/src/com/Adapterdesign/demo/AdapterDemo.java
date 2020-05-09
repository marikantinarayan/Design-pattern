package com.Adapterdesign.demo;

public class AdapterDemo 
{//step:5
	public static void main(String[] args) {
		Audioplayer audioplayer=new Audioplayer();
		audioplayer.play("Mp3", "beyond the horizon.mp3");
		audioplayer.play("Mp4", "alone.Mp4");
		audioplayer.play("Vlc", "far far away.Vlc");
		audioplayer.play("avi", "mind me.avi");
	}

}
