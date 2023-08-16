package array;

public class ArrayTest61 {

	// application 실행할 때 명령형 매개변수를 사용했다.
	//                    -> 외부 데이터가 application 실행 시 필요할 때
	public static void main(String[] args) {
		// 배열의 사이즈를 변경하는 방법
		int[] firstArr = {1, 2 , 3, 4,5};
		// 1. 배열의 사이즈를 변경하기 위해서 새로운 배열을 만들어야 한다.
		int[] secondArr = new int[firstArr.length * 3];
		String[] strArr = new String[3];
		
		
		// 2. 기존배열의 요소를 새로운 배열에 copy하도록 지원되는 System클래스의 arraycopy메소드 활용
		/**
		 * System.arraycopy(firstArr, 0, secondArr, 0, 0);
		 *                  -----------------------------
		 *                 원본배열,  시작위치, 타겟배열,  타겟배열의 시작위치, copy요소의 개수 
		 */
//		System.arraycopy(firstArr, 0, strArr, 0, 0);
		System.arraycopy(firstArr, 2, secondArr, secondArr.length - 3, 3);
		
		// 배열을 출력하기
		for(int i = 0; i < secondArr.length; i++) {
			System.out.print(secondArr[i] + "\t");
		}

	}

}
