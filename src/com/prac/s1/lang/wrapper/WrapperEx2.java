package com.prac.s1.lang.wrapper;

import java.util.Scanner;

import com.prac.s1.ang.string.ex1.MemberDTO;

public class WrapperEx2 {

	public void ex2() {
		// 똑같이 받고
		// 9 5 0 5 2 4 - 1 1 8 2 6 1 0 -->마지막 체크용 번허ㅗ
		// 2 3 4 5 6 7 8 9 2 3 4 5
		// 곱한거 다 더한다 ex)122 122/11 나머지 구한다-->1
		// 나머지 값을 -11로 뺴고 그 값을 체크용이랑 같은지 비교
		// 결과가 두자릿수면 다시10으로 나눠서 다시 비교
		Scanner sc =new Scanner(System.in);
		System.out.println("주민번호 입력하세요.");
		String count = sc.next();
		String cnt[]=count.split("");
		for(int i=0; i<cnt.length;i++) {
		System.out.println(cnt[i]);
			
		}
		System.out.println("==============");
		int nums=0;
		for(int i=0; i<6;i++) {
			nums=nums+Integer.parseInt(cnt[i]);
		
		}
		for(int j=2;j<8;j++) {
			for(int i=0;i<6;i++) {
			int a=nums*j;
			System.out.println(a);
		}
	}
}
}
