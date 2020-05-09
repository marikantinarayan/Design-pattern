package com.Iteratordesign.demo;

public class NameRepository  implements Container
//step:2
{
	public String name[]= {"Robert","john","Julie","lora"};
	
	@Override
	public Iterator getiterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}
	private class NameIterator implements Iterator
	{
		int index=0;
		@Override
		public boolean hasNext() {
			if (index<name.length)
			{
				return true;
			}
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next()
		{
			if (this.hasNext())
			{
				return name[index++];
			}
			return null;
			// TODO Auto-generated method stub
			
		}
		
		
	}

}
