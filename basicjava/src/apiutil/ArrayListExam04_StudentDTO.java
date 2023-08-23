package apiutil;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * ArrayListExam03 -> BoardExam처럼 변환
 * Student클래스를 만들고 정의
 * 
 * @author Playdata
 *
 */
public class ArrayListExam04_StudentDTO {
	
	
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();
		
		
		
		
		
	}
	
	public static void display(ArrayList<Board> boardList) {
		for(int i = 0; i < boardList.size(); i++) {
			Board board = boardList.get(i);
			System.out.println(board);
		}
	}
	

}
