package com.test;

public class test {

	public static void main(String[] args) {

		queueimpl q=new queueimpl();
		q.enqueue(50);
		q.enqueue(2);
		q.enqueue(1);
		System.out.println("display elements");
		q.display();
		System.out.println("size :"+q.size());
		System.out.println("element dequeued: "+q.dequeue());
		System.out.println("element dequeued: "+q.dequeue());
		System.out.println("element dequeued: "+q.dequeue());
		System.out.println(q.dequeue());
		System.out.println("display elements");
		q.display();
		
		//Continuous sub array of [2, 51, 7, 81, 5, 11, 25] whose sum is 93
		
		String str1 = "ABCDCD";
		String str2 = "CDEFD";
		//o/p -> CDD
		//A-1,B-1,C-2,D-2->1C
		//1C2D
		//123->132,HM->1-1,2-1,3-1->123,321,231
		//192->219
		//123,124,125,126,
		//1024
		//s="123",
		//PERMUTAION(START,SUBSTRING,res)
		//{
		//	IF(INPUT.LENGTH==)
		//	res.add(input);
		//	else
		//		permutation(s.substring(i+1),s.chart(i))
		//}
		
		
		
		
	}


}
