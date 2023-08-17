package inheritance;

/**
 * Coffee
 * 설명 : 커피, 음료수 중
 * @author Playdata
 *
 */
public class Coffee extends Beverage {
	
	private String name;
	
	// 생성자
	public Coffee(int price, String name) {
		super(price);
		super.setType("커피");
		this.name = name;
	}

	public String getName() {
		
		return name;
	}

}
