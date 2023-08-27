package weeklytest6;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
	
	public static void main(String[] args) {
		
		List<Shape> shapeList = new ArrayList<>();
		
		shapeList.add(new Rectangle(4, 7, 5)); 
		shapeList.add(new Rectangle(5, 4, 6));
		shapeList.add(new Circle(6, 6, 7)); 
		shapeList.add(new Circle(7, 8, 3)); 
		
//		모든 객체의 넓이 정보와 둘레 정보를 화면에 출력 한다. – for 문 이용
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("구분\t\t 길이\t x좌표\t y좌표\t Area\t dirdumferende\t\n");
		
		for(Shape shape : shapeList) {

			if(shape instanceof Circle) {
				Circle c = (Circle)shape;
				String shapeFullName = c.getClass().getName();
				stringBuffer.append(shapeFullName.substring(shapeFullName.indexOf(".") + 1) + "\t\t "
						+ c.getRadius()
						+ "\t "
						+ c.getPoint().getX()
						+ "\t "
						+ c.getPoint().getY()
						+ "\t "
						+ String.format("%.0f", c.getArea())
						+ "\t "
						+ String.format("%.0f", c.getCircumference())
						+ "\t\n");
			} else {
				Rectangle d = (Rectangle)shape;
				String shapeFullName = d.getClass().getName();
				stringBuffer.append(shapeFullName.substring(shapeFullName.indexOf(".") + 1) + "\t "
						+ d.getWidth()
						+ "\t "
						+ d.getPoint().getX()
						+ "\t "
						+ d.getPoint().getY()
						+ "\t "
						+ String.format("%.0f", d.getArea())
						+ "\t "
						+ String.format("%.0f",d.getCircumference())
						+ "\t\n");
			}
			
		}
		stringBuffer.append("이동 후...\n");
		int xMovePoint = 10;
		int yMovePoint = 10;
		for(Shape shape : shapeList) {
			if(shape instanceof Circle) {
				Circle c = (Circle)shape;
				c.move(xMovePoint, yMovePoint);
				String shapeFullName = c.getClass().getName();
				stringBuffer.append(shapeFullName.substring(shapeFullName.indexOf(".") + 1) + "\t\t "
						+ c.getRadius()
						+ "\t "
						+ c.getPoint().getX()
						+ "\t "
						+ c.getPoint().getY() + "\n");
			} else {
				Rectangle d = (Rectangle)shape;
				d.move(xMovePoint, yMovePoint);
				String shapeFullName = d.getClass().getName();
				stringBuffer.append(shapeFullName.substring(shapeFullName.indexOf(".") + 1) + "\t "
						+ d.getWidth()
						+ "\t "
						+ d.getPoint().getX()
						+ "\t "
						+ d.getPoint().getY()  + "\n");
			}
		}
		
		System.out.println(stringBuffer);
		
		
		
		
	}
	
	
	
	
	
}
