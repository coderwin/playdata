package basic;

// 놀리연산자
// - and : &
// - or : |
public class OprTest3 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		
		System.out.println("=============");
		// true & true
		System.out.println((num1 < num2) & (num1>=100));
		// false & ture
		System.out.println((num1 > num2) & (num1 < num2));
		// true & false
		System.out.println((num1 < num2) & (num1 != 100));
		// false & false
		System.out.println((num1 > num2) & (num1 == num2));
		
		System.out.println("=========|연산============");
		// true & ture
		System.out.println((num1 < num2) | (num1>=100));
		// false & ture
		System.out.println((num1 > num2) | (num1 < num2));
		// true & false
		System.out.println((num1 < num2) | (num1 != 100));
		// false & false
		System.out.println((num1 > num2) | (num1 == num2));

	}

}
