package oop.basic;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MyMethodTest {

	public static void main(String[] args, MyMethod obj) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 50);
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
		
		//4. 리턴값이 있고 매개변수가 두 개인 메소드이 호출
		int resdata = obj.add(25, 10);
		bw.write("메소드호출결과=>"+resdata);
		if(resdata>200) {
			bw.write("완료");
		} else {
			bw.write("다시작업");
		}
		bw.flush();
		
		if(obj.add(100, 200)>200) {
			bw.write("완료");
		} else {
			bw.write("다시작업");
		}
		bw.flush();
		
		
		
	}

}
