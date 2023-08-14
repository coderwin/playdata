package oop.basic;

import java.io.IOException;

public class MyMethodTest {

	public static void main(String[] args) throws IOException {
		MyMethod obj = new MyMethod();
		
		System.out.println("*****프로그램 시작********");
		
		obj.display();
		System.out.println("********step1**********");
		obj.display();
		System.out.println("********step2**********");
		
		
		obj.display("ab");
		obj.display("u");
		System.out.println("*******different overoding method*********");
		obj.display(3);
		
		System.out.println("*******different overoding method two params *****************************");
		obj.display("a", 3);
		obj.display("ok", 20);
		
	}

}
