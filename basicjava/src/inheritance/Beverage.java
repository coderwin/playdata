package inheritance;

/**
 * Beverrage
 * 설명 : 음료수
 * @author Playdata
 *
 */
public class Beverage {
	
	
	private int price;		// 가격
	private String type;	// 타입

	// 생성자
	public Beverage(int price) {
		this.price = price;
	}
	
	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setType(String type) {
		this.type = type;
	}
}
