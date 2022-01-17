package com.prac.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy4 {

	public static void main(String[] args) {
		// 현재 시간
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		// 태어난 년도 월 일
		Calendar caj = Calendar.getInstance();
		caj.set(1995, 5,24);
		System.out.println(caj.getTime());
		//얼마나 지났는지 일
		long l1= ca.getTimeInMillis();
		long l2= caj.getTimeInMillis();
		long result = l1-l2;
		System.out.println("며칠이 지났을까요?-->"+result/(1000*60*60*24));
		//나이
		System.out.println("몇살 일까요?-->"+result/(1000*60*60*24*365.2425));
	}

}
