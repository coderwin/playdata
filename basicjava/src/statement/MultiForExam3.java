package statement;

public class MultiForExam3 {

	public static void main(String[] args) {
		// 구구단 출력하기	
//		2 * 1 = 2
//		2 * 2 = 4
//		.....
//		3*1 = 3
//		3* 2 = 4	
		
		for(int line = 2; line < 10; line++) {
			for(int row = 1; row < 10; row++) {
				System.out.print(line
						+ "*"
						+ row
						+ "="
						+ line*row
						+ "\t");
			}
			System.out.println();
		}

	}

}
