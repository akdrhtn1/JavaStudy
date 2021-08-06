package com.mystudy.ex02_url;

import java.net.MalformedURLException;
import java.net.URL;

public class URL_Exam {

	public static void main(String[] args) throws MalformedURLException {
		//	프로토콜://호스트(서버):포트/경로(패스)?질의(query)
		//	https://news.naver.com/main/list.naver?mode=LPOD&mid=sec&oid=082&listType=paper&date=20210804
		//	URL(String protocol,String host,int port,String file)
		//
		URL url = new URL("http", "com.mystudy.java", 8080, "aaa/bbb/index.jsp?id=hong&password=1234#content");
		

		String protocol = url.getProtocol();	
		String host = url.getHost();
		int port = url.getPort();
		int defaultPort = url.getDefaultPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		
		System.out.println("프로토콜(protocol) : " + protocol);
		System.out.println("호스트(host) : " + host);
		System.out.println("포트번호(port) : "  + port);
		System.out.println("포트번호(defaultPort) :" + defaultPort);
		System.out.println("경로-패스(path) : " + path);
		System.out.println("쿼리-질문(query) : " + query); //데이터를 보낼테니 달라
		System.out.println("참조(ref) :" + ref);
		
		
		url = new URL("https://news.naver.com/main/list.naver?mode=LPOD&mid=sec&oid=082&listType=paper&date=20210804");
		protocol = url.getProtocol();	
		host = url.getHost();
		port = url.getPort();
		defaultPort = url.getDefaultPort();
		path = url.getPath();
		query = url.getQuery();
		ref = url.getRef();
		
		System.out.println("프로토콜(protocol) : " + protocol);
		System.out.println("호스트(host) : " + host);
		System.out.println("포트번호(port) : "  + port);
		System.out.println("포트번호(defaultPort) :" + defaultPort);
		System.out.println("경로-패스(path) : " + path);
		System.out.println("쿼리-질문(query) : " + query); //데이터를 보낼테니 달라
		System.out.println("참조(ref) :" + ref);
		
		
		}

}
