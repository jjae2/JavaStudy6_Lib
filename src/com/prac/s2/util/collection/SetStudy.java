package com.prac.s2.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetStudy {
	public void study4() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		Iterator<Integer> it =hs.iterator();
		while(it.hasNext()) {//다음 요소를 꺼낸다
			int num=it.next();//다음 요소를 줘라
			System.out.println(num);
		}
	}
	public void study3() {//set
		Random random =new Random();
		HashSet<Integer> hs = new HashSet<>();
		while(hs.size()!=6){//set 중복허용이 안되서 중복되면 6개가 안나와서 while문 사용
			int num = random.nextInt(45)+1;
			hs.add(num);
		}
			
		System.out.println(hs);
	}
	public void study2() {//list
		Random random =new Random();
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i=0;i<6;i++) {
			int num = random.nextInt(45)+1;
			ar.add(num);
		}
		System.out.println(ar);
	
	
	}
	public void study1() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(1);
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);
		ar.add(100);
		System.out.println(ar);
		System.out.println(hs);
		System.out.println(hs.size());
		
	}
}
