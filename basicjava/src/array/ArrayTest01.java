package array;
// 배열의 사용
/*
 * 1. 배열의 선언
 * 2. 배열의 생성
 * 3. 배열의 초기화
 * 
 */
public class ArrayTest01 {
	public static void main(String[] args) {
		//1. 배열의 선언
		// - 배열의 참조할 변수를 정의하는 과정
		// [형식]
		// 데이터타입[] 변수명
		int[] myarr = null;//배열 선언
		System.out.println(myarr);
		// 2. 배열의 생성
		// - 실제 데이터를 저장할 수 있는 구조를 만든느 과정
		// - 생성된 배열은 힙에 할당된다.
		myarr = new int[5];
		System.out.println(myarr);
		
		System.out.println(myarr == null);
		System.out.println(myarr != null);
		
		int[] myarr2 = new int[5];
		System.out.println(myarr2);
		
		System.out.println(myarr2 == null);
		System.out.println(myarr2 != null);
		
		
		
		int [] arr5 = new int[5];
		int[] arr6 = arr5;
		int[] arr7 = new int[5];
		
		System.out.println("arr5==arr6:"+(arr5==arr6));
		System.out.println("arr5==arr7:"+(arr5==arr7));
		System.out.println("======================");
		System.out.println("arr5.equals(arr6)"+arr5.equals(arr6));
		System.out.println("arr5==arr7"+arr5.equals(arr7));


	}
}
