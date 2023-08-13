package basic;

import java.util.Random;

// 참조형변수 사용방법
public class APITest2 {

	public static void main(String[] args) {
		int i = 10;
		System.out.println("기본형변수=>"+i);
		
		Random rand = new Random();
		System.out.println("참조형변수=]>"+rand);
		
		Random rand2 = new Random();
		System.out.println(rand2);
		Random rand3 = rand2;
		System.out.println(rand3);
		
		System.out.println(rand2 == rand3);
		System.out.println(rand == rand3);
		System.out.println(rand.equals(rand3));
		System.out.println(rand2.equals(rand3));
		
		
		String str = new String("java programming");
		String str2 = new String("java programming");
		System.out.println("참조형변수=>"+str.toString());
		System.out.println("참조형변수=>"+str2.toString());
		String str3 = str;
		System.out.println("참조형변수=>"+str3.toString());
		
		/*
		 * Stirng클래스에 정의되엉 있는 length메소드를 사용
		 * --------------
		 * 메소드 호출
		 * 4. 메소드 실행 결과(리턴값)가 있으면 결과와 동일한 타입의 변수를 선언해서 메소드의 실행결과를 저장해서 활용한다.
		 */
		String str4 = new String("java progrAMing");
		int result = str4.length();
		System.out.println("결과=>"+result);

		String result2 = str4.toUpperCase();
		System.out.println("결과=>"+result2);
	}

}
