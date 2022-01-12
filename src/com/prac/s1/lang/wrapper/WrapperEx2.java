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
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력하세요");
		String name = sc.next();
		String[] datas = name.split("");
		int[] checkNum = {2,3,4,5,6,7,8,9,2,3,4,5};
		int number = 0;
		int numbers[]= new int[13];
		int sum = 0;

		for (int i = 0; i < datas.length; i++) {
			if (datas[i].equals("-")) {
				continue;
			}
			number = Integer.parseInt(datas[i]);
			numbers[i]=number;
			System.out.println(numbers[i]);
		}
		for(int i=0;i<checkNum.length;i++) {
			
			sum=sum+numbers[i]*checkNum[i];
		}
		System.out.println(sum);
		
		System.out.println("종료");
	}
}