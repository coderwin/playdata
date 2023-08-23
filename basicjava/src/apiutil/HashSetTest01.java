package apiutil;

import java.util.HashSet;
import java.util.Vector;

public class HashSetTest01 {
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>(1);
		
		v.add(1);
		System.out.println(v.capacity());
		v.capacity();
		v.add(2);
		v.capacity();
		System.out.println(v.capacity());
		
		System.out.println(v);
		
		System.out.println("======================");
		
		//1. HashSet을 생성
		HashSet set = new HashSet();
		
		set.add("자바");
		set.add("서블릿");
		set.add("JSP");
		set.add("스프링");
		set.add("스프링");
		// 3. 저장된 요소의 개수
		System.out.println(set.size());
		System.out.println(set.contains("스프링"));
		
		for(Object data : set) {
			System.out.println(data);
		}
		
		
		HashSet set2 = new HashSet();
		
		Board board1 = new Board(0, null, null, null, 0, null);
		Board board2 = new Board(0, null, null, null, 0, null);
		Board board3 = new Board(0, null, null, null, 0, null);
		Board board4 = new Board(0, null, null, null, 0, null);
		Board board5 = new Board(0, null, null, null, 0, null);
		Board board6 = new Board(0, null, null, null, 0, null);
		Board board7 = new Board(0, null, null, null, 0, null);
		
		set2.add(board1);
		set2.add(board2);
		set2.add(board3);
		set2.add(board4);
		set2.add(board5);
		set2.add(board6);
		set2.add(board7);
		set2.add(board7);
		
		System.out.println(set2.size());
		
		for(Object board : set2) {
			System.out.println(board);
		}
		
		Board board1 = new Board(1, null, null, null, 1, null);
		Board board2 = new Board(1, null, null, null, 1, null);

		board1.equals(board2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
