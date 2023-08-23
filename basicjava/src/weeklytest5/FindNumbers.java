package weeklytest5;

public class FindNumbers {
	public static void main(String[] args) {
		FindNumbers fn = new FindNumbers();

		long number = 228754462;
		System.out.println("입력 숫자 = " + number);
		System.out.println("2 횟수 => " + fn.countNumber(number, 2));// 3을 리턴
		System.out.println("4 횟수 => " + fn.countNumber(number, 4));// 2를 리턴
		
//		System.out.println("입력 숫자 = " + number);
//		System.out.println("2 횟수 => " + fn.countNumberV2(number, 2));// 3을 리턴
//		System.out.println("4 횟수 => " + fn.countNumberV2(number, 4));// 2를 리턴
	}

	/* 이곳에 countNumber 메소드를 작성하십시오. */
	public int countNumber(long number, int i) {
		
		long start = System.nanoTime();
		// String으로 변환한다.
		String numberStr = String.valueOf(number);
		int count = 0;// 횟수
		// charAt()으로 비교한다.
		for (int j = 0; j < numberStr.length(); j++) {

			if (String.valueOf(numberStr.charAt(j)).equals(String.valueOf(i))) {

				count++;
			}
		}
		long end = System.nanoTime();
		System.out.println(end - start);
		
		return count;
	}
	
	/* 이곳에 countNumber 메소드를 작성하십시오. */
	public int countNumberV2(long number, int i) {
		
		long start = System.nanoTime();
		// char[]로 변환한다..
		String numberStr = String.valueOf(number);
		char[] numberCharArr = numberStr.toCharArray();
		int count = 0;// 횟수
		// charAt()으로 비교한다.
		for (int j = 0; j < numberCharArr.length; j++) {

			if (String.valueOf(numberCharArr).equals(String.valueOf(i))) {

				count++;
			}
		}
		long end = System.nanoTime();
		System.out.println(end - start);
		
		return count;
	}
	
	

}
