package com.mystudy.socket01_byte;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClientByte {

	public static void main(String[] args) {
		//	클라이언트 : Socket 이용해서 서버에 접속(서버Ip주소, 서버의포트번호)
		Socket socket = null;
		
		try {
			System.out.println("--- 클라이언트 ---");
			//	localhost : 현재컴퓨터, 127로 시작하는 IP주소
			socket = new Socket("127.0.0.1", 10000);
			System.out.println(">> 서버 연결 성공~~~");
			
			//생성된 socket 으로 부터 Input, Output 스트림 생성
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			//OutputStream 이용해서 서버쪽으로 쓰기
//			System.out.println(">> 서버쪽으로 문자 'A'보내기");
//			out.write('A');

			byte[] buf = "안녕하세요 ~ 반값습니다".getBytes();
			out.write(buf);
			
			out.close();
			in.close();
			System.out.println("Client 종료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
