package com.mystudy.net_multi;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientMulti {

	public static void main(String[] args) {
		//서버쪽으로 메시지 전송만~~~
		System.out.println("--- 클라이언트 시작 ---");
		Socket socket = null;
		InputStreamReader isr= null;
		OutputStream os = null;
		PrintWriter prw = null;
		
		Scanner scan = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 10000);
			
			os = socket.getOutputStream();
			prw = new PrintWriter(os);
			

			while(true) {
				//메시지 쓰기
				System.out.print("메시지 입력>");
				String msg = scan.nextLine();
				//메시지 서버 전송
				prw.println(msg);
				prw.flush(); //버퍼 데이터 출력
				if("exit".equalsIgnoreCase(msg)) {
					System.out.println("종료합니다.");
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(prw != null)prw.close();
			if(socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
