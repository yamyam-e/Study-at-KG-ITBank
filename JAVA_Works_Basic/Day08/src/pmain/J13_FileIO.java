package pmain;

import java.io.*;

public class J13_FileIO {

//	위치 : java.io 패키지
	
	public static void main(String[] args) {
		
//		1. try - catch 필요
		try {
			
//			2. 방향 설정
			OutputStream os = null;
			
//			3. 대상 설정
//			=> 파일을 대상을 설정하는 경우 
//				관련 명령을 지원해주는 FileOutputStream 사용
			os = new FileOutputStream("D:\\이성권\\MyWork\\Day08\\src\\files\\abc.txt");
			
//			4. 문자 쓰기 : PrintWriter
			PrintWriter out = new PrintWriter(os);
			out.println("안녕하세요");
			out.println("abcde");
			out.println(100);
			
//			5. close() : 스트림 통로 제거
			out.close();
			
		} catch(Exception e) {
			System.out.println("예외발생");
		}
		
	}

}
