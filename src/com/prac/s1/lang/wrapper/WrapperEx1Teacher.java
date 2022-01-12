package com.prac.s1.lang.wrapper;
import java.util.Scanner;

public class WrapperEx1Teacher {

   private Scanner sc;

   public WrapperEx1Teacher() { // 생성자
      this.sc = new Scanner(System.in);
   }

   public void ex2() {

      System.out.println("주민번호 입력");

      String jumin = sc.next();
      System.out.println(jumin);
      jumin = "970911-2710815";

//      String[] result = jumin.split("");
//      for (int i = 0; i < result.length; i++) {
//         if (result[i].equals("-")) {
//            continue;
//         }
//         System.out.println(Integer.parseInt(result[i]));
//
//      }

//      for (int i = 0; i < jumin.length()-1; i++) {
//         String result = jumin.substring(i, i + 1);
//         if(result.equals("-"))
//            continue;
//         System.out.println(Integer.parseInt(result));
//
//      }
      int source = 2;
      int sum = 0;

      for (int i = 0; i < jumin.length()-1; i++) {

         char ch = jumin.charAt(i);
         if (ch != '-') {
            int num = Integer.parseInt(String.valueOf(ch));
            sum = sum + num * source;
            source++;
            if (source > 9) {
               source = 2;
            }

         }

      }
      System.out.println(sum);
      
      sum = sum%11;
      sum = 11-sum;
      
      if(sum>9) {
         sum=sum%10;
      }
      
      int check=Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));
   
      if(sum==check)
         System.out.println("ok");
      else
            System.out.println("fail");
      
      

   }
//*********************************************************************
   public void ex1() {
      System.out.println("주민번호 입력");

      String jumin = sc.next();
      System.out.println(jumin);
      jumin = "010911-3710815";

      int age = 0;
      int year = 0;

//      charAt이용해서 년도 뺴기
//      char ch1=jumin.charAt(0);
//      char ch2=jumin.charAt(1);
//      String y = ""+ch1+ch2;
//      System.out.println(y);

      // ----------------나이----------------------------------------
      int y = Integer.parseInt(jumin.substring(0, 2));

      int preYear = 2000;

      char ss = jumin.charAt(7);
      if (ss == '1' || ss == '2') {
         preYear = 1900;
      }
      year = preYear + y;

      age = 2022 - year + 1;
      System.out.println("나이 : " + age);
      // ----------------성별----------------------------------------

      String s = jumin.substring(7, 8);
      String sss = "여자";
      if (s.equals("1") || s.equals("3"))
         sss = "남자";
      System.out.println("성별 : " + sss);

      // -----------------계절----------------------------------------
      String result = "";
      int season = Integer.parseInt(jumin.substring(2, 4));
      if (season >= 3 && season <= 5)
         result = "봄";
      else if (season >= 6 && season <= 8)
         result = "여름";
      else if (season >= 9 && season <= 11)
         result = "가을";
      else
         result = "겨울";

      System.out.println("태어난 계절 : " + result);

   }

}