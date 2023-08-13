package basic;

public class OprTest4 {
	public static void main(String[] args) {
		int num1 = 200;
		String str = null;// null은 참조형변수의 초기값
//		str.length();
//		System.out.println(num1 > 100 | str.length() > 0); //error
		// 연산자는 or 연산의 특성을 이용해서 첫 번째 항이 true이면 ||연산자 뒤의 항은 검사하지 않고 넘어간다.(쇼컷 연산자)
		System.out.println(num1 > 100 || str.length() > 0); // no error
//		System.out.println(num1 < 100 || str.length() > 0);
		
		// &
//		System.out.println(num1<100 & str.length()>0);// error
		System.out.println(num1<100 && str.length()>0);// no error

	}

}
