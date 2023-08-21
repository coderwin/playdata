package apilang;

//자바의 특징에 맞게 클래스를 정의
// 클래스를 정의한느 경우 멤버변수(클래스의 속성, 클랛의 구성요소, 클래스에서 다루는 데이터)는 private으로
// 선언해서 외부에서 접근할 수 없도록 정보를 은닉하고 public메소드를 통해서 접근할 수 있도록 구현한다.
public class Person {
	
	// 정보를 은닉
	private String name;
	private String addr;
	private int age;
	
	
	
	/**
	 * @param name
	 * @param addr
	 * @param age
	 */
	public Person(String name, String addr, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	public void setName(String name) {
		this.name           =        name;
	// 현재작업중인 객체.name             매개변수지역변수()
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddr() {
		return this.addr;
	}
	
	public int getAge() {
		return this.age;
	}
	
//	@Override
//	public boolean equals(Object obj) {
////		obj.name();
//		// TODO 같은 객체인지 확인
//		// 1. obj의 타입이 Person클래스 타입인지 검사
//		if(obj instanceof Person) {
//			// 객체의 값을 비교해야 하므로 Person의 멤버를 액세스해야 한다.
//			Person p = (Person)obj;
//			// 객체의 모든 값들을 비교해야한다.
//			if(this.name.equals(p.name) || this.addr.equals(p.addr) || this.age == p.age) {
//				return true;
//			}
//		} 	
//		return false; 
//	}
	
	/**
	 * 기능 : 객체가 같은지 비교하고 싶을 때
	 */
	@Override
	public boolean equals(Object obj) {
//		obj.name();
		// TODO 같은 객체인지 확인
		// 1. obj의 타입이 Person클래스 타입인지 검사
		if(obj instanceof Person) {
			// 객체의 값을 비교해야 하므로 Person의 멤버를 액세스해야 한다.
			Person p = (Person)obj;
			// 객체의 모든 값들을 비교해야한다.
			if(this.name.equals(p.name)||this.addr.equals(p.addr)||this.age == p.age) {
				return true;
			}
		} 	
		return false; 
	}

	// 주속해서 test 해보기
	@Override
	public int hashCode() {
		int hashCode = name.hashCode() + addr.hashCode() + age;
		System.out.println("person 객체 hashCode : " + name.hashCode());
		return hashCode;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
