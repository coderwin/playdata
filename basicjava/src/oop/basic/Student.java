package oop.basic;

public class Student extends Person {
	
	private int id;// 학번
	
	
	public Student() {
		
	}
	
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 기능 : 정보를 보여줍니다.
	 */
	public void display() {
		
		System.out.println("이 름 : "
				+ getName()
				+ " 나 이 : "
				+ getAge()
				+ " 학   번 : "
				+ id);
	}
	
	
}
