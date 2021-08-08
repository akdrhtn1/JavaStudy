package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClientEcho {

	public static void main(String[] args) {
		//	클라이언트 : 메시지를 서버쪽으로 보내고, 서버로부터 메시지 돌려받기
		System.out.println("---- 클라이언트 시작----");
		Socket socket = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		PrintWriter prw = null;
		
		try {
			System.out.println("---- 클라이언트 ----");
			socket = new Socket("localhost",10000);
			System.out.println(">>> 서버에 접속 완료");
			
			os=socket.getOutputStream();
			
			//	서버쪽으로 쓰기(전송-output/write)
			System.out.println(">>메시지 쓰기 ");
			prw = new PrintWriter(os);
			String msg = "안녕하세요 반갑습니다";
			prw.println(msg);
			prw.flush();
			//flush를 써서 보내야 데이터 전송이 된다.
			
			System.out.println(">>보낸 메시지:  " + msg);
			//	서버에서 보내온 메시지 받기(수신)
			isr = new InputStreamReader(socket.getInputStream());
			br = new BufferedReader(isr);
			
			String receiveMsg = br.readLine();
			System.out.println(">> 받은 메시지 : " + receiveMsg);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			}
			if(prw != null) prw.close();
		}
		System.out.println("---- 클라이언트 종료----");
	}

}
