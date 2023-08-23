package apiutil;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;

// 1. 100, 98, 88, 77, 100
public class HashSetExam {
	
	
	
	
	public static void main(String[] args) {
		
		
		HashSet<String> a = new HashSet<>();
		a.add("String");
		a.add("v");
		
		
		HashSet<Integer> b = new HashSet<>();
		b.add(1);
		b.add(2);
		
		HashSetExam.<String>print(a);
		HashSetExam.<Integer>print(b);
		HashSetExam.print(a);
		HashSetExam.print(b);
		
		HashSetExam he = new HashSetExam();
		he.<String>printV2(a);
		he.<Integer>printV2(b);
		he.printV2(a);
		he.printV2(b);
		
		System.out.println("=======================");
		Board b2 = new Board(1, null, null, null, 3, Calendar.getInstance().getTime());
		he.printBox("a", b2);
		
		
		
	}
	
	public <T, U> void printBox(T x, U y) {
		System.out.println(x.getClass().getSimpleName());
		System.out.println(y.getClass().getSimpleName());
		System.out.println(x.getClass());
		System.out.println(y.getClass());
	}
	
	//2. HashSet -> 배열로 변환해서 리턴하기
	public static int[] changeArr(HashSet<?> set) {
		// 배열 생성하기
//		Integer[] newArr = new Integer[set.size()];
		int[] newArr = new int[set.size()];
		// Set -> 배열로 바꾸기
		int i = 0;
		for(Object e : set) {
			newArr[i] = (Integer)e;
			i++;
		}
		
		return newArr;
	}
	//3. HashSet에 저장된 데이터를 출력하기
	/*
	 * 메소드명 : print
	 * -> Iterator를 이용해서 출력하기
	 * -> 메소드 선언부는 임의로 정해서 작업하기
	 */
	public static <E> void print(HashSet<E> set) {
		
		Iterator<E> it = set.iterator();
		while(it.hasNext()) {
			E e = it.next();
			System.out.println(e);
			
		}

	}
	
	public static <E, T> void print() {
	
	}
	
	public <E> void printV2(HashSet<E> set) {
		
		Iterator<E> it = set.iterator();
		while(it.hasNext()) {
			E e = it.next();
			System.out.println(e);
			
		}

	}
	
//	public static T abc(int a) {
//		
//	}
//	
//	public static abc2(T a) {
//		
//	}
//	
//	public void abc3(T as) {
//		
//	}
//	
//	public T abc5() {
//		
//	}
//	
//	public <T> T abc31() {
////		T a = new T();
//		return a;
//	}
	
	public <T> void abc4(T as) {
		
	}
	
	public static <ET> void ae() {
		
	}
	
	public <ok> String de() {
		return "asd";
	}

}
