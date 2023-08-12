package basic;

public class TimeTest {

	
	public static void main(String[] args) {
		// int형 변수를 선언하고 8880을 할당하기
//		int totalSec = 8800;// 초
		int time = 8800;//주어진 시간
		// 8800초 데이터라 가정하고 시 분 초로 표현하기
//		int hour = 8800 / 3600;// 시간
		int hour = time / 3600;// 시간
//		int min = 8800 / 60 - hour * 60;// 분
		int min = time / 60 - hour * 60;// 분
//		int sec = 8800 - min * 60 - hour * 3600;// 초
		int sec = time - min * 60 - hour * 3600;// 초

		// 문제를 풀기 위해서 필요한 변수는 정의하기
		System.out.println(hour
				+ "시간"
				+ min
				+ "분"
				+ sec
				+ "초");
		
		// 시간
		int h = time / 3600;
		// 나머지 초
		int data = time % 3600;
		// 분
		int m = data / 60;
		// 초
		int s = data % 60;
		
		System.out.println(h
				+ "시간"
				+ m
				+ "분"
				+ s
				+ "초");
		
		int $hello = 10;
		System.out.println($hello);
		

	}
	
	

}
