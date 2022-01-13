package com.prac.s3.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberData {
	private String data;
	private Scanner sc;
	public MemberData() {
		this.data = "id1-pw1-name1-id1@gmail.com-20-";
		this.data = this.data + "id2-pw2-name2-id2@naver.com-32-";
		this.data = this.data + "id3-pw3-name3-id3@kakao.com-22-";
		this.data = this.data + "id4-pw4-name4-id4@yahoo.com-54-";
		this.sc= new Scanner(System.in);
		System.out.println(this.data);
	}
	public MemberDTO removeMember(ArrayList<MemberDTO> ar) {
		//삭제하고 싶은 id받아서 삭제
		//arraylist에서 삭제
		MemberDTO memberDTO=null;
		System.out.println("삭제할 아이디 입력하세요");
		String id =sc.next();
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).getId().equals(id)) {
				memberDTO=ar.remove(i);
				break;
			}
		}
		return memberDTO;
	}

	public void addMember(ArrayList<MemberDTO> ar) {
		// MemberDTO 생성
		// 키보드로부터 id,pw,name,email,age 입력받아
		// memberdto의 멤버 변수 값으로 대입
		// 매개변수로 받은 ar에 memberdto 추가
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println(" 입력하세요");
		String info = sc.next();
		StringTokenizer st = new StringTokenizer(info, "-");
		String token = st.nextToken();
		memberDTO.setId(token);
		token = st.nextToken();
		memberDTO.setPw(token);
		token = st.nextToken();
		memberDTO.setName(token);
		token = st.nextToken();
		memberDTO.setEmail(token);
		token = st.nextToken();
		memberDTO.setAge(Integer.parseInt(token));
		ar.add(memberDTO);
	}

	public ArrayList<MemberDTO> init() {// 뭔가를 초기화 시켜준다
		// data에 있는 문자열을 stirngtokenizer로 파싱해서
		// MemberDTO를 생성해서 멤버 변수 값으로 대입
		// MemberDTO들을 ArrayList에 담아서 리턴
		StringTokenizer st = new StringTokenizer(this.data, "-");
		ArrayList<MemberDTO> ar = new ArrayList<>();
		while (st.hasMoreElements()) {
			MemberDTO memberDTO = new MemberDTO();

			memberDTO.setId(st.nextToken().trim());
			memberDTO.setPw(st.nextToken().trim());
			memberDTO.setName(st.nextToken().trim());
			memberDTO.setEmail(st.nextToken().trim());
			memberDTO.setAge(Integer.parseInt(st.nextToken().trim()));
			
			
			//한사람만 입력받을때 예
			//MemberDTO memberDTO= new MemberDTO();
//			System.out.println("ID 입력");
//			memberDTO.setId(sc.next());
//			System.out.println("PW 입력");
//			memberDTO.setPw(sc.next());
//			System.out.println("Name 입력");
//			memberDTO.setName(sc.next());
//			System.out.println("Email 입력");
//			memberDTO.setEmail(sc.next());
//			System.out.println("Age 입력");
//			memberDTO.setAge(sc.nextInt());
		}

		return ar;
	}
}
