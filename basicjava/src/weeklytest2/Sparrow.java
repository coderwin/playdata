package weeklytest2;

/**
 * Sparrow : 참새
 * @author Playdata
 *
 */
public class Sparrow {
	
	private String name;// 이름
	private int legs;// 다리의 수
	private int length;// 몸길이
	
	public void setName(String name) {
		this.name = name;
	}
	
	// 메서드
	/**
	 * 기능 : 날다
	 */
	public void fly() {
		System.out.println("참새("
				+ name
				+ ")는 날지 않습니다.");
	}
	/**
	 * 기능 : 울다
	 */
	public void sing() {
		System.out.println("참새("
				+ name
				+ ")가 소리내어 웁니다.");
	}

	@Override
	public String toString() {
		return "참새의 이름은 "
				+ name
				+ " 입니다.";
	}
}
