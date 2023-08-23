package array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// 2차원 배열의 활용예제
public class Array2DExam2 {
	
	public static void main(String[] args) throws IOException {
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		// method1
		/**
		 * 1. 2학급의 국어, 수학, 영어 점수를 저장할 배열을 만들고 값을 저장하기
		 * A반 - 90, 89, 100
		 * B반 - 98, 89, 97
		 * 점수는 각각 코드로 저장
		 */
		int[][] groupArr = new int[2][3];
		int[][] groupArr2 = {
				{}
		};
		System.out.println(groupArr2);
		System.out.println(groupArr2[0]);
		// A반 한 명의 점수 대입
		groupArr[0][0] = 90;
		groupArr[0][1] = 89;
		groupArr[0][2] = 100;
		// B반 한 명의 점수 대입
		groupArr[1][0] = 98;
		groupArr[1][1] = 89;
		groupArr[1][2] = 97;
		
		// method2
		/**
		 *  2. 저장된 배열의 모든 값을 출력하기
		 *  단, 각 과목 점수의 출력 뒤에 전체합계 평균 출력
		 *  90, 89, 100 합계:_ 평균:_
		 *  98, 89, 97 합계:_ 평균:_
		 *  
		 */
//		int total = 0;// 점수 합계
//		int avg = 0;// 평균
		for(int row = 0; row < groupArr.length; row++) {
			// 초기화
			int total = 0;
			int avg = 0;
			for(int i = 0; i < groupArr[row].length; i++) {
				if(i == groupArr[row].length - 1) {

					bw.write(groupArr[row][i] + "");
					
//					System.out.print(""
//							+ groupArr[row][i]);
				} else {
					bw.write(groupArr[row][i] + ", ");
//					System.out.print(""
//							+ groupArr[row][i]
//							+ ", ");
				}
				total += groupArr[row][i];
			}
			avg = total / groupArr[row].length;
			bw.write("\t합계:"
					+ total
					+ " 평균:"
					+ avg + "\r");
//			System.out.print("\t합계:"
//					+ total
//					+ " 평균:"
//					+ avg);
			bw.flush();// 출력하기
//			System.out.println(bw);
//			System.out.println();
		}

	}

}
