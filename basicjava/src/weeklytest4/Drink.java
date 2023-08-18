package weeklytest4;

/**
 * Drink 설명 : 음료
 * 
 * @author Playdata
 *
 */
public class Drink {

	String name;// 상품명
	int price;// 단가
	int count;// 수량

	// 생성자
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// 메서드
	/**
	 * 기능 : 금액 계산
	 * 
	 * @return 총 금액
	 */
	public int getTotalPrice() {
		return price * count;
	}

	/**
	 * 기능 : 타이틀 출력
	 */
	public static void printTitle() {
		System.out.println("상품명\t단가\t수량\t금액");
	};

	/**
	 * 기능 : 상품 정보 출력
	 */
	public void printData() {
		System.out.println(getName() + "\t" + getPrice() + "\t" + getCount() + "\t" + getTotalPrice());
	};

}
