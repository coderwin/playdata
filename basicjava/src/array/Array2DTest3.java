package array;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

//가변배열 - 다차원배열은 배열의 요소가 참조하는 배열의 사이즈를 다르게 생성할 수 있다.
public class Array2DTest3 {

	public static void main(String[] args) throws IOException {
		char[][] myarr = new char[5][];
		myarr[0] = new char[1];
		myarr[1] = new char[2];
		myarr[2] = new char[3];
		myarr[3] = new char[4];
		myarr[4] = new char[5];
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 10);
		//값을 할당
		for(int row=0; row < myarr.length; row++) {
			for(int i = 0; i < myarr[row].length; i++) {
				myarr[row][i] = '*';
			}
		}
		
		// 배열의 값을 출력하는 for
		for(int row = 0; row < myarr.length; row++) {
			for(int i = 0; i < myarr[row].length; i++) {
				bw.write(myarr[row][i]);
			}
			bw.write("\r");
		}
		// 출력하기
		bw.flush();

	}

}
