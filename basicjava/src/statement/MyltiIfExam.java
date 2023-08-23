package statement;

import java.util.Scanner;

public class MyltiIfExam {

	public static void main(String[] args) {
		// 다중 if, if문을 중첩
		
		/*
		 * [출력형식]
		 * 점수:_, _학점
		 */

		//1)Scanner클래스를 이용해서 입력받도록
		// Scanner 메모리 생성
		Scanner sc = new Scanner(System.in);
		// 선택형 만들기
		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		String grade = "";// 학점
		if(score >= 0 & score < 60) {
			grade = "F";
		} else if(score >= 60 & score < 70) {
			grade = "D";
		} else if(score >= 70 & score < 80) {
			grade = "C";
		} else if(score >= 80 & score < 90) {
			grade = "B";
		} else if(score >= 90 & score <= 100) {
			grade = "A";
		}
		//2)0부터 100까지 입력되면 학점평가, 외의 숫자는 잘못 입력을 출력되도록 구현
		if(score >=0 & score <= 100) {
			System.out.println("점수: "
					+ score
					+ ", 학점: "
					+ grade);
		} else {
			System.out.println("잘못입력");
		}
		
		
		// 선생님 방법
		// 코드도 짧고 가독성이 크구나
		// 잘못입력, 학점을 먼저 구분한다.
		System.out.print("점수: "+score);
		if(score >= 0 & score <= 100) {
			if(score >= 90) {
				System.out.println("B학점");
			} else if(score >= 80) {
				System.out.println("C학점");
			} else if(score >= 70) {
				System.out.println("D학점");
			} else {
				System.out.println("F학점");
			}
		} else {
			System.out.println("잘못입력");
		}
		// 점수를 학점으로 보낸다.
		
		
		
		
		
	}

}
