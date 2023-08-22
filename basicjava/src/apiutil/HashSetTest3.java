package apiutil;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class HashSetTest3 {

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

		set.add("java");
		set.add("servlet");
		set.add("JSP");
		set.add("spring");
		set.add("spring");
		// 3. 저장된 요소의 개수
		System.out.println(set.size());
		System.out.println(set.contains("스프링"));

		
		// 합집합
		HashSet<String> set2 = new HashSet<>();
		set2.add("hadoop");
		set2.add("spark");
		set2.add("flume");
		set2.add("JSP");
		print(set2);
		
		HashSet<String> set3 = new HashSet<>();
		set3.add("java");
		set3.add("servlet");
		set3.add("python");
		print(set3);
		
		// 교집합
//		set3.retainAll(set);
//		print(set3);
		
		set2.retainAll(set);
		print(set2);
		print(set);
		
		set3.addAll(set2);
		print(set3);
		print(set2);
		
		set3.addAll(set);
		print(set3);

	}
	
	public static void print(HashSet<?> set) {
		
		Iterator<?> it = set.iterator();
		while(it.hasNext()) {
			Object data = it.next();
			System.out.println(data);
		}
		System.out.println("---------------------------------");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
