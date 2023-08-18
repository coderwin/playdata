package inheritance;

public class FinalTest {
	
	static final int CODE = 100;
	
	public void test() {
		CODE = 200;
	}
	
//	public final void login(String pass) {
//		//보안이 필요한 너무 중요한 메소드
//		System.out.println("부모클래스의 중요한 메소드 - 인증하고 액세스하기");
//	}
	
	public void login(String pass) {
		//보안이 필요한 너무 중요한 메소드
		System.out.println("부모클래스의 중요한 메소드 - 인증하고 액세스하기");
	}
	
	public final void secure() {
		
	}

}
