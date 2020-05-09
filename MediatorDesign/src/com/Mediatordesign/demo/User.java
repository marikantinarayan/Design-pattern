package com.Mediatordesign.demo;

public class User
//step:2
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		super();
		this.name = name;
	}
	public void sendmessage(String message) {
	ChatRoom.showmessage(this, message);
	}
	

}
