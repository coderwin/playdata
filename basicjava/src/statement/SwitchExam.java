package statement;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		
		int j = 0;
		int k = 0;
		int h = 0;
		for(int i = 0; i < 10; i++) {
			
			System.out.println(i);
//			System.out.println(j);
			System.out.println(h);
			h = h++; // ++는 할당이 어떻게 되는 건가?
			j = k++;
		}
		
		
		/*
		 * [출력형식]
		 * 점수:_, _학점
		 */
		// swithch문을 활용해서 A~F학점평가하기
		//1)Scanner클래스를 이용해서 입력받도록
		// Scanner 메모리 생성
		Scanner sc = new Scanner(System.in);
		// 선택형 만들기
		System.out.print("점수 입력: ");
		String score = sc.next();
		String grade = "";// 학점
		
		// 100점은 F가 나온다.
		if(Integer.valueOf(score) >= 0 && Integer.valueOf(score) <= 100) {	
			switch(score.charAt(0)) {
			case '9':
				grade = "A";
				break;
			case '8':
				grade = "B";
				break;
			case '7':
				grade = "C";
				break;
			case '6':
				grade = "D";
				break;
			case '1':
				if(score.length() > 2 && score.charAt(1) == '0') {
					grade = "A";
				} else {
					grade = "F";
				}
				break;
			default:
				grade = "F";
				break;
			}	
			System.out.println("점수: "
					+ score
					+ ", 학점: "
					+ grade);
		} else {
			System.out.println("잘못입력");
		}
		
		int score2 = sc.nextInt();
		
		if(score2 >= 0 & score2 <= 100) {
			
			switch(score2 / 10) {
				case 10:
				case 9:
					grade = "A";
					break;
				case 8:
					grade = "B";
					break;
				case 7:
					grade = "C";
					break;
				case 6:
					grade = "D";
					break;
				default:
					grade = "F";
					break;
			}
			
			System.out.println("점수: "
					+ score2
					+ ", 학점: "
					+ grade);
		} else {
			System.out.println("잘못입력");
		}
		
	}

}
