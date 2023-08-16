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
	
	
	// 기본생성자와 매개변수 2개 생성자 정의하고 생성자를 이용하는 코드로 수정해서 제출
	// 기본 생성자
	public Movie() {
		
	}
	// 매개변수 2개 생성자
	public Movie(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}

	// 메서드
	/**
	 * 기능 : 데이터를 초기화합니다.
	 */
	public static Movie create(String title, String genre) {
		
		Movie movie = new Movie();
		
		movie.title = title;
		movie.genre = genre;
		
		return movie;
	}
	
	/**
	 * 기능 : 데이터를 초기화합니다. v2
	 */
	public static Movie createV2(String title, String genre) {
		
		Movie movie = new Movie();
		
		movie.setTitle(title);
		movie.setGenre(genre);
		
		return movie;
	}

	
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
