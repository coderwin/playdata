package statement;

public class MultiForExam2 {

	public static void main(String[] args) {
		// 이중for문 연습하기
		/**
		 * 12345
		 * 678910
		 * 
		 */
		int i = 1;
		for(int line = 0; line < 5; line++) {
			for(int row = 0; row < 5; row++ ) {
				System.out.print(i + "\t");
				i++;
			}
			System.out.println();
		}

	}

}
