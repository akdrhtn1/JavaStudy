package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEcho {
	public static void main(String[] args) {
		
		//서버 :클라이언트에서 보낸 메시지를 다시 되돌려줌
		ServerSocket server = null;
		
		//데이터를 읽기 위한 객체를 저장할 변수 선언
		InputStreamReader isr = null;
		BufferedReader br = null;
		//데이터를 쓰기 위한 객체
		OutputStream os = null;
		PrintWriter prw = null;
		
		try {
			System.out.println(">> 서버 시작");
			server = new ServerSocket(10000);
			
			System.out.println(">> 대기중 ...");
			Socket socket = server.accept();
			
			isr = new InputStreamReader(socket.getInputStream());
			br = new BufferedReader(isr);
			
			String msg = br.readLine();
			System.out.println("받은 메시지 " + msg);
			
			//-----------------------
			//받은 메시지 클라이언트 쪽으로 보내기~!
			os = socket.getOutputStream();
			prw = new PrintWriter(os);
			
			prw.println("[서버에서 보냄]" + msg);
			
		//	socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(prw != null) prw.close();
			if(br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
		
		
		
		System.out.println(">> 서버 종료");
	}
}
