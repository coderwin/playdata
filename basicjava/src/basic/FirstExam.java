package basic;

public class FirstExam {
	
	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 임의로 정의하고
		int language = 20;// 국어 점수
		int english = 30;// 영어 점수
		int math = 25;// 수학 점수
		
		// 총점과 평균을 출력하기(메일로 제출하기)
		// [출력형식]
		// 총점:_____
		int total = language + english + math;
		System.out.println("총점:"+total);
		// 평균:_____
//		int avg = (language + english + math) / 3;
		int avg = total / 3;
		System.out.println("평균:"+avg);
	}
	

}
