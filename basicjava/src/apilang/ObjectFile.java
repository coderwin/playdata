package apilang;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class ObjectFile {
	public static void main(String[] args) {

		Object obj1 = new Object();
		Object obj2 = new Object();

		if (obj1.equals(obj2)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}

		Person me = new Person("BTS", "서울", 30);
		Person you = new Person("BTS", "서울", 30);
		Person you2 = new Person("BTS", "서울", 31);
		Person you3 = new Person("BTD", "서울", 30);



		if (me.equals(you)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다");
		}
		
		if (me.equals(you2)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다");
		}
		
		if (me.equals(you3)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다");
		}
		
		System.out.println(obj1);
		System.out.println(obj1.toString());
		
		System.out.println(me);
		System.out.println(you.toString());
		
		// hashCdoe는 객체가 할당된 곳의 메모리를 기준으로 값을 계산해서 리턴하므로
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println(me.hashCode());
		System.out.println(you.hashCode());
		System.out.println(you2.hashCode());
		System.out.println(you3.hashCode());
		
		// 편하게 데이터를 조회하기 위해서
		System.out.println(obj1);
		System.out.println(obj1.toString());
		
		System.out.println(me);
		System.out.println(you.toString());
		
		String str = new String("java");
		System.out.println(str);
		
		Date d = new Date();
		System.out.println(d);
		
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list);
		
		list.add("test");
		list.add("java");
		System.out.println(list);
		
		Random rand = new Random();
		System.out.println(rand);
		

	}
}
