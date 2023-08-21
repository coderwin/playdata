package apilang;

import java.util.HashMap;

/**
 * HashCodeTest
 * 동일성 비교
 * @author Playdata
 *
 */
public class HashCodeTest {
	
	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// 식별키 new Key(1)로 "홍길동" 저장
		hashMap.put(new Key(1), "홍길동");
		
//		// 식별키 new Key(1)로 "홍길동"을 읽어옴
//		// equals만 따로 처리하고 hashCode() 따로 처리 안 했을 때
//		String value = hashMap.get(new Key(1));
//		System.out.println(value);
		
		// 식별키 new Key(1)로 "홍길동"을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		
		
		
	}
	
	
	
	
	

}
