package statement;

public class MultiForExam1 {

	public static void main(String[] args) {
		/**
		 * 너 찾기 : (3, 3) == (i, row)
		 * 22222
		 * 22222
		 * 22너22
		 * 22222
		 * 22222
		 */
		int i;// 세로
		int row;// 가로
		for(i = 0; i < 5; i++) {
			for(row = 0; row <5; row++) {
				if(i==2 & row==2) {
					System.out.print("너\t");
				} else {
					System.out.print("2\t");
				}
			}
			System.out.println("");
		}
		
		

	}

}
