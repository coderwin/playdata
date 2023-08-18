package oop.polymorphism;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class RefTypeCastingTest2 {

	public static void main(String[] args) {
		Sub obj1 = new Sub();
		Super obj2 = new Sub();
		
		obj2 = obj1;
		
		if(obj2 instanceof Super) {
			System.out.println("Super의 타입이다.");
		} else {
			System.out.println("Super 타입이 아니다.");
		}
		
		if(obj2 instanceof Sub) {
			System.out.println("Sub의 타입이다.");
		} else {
			System.out.println("Sub의 타입이 아니다.");
		}
		
		Super b1 = new Super();
		Sub b2 = (Sub) b1;// 컴파일 중에는 에러 안나지만 실행시 에러 발생 : Super타입이 Sub타입이 될 수 없다.
		b2.display();
		b2.test();
		
		
		
		
	}	
}
