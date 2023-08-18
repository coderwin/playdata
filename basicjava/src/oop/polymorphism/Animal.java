package oop.polymorphism;

/**
 * Animal
 * 설명 : 동물
 * @author Playdata
 *
 */
public abstract class Animal {
	
	private int speed;			// 속도[km/h]
	private double distance;	// 이동거리[km]
	
	// 생성자
	public Animal(int speed) {
//		super();
		this.speed = speed;
	}
	
	public double getDistance() {
		return distance;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;	
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	// 메서드
//	default abstract void run(int hours);
	/**
	 * 기능 : 이동합니다.
	 * @param hours
	 * @return
	 */
	abstract void run(int hours);

}
