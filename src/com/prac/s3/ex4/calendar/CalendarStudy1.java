package com.prac.s3.ex4.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarStudy1 {
	
	public static void main(String[] args) {
		//calendar는 추상 클래스
		//GregroianCalendar가 Calendar 클래스 상속
		//Calendar의 메세드는 GregorianCalendar에 있다
		
		//현재 날짜와 시간정보를 가지는 객체를 생성
		GregorianCalendar gc =new GregorianCalendar();
		Calendar calendar = new GregorianCalendar();
		Calendar ca = calendar.getInstance();//getinstance::자기 자신의 객체를 리턴해준다
		System.out.println(gc);
		System.out.println(calendar);
		int y =ca.get(Calendar.YEAR);
		int m =ca.get(Calendar.MONTH);
		int d =ca.get(Calendar.DATE);
		int h =ca.get(Calendar.HOUR);
		int hh=ca.get(Calendar.HOUR_OF_DAY);//24시 중 3시=15시
		int min = ca.get(Calendar.MINUTE);
		int s = ca.get(Calendar.SECOND);
		int ms =ca.get(calendar.MILLISECOND);//1000분의 1초
		long millis =ca.getTimeInMillis();
		Date date = ca.getTime();// Date 타입으로 변하면 좋은점 시간 보기가 편하다
		System.out.println("Y :: "+y);
		System.out.println("M :: "+(m+1));//월이 컴퓨터로 입력되면0부터 시작
		System.out.println("D :: "+d);
		System.out.println("H :: "+h);
		System.out.println("HH :: "+hh);
		System.out.println("min :: "+min);
		System.out.println("s :: "+s);
		System.out.println("MS :: "+ms);
		System.out.println("Millis :: "+millis);
		System.out.println("Date :: "+date );
	}
}
	
	
