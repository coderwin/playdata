package apiutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 배열을 ArrayList로 변환해서 리턴하는 메소드를 정의
 * 메소드명 : changeArrayList
 * 매개변수 : String[]
 * 리턴타입 : ArrayList<String>
 * @author Playdata
 *
 */
public class ArrayExam02 {
	
	public static void main(String[] args) {
		String[] strArr = {"java", "servlet", "jsp", "spring"};
		//2. 1번에서 구현한 changeArrayList메소드 호출하기
		List<String> newList = changeArrayList(strArr);
		//3. 호출 후 리턴된 ArrayList결과 출력하기
		System.out.println(newList);
	}
	
	//1. changeArrayList메소드를 정의하기
	public static ArrayList<String> changeArrayList(String[] strArr) {
		
//		ArrayList<String> list = (ArrayList<String>)Arrays.asList(strArr); ClassCastException
		
		ArrayList<String> newList = new ArrayList<>();
		// 배열을 for문 돌리기
		for(String e : strArr) {
			// 데이터를 리스트에 넣기
			newList.add(e);
		}
		return newList;
	}
	
//	public static void main(String[] args) {
//		String[] strArr = {"java", "servlet", "jsp", "spring"};
//		//2. 1번에서 구현한 changeArrayList메소드 호출하기
//		List<String> newList = changeArrayList(strArr);
//		//3. 호출 후 리턴된 ArrayList결과 출력하기
//		System.out.println(newList);
//		
//		
//		Integer[] intArr = {1, 3, 34};
//		List<Integer> newList2 = changeArrayList(intArr);
//		System.out.println(newList2);
//	}
	//1. changeArrayList메소드를 정의하기
	public static <E> ArrayList<E> changeArrayList(E[] strArr) {
		
		ArrayList<E> newList = new ArrayList<>();
		// 배열을 for문 돌리기
		for(E e : strArr) {
			// 데이터를 리스트에 넣기
			newList.add(e);
		}
		return newList;		
	}
	
	
	
	
	
}
