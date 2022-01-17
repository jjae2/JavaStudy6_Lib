package com.prac.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy2 {

	public static void main(String[] args) {
		//현재시간
		Calendar ca =Calendar.getInstance();// new 로 객체 생성 안된다 
		System.out.println(ca.getTime());
		//시간변경 							// 왜냐 추상클래스 이기 떄문
		Calendar ca2 =Calendar.getInstance();
		ca2.set(Calendar.DATE, 15);
		ca2.set(Calendar.YEAR,2023);
		System.out.println(ca2.getTime());
	}

}
