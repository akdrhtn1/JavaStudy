package com.mystudy.socket04_echo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientEchoWhile {

	public static void main(String[] args) {
		// 메시지를 작성해서 서버로 전송하고, 서버로 부터 전달받은 메시지 수신 반복
		// 메시지 작성 : Scanner 객체 사용해서 콘솔에서 입력

		Socket socket = null;

		//byte 단위 입출력 처리 변수 선언
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStream os = null;
		PrintWriter prw = null;
		Scanner scan = new Scanner(System.in);

		try {

			System.out.println("---- 클라이언트 ----");
			socket = new Socket("localhost", 10000);

			os = socket.getOutputStream();
			prw = new PrintWriter(os);
			//바이트 처리 계열을 문자 처리계열로 변환
			isr = new InputStreamReader(socket.getInputStream());
			//버퍼 사용으로 라인단위 입출력
			br = new BufferedReader(isr);
			
			while (true) {


				System.out.print(">>메시지 쓰기(종료:exit): ");
				String msg = scan.nextLine();
				// 버퍼 데이터 출력
				prw.println(msg);
				prw.flush();
				
				if ("exit".equalsIgnoreCase(msg)) {
					System.out.println("시스템이 종료되었습니다.");
					break;
				}
				
				String receiveMsg = br.readLine();
				System.out.println(">> 받은 메시지 : " + receiveMsg);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			scan.close();
			
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (prw != null)
				prw.close();
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
