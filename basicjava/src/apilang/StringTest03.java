package apilang;

public class StringTest03 {
	public static void main(String[] args) {
		
		String str1 = new String("java programming10");
		String str2 = "재밌다.";
		
		System.out.println(str1.charAt(1));
		System.out.println(str1.concat(str2));
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.lastIndexOf('합'));
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.lastIndexOf(10));
		System.out.println(str1.equals("java prograMming10"));
		System.out.println(str1.equalsIgnoreCase("java prograMming10"));// 대문자 상관없이
//		System.out.println(str1.equalsIgnoreCase());
		
		
		
		
		
		
		
	}
}
