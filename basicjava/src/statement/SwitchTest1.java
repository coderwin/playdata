package statement;

import java.util.Scanner;

// switch연습
public class SwitchTest1 {
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("단:");
		int dan = key.nextInt();
		switch(dan) {
		case 2:
			System.out.println("2단");
			break;
		case 3:
			System.out.println("3단");
			break;
		default:
			System.out.println("기타");
			break;
		}
	}
}
