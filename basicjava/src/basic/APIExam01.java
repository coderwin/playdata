package basic;
// String클래스의 사용
public class APIExam01 {

	public static void main(String[] args) {
		//1. 안녕하세요 라는 문자열을 이용해서 작업하기
		String greeting = new String("안녕하세요");
		String greeting2 = new String("안녕하세요");

		//=> String클래스를 만들고 문자열의 길이를 출력하기
	 	Integer length = greeting.length();
	 	Integer length2 = greeting2.length();
	 	Integer length3 = new Integer(5);
	 	Integer length4 = Integer.valueOf(5);
	 	
	 	System.out.println("결과=>"+length);
	 	if(greeting.equals(greeting2)) {
	 		System.out.println("ok");
	 		
	 	}
	 	
	 	/*
	 	 * 참조형인 length와 length2는 동일성 비교 시 같다고 나오는 것은
	 	 * AutoBoxing 때문인가요?
	 	 */
	 	if(length == length2) {
	 		System.out.println("ok");	
	 	}
	 	
	 	/*
	 	 * 
	 	 */
	 	if(length3 == length2) {
	 		System.out.println("ok");	
	 	} else {
	 		System.out.println("fail");
	 	}
	 	
	 	/*
	 	 * 이건 왜 Ok일까?
	 	 */
	 	if(length4 == length2) {
	 		System.out.println("ok");	
	 	} else {
	 		System.out.println("fail");
	 	}
	 	
	 	
	 	//2. charAt을 호출해서 결과 출력해보기
	 	char char1 = greeting.charAt(1);
	 	System.out.println(char1);

	}

}
