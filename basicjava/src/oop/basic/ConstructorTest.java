package oop.basic;
// 생성자 테스트
public class ConstructorTest {
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		//1. 컴파일러가 기본생성자를 제공한다.(생성자를 정의하지 않는 경우)
		Constructor obj = new Constructor("민수", "12345", "pass", "동작구", "010-1234-1234", "오케이", "nickname", 10);
		
		long endTime = System.currentTimeMillis();
		
		long takenTime = endTime - startTime;
		System.out.println("걸린 시간 : " + takenTime);
		
		
		System.out.println("******걸린시간****");
		startTime = System.currentTimeMillis();
		
		Constructor obj2 = new Constructor("민수", "12345", "pass", "동작구", "010-1234-1234", "오케이");
		
		endTime = System.currentTimeMillis();
		System.out.println("걸린 시간 : " + takenTime);
		
	}

}
