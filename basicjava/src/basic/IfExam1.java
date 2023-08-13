package basic;

import java.util.Random;
import java.util.Scanner;

public class IfExam1 {
	public static void main(String[] args) {
		// 1. Scanner로 값을 입력받아 처리하기
		Scanner sc = new Scanner(System.in);
		// 숫자를 입력 받아 5의 배수인지 체크
		int num = sc.nextInt();
		if(num % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}
		String result = num % 5 == 0 ? "5의 배수입니다." : "5의 배수가 아닙니다.";
		System.out.println("결과:"+result);
		
		
		/*
		 * 2. 1부터 10까지 Random수를 발생시켜서 양수와 음수를 판단
		 * 	  양수인 경우 짝수인지 홀수인지 판단
		 * [출력형식]
		 * 10 : 양수이면서 짝수
		 * 7 : 양수이면서 홀수
		 * -10 : 음수
		 */
		Random rd = new Random();
		int rdNumber = rd.nextInt(10);
		// 양수와 음수 판단하기
//		if(rdNumber > 0) {
//			// 양수인 경우 짝수인지 홀수인지 판단
//			if(rdNumber % 2 == 0) {
//				System.out.println(rdNumber + ": 양수이면서 짝수");
//			} else {
//				System.out.println(rdNumber + ": 양수이면서 홀수");
//			}
//		} else {
//			System.out.println(rdNumber + ": 음수");
//		}
		String result2 = rdNumber > 0 ? 
				rdNumber % 2 == 0 ? rdNumber + ": 양수이면서 짝수" : rdNumber + ": 양수이면서 홀수"
						: rdNumber + ": 음수";
		System.out.println(result2);
		
	}
}
