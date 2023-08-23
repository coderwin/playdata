package apilang;


public class Prob1 {
	public static void main(String[] args) {
		System.out.println("문자열에 특정문자 변경하는 테스");
		System.out.println("-------------Sample 1 --------------");
		String str1=myReplace("hello world",'l','*');
		System.out.println(str1);
		
		System.out.println("-------------Sample 2 --------------");
		String str2=myReplace("hello world",' ','-');
		System.out.println(str2);
		
		System.out.println("-------------Sample 3 --------------");
		String str3=myReplace("hello world",'a','*');
		System.out.println(str3);
		

	}
	public static String myReplace(String str, char oldChar, char newChar){
		// 이 부분을 구현하시오.
		// char[]로 만든다.
		char[] strChar = str.toCharArray();
		for(int i = 0; i < strChar.length; i++) {
			if(strChar[i] == oldChar) {
				strChar[i] = newChar;
			}
		}
//		return str.replace(oldChar, newChar);
//		return str.replaceAll(String.valueOf(oldChar), String.valueOf(newChar));
		
		
		// concat을 사용한다. or 배열을 String으로 바꾼다.
		return String.valueOf(strChar);
	}
	
}