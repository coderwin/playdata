package oop.basic;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		System.out.println("성명:"+p1.name);
		System.out.println("주소:"+p1.addr);
//		System.out.println("나이:"+p1.age);
		
		p1.name = "동구";
		p1.addr = "동작구";
//		p1.age = 30;
		
		System.out.println("성명:"+p1.name);
		System.out.println("주소:"+p1.addr);
//		System.out.println("나이:"+p1.age);
		
		System.out.println("===============");
		Person p2 = new Person();
		p2.name = "수가";
//		p2.age = 32;
		p2.addr = "대구";
		
		System.out.println("성명:"+p2.name);
		System.out.println("주소:"+p2.addr);
//		System.out.println("나이:"+p2.age);
		
		System.out.println(p2.byte1);
		System.out.println(p2.short1);
		System.out.println(p2.char1);
		
	}

}
