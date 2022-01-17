package com.prac.s5.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("서버 입니다");
		ServerSocket serverSocket = null;
		Socket socket = null;
		Scanner sc =new Scanner(System.in);
		try {
			System.out.println("클라이언트 접속 기다리는중");
			serverSocket = new ServerSocket(8282);// 클라이언트와 접속준비
			socket = serverSocket.accept();// 클라이언트와 연결
			System.out.println("접속한 클라이언트와 1대1 연결 완료");
			// 클라이언트에서 보낸것을 받는다.
			InputStream is = socket.getInputStream();//0,1처리
			InputStreamReader ir = new InputStreamReader(is);// char
			BufferedReader br = new BufferedReader(ir);// string

			String message = br.readLine();
			System.out.println("client : " + message);//메세지 받음
			//서버에서 클라이언트로 메세지 전송
			System.out.println("클라이언트로 전송할 메세지 입력");
			message = sc.nextLine();
			OutputStream os =socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(ow);
			bw.write(message+"\r\n");
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
