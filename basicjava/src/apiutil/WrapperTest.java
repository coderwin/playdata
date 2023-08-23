package apiutil;

public class WrapperTest {

	public static void main(String[] args) {

		// 5.0 이전
		int i = 10;
		// 기본형을 참조형으로
		Integer in = new Integer(i);
		test(in);

		// 5.0 이후
		int j = 10;
		Integer in2 = j;// == new Integer(j);
		test(in2); // 5.0이후 버전의 jdk에서 컴파일러가 자동으로 변환해준다.
		
		Integer i1 = 10;
		Integer i2 = 10;
		String newIn = i1 == i2 ? "같다" : "다르다";
		System.out.println(newIn);
		
		System.out.println(Integer.MAX_VALUE + 1);
		System.out.println(Integer.MIN_VALUE - 1);
		System.out.println(Long.MAX_VALUE + 1);
		System.out.println(Long.MIN_VALUE - 1);

	}

	public static void test(Object obj) {
		// 5.0이전
		// Object -> Integer 변환
		Integer in = (Integer) obj;
		// Integer를 다시 int로 변환
		int myoldval = in.intValue();
		System.out.println(myoldval);
		System.out.println(obj);
	}

}
