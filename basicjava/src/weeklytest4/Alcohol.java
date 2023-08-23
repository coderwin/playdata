package weeklytest4;

/**
 * Alcohol 설명 : 술
 * 
 * @author Playdata
 *
 */
public class Alcohol extends Drink {

	double alcper;// 알코올 도수

	// 생성자
	public Alcohol(String name, int price, int count, double alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}

	// 메서드
	/**
	 * 기능 : 타이틀 출력
	 */
//	@Override
	public static void printTitle() {
		System.out.println("상품명(도수[%])\t단가\t수량\t금액");
	}
	/**
	 * 기능 : 상품 정보 출력
	 */
	@Override
	public void printData() {
		System.out.println(super.getName()
				+ "("
				+ alcper
				+ ")\t"
				+ super.getPrice()
				+ "\t"
				+ super.getCount()
				+ "\t"
				+ super.getTotalPrice());
	}

}
