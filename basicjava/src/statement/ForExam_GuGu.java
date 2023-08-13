package statement;

import java.util.Scanner;

public class ForExam_GuGu {
	
	public static void main(String[] args) {
		
		/*
		 * 단을 입력 받고 입력 받은 구구단을 출력
		 * 단:_
		 * 7*1=7
		 * ...
		 * 7*9=63
		 */
		// Scanner 생성
		Scanner sc = new Scanner(System.in);
		// 구구단을 for문으로 완성한다.
		// 단 출력
		int dan = sc.nextInt();
		System.out.println("단:"+dan);
		for(int i = 1; i < 10; i++) {
			// 계산값 출력
			System.out.println(dan
					+ "*"
					+ i
					+ "="
					+ dan*i);
		}
		
	}
	

}
