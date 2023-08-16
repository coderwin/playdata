package array;

import java.util.Random;

public class ArrayTest5 {
	
	public static void main(String[] args) {
		
		// String 객체 3개를 참조할 수 있는 주소가 저장된 배열
		String [] strArr = new String[3];
		System.out.println(strArr);
		System.out.println(strArr[0]);
		
		// Random객체 3개를 참조할 수 있는 주소가 저장된 배열
		Random[] randArr = new Random[3];
		System.out.println(randArr);
		System.out.println(randArr[0]);
		
		randArr[0] = new Random();
		randArr[1] = new Random();
		randArr[2] = new Random();
		
		for(int i = 0; i < randArr.length; i++) {
			System.out.println(randArr[i]);
		}
		
		
		//String 배열
		strArr[0]  = new String("java");
		strArr[1] = new String("oracle");
		strArr[2] = new String("jdbc");
		
		for(int index = 0; index < strArr.length; index++) {
			System.out.println(strArr[index]);	
		}
		
		
		
		
		
		
		
		
		
		
		String str1 = new String("안녕하세요");
		String str4 = new String("안녕하세요");
		String str2 = "안녕하세요";
		String str3 = "안녕하세요";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str2 == str3);
		
		System.out.println(str1 == str4);
		System.out.println(str1.equals(str4));
	}

}
