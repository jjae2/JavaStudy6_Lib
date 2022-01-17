package com.prac.s5.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CilentMain {

	public static void main(String[] args) {
		System.out.println("클라이언트입니다");
		Socket socket=null;
		Scanner sc = new Scanner (System.in);
		try {
		 socket = new Socket("192.168.0.17", 8282);
			System.out.println("서버 접속 성공!");
			System.out.println("서버로 보낼 메세지 입력");
			String message = sc.nextLine();
			System.out.println(message);
			
			//1. output Stream을 구해오기                hi -> h,i 0,1로..
			OutputStream os = socket.getOutputStream();//byte(bit처리)
			OutputStreamWriter ow =new OutputStreamWriter(os);//char(문자처리)
			BufferedWriter bw = new BufferedWriter(ow);//문자열처리
			//서버한테 전송 준비 끝
			bw.write(message+"\r\n");//전송
			bw.flush();//강제로 버퍼 비우기
			//받아오기
			InputStream is = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			message = br.readLine();
			System.out.println("server : "+message);
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
