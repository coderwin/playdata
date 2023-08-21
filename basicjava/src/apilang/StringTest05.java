package apilang;

//
public class StringTest05 {

	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("java oracle html4 css javascript jquery");

		// 1. String -> byte[]
		byte[] data1 = str1.getBytes();
		System.out.println(data1);
		for (byte b : data1) {
			System.out.println(b);
		}
		// 2. String -> char[]
		char[] data2 = str1.toCharArray();
		for (char val : data2) {
			System.out.println(val);
		}
		System.out.println();
		// 3. Sring -> String[]
		String[] data3 = str2.split("");
		for (String val : data3) {
			System.out.println(val);
		}
		System.out.println("=================");
		String[] data4 = str2.split(" ");
		for (String val : data4) {
			System.out.println(val);
		}
		// 4. 기본형 -> String
		int i = 100;
//		test(i);
		test(String.valueOf(i));
		
		System.out.println(str1);

	}
	
	public static void test(String data) {
		System.out.println("전달받은데이터===>"+data);
	}

}
