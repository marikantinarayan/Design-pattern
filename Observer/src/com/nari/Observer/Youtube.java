package com.nari.Observer;

public class Youtube {
	public static void main(String[] args)
	{
		channel narayan=new channel();
		
		subscriber s1=new subscriber("Naresh");
		subscriber s2=new subscriber("Ramesh");
		subscriber s3=new subscriber("thiru");
		subscriber s4=new subscriber("arnav");
		subscriber s5=new subscriber("navin");
		narayan.subscribe(s1);
		narayan.subscribe(s2);
		narayan.subscribe(s3);
		narayan.subscribe(s4);
		narayan.subscribe(s5);
		s1.subscribechannel(narayan);
		s2.subscribechannel(narayan);
		s3.subscribechannel(narayan);
		s4.subscribechannel(narayan);
		s5.subscribechannel(narayan);
		
		narayan.unsubscribe(s2);
		narayan.upload("How to learning programming??");
		
		
		
		
		
	}

}
