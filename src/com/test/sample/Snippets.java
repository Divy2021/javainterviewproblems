package com.test.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class Parent {
	static void staticDisplay() {
		System.out.println("Parent staticDisplay");
	}

	void instanceDisplay() {
		System.out.println("Parent instanceDisplay");

	}
}

class Child extends Parent {
	static void staticDisplay() {
		System.out.println("Child staticDisplay");
	}

	@Override
	void instanceDisplay() {
		System.out.println("Child instanceDisplay");
	}
}

public class Snippets {
	public static void main(String[] args) {
		
		String[] input={"eat","tea","tan","ate","nat","bat"};
		HashMap<String, List<String>> groupAnagram = groupAnagram(input);
		 //  strs =   ["eat","tea","tan","ate","nat","bat"]
			//	   Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
		Parent parentRef = new Child();

		parentRef.staticDisplay(); // What does this output?
		parentRef.instanceDisplay(); // What about this? --Child instanceDisplay
		
		for (int i =0; i <3; i++)
		 {  
		                   switch(i) {       
		                     case 0: break;      
		                      case 1: System.out.println("one ");     
		                       case 2: System.out.println("two ");       
		                     case 3: System.out.println  ("three ");      
		   }    //switch close        
		        System.out.println("done");       
		       } 

	}
	
	public static HashMap<String,List<String>> groupAnagram(String[] input)
	{
		HashMap<String,List<String>> hm=new HashMap<>();
		
	
		
		int i=0;
		
		while(i<input.length)
		{
			String s=input[i];
			String c = s.chars().sorted().mapToObj(x->(String.valueOf((char) x))).collect(Collectors.joining());
			hm.computeIfPresent(c, (k,v)->{v.add(s);return v;});
			hm.putIfAbsent(c,new ArrayList<>(Collections.singletonList(s)));
			//System.out.println(c);
		/*	if(hm.containsKey(c))
			{
				List<String> li1=hm.get(c);
			//	System.out.println(li1);
				li1.add(input[i]);
				hm.put(c, li1);
			}
			else
			{
				List<String> li=new ArrayList<String>();
				li.add(input[i]);
				hm.put(c, li);
			} */
				
				i++;
		}
		
		System.out.println(hm);
		
		return hm;
		
	}
}