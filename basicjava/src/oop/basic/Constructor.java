package oop.basic;

public class Constructor {
	
	private String name;
	private String id;
	private String pass;
	private String addr;
	private String telNum;
	private String ssn;
	private String nickName;
	private int point;
	
	public Constructor() {
		System.out.println("매개변수 0개 사용");
	}
	
	
	// insert용생성자
	public Constructor(String name, String id, String pass, String addr, String telNum, String ssn) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.addr = addr;
		this.telNum = telNum;
		this.ssn = ssn;
		System.out.println("매개변수 6개 사용");
	}
	// select용 생성자
	public Constructor(String name, String id, String pass, String addr, String telNum, String ssn, String nickName, int point) {
		this(name, id, pass, addr, telNum, ssn);
		this.nickName = nickName;
		this.point = point;
		System.out.println("매개변수 8개 사용");
	};
	
	// 생성자가 오버로딩 되어있으면 this를 사용하여 중복을 줄일 수 있다.
	

}
