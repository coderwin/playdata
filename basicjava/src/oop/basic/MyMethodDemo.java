package oop.basic;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class MyMethodDemo {

	/**
	 * 기능 : 구구단을 출력한다.
	 */
	public void printGuGu(int dan) {

		System.out.println("단:" + dan);
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
	}

	/**
	 * 기능 : 구구단 전체를 출력한다.
	 */
	public void printGuGu() {
		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.print("" + dan + "*" + i + "=" + dan * i + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 50);
		MyMethodDemo mth = new MyMethodDemo();
		
		
		System.out.println(args);
		System.out.println(args[0]);
		bw.write(args[1] + "\n");
		bw.write(args[2]);

		bw.flush();
//		printGuGu();
//		mth.printGuGu();
	}

}
