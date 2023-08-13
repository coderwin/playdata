package statement;

public class IfTest {
	public static void main(String[] args) {
		// 이와 같은 방법은 지양해야 한다.
		int num1 = 100;
		if(num1>=100)
			System.out.println("통과");
			System.out.println("종료");
		if(num1<100)
			System.out.println("통과");
			System.out.println("종료");
			
	
	}
}
