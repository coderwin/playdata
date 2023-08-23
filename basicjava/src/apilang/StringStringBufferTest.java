package apilang;

// String과 StringBuffer의 성능비교
public class StringStringBufferTest {
	
	public static void main(String[] args) {
		int count = 10000;// 실행횟수
		System.out.println("실행횟수=>"+count);
		stringCehck(count);
		System.out.println("====================");
		stringBufferCheck(count);
		System.out.println("====================");
		stringBuilder(count);
	}
	
	
	public static void stringCehck(int count) {
		
		long start = System.nanoTime();
		// TODO 로직 추가
		String str = new String("java");
		for(int i=1;i<=count;i++) {
			str = str + "java";
		}
		
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("str = str + java");
		System.out.println("실행시간:"+time);
		
		
	}
	
	public static void stringBufferCheck(int count) {
		long start = System.nanoTime();
		// TODO 로직 추가
		StringBuffer str = new StringBuffer("java");
		for(int i=1;i<=count;i++) {
			str.append("java");
		}
		
		long end = System.nanoTime();
		long time = end - start;
//		System.out.println("str.append(\'java\')");
		System.out.println("str.append('java')");
		System.out.println("실행시간:"+time);
	}
	
	public static void stringBuilder(int count) {
		long start = System.nanoTime();
		// TODO 로직 추가
		StringBuilder str = new StringBuilder("java");
		for(int i=1;i<=count;i++) {
			str.append("java");
		}
		
		long end = System.nanoTime();
		long time = end - start;
//		System.out.println("str.append(\'java\')");
		System.out.println("str.append('java')");
		System.out.println("실행시간:"+time);
	}

}
