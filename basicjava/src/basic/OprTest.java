package basic;

public class OprTest {
	
	
	public static void main(String[] args) {
		
		int x;
		int y;
		
		x = 5;
		y = ++x;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("====================");
		x = 5;
		y = x++;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("====================");
		x = 5;
		y = --x;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("====================");
		x = 5;
		y = x--;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("====================");

		
	}

}
