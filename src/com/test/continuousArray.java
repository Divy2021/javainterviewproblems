package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class continuousArray {

	public static void main(String[] args) {

		
		//Continuous sub array of [2, 51, 7, 81, 5, 11, 25] whose sum is 93 ->[7,81,5]
		
		int[] input= {2, 51, 7, 81, 5, 11, 25}; //2 :53 :60 :141 :146 :157 :182 :
		List<Integer> lis=Arrays.asList(4,5,6,1,2,3);
		List<Integer> res=lis.stream().sorted().collect(Collectors.toList());
		System.out.println(res);
		List<Integer> li=Arrays.stream(input).sorted().boxed().collect( Collectors.toList());//boxed().toList();
		System.out.println(li);
     	System.out.println(Arrays.toString(input));
	    
     	int start=0;
     	ArrayList<Object> list = new ArrayList<>();
     	
     	int sum=0;
     	int k=93;
     	
     	for(int i=0;i<input.length;i++)
     	{
     		sum+=input[i];
     		while(sum>k && start<=i-1)
     		{
     			sum-=input[start];
     			start++;
     		}
     		
     		if(sum==k)
     		{
     			for(int j=start;j<i+1;j++)
     			{
     				list.add(input[j]);
     			}
     		}
     	}
     	
     	System.out.println(list);
		

		
	}
	
	
}
