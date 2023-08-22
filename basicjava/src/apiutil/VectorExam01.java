package apiutil;

import java.util.Vector;

// 78, 99, 100, 95, 100점을 Vector에 저장하고 저장된 점수의 총점과 평균을 구해서 출력하기
public class VectorExam01 {

	public static void main(String[] args) {
		// 점수 저장
		Vector<Integer> grades = new Vector<>();
		int[] gradesArr = { 78, 99, 100, 95, 100 };

		for (int grade : gradesArr) {
			grades.add(grade);
		}

		// 총점 구하기
		int total = 0;// 총점
		int avg = total;// 평균
		for (int grade : grades) {
			total += grade;
		}
		// 평균 구하기
		avg = total / grades.size();// 평균

		// 출력문
		System.out.println("총점 : " + total + "점");
		System.out.println("평균 : " + avg + "점");

	}

}
