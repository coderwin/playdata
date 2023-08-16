package oop.basic;

import java.util.Scanner;

public class Calc {
	
	int num1;// 입력 숫자
	int num2;// 입력 숫자 
	String operator;// 사칙연사
	Scanner sc = new Scanner(System.in);// 숫자 입력받기
	
	/**
	 * 기능 : 사칙연산 선택할 수 있습니다.
	 */
	public void chooseOperator() {
		System.out.println("******미니계산기******");
		System.out.println("1.더하기");
		System.out.println("2.곱하기");
		System.out.println("3.빼기");
		System.out.println("4.나누기");
		System.out.print("연산자를 선택하세요.");
		
		operator = sc.next();
	}
	
	/**
	 * 기능 : 숫자를 입력할 수 있습니다.
	 */
	public void addNumbers(int num1_, int num2_) {
		num1 = num1_;
		num2 = num2_;
	}
	
	/**
	 * 기능 : 계산 결과를 입력할 수 있습니다.
	 */
	public void printResult(String operator) {
		if(operator.equals("1") || operator.equals("2") || operator.equals("3") || operator.equals("4")) {
			int result = 0;// 계산 결과
			if(operator.equals("1")) {
				result = num1 + num2;
				System.out.println("계산결과=>"+result);
			} else if(operator.equals("2")) {
				result = num1 * num2;
				System.out.println("계산결과=>"+result);
			} else if(operator.equals("3")) {
				result = num1 - num2;
				System.out.println("계산결과=>"+result);
			} else {
				if(num2 != 0) {
					result = num1 / num2;
					System.out.println("계산결과=>"+result);
				} else {
					System.out.println("계산이 불가합니다.");
				}
			}			
		} else {
			System.out.println("연산자를 잘못 선택하셨습니다.");
		}
	}
	
	
	
}
