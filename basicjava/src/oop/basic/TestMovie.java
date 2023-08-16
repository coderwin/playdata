package oop.basic;

public class TestMovie {
	
	public static void main(String[] args) {
		
		// 선생님
		Movie myMovie = new Movie();
		myMovie.setTitle("겨울왕국");
		myMovie.setGenre("애니메이션");
		myMovie.play();
		
		System.out.println("-----------------");
		Movie yourMovie = new Movie();
		yourMovie.setTitle("아바타3");
		yourMovie.setGenre("SF");
		yourMovie.play();
		
		
		// 내가 한 것
		// 영화 불러온다.
		Movie movie = new Movie();
		// 영화 입력한다.
		String movieName = "겨울왕국2";
		String genre = "애니메이션";
		movie.setTitle(movieName);
		movie.setGenre(genre);
		// 영화 출력한다. .equals 영화를 플레이한다. .equals 재생시킨다.
		movie.play();
		
		Movie movie2 = new Movie();
		System.out.println("-----------------");
		movieName = "아바타";
		genre = "SF";
		movie2.setTitle(movieName);
		movie2.setGenre(genre);
		// 영화 출력한다.
		movie2.play();
		
		System.out.println("-----------------");
		Movie movie3 = new Movie();
		movie3.setTitle("아바타2");
		movie3.setGenre("SF2");
		
		System.out.println("--------생성자로 객체 생성하기-------------");
		Movie movie4 = new Movie("겨울왕국3", "애니메이션");
		movie4.play();
		
		System.out.println("-----------성능 검사---------------");
		
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		// 시험해 볼 코드
		Movie nextMovie = new Movie("겨울", "애니");
		nextMovie.play();
		
		long endTime = System.currentTimeMillis();
//		System.out.println(endTime);
		
		long takenTimes = endTime - startTime;
//		System.out.println(takenTimes);
		
		
		startTime = System.currentTimeMillis();
		
		Movie nextMovie2 = Movie.create("겨우", "애니");
		nextMovie2.play();
		
		endTime = System.currentTimeMillis();
		
		takenTimes = endTime - startTime;
		System.out.println(takenTimes);
		
		
		startTime = System.currentTimeMillis();
		
		Movie nextMovie3 = Movie.createV2("결울", "애니");
		nextMovie3.play();
		
		endTime = System.currentTimeMillis();
		
		takenTimes = endTime - startTime;
		System.out.println(takenTimes);
		
		
		
		
		
		
		
	}

}
