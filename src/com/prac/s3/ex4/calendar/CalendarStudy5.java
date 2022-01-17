package com.prac.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy5 {

	public static void main(String[] args) {
		// 카카오택시
		//30분 소요 예정 -1000*60*30
		// 도착 예쩡 시간은?
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		long time= ca.getTimeInMillis();
		time = time+1000*60*30;
		ca.setTimeInMillis(time);
		System.out.println(ca.getTime());
		ca.roll(Calendar.MINUTE, 30);
		ca.roll(Calendar.MINUTE, 70);//시간은 안넘어가고 분만 넘어갔다 1시간 10분 ->10분
		ca.add(Calendar.MINUTE, 70);//1시간10분 넘어감
		System.out.println(ca.getTime());

	}

}
