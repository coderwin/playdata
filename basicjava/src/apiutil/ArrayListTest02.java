package apiutil;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest02 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("oracle");
		list.add("html");
		list.add("css");
		list.add("javascript");
		
		display((ArrayList)list);
		
		list.set(3, "javascript & jQuery");
		display((ArrayList)list);
		
		System.out.println("===============");
		list.add(2, "JDBC");
		display((ArrayList)list);
		
		System.out.println("======================");
		String a = list.remove(2);
		System.out.println("빠져나왔다? => " + a);
		boolean check1 = list.remove("oracle");
		boolean check2 = list.remove("hello");
		System.out.println(check1);
		System.out.println(check2);
		System.out.println(list);
		
		System.out.println("}=======있나없나?=======");
		System.out.println(list.contains("JDBC"));
		System.out.println(list.contains("ds"));
		System.out.println(list.contains("css"));
		System.out.println(list.contains("java"));
		
		
		System.out.println("====================");
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("스프링");
		list2.add("자바");
		list2.add("Mysql");
		list.addAll(list2);
		System.out.println(list);
		
		
		
		
		
	}
	
	public static <E> void display(ArrayList<E> list) {
		for(E data : list) {
			System.out.println(data);
		}
	}
	
	
	
	
	
	
}
