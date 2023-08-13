package basic;

// 기본형변수에 저장되는 값(리터럴)
public class PrimitiveTypeValueTest {
	public static void main(String[] args) {
		int num = 100;
		num = 200;
		
		//논리형 - boolean
		boolean bolVal = false;//true
		//정수형 - byte, short, int, log, float, double
//		byte b = 127;
		// ---   ---
		// 변수   리터럴
		// byte  int
		byte b =  127;
//		byte b2 = 128;//에러상황
		// 강제로 캐스팅을 하면 저장이 가능
		//    -------
		//    타입을 변환
		byte b2 = (byte)1234;
		System.out.println("byte변수=>"+b);
		System.out.println("캐스팅된 byte변수=>"+b2);// 쓰레기 값이 된다.
		
		short s = 32767;
		System.out.println(s);
		short s2 = (short)32768;//-32768
		System.out.println(s2);
		
		int i = 2147483647;
		long i2 = 2147483649L;
		System.out.println(i2);
		
		// 실수형리터럴(float, double)
		// 실수형리터럴의 기본타입은 double
		double d = 10.5;
		System.out.println(d);
		// float의 접미사 - f, F
		float f = 20.5f;
		System.out.println(f);
		
		// 문자형 리터럴
		char c = 'A';
		System.out.println(c);
		System.out.println((int)c);
		System.out.println((short)c);
		System.out.println((byte)c);
		int char1 = 65;
		System.out.println(char1);
		System.out.println((char)char1);
		
		System.out.println((char)65535);
		
		
		// 참조형 중에서 String은 기본형처럼 리터럴로 할당할 수 있다.
		String str = "참조형인 String의 리터럴은 큰따옴표로 표현";
		System.out.println("String변수=> "+str);
		
		
		


		
		
		
		
	}
}
