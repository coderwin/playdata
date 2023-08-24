package apiutil;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableHashMapTest {
	
	public static void main(String[] args) {
		
		// hashtable - null, null 불가
//		Map<Integer, String> hashtable = new Hashtable<>();
//		hashtable.put(null, null);
//		
//		System.out.println(hashtable.get(null));
		
		// hashMap - null, null 가능 o
		Map<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(null, null);
		hashMap.put(1, "가");
		hashMap.put(2, "나");
		
		System.out.println("hashMap null 키 null 값=> " + hashMap.get(null));// 에러 없음
		
		Set<Integer> set = hashMap.keySet();
		for(Integer key : set) {
			System.out.println(hashMap.get(key));
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext() == true) {
			System.out.println("value : " + it.next());
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
