package com.prac.s2.util.collection;

import java.util.HashMap;

public class MapStudy {
	public void study1() {
		// HashMap
		HashMap<String, Integer> map = new HashMap<>();
		map.put("f1", 1);
		map.put("f2", 2);
		map.put("f3", 3);
		System.out.println(map);
		int num = map.get("f2");
		System.out.println(num);
		map.remove("f3");
		System.out.println(map);
		Integer n = map.get("test");//int도 가능하지만 integer 해야 오류안난다.
		String name= "k5";
		map.put(name, null);//이렇게도 넣는게 가능하다.
		System.out.println("N:"+n);
		System.out.println(map);
	}
}
