package oop.basic;

public class Teacher extends Person {
	
	private String subject;// 담당과목
	
	public Teacher() {
		
	}
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
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
				+ getName()
				+ " 나 이 : "
				+ getAge()
				+ " 담당과목 : "
				+ subject);
		
	}
	
	
}
