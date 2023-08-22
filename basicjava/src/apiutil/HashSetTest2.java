package apiutil;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;


public class HashSetTest2 {

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

		// 1. HashSet을 생성
		HashSet set = new HashSet();

		set.add("자바");
		set.add("서블릿");
		set.add("JSP");
		set.add("스프링");
		set.add("스프링");
		// 3. 저장된 요소의 개수
		System.out.println(set.size());
		System.out.println(set.contains("스프링"));

		for (Object data : set) {
			System.out.println(data);
		}
		
		
		Iterator<?> setIterator = set.iterator();
		
		while(setIterator.hasNext()) {
//			setIterator.next();
			Object data = setIterator.next();
			System.out.println(data);
		}
		
		System.out.println(set.size());
		set.remove("스프링");
		System.out.println(set.size());
		
		
		
		
		
		
		
	}
}
