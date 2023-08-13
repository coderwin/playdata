package array;

import java.util.Random;

// 배열의 사용 - 배열을 만들고 초기값을 살펴보기
public class ArrayTest2 {
	
	public static void main(String[] args) {
		//1. 배열의 선언과 생성
		int[] myarr = new int[3];
		double[] myarr2 = new double[3];
		boolean[] myarr3 = new boolean[3];
		String[] myarr4 = new String[4];
		Random[] myarr5 = new Random[3];
		
		// 배열은 각 요소에 초기값이 자동으로 할당된다.
		System.out.println(myarr[0]); // 0
		System.out.println(myarr2[2]); // 0.0
		System.out.println(myarr3[0]); // false
		System.out.println(myarr4[1]); // null
		System.out.println(myarr5[0]); // null
		
		// 2. 배열의 초기화
		// => 배열의 각요소에 값을 할당
		myarr[0] = 100;
		myarr[1] = 200;
		myarr[2] = 300;
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
//		System.out.println(myarr[3]);
		
		// 배열의 액세스
		// => index가 제공되므로 for를 이용해서 배열을 액세스할 수 있다.
		for(int i = 0; i<5; i++) {
			System.out.println(myarr[i]);
		}
		
		
		
		
		
	}

}
