package weeklytest4;

/**
 * Coffee
 * 설명 : 커피
 * @author Playdata
 *
 */
public class Coffee extends Beverage {

	static int amount;// 판매수량
	
	// 생성자 -> 주문
	public Coffee(String name) {
		super(name);
		Coffee.amount++;
	}
	
	
	// 메서드
	/**
	 * 기능 : 메뉴에 따른 가격을 정합니다.
	 */
	@Override
	void calcPrice() {
		
		switch(super.name) {
		case "Americano":
			super.setPrice(1500);
			break;
		case "CafeLatte":
			super.setPrice(2500);
			break;
		case "Cappuccino":
			super.setPrice(3000);
			break;
		}
	}
	
	
	
	
	
}
