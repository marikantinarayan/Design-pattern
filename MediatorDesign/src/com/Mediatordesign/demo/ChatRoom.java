package com.Mediatordesign.demo;

import java.util.Date;

public class ChatRoom 
//step:1
{
	public static void showmessage(User user,String message) {
		
		System.out.println(new Date().toString()+"["+user.getName()+"]:"+message);
	}


}
