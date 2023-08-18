package weeklytest4;

/**
 * Tea
 * 설명 : 차
 * @author Playdata
 *
 */
public class Tea extends Beverage {
	
	static int amount;// 판매수량
	
	// 생성자
	public Tea(String name) {
		super(name);
		Tea.amount++;
	}
	
	// 메서드
	/**
	 * 기능 : 메뉴에 따른 가격을 정합니다.
	 */
	@Override
	void calcPrice() {
		switch(super.name) {
		case "lemonTea":
			setPrice(1500);
			break;
		case "ginsengTea":
			setPrice(2000);
			break;
		case "redginsengTea":
			setPrice(2500);
			break;
		}
		
	}
	
	
	
}
