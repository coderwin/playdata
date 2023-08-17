package oop.basic;

// 싱글톤
public class Singleton {

	private static Singleton singleton;
	private Singleton() {
		System.out.println("인스턴스를 생성했습니다.");
	}
	
	// 싱글톤 불러오기 v1
	public static Singleton getInstance() {
		return new Singleton();
	}
}
