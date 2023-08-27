package weeklytest6;

/**
 * Shape
 * @author Playdata
 * 설명 : 모양
 */
public abstract class Shape {
	
	private Point point;
	
	// 생성자
	public Shape() {
		
	}
	public Shape(Point point) {
		this.point = point;
	}
	
	// 메서드
	public Point getPoint() {
		return point;
	}
	
	public void setPoint(Point point) {
		this.point = point;
	}
	
	
	public abstract double getArea();
	

	public abstract double getCircumference();

}
