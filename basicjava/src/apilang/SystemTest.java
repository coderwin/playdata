package apilang;

public class SystemTest {
	
	public static void main(String[] args) {
		// 프로그램의 실행시간 - 1970/1/1기준
		long start = System.currentTimeMillis();
		for(int i = 1;i < 100; i++) {
			System.out.println("java");
		}
		long end = System.currentTimeMillis();
		
		System.out.println(start);
		System.out.println(end);
		System.out.println("실행시간:"+(end-start));
		
		System.out.println("=============================");
		
		start = System.nanoTime();
		for(int i = 1;i < 100; i++) {
			System.out.println("java");
		}
		end = System.nanoTime();
		System.out.println(start);
		System.out.println(end);
		System.out.println("실행시간:"+(end-start));
	}

	
	
	
	
	
	
	
}
