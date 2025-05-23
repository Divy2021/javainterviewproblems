package com.test.sample;

public class Department {
	
	private static Department instance=null;
	

	private String name="HR";
	
	private Department(String name)
	{
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public static Department getInstance(String name)
	{
		
		if(instance==null)
			instance=new Department(name);
		
		return instance;
			
	}
	

}
