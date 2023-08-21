package apilang;

public class StringTest04 {
	
	public static void main(String[] args) {
		
		String str1 = new String("java programming");
		String str2 = "재밌다.";
		
		System.out.println("str1.startsWith(\"java\")=>"+str1.startsWith("java"));
		System.out.println("str1.startsWith(\"java2\")=>"+str1.startsWith("java2"));
		System.out.println("str1.endWith(\"ing\")=>"+str1.endsWith("ing"));
		System.out.println("str1.endWith(\"java\")=>"+str1.endsWith("java"));
		System.out.println("str1.contains(\"ja\")=>"+str1.contains("ja"));
		System.out.println("str1.contains(\"gra\")=>"+str1.contains("gra"));
		System.out.println("str1.contains(\"grm\")=>"+str1.contains("grm"));
		
		// 대소문자변환
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());
		System.out.println("str1.toLowerCase()=>"+str1.toLowerCase());
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("str1.substring(5)=>"+str1.substring(5));
		System.out.println("str1.substring(5,8)=>"+str1.substring(5,8));
//		System.out.println("str1.substring(5,8)=>"+str1.substring(5,50));// StringIndexOutOfBoundException
		System.out.println("str1.replace('a','A')=>"+str1.replace('a', 'A'));
		System.out.println("str1.replace(65, 85)=>"+str1.replace((char)65, (char)85));
		System.out.println(str1);
		System.out.println(str2);
		
		// 배열로 바꾸기
		System.out.println("str1.split(\"a\")=>"+str1.split("a"));
		System.out.println(str1.split("a"));
		for(int i = 0; i < str1.split("a").length; i++) {
			System.out.println(str1.split("a")[i]);
		}

		
	}
}
