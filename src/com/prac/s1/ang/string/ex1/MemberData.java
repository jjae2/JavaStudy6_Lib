package com.prac.s1.ang.string.ex1;

public class MemberData {
	private String data;

	public MemberData() {
		this.data = "id1-pw1-name1-id1@gmail.com-20-";
		this.data = this.data + "id2-pw2-name2-id2@naver.com-32-";
		this.data = this.data + "id3-pw3-name3-id3@kakao.com-22-";
		System.out.println(this.data);
	}

	public MemberDTO[] init() {// 뭔가를 초기화 시켜준다
		String datas[] = this.data.split("-");
		MemberDTO members[] = new MemberDTO[4];//datas.length/4 로하면 id숫자가많아져도 변동x
		int index=0;
		for (int i = 0; i < members.length; i++) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(datas[index++]);//datas[0] 4 8
			memberDTO.setPw(datas[index++]);//datas[1] 5 9
			memberDTO.setName(datas[index++]);//2 6 10
			memberDTO.setEmail(datas[index++]);//3 7 11 바뀌는것이여서 변수를 넣어야함
			memberDTO.setAge(Integer.parseInt(datas[index++]));
 			members[i] = memberDTO;//넣은값을 저장시키기위해 배열값에 넣는다.
 		
 			//증감 연산자
 			//++i 나 자신(i)을 먼저 실행
 			//i-- 나 자신(i)을 젤 나중에 실행
 			//단독 사용은  차이가 없다.
 			//datas[++index] ++뒤에 넣으면 다 해결하고 마지막 ++라서 안맞는다.
		}
		return members;
	}
}
