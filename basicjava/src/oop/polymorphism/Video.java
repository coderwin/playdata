package oop.polymorphism;

public class Video extends Content {
	
	private String genre;// 장르

	// 생성자
	public Video(String title, String genre) {
		super(title);
		setGenre(genre);
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
		int price = 0;// 가격
		switch(genre) {
		case "new":
			price = 2000;
			break;
		case "comic":
			price = 1500;
			break;
		case "child":
			price = 1000;
			break;
		}
		super.setPrice(price);
	}
	
//	// 메서드
	@Override
	public void totalPrice() {
//		int price = 0;// 가격
//		switch(genre) {
//		case "new":
//			price = 2000;
//			break;
//		case "comic":
//			price = 1500;
//			break;
//		case "child":
//			price = 1000;
//			break;
//		}
//		super.setPrice(price);
	}
	
}
