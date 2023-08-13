package basic;

// 기본형데이터의 캐스팅
public class PrimitiveTypeCastingTest {
	
	public static void main(String[] args) {
		//1. 자동형변환 - JVM내부에서 자동으로 변환
		byte b = 100;
		short s = b;//형변환  // char
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		System.out.println(d);
		
		char data1 = 'A';
		int data2 = data1;
		System.out.println(data1);
		System.out.println(data2);

//		data1 = data2;
		
		byte byteValue = 65;
//		char charValue = byteValue; // byte의 음수값으로 인해 자동형변환 안 된다.
		
		// 2. 명시적형변환 - (캐스팅할타입)을 정의
		byte b2 = (byte)1234;
		System.out.println(b2);
		
		int data3 = 97;
		char char2 = 'A';
		System.out.println((char)data3);
		System.out.println(data3 - char2);
		
		double result = 10/3;
		System.out.println(result);
		double result2 = (double)32/100*100;
		System.out.println(result2+"%");
	}

}
