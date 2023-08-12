package basic;

public class OprTest5 {
	public static void main(String[] args) {
		int i = 0;
		i = i + 20;
		System.out.println("i="+i);
		
		i+=30;// i = i+30;
		System.out.println("i="+i);
		
		i-=30;// i = i-30;
		System.out.println("i="+i);
		
		i*=30;// i = i * 30;
		System.out.println("i="+i);
		
		i/=30;// i = i / 30;
		System.out.println("i="+i);
		
		i%=3;// i = i % 3;
		System.out.println("i="+i);
		
		int num1 = 90;
		// 삼항연산자
		String result = num1>=90 ? "합격" : "불합격";
		System.out.println("삼항연산결과=>"+result);
		
		int point = num1>90 ? 10000 : 100;
		System.out.println("삼항연산결과=>"+point);
		
		if(true) System.out.println("hello");
		if(false) System.out.println("hello");
	}
}
