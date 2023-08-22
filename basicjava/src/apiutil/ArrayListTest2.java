package apiutil;

import java.util.List;
import java.util.ArrayList;

import weeklytest45.A;

public class ArrayListTest2 {
	
	
	
	public static void main(String[] args) {
		//1. Vector 셍성
		ArrayList<Integer> v = new ArrayList<>();// int[] myrr = new int[50];
		System.out.println(v);
		
		v.add(10);
//		v.add("java");
		System.out.println(v);
		
		List<A> a = new ArrayList();
		a.add(null);
		
		// ArrayList에 저장된 요소 개수
		System.out.println("현재 백터에 저장된 요소긩 개수 : " + v.size());
//		System.out.println("현재 백터의 용량 => " + v.capacity());
		
		for(int i =1; i <= 10; i++) {
			v.add(i);
		}
		System.out.println("현재 백터에 저장된 요소긩 개수 : " + v.size());
//		System.out.println("현재 백터의 용량 => " + v.capacity());
		
		for(int i =11; i <= 20; i++) {
			v.add(i);
		}
		System.out.println("현재 백터에 저장된 요소긩 개수 : " + v.size());
//		System.out.println("현재 백터의 용량 => " + v.capacity());
		
		for(int i =1; i <= 20; i++) {
			v.add(i);
		}
		System.out.println("현재 백터에 저장된 요소긩 개수 : " + v.size());
//		System.out.println("현재 백터의 용량 => " + v.capacity());
		
		for(int i =1; i <= 40; i++) {
			v.add(i);
		}
		
		/**
		 * 왜 용량이 안 늘어났지?
		 * capacity가 뭘까?
		 */
		System.out.println("현재 백터에 저장된 요소긩 개수 : " + v.size());
//		System.out.println("현재 백터의 용량 => " + v.capacity());
		
		for(int i =1; i <= 40; i++) {
			v.add(i);
		}
		System.out.println("현재 백터에 저장된 요소긩 개수 : " + v.size());
//		System.out.println("현재 백터의 용량 => " + v.capacity());
		
		for(int i =1; i <= 40; i++) {
			v.add(i);
		}
		System.out.println("현재 백터에 저장된 요소긩 개수 : " + v.size());
//		System.out.println("현재 백터의 용량 => " + v.capacity());
		
		
		// 4. 저장 요소 꺼내기
		System.out.println(v);
		System.out.println("0번 요소에 저장된 값=>" + v.get(0));
		System.out.println("1번 요소에 저장된 값=>" + v.get(1));
		
		long start = System.nanoTime();
		// 저장된 모든 요소 꺼내기
		/**
		 * 성능 검사
		 * - 메모리에 계속 남아있는 것이 좋은건가?
		 * - 메모리에 사라졌다가 다시 나타나는 것이 성능에 좋은건가?
		 */
		// 성능 검사 1
//		int size = v.size();// 메서드를 계속 호출하면 스택에 쌓인다.
		for(int i = 0; i < v.size();i++) {
			int data = v.get(i);
			System.out.println(i + "번째 요소 => "
					+ data);
		}
		long end = System.nanoTime();
		System.out.println("걸린 시간 : " + (end - start));
		
		// 성능 검사 2
		start = System.nanoTime();
		int size = v.size();// 메서드를 계속 호출하면 스택에 쌓인다.
		for(int i = 0; i < size;i++) {
			int data = v.get(i);
			System.out.println(i + "번째 요소 => "
					+ data);
		}
		end = System.nanoTime();
		System.out.println("걸린 시간 : " + (end - start));
		
		// 성능 검사 3
		start = System.nanoTime();

		System.out.println("=======================");
		for(int data : v) {
			System.out.println("번째 요소 => " + data);
			
		}
		end = System.nanoTime();
		System.out.println("걸린 시간 : " + (end - start));
		
		ArrayList<String> v2 = new ArrayList<>();
		boolean result1 = v2.add(null);
		boolean result2 = v2.add("ok");
		System.out.println("null add : " + result1);// true
		System.out.println("String add : " + result2);// true
		
		
		//4. 요소 꺼내기
		System.out.println("index 10번째 : " + v.get(10));
		
		//5. v.set();
		Integer result = v.set(0, 12);
		System.out.println("result : " + result);
		System.out.println("index 0번째 : " + v.get(0));
		Integer result12 = v.set(0, 15);
		System.out.println("result : " + result12);
		System.out.println("index 0번째 : " + v.get(0));
		
		
		
		
		
		
		
		
	}
}
