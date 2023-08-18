package oop.polymorphism;

/**
 * Chicken
 * 설명 : 닭
 * @author Playdata
 *
 */
public class Chicken extends Animal implements Cheatable {

	// 생성자
	public Chicken(int speed) {
		super(speed);
	}

	// 메서드
	/**
	 * 기능 : 이동합니다.
	 */
	@Override
	public void run(int hours) {
		
		// 시간만큼 이동한다.
		// distance 누적한다.
		double distance = super.getSpeed() * hours;
		setDistance(distance);
	}

	@Override
	/**
	 * 기능 : 속도가 두배 증가합니다.
	 */
	public void fly() {
		int speed = super.getSpeed();
		speed = speed * 2;
		super.setSpeed(speed);
	}
	
	
	
	
	
}
