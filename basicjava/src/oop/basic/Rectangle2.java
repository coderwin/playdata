package oop.basic;

import java.util.Comparator;

/**
 * Rectangle2
 * 설명 : 직사각형 version2
 * @author Playdata
 * 
 */
public class Rectangle2 implements Comparable<Rectangle2>, Comparator<Rectangle2> {
	
	private int width;		// 가로
	private int length;		// 세로
	private String color;	// 색깔
	
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		
	}
	
	// 메서드
	/**
	 * 기능 : 면적을 계산합니다.
	 * @return area : 면적
	 */
	public int area() {
		int area = width * length;
		return area;
	}
	
	/**
	 * 기능 : 둘레를 계산합니다.
	 * @return perimeter : 둘레
	 */
	public int perimeter() {
		int perimeter = length * 2 + width * 2;
		return perimeter;
	}
	
	/**
	 * 기능 : 넓이를 비교합니다.
	 * @param o
	 * @return
	 */

	@Override
	public int compareTo(Rectangle2 o) {
		
		// v1
		// 자기 자신의 넓이가 o의 넓이보다 크다면 양수
		if(this.area() > o.area()) {
			return 1;
		// 자기 자신의 넓이와 o의 넓이가 같다면 0
		} else if(this.area() == o.area()) {
			return 0;
		// 자기 자신의 넓이가 o의 넓이보다 작다면 음수
		} else {
			return -1;
		}
		
		// v2
//		return this.area() - o.area();
	}
	
	/**
	 * 기능 : 둘레를 비교합니다.
	 * @param o1
	 * @param o2
	 * @return
	 */
	@Override
	public int compare(Rectangle2 o1, Rectangle2 o2) {
		
//		if(o1.perimeter() > o2.perimeter()) {
//			return 1;
//		} else if(o1.perimeter() == o2.perimeter()) {
//			return 0;
//		} else {
//			return -1;
//		}
		
		return o1.perimeter() - o2.perimeter();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
