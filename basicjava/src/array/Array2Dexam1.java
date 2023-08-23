package array;

public class Array2Dexam1 {
	
	
	/**
	 * * B C D E
	 * F * H I J
	 * K L * N O
	 * P Q R * T
	 * U V W X *
	 */
	public static void main(String[] args) {
		
		// 선생님 한 것
		String[][] alphaArr = new String[5][5];
		char data = 'A';
		
		// 배열에 값을 저장하는 for
		for(int row = 0; row < alphaArr.length; row++) {
			for(int i = 0; i < alphaArr[row].length; i++) {
				alphaArr[row][i] = data + "";
				// refactor1 : 알파벳에 변화를 준다.
				data++;
			}
		}
		
		// 배열의 값을 출력하는 for
		for(int row = 0; row < alphaArr.length; row++) {
			for(int i = 0; i < alphaArr[row].length; i++) {
				// refactor2 : 별을 출력한다.
				if(row==i) {
					System.out.print("*\t");
				} else {
					System.out.print(alphaArr[row][i] + "\t");
				}
			}
			System.out.println();
		}
		
		System.out.println("==============구분선================");
		
	
		// 내가 한 것
		
		// 요소가 A ~ Y까지 배열을 만든다.
		// *를 표시한다. 규칙을 찾는다.
		String[][] alpArr = new String[5][5];
		char firstChar = 'A';
//		char firstChar = 65;

		
		for(int i = 0; i < alpArr.length; i++) {		
			// row
			for(int j = 0; j < alpArr[i].length; j++) {
				if(i == j) {
					alpArr[i][j] = "*";
					firstChar++;
					System.out.print(alpArr[i][j] + "\t");
					continue;
				}
//				alpArr[i][j] = String.valueOf(firstChar);
				alpArr[i][j] = firstChar + "";
				firstChar++;
				System.out.print(alpArr[i][j] + "\t");
			}
			System.out.println();
		}	
	}
}
