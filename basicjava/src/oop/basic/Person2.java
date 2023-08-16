package oop.basic;

//자바의 특징에 맞게 클래스를 정의
// 클래스를 정의한느 경우 멤버변수(클래스의 속성, 클랛의 구성요소, 클래스에서 다루는 데이터)는 private으로
// 선언해서 외부에서 접근할 수 없도록 정보를 은닉하고 public메소드를 통해서 접근할 수 있도록 구현한다.
public class Person2 {
	
	// 정보를 은닉
	private String name;
	private String addr;
	private int age;
	
	public void setName(String name) {
		this.name           =        name;
	// 현재작업중인 객체.name             매개변수지역변수()
	}
	
	public void setAddr(String addr) {
		this.addr = addr
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddr() {
		return this.addr;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	
	
	
}
