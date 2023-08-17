package oop.basic;

// 클래스를 정의하고 멤버변수를 정의하는 방법
public class Person {
	
	// 클래스의 특성을 나타내는 데이터를 정의 - 필드 or 멤버변수
	private String name;// 이름
	private String addr;// 주소
	private int age;// 나이
	protected String phone;// 휴대폰번호
	byte byte1;
	short short1;
	char char1 = 65;
	
	// 생성자
	public Person() {
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	protected void hello() {
		
	}
}
