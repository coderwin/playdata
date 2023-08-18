package oop.polymorphism;

/**
 * TestShape
 * 설명 : 모양의 면적을 계산하는 곳
 * @author Playdata
 *
 */
public class TestShape {
	public static void main(String[] args) {
		Shape [] shape = new Shape[2];
		shape[ 0 ]  = new Circle("원",10);
		shape[ 1 ] = new Rectangular("직사각형",10,20);
		
		for (int i = 0; i < shape.length; i++) {
			shape[ i ].calculationArea();
			shape[ i ].print();
		}
	}
}