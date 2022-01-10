package com.prac.s1.lang.string;

import java.util.Scanner;

public class StringStudy1 {

	public void subStringEx1() {
		// 키보드로부터 업로드할 파일명을 입력
		// a.txt, b.pdf, iu.jpg
		// jpg, gif, png -> 이미지파일입니다 출력
		// txt, pdf, hwp -> 문서 파일입니다 출력
		// mp3, wav, ogg -> 음원 파일 입니다 출력
		// 나머지는 알 수 없는 파일 입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 입력");
		String fileName = sc.next();// abc.test.txt
		String result = fileName.substring(fileName.lastIndexOf(".") + 1);
		System.out.println(result);

		if (result.equals("jpg") || result.equals("gif") || result.equals("png")) {
			System.out.println("이미지 파일");
		} else if (result.equals("txt") || result.equals("pdf") || result.equals("hwp")) {
			System.out.println("문서 파일");
		} else if (result.equals("mp3") || result.equals("wav") || result.equals("ogg")) {
			System.out.println("음원 파일");
		} else {
			System.out.println("알 수 없는 파일 형식");
		}

	}
}