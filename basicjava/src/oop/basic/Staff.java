package oop.basic;

public class Staff extends Person {
	
	private String dept;//부서
	
	public Staff() {
		
	}
	
	public Staff(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
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
				+ getName()
				+ " 나 이 : "
				+ getAge()
				+ " 부   서 : "
				+ dept);
		
	}
	
	
}
