package basic;

public class StatementTest {
	public static void main(String[] args) {
		// 변수의 선언 - 자바는 무조건 데이터타입을 명시하고 변수를 선언해야 한다.
		/*
		 * 데이터타입 면수명 = 값
		 */
		int num1 = 100; //변수의 정의와 초기화를 한 번에 작업
		int num2;// 변수를 정의
		num2 = 200;
		System.out.println("num1="+num1);
		System.out.println("num2의 값=>"+num2);
		
		// 연산자(산술연산자) - +, -, /, *, %
		int result = num1 + num2;
		System.out.println("결과=> "+result);
		
		result = num2 - num1;
		System.out.println("결과=>"+result);
		
		result = num2 * num1;
		System.out.println("결과=>"+result);
		
		result = num2 / num1;
		System.out.println("결과=>"+result);
		
		result = num2 % num1;
		System.out.println("결과=>"+result);
		
	}
}
