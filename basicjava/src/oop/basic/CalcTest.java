package oop.basic;

public class CalcTest {
	public static void main(String[] args) {
		// 계산기 생성한다.
		Calc calc = new Calc();
		// 사칙연산 선택한다.
		calc.chooseOperator();
		// 숫자 입력한다.
		calc.addNumbers(50, 20);
		// 계산 출력한다.
		calc.printResult(calc.operator);
	}
}
