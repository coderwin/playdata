package oop.basic;

public class ArrayExam {
	

	int[] ia;
	int[] ib;
	
	/**
	 * 기능 : 홀수의 합 구하기
	 * @param intArr : int 배열
	 * @return oddTotal
	 */
	public int sumOdd(int[] intArr) {
		int oddTotal = 0;// 홀수의 합;
		
		for(int i = 0; i < intArr.length; i++) {
			if(intArr[i] % 2 != 0) {
				oddTotal += intArr[i];
			}
		}
		return oddTotal;
	}
	
	/**
	 * 기능 : 짝수의 합 구하기
	 * @param intArr : int 배열
	 * @return evenTotal
	 */
	public int sumEven(int[] intArr) {
		int evenTotal = 0;// 홀수의 합;
		
		for(int i = 0; i < intArr.length; i++) {
			if(intArr[i] % 2 == 0) {
				evenTotal += intArr[i];
			}
		}
		return evenTotal;
	}
	
	/**
	 * 기능 : 계산한 값을 출력할 수 있습니다.
	 */
	public void print(int oddTotal, int evenTotal) {
		int a = 10;
		System.out.println("( 배열 )\n"
				+ "홀수의 합 : "
				+ oddTotal
				+ "\n짝수의 합 : "
				+ evenTotal);
	}
	
	
	
	
	
	
	
	
	
	
	
}
