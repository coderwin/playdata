package oop.basic;

/**
 * 영화
 * 
 * @author Playdata
 *
 */
public class Movie {

	// 데이터
	private String title;// 영화명
	private String genre;// 장르

	// 메서드
	/**
	 * 기능 : 영화명을 입력한다.
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 기능 : 장르를 입력한다.
	 * 
	 * @param genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * 기능 : 영화의 정보를 출력한다.
	 */
	public void play() {
		// 영화 정보 출력하기
		System.out.println(title + "(" + genre + ") 상영중입니다.");

	}
}
