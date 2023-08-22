package apiutil;

import java.util.ArrayList;
import java.util.List;

/**
 * 번호 성명 국어 수학 영어 1 장동건 100 99 88 2 이민호 89 100 100 3 김범룡 95 89 100 => 제목은 sysout
 * 출력 => 내용만 ArrayList
 * 
 * 
 * @author Playdata
 *
 */
public class ArrayListExam03 {

	public static void main(String[] args) {
		// 과목정보를 입력한다.
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("번호");
		subjects.add("성명");
		subjects.add("국어");
		subjects.add("수학");
		subjects.add("영어");
		// 학생정보를 입력한다.
		ArrayList<String> donggun = new ArrayList<>();
		donggun.add("1");
		donggun.add("장동건");
		donggun.add("100");
		donggun.add("99");
		donggun.add("88");
		ArrayList<String> minho = new ArrayList<>();
		minho.add("2");
		minho.add("이민호");
		minho.add("89");
		minho.add("100");
		minho.add("100");
		ArrayList<String> bumrung = new ArrayList<>();
		bumrung.add("3");
		bumrung.add("김범룡");
		bumrung.add("95");
		bumrung.add("89");
		bumrung.add("100");

		ArrayList<ArrayList<String>> studentsList = new ArrayList<>();

		studentsList.add(subjects);
		studentsList.add(donggun);
		studentsList.add(minho);
		studentsList.add(bumrung);

		// 성적표를 출력한다.
		dispaly(studentsList);

	}

	private static void dispaly(ArrayList<ArrayList<String>> studentsList) {

		StringBuffer sb = new StringBuffer();
		for (ArrayList<String> student : studentsList) {
			for (String obj : student) {
				sb.append(obj + "\t");
			}
			sb.append("\n")	;
		}

		System.out.println(sb);
	}

}
