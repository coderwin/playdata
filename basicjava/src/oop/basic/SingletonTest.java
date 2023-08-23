package oop.basic;

// 싱글톤을 테스트합니다.
public class SingletonTest {
	
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
	}

}
