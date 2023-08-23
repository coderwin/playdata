package oop.basic;


import java.util.Scanner;
public class TestRectangle {
	public static void main(String s[]){
		Scanner keyboard = new Scanner(System.in);
		Rectangle2 rec1 = new Rectangle2();
		System.out.println("첫번째 직사각형의 색깔: ");
		rec1.setColor(keyboard.next());
		System.out.println("첫번째 직사각형의 가로: ");
		rec1.setWidth(keyboard.nextInt());
		System.out.println("첫번째 직사각형의 세로: ");
		rec1.setLength(keyboard.nextInt());
		
		Rectangle2 rec2 = new Rectangle2();
		System.out.println("두번째 직사각형의 색깔: ");
		rec2.setColor(keyboard.next());
		System.out.println("두번째 직사각형의 가로: ");
		rec2.setWidth(keyboard.nextInt());
		System.out.println("두번째 직사각형의 세로: ");
		rec2.setLength(keyboard.nextInt());
		
		System.out.println(rec1.getColor() + " 직사각형의 넓이는 " + rec1.area() + "이고 둘레는 " + rec1.perimeter() + "입니다.");
		System.out.println(rec2.getColor() + " 직사각형의 넓이는 " + rec2.area() + "이고 둘레는 " + rec2.perimeter() + "입니다.");
		
		// TODO 1) 두 직사각형의 넓이를 비교하십시오.
		if(rec2.area() > rec1.area()) {
			System.out.println("넓이는 "
					+ rec2.getColor()
					+ " 직사각형이 더 큽니다.");
		} else {
			System.out.println("넓이는 "
					+ rec1.getColor()
					+ " 직사각형이 더 큽니다.");
		}
		
		System.out.println("-----------Rectangle2의 Comparable 이용 시작--------------");
		
		// Rectangle2의 Comparable 이용
		int comparedArea = rec2.compareTo(rec1);
		if(comparedArea > 0) {
			System.out.println("넓이는 "
					+ rec2.getColor()
					+ " 직사각형이 더 큽니다.");
		} else if(comparedArea == 0) {
			System.out.println("넓이가 같습니다.");
		} else {
			System.out.println("넓이는 "
					+ rec1.getColor()
					+ " 직사각형이 더 큽니다.");
		}
		
		System.out.println("-----------Rectangle2의 Comparable 이용 끝--------------");
				
		// TODO 2) 두 직사각형의 둘레를 비교하십시오.
		if(rec2.perimeter() > rec1.perimeter()) {
			System.out.println("둘레는 "
					+ rec2.getColor()
					+ " 직사각형이 더 큽니다.");
		} else if(rec2.perimeter() < rec1.perimeter()) {
			System.out.println("둘레는 "
					+ rec1.getColor()
					+ " 직사각형이 더 큽니다.");
		} else {
			System.out.println("둘레는 같습니다.");
		}
		
		// int overFlow 확인
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		int base = Integer.BYTES;
		
		System.out.println("max + 1 = " + (maxInt + 1)); // 2,147,483,647 21억
		System.out.println("min - 1 = " + (minInt - 1)); // -2,147,483,648 -21억
		
System.out.println("-----------Rectangle2의 Comparator 이용 시작--------------");
		
		// Rectangle2의 Comparable 이용
		int comparedAreaV2 = rec2.compare(rec2, rec1);
		if(comparedAreaV2 > 0) {
			System.out.println("넓이는 "
					+ rec2.getColor()
					+ " 직사각형이 더 큽니다.");
		} else if(comparedAreaV2 == 0) {
			System.out.println("넓이가 같습니다.");
		} else {
			System.out.println("넓이는 "
					+ rec1.getColor()
					+ " 직사각형이 더 큽니다.");
		}
		
		System.out.println("-----------Rectangle2의 Comparator 이용 끝--------------");
		
		System.out.println("--------static 변수(클래스 변수), static method(클래스 메서드) 사용해보자------------");
		
		System.out.println("Rectangle count : " + Rectangle.count);
		// 1상승
		Rectangle.increaseCount();
		Rectangle.increaseCount();
		System.out.println("Rectangle count : " + Rectangle.count);
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		// 다른 Rectanlgle 객체(인스턴스)에서의 count 값 비교
		System.out.println("r1 count : " + r1.count);// count 잘못되 접근
		System.out.println("r1 count : " + Rectangle.count);
		System.out.println("r2 count : " + r2.count);// count 잘못된 접그
		System.out.println("r2 count : " + Rectangle.count);


		
	}
	
	public static void hello() {
		System.out.println("진행 했다.");
	}
}

