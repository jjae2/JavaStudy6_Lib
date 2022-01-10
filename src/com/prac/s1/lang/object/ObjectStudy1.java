package com.prac.s1.lang.object;

public class ObjectStudy1 {
	public void study1() {
		System.out.println("Study1 실행");
		//Object 객체를 생성하고 주소 출력
		Object obj = new Object();
		//clone 호출
		//참조변수명.멤버
		int i= obj.hashCode();
		System.out.println(i);
		String j=obj.toString();
		System.out.println(j);
	}

}
