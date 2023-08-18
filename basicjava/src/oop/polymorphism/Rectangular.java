package oop.polymorphism;

public class Rectangular extends Shape {
	private double width;// 세로 길이
	private double hight;// 가로 길이
	
	// 생성자
	public Rectangular(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}
	
	// 메서드
	/**
	 * 기능 : 면적을 계산합니다.
	 */
	@Override
	public void calculationArea() {
		double area = width * hight;
		setArea(area);
	}
	
	
	
	
	
	
}
