package com.prac.s3.ex2;

import java.util.ArrayList;

public class StudentMain {

   public static void main(String[] args) {
	   StudentData stuD = new StudentData();
	   ArrayList<StudentDTO> ar = stuD.inIt();
//	   stuD.addData(ar);
	   StudentDTO studentDTO=stuD.removeData(ar);
	   if(studentDTO!=null) {
		   System.out.println("삭제 성공");
	   }else {
		   System.out.println("삭제 실패");
	   }
	   
	   for(int i=0; i<ar.size();i++) {
		   System.out.println("학생의 이름은::"+ar.get(i).getName());
		   System.out.println("학생의 번호는::"+ar.get(i).getNumber());
		   System.out.println("학생의 국어점수는::"+ar.get(i).getKor());
		   System.out.println("학생의 영어점수는::"+ar.get(i).getEng());
		   System.out.println("학생의 수학점수는::"+ar.get(i).getMath());
		   System.out.println("학생의 총점은::"+ar.get(i).getSum());
		   System.out.println("학생의 평균은::"+ar.get(i).getAvg());
		  
	   }
	   
   }
}
