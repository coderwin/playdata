package weeklytest4;

/**
 * Beverage 설명 : 음료
 * 
 * @author Playdata
 *
 */
public abstract class Beverage {

	String name;// 제품명
	private int price;// 가격

	// 생성자
	public Beverage(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메서드
	/**
	 * 기능 : 메뉴에 따른 가격을 정합니다.
	 */
	abstract void calcPrice();

	public void print() {

	}

}
