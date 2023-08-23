package apiutil;

import java.util.ArrayList;
import java.util.Calendar;

public class BoardExam {
	
	public static void main(String[] args) {
		ArrayList<Board> boardList = new ArrayList<>();
		
		Board board1 = new Board(1, "jang", "자바어려워", "자바어려워", 10, Calendar.getInstance().getTime());
		Board board2 = new Board(2, "jang", "자바어려워", "자바어려워", 10, Calendar.getInstance().getTime());
		Board board3 = new Board(3, "jang", "자바어려워", "자바어려워", 10, Calendar.getInstance().getTime());
		Board board4 = new Board(4, "jang", "자바어려워", "자바어려워", 10, Calendar.getInstance().getTime());
		Board board5 = new Board(5, "jang", "자바어려워", "자바어려워", 10, Calendar.getInstance().getTime());
		
		boardList.add(board1);
		boardList.add(board2);
		boardList.add(board3);
		boardList.add(board4);
		boardList.add(board5);
		boardList.add(board5);
		
		display(boardList);
	}
	
	public static void display(ArrayList<Board> boardList) {
		for(int i = 0; i < boardList.size(); i++) {
			Board board = boardList.get(i);
			System.out.println(board);
		}
	}
	

}
