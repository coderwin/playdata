package oop.polymorphism;

/**
 * Dog
 * 설명 : 개
 * @author Playdata
 *
 */
public class Dog extends Animal {

	// 생성자
	public Dog(int speed) {
		super(speed);
	}
	
	// 메서드
	/**
	 * 기능 : 이동합니다.
	 */
	@Override
	public void run(int hours) {
		
		// 반시간만 이동한다.
		double moveTime = (double)hours / 2;

		double distance = super.getSpeed() * moveTime;
		setDistance(distance);
	}	

}
