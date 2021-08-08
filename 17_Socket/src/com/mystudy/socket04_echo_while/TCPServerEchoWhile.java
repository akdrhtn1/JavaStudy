package com.mystudy.socket04_echo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEchoWhile {

	public static void main(String[] args) {
		// 클라이언트에서 보내는 메시지를 받고 다시 보내기 반복처리
		// 수신(input)메시지 화면출력 후 클라이언트로 전송(output)
		// 클라이언트에서 종료요청시 까지
		ServerSocket server = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStream os = null;
		PrintWriter prw = null;
		Socket socket = null;

		try {
			System.out.println(">> 서버 시작");
			server = new ServerSocket(10000);
			System.out.println(">> 대기중 ...");
			socket = server.accept();
			// Client의 입력을 받기 위해서 선언
			isr = new InputStreamReader(socket.getInputStream());
			br = new BufferedReader(isr);
			// Client에게서 받은 값을 다시 전달
			os = socket.getOutputStream();
			prw = new PrintWriter(os);

			while (true) {

				String msg = br.readLine();
				System.out.println("[서버] 받은메시지 : " + msg);
				
				if ("exit".equalsIgnoreCase(msg)) {
					System.out.println("서버를 중단합니다.");
					break;
				}

				prw.println("[서버에서 보냄]" + msg);
				prw.flush();
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (prw != null)
				prw.close();
		}

	}

}
