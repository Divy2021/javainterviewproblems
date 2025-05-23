package com.test.sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestEmployee {

	public static void main(String[] args) {

		
//		Find 1st non repeated character from a string using java8
	    String str="kafka"; // output= f
			    LinkedHashMap<Character, Long> collect = str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		collect.entrySet().stream().filter(x->(x.getValue()==1)).limit(1).forEach(x->System.out.println(x.getKey()));
		
		//Reverse each word in String
	   // input="java code"
	    //	    output = "avaj edoc"
		
		String s1="java code";
		String[] s=s1.split(" ");
		StringBuilder op=new StringBuilder();
		for(int i=0;i<s.length;i++)
		{
			StringBuilder op1=new StringBuilder();
			if(i!=s.length-1)
			op.append(op1.append(s[i]).reverse().append(" "));
			else
				op.append(op1.append(s[i]).reverse());
				
		}
		
		System.out.println(op);
		List<Employee> el=Arrays.asList(new Employee("chris",20000,22),new Employee("John",25000,25),new Employee("bob",20000,23),
				
				new Employee("Jack",35000,25),new Employee("Mary",20000,25));
		Employee e1=new Employee("jack",30000,24);
		Department dept1=Department.getInstance("IT");
		Department dept2=Department.getInstance("Service");
		System.out.println(dept1.getName());
		System.out.println(dept2.getName());
		
		
		
		//el.stream().sorted(Comparator.comparingLong(Employee::getSalary).thenComparing(Employee::getName)).forEach(x->System.out.println("Name:  "+x.getName()+" salary: "+x.getSalary()+" age:"+x.getAge()));;
	
		
		List<Employee> el2=Arrays.asList(new Employee("John",25000,25),new Employee("bob",20000,23),
				new Employee("Jack",35000,25),new Employee("Mary",20000,25));
		
		el2.stream().sorted(Comparator.comparingInt(Employee::getAge)).map(x->x.getName()).close();;
	
	}

}
