package oop.basic;


public class StaticDemoTest {
	
	public static void main(String[] args) {
		
		StaticMethodDemo obj = new StaticMethodDemo();
		System.out.println(StaticMethodDemo.staticNum);
		System.out.println("====================");
		StaticMethodDemo obj22 = new StaticMethodDemo();

		
		StaticDemo obj1 = new StaticDemo();
		obj1.display();
		StaticDemo obj2 = new StaticDemo();
		obj2.display();
		obj1.display();
		StaticDemo obj3 = new StaticDemo();
		obj3.display();
		obj2.display();
		obj1.display();
		
//		Math math = new Math();
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));
	}

}
