package oop.basic;

public class ArratExamTest {
	
	public static void main(String[] args) {
		// int 배열 생성하기
//		int[] intArrTest = new int[100 - 0 + 1];
		int[] intArrTest = new int[100 - 0 + 1];

		// 배열에 값을 대입하기
		for(int i = 0; i <= 100; i++) {
			intArrTest[i] = i; 
		}
		// 배열 계산기 생성하기
		ArrayExam arrayCal = new ArrayExam();
		// 홀수합 구하기
		int oddTotal = arrayCal.sumOdd(intArrTest);
		// 짝수합 구하기
		int evenTotal = arrayCal.sumEven(intArrTest);
		// 홀수합과 짝수합 출력하기
		arrayCal.print(oddTotal, evenTotal);
	}
}
