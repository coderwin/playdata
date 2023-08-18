package oop.polymorphism;

public class Circle extends Shape {
	
	private double radius;// 반지름
	
	// 생성자
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	// 메서드
	/**
	 * 기능 : 면적을 계산합니다.
	 */
	public void calculationArea() {
		double pi = Math.PI;
		
		double area = radius * radius * pi;
		super.setArea(area);
	}
	
	

}
