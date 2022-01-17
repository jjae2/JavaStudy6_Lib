package com.prac.s3.ex1.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.prac.s3.ex1.member.MemberDTO;

public class StudentData {
	private Scanner sc;

	public StudentData() {
		this.sc = new Scanner(System.in);
	}

	public Map<String, StudentDTO> addStudent(List<MemberDTO> ar) {// 학생의 정보라 생각
		// 멤버의 수만큼 성적 정보 입력
		// 받은 정보를 StudentDTO 객체 생성 그 수만큼
		// MAP 키는 id ,벨류 studentdto
		HashMap<String, StudentDTO> map = new HashMap<>();
		for (int i = 0; i < ar.size(); i++) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setId(ar.get(i).getId());// 리스트에서 멤머dto꺼내고 id꺼내자
			studentDTO.setName(ar.get(i).getName());
			System.out.println("학생 " + (i + 1) + " 국어점수를 입력하세요.");
			studentDTO.setKor(sc.nextInt());
			System.out.println("학생 " + (i + 1) + " 영어점수를 입력하세요.");
			studentDTO.setEng(sc.nextInt());
			System.out.println("학생 " + (i + 1) + " 수학점수를 입력하세요.");
			studentDTO.setMath(sc.nextInt());
			studentDTO.setTotal(studentDTO.getKor() + studentDTO.getEng() + studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal() / 3.0);
			// studentDTO를 하나 만들어서 MAP에 넣기
			map.put(studentDTO.getId(), studentDTO);
			System.out.println("====================");
		}
		return map;
	}
}
