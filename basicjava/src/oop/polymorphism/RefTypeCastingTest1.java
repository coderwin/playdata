package oop.polymorphism;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class RefTypeCastingTest1 {

	public static void main(String[] args) {
		AbstractCollection c1 = new Vector<>();
		AbstractList c2 = new Vector();
		AbstractList c3 = new Stack<>();
//		ArrayList c4 = new Stack();
		Vector v1 = new Stack();// 자식에서 부모로 가려면 컴파일이 자동으로 해준다.
		Stack s1 = (Stack) v1;// 부모에서 자식으로 가려면 cast type 해야한다.
		
		System.out.println("1. 녀ㅔㄷㄱxkdlqdml ckawhqustnfh 녀ㅔㄷㄱ rorcpfmf tkdyd");
		Super obj1 = new Sub();
		obj1.display();
		System.out.println(obj1.data);
		System.out.println("*************************");
		System.out.println("2. Sub타입의 참조변수로 Sub객체를 사용");
		Sub obj2 = new Sub();
		
		obj2.display();
		obj1 = obj2;
		obj1.display();// sub의 오버라이딩 메서드 사용해요
		
//		obj1.test();// Super에는 없어서 못써요
		((Sub)obj1).test();
		
//		obj2 = obj1;
		Sub obj4 = (Sub)new Super();// 컴파일은 속일 수 있지만 작동 시 에러 발생
		obj4.test();
		obj4.display();
		// 디버깅에서는 sub2인데 왜 cast 해야되지?
		obj2 = (Sub)obj1;
		
		
		
		
		
	}	
}
