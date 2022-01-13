package com.prac.s3.ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentData {
	private String data;
	private Scanner sc;

	public StudentData() {
		this.sc = new Scanner(System.in);
		this.data = "name1,10,60,80,90,name2,11,60,70,90,";
		this.data = this.data + "name3,15,60,80,90";
		System.out.println(this.data);
	}

	public ArrayList<StudentDTO> inIt() {
		StringTokenizer st = new StringTokenizer(this.data, ",");
		ArrayList<StudentDTO> ar = new ArrayList<>();
		while (st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNumber(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setSum(studentDTO.getKor() + studentDTO.getEng() + studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getSum() / 3.0);
			ar.add(studentDTO);
		}
		return ar;
	}

	public void addData(ArrayList<StudentDTO> ar) {
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("=============");
		System.out.println("이름을 입력하세요.");
		studentDTO.setName(sc.next());
		System.out.println("번호를 입력하세요");
		studentDTO.setNumber(sc.nextInt());
		System.out.println("국어점수를 입력하세요.");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어점수를 입력하세요.");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학점수를 입력하세요.");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setSum(studentDTO.getKor() + studentDTO.getEng() + studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getSum() / 3.0);
		ar.add(studentDTO);
	}

	public StudentDTO removeData(ArrayList<StudentDTO> ar) {
		StudentDTO studentDTO = null;
		System.out.println("삭제할 번호를 입력하세요.");
		int num = sc.nextInt();
		for (int i = 0; i < ar.size(); i++) {
			ar.get(i).getNumber();
			if (num == ar.get(i).getNumber())
				;
			studentDTO = ar.remove(i);
			break;
		}
		return studentDTO;

	}
}

// 학생들의 정보를 파싱해서 총점과 평균도 계산 후 전체 출력
// 학생의 정보를 추가
// 학생의 정보를 삭제
