package oop.basic;
/**
 * Rectangle
 * 설명 : 직사각형
 * @author Playdata
 *
 */
public class Rectangle implements Comparable<Rectangle> {
	
	private int width;		// 가로
	private int height;		// 높이
	private String color;	// 색깔
	private int area;	// 면적
	
	// 클래스 변수
	public static int count;

	// 생성자
	public Rectangle() {
		this.color = "흰색";
	}
	
	public Rectangle(int width, int height) {
		this();
		this.width = width;
		this.height = height;
	}
	
	
	public Rectangle(int width, int height, String color) {
		this();
		this.width = width;
		this.height = height;
		this.color = color;
	}


	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getArea() {
		return area;
	}
	
	// 메서드
	/**
	 * 기능 : 면적(넓이)을 보여줍니다.
	 */
	public void calculateArea() {
		area = width * height;
	}
	
	/**
	 * 기능 : 둘레를 보여줍니다.
	 */
	public int perimeter() {
		int perimeter = height * 2 + height * 2;
		return perimeter;
	}

	@Override
	public int compareTo(Rectangle o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void increaseCount() {
		count++;
	}

	
	
	
	
	
}
