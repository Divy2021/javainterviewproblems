package com.test.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestJava {

	public static void main(String[] args) {

		 System.out.println("Hello, World!"); 
		 main(143);
		 
		 List<String> li=List.of("1","2");
		 List<String> li1=new ArrayList<>();
		 li1.add("1");
		// li1.removeFirst(1);
		 
		 
	        String s = "string data to count each character";
	        Map<Character, Long> collect = s.chars().mapToObj(x->Character.valueOf((char) x)).filter(x->!x.equals(' ')).
	        		collect(Collectors.groupingBy(Function.identity(),  Collectors.counting()));
		System.out.println(collect);
		
		
	  //   Input : 10 -> 20 -> 30 -> 40 -> 50 -> 60  K = 4

	  //  		 Output : 50 -> 60 -> 10 -> 20 -> 30 -> 40
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		Node n5=new Node(50);
		Node n6=new Node(60);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		
		Node head=n1;
		Node root=n1;
		System.out.println("input");
		display(n1);
		int k=4;
		int count=1;
		Node result=null;
		while(count<k)
		{
			head=head.next;
			count++;
			
		}
		result=head.next;
		head.next=null;
		System.out.println("head "+head.value);
		System.out.println("result "+result.value);
		
		Node temp=result;
		while(result.next!=null)
		{
        result=result.next;
        }
		
		result.next=root;
		System.out.println("output");
		display(result);
		
		
			}
	
	public static void display(Node n)
	{
		
		while(n!=null)
		{
			System.out.print(n.value+"->");
			n=n.next;
		}
	}
	
	public static void main(Integer n)
	{
		
		while(n!=null)
		{
			System.out.println(n+"integer main ->");
			break;
			//n=n.next;
		}
	}
	
	

}
