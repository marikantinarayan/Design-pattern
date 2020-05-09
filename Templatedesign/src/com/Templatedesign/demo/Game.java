package com.Templatedesign.demo;

public abstract class Game
//step:1
{
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	public final void play() {
		initialize();
		startPlay();
		endPlay();
	}

}
