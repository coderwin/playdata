package weeklytest6;

/**
 * Circle
 * @author Playdata
 * 설명 : 원
 */
public class Circle extends Shape implements Movable {
	
	private int radius;// 반지름
	
	// 생성자
	public Circle() {
		
	}
	
	public Circle(int radius, int x, int y) {
		this.radius = radius;
		Point point = new Point(x, y);
		super.setPoint(point);
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// 메서드

	/**
	 * 기능 : 도형의 좌표 변경
	 */
	@Override
	public void move(int x, int y) {
		Point newPoint = new Point(super.getPoint().getY() + x + 1, super.getPoint().getY() + y + 1);
		super.setPoint(newPoint);
	}

	/**
	 * 기능 : 넓이 구하기
	 */
	@Override
	public double getArea() {
		
		return Math.PI * radius * radius;
	}

	/**
	 * 기능 : 둘레 구하기
	 */
	@Override
	public double getCircumference() {
		return 2 * radius * Math.PI;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
