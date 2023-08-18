package oop.polymorphism;

/**
 * Content
 * 설명 : 비디오 정보 및 전체 가격 확인 가능합니다.
 * @author Playdata
 *
 */
public abstract class Content {
	
	private String title;// 제목
	private int price;// 가격	
	
	// 생성자
	public Content() {
		super();
	}

	public Content(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 메서드
	/**
	 * 기능 : 전체 비디오 가격을 보여줍니다.
	 */
	public abstract void totalPrice();
	
	/**
	 * 기능 : 비디오 정보를 보여줍니다.
	 */
	public void show() {
		System.out.println(title
				+ "비디오의 가격은 "
				+ price
				+ "원 입니다.");
	}
	
	
	
	
	
	
	
}
