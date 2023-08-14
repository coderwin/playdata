package oop.basic;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// 메소드를 유형별로 정의
public class MyMethod {
	
	//3. 리턴값이 없고 매개변수가 두 개인 메소드
	//=> 출력할 기호, 출력할 횟수를 매개변수로 전달 받아 사용
	//   할 수 있도록 메소드를 정의
	//=> MyMethodTest에서 호출해서 사용하기
	//=> 메소드명 : display
	public void display(String str, int num) throws IOException {
		for(int i = 0; i < num; i++) {
			bw.write(str);
		}
		bw.flush();
		System.out.println();
	}
	
	//2. 리턴값이 없고 매개변수가 한 개인 메소드
	// 오버로딩 : 메서드명이 같고 매개변수가 다르다
	public void display(String str) {
		for(int i = 0; i <= 10; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	public void display(int str) {
		for(int i = 0; i <= 10; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
//	BufferedWriter bw;
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 5);
	//1. 매개변수 없고 리턴값이 없는 메소드
	public void display() throws IOException {
		for(int i = 1; i <= 10; i++) {
			bw.write("*");
//			System.out.print("*");
		}
		bw.write("\n");
		bw.flush();
//		System.out.println();
	}
	
}
