package com.prac.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperEx1 {
	private Scanner sc;
	   public WrapperEx1() { // 생성자
		      this.sc = new Scanner(System.in);
		   }
	public void ex1() {
		// 키보드로 부터 주민등록번호 입력
		// 나이 계산 현재년도 - 출생년도
		// 남자 여자
		// 3-5 봄 6-8 여름 9 -11 가을 12-2 겨울
	
		System.out.println("주민번호 입력하세요");
		String num = sc.next();
		String nums[] = num.split("");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("==============");
		int y = Integer.parseInt(nums[0]);
		int y2 = Integer.parseInt(nums[1]);
		int s = Integer.parseInt(nums[7]);
		int old = 2022 - Integer.parseInt("19" + y + y2) + 1;
		System.out.println("당신의 나이는::" + old);
		switch (s) {
		case 1:
			System.out.println("당신은 1900년대 남자입니다.");
			break;
		case 2:
			System.out.println("당신은 1900년대 여자입니다.");
			break;
		case 3:
			System.out.println("당신은 2000년대 남자입니다.");
			break;
		case 4:
			System.out.println("당신은 2000년대 여자입니다.");
			break;
		}
		int m = Integer.parseInt(nums[2]);
		int m2 = Integer.parseInt(nums[3]);
		int mn = m + m2;
//		String mn = num.substring(2,4);
		switch (mn) {
		case 3,4,5:

			System.out.println("당신의 계절은 봄입니다.");
			break;
		case 6,7,8:

			System.out.println("당신의 계절은 여름입니다.");
			break;
		case 9,10,11:

			System.out.println("당신의 계절은 가을입니다.");
			break;

		case 12,1,2:

			System.out.println("당신의 계절은 겨울입니다.");
			break;
		}

		System.out.println("==============");
	}

	public void ex3() {
		String jumin = "950524-1182610";
		for (int i = 0; i < jumin.length(); i++) {
			String result = jumin.substring(i, i+1);
			System.out.println(Integer.parseInt(result));
		}

		
	}

}
