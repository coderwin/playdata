package basic;

import java.util.Scanner;

// Scanner사용방법
//=> 키보드를 통해 직접 입력 받은 값을 타입에 따라 가각 읽어서 사용할 수 있도록 지원
//=> 표준입력으로 입력된 값을 읽어서 리턴하는 기능들을 제공
// --------
// 키보드로 입력 : System.in
// 표준출력(모니터로 출력 - console로 출력) : System.out
public class ScannerTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("문장을 입력하세요");
		String line = key.nextLine();//한 문장 전체를 읽는다.
		System.out.println(line);
		
		System.out.println("문자열을 입력하세요:");
		String val1 = key.next();
		// next()는 spacebar나 enter를 만나기 전까지 입력된 문자열을 읽어서 리턴
		System.out.println("입력한 값1:"+val1);
		
		int val2 = key.nextInt();
		System.out.println("입력한 값2:"+val2);
		
		double val3 = key.nextDouble();
		System.out.println("입력한 값3:"+val3);
	}

}
