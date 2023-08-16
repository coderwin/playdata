package oop.basic;

public class Student {
	
	private String name;// 이름
	private int age;// 나이
	private int id;// 학번
	
	
	
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
				+ name
				+ " 나 이 : "
				+ age
				+ " 학   번 : "
				+ id);
	}
	
	
}
