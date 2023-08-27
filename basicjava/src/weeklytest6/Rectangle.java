package weeklytest6;

/**
 * Rectangle
 * @author Playdata
 * 설명 : 직사각형
 */
public class Rectangle extends Shape implements Movable {
	
	private int width;// 한 변의 길이
	
	// 생성자
	public Rectangle() {

	}
	
	public Rectangle(int width, int x, int y) {
		this.width = width;
		Point point = new Point(x, y);
		super.setPoint(point);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	// 메서드
	/**
	 * 기능 : 도형의 좌표 변경
	 */
	@Override
	public void move(int x, int y) {
//		super.getPoint().setX(x);
//		super.getPoint().setY(y);
		Point newPoint = new Point(super.getPoint().getX() + x + 2, super.getPoint().getY() + y + 2);
		super.setPoint(newPoint);
	}

	/**
	 * 기능 : 넓이 구하기
	 */
	@Override
	public double getArea() {
		return width * width;
	}

	/**
	 * 기능 : 둘레 구하기
	 */
	@Override
	public double getCircumference() {
		return width * 4;
	}
	
	
	
	
	
	
	
	
	

}
