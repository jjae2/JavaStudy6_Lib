package com.prac.s2.util.collection;

import java.util.ArrayList;

public class ListStudy {
	public void study3() {
		ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add('b');
		ar.add(3.12);
		ar.add("iu");
		for(int i=0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
	}
	public void study2() {
		ArrayList ar = new ArrayList();
		int num =1;
		Integer n = num;//autoboxing다형성
		ar.add(n);
		ar.add(1);//autoboxing다형성
		ar.add('a');//autoboxing다형성
		ar.add("name");//autoboxing 다형성
	}
	
	public void study1() {
		int numbers[]= new int[3];
		ArrayList ar = new ArrayList();
		numbers[0]=1;
		numbers[1]=2;
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(3,100);
		ar.set(0, 200);
		ar.remove(1);
		for(int i=0; i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}
}
