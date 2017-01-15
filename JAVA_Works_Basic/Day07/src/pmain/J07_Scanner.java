package pmain;

import java.util.Scanner;

public class J07_Scanner {
	
	public static void main(String[] args) {
		
//		Scanner
//		- 어떠한 대상으로부터 문자 형태의 데이터를 읽어올 때 사용
//		- 위치 : java.util 패키지
		
		Scanner scan = new Scanner(System.in);
//		=> 시스템의 콘솔창을 대상으로 함
//		=> 콘솔창으로부터 입력받은 문자 데이터를 읽어오는 명령
		
//		1. nextLine() : 콘솔창에 입력된 내용을 엔터 이전까지 읽어옴
		System.out.println("문자열 입력");
		String s1 = scan.nextLine();
		System.out.println("s1 : " + s1);
		
//		2. nextInt() : 정수 읽어옴(빈공간 이전까지) 띄어 쓰기하면 뒤에는 짤림
		System.out.println("정수 입력");
		int s2 = scan.nextInt();
		System.out.println("s2 : " + s2);
		
//		3. nextDoble() : 실수 읽어옴(빈공간 이전까지)
		System.out.println("실수 입력");
		double s3 = scan.nextDouble();
		System.out.println("s3 : " + s3);
		
	}

}
