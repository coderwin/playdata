package basic;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		// 국어, 수학, 영어 총점과 평균을 구하자
	 	Scanner sc = new Scanner(System.in);
		// [출력형식]
	 	double korean = sc.nextDouble();
		// 국어:__
	 	System.out.println("국어:"+korean);
		// 수학:__
	 	double math = sc.nextDouble();
	 	System.out.println("수학:"+math);
		// 영어:__
	 	double en = sc.nextDouble();
	 	System.out.println("영어:"+en);
//		총점:__
	 	double total = korean + math + en;
	 	System.out.println("총점:"+total);
//		평균:__
	 	double avg = total/3;
	 	System.out.println("평균:"+avg);

	}

}
