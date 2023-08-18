package inheritance;

/**
 * ATest
 * 설명 : 오버라이딩 시, 상속과 인플러먼트 한 거 누구 메서드? 같은 메서드 일 때
 * @author Playdata
 *
 */
public class ATest {
	
	public static void main(String[] args) {
		A a = new A();
		
		a.login("lee");
		
		FinalTest ft = (FinalTest) a;
		a.login("lee2");
		
		B b = (B) a;
		a.login("lee3");
		
	}
}
