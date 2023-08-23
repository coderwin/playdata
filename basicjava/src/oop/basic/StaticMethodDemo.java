package oop.basic;

// static 메소드 특징과 static 블럭
public class StaticMethodDemo {
	
	static int staticNum;
	
	// static 블럭 - 클래스로더에 의해서 클래스에 대한 정보가 method area에 올라갈 때 한 번 실행
	static {
		staticNum = 100;
		System.out.println("static블럭 - 클래스가 로딩될 때 한 번 실행하는 코드를 정의할 목적");
		System.out.println("static블럭 - 자원에 대한 정보를 한 번 인식시키거나 액세스할 때");
		System.out.println("static블럭 - 클래스가 로딩도리 때 한 번만 실행되므로 static변수를 초기화할 목적");
	}
	
	public StaticMethodDemo() {
		System.out.println("StaticMethodDemo의 기본생성자");
	}
	
	// 
	public static void test() {
		// static메소드에서 static 메소드를 호출한다.
		show();
//		display();
	}

	public void display() {
		// non-static메서드를 non-static메서드에서 호출한다.
		change();
		show();
	}
	public static void show() {
		// static에서 non-static
		// show가 메모리에 잇는 상태에 바로 examtest를 확인할 수 없으므로 에러발생
//		examtest();
	}
	public void change() {
		
	}
	public void examtest() {
		System.out.println();
	}
}
