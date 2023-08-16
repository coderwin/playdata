package oop.basic;

public class Staff {
	
	private String name;//이름
	private int age;//나이
	private String dept;//부서
	
	public Staff() {
		
	}
	public Staff(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	/**
	 * 기능 : 정보를 출력합니다.
	 */
	public void display() {
		System.out.println("이 름 : "
				+ name
				+ " 나 이 : "
				+ age
				+ " 부   서 : "
				+ dept);
		
	}
	
	
}
