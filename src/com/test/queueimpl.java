package com.test;

public class queueimpl {
	int[] queue=new int[10];
	
	int count=0;
	int front=0,size=0;
	
	public  void enqueue(int x)
	{
		queue[count]=x;
		count++;
		size++;
	}
	
	public String dequeue()
	{
		int y=0;
		if(size!=0)
		{
			y=queue[front];
			queue[front]=0;
			front++;
			size--;
		}
		else
		return "queue is empty";
		
		return y+" is dequeued";
		
	}
	public void display()
	{
		for(int i:queue)
		{
			if(i!=0)
			{
			System.out.println(i);
			}
		}
	}	
	public int size()
	{
		return size;
	}
}
