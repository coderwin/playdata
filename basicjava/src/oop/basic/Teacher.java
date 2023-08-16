package oop.basic;

public class Teacher {
	
	private String name;// 이름
	private int age;// 나이
	private String subject;// 담당과목
	
	
	
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



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	/**
	 * 기능 : 정보를 보여줍니다.
	 */
	public void display() {
		System.out.println("이 름 : "
				+ name
				+ " 나 이 : "
				+ age
				+ " 담당과목 : "
				+ subject);
		
	}
	
	
}
