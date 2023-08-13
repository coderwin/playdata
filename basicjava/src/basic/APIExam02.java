package basic;

import java.util.Random;

public class APIExam02 {
	
	public static void main(String[] args) {
		// 1. java.util패키지의 Random클래스를 이용해서 작업하기
		// - 참조변수명 : rand
		Random rand = new Random();
		// - nextInt메소드를 호출해서 랜덤수를 다음과 같이 출력하기
		// [출력형식]
		// 랜덤수:_____
		int rd = rand.nextInt();
		System.out.println("랜덤수:"+rd);
		
		//2. 1번을 모두 완료하면 메일로 제출하고 1부터 100까지의 랜덤수를 출력할 수 있도록 
		//   Random클래스에서 메소드를 찾아서 호출해보기
		Random rand2 = new Random();
		int rd2 = rand2.nextInt(101);
		// [c출력형식]
		// 랜덤수:_____
		// 2번은 제출하지 않아도 됩니다.
		System.out.println("랜덤수:"+rd2);	
		
		int d1 = -10;
		
		
	}

}
