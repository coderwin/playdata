package oop.polymorphism;

/**
 * Shape
 * 설명 : 도형
 * @author Playdata
 *
 */
public abstract class Shape {
	
	private double area;// 면적
	private String name;// 이름
	
	// 생성자
	public Shape() {
		
	}
	
	public Shape(String name) {
		this.name = name;
	};
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 메서드
	/**
	 * 기능 : 면적을 계산합니다.
	 */
	public abstract void calculationArea();
	
	/**
	 * 기능 : 정보를 출력합니다.
	 */
	public void print() {
		System.out.println(name
				+ "의 면적은 "
				+ area);
	};
	
	
}
