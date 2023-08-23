package apiutil;

import java.util.Date;

public class Board {
	
	private int boardNo;
	private String writer;
	private String title;
	private String content;
	private int hit;
	private Date date;
	
	// 생성자
	/**
	 * @param boradNo
	 * @param writer
	 * @param title
	 * @param content
	 * @param hit
	 * @param date
	 */
	public Board(int boradNo, String writer, String title, String content, int hit, Date date) {
		this.boardNo = boradNo;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.date = date;
	}
	
	public int getBoardNo() {
		return boardNo;
	}
	
	// 메서드
	@Override
	public int hashCode() {
		return boardNo;
	}

//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);W
//	}
	
	

//	@Override
//	public boolean equals(Object obj) {
//		
////		if(obj instanceof Board) {
////			Board board = (Board)obj;
////			if(this.boardNo == board.getBoardNo()) {
////				return true;
////			}
////		}
////		return false;
//		
//		return true;
//	}
	
	
	
	
	
	
	
	
	
}
