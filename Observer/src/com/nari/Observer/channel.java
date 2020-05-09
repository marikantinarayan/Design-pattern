package com.nari.Observer;

import java.util.ArrayList;
import java.util.List;

public class channel implements Subject 
{
		private	List<subscriber>subs=new ArrayList<>();
		//private String title;
		 String title;
		@Override
		public void subscribe(subscriber sub)
		{
			subs.add(sub);	
		}
		@Override
		public void unsubscribe(Observer sub)
		{
			subs.remove(sub);
		
		}
		@Override
		public void notifysubscribes()
		{
			for (Observer s : subs)
			{
				s.update();
				
			}
			
		}
		@Override
		public void upload(String title)
		{
			this.title=title;
			notifysubscribes();
			
		}
}
