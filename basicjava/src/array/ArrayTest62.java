package array;

public class ArrayTest62 {

	public static void main(String[] args) {
		// 배열의 사이즈를 변경하는 방법
		int[] firstArr = {1, 2 , 3, 4,5};
		// 1. 배열의 사이즈를 변경하기 위해서 새로운 배열을 만들어야 한다.
		int[] secondArr = new int[firstArr.length * 3];
		// 2. 기존배열의 요소를 새로운 배열에 copy
		for(int i = 0; i < firstArr.length; i++) {
			secondArr[i] = firstArr[i];
		}
		
		// 배열을 출력하기
		for(int i = 0; i < secondArr.length; i++) {
			System.out.print(secondArr[i] + "\t");
		}

	}

}
