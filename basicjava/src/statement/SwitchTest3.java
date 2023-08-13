package statement;

import java.util.Scanner;

// switch연습
public class SwitchTest3 {
	
	public static void main(String[] args) {
		
		int data=10;
		float data2=10.0f;
		double data3 = 10.5;
		long data4 = 10L;
		short data5 = 10;
		String data6 = new String("01");
		
		
		switch(data6) {
		case "01":
			System.out.println("문자열도 스위치문에 쓸 수 있다.");
			break;
		}
		
		switch(data/5) {
		case 2:
			System.out.println("값이 나왔다.");
			break;
		}
	}
}
