package array;

import java.util.Random;

public class ArrayExam2 {

	public static void main(String[] args) {
		// 랜덤수를 배열에 저장하기
		Random rand = new Random();
		int[] myarr = new int[5];
		
		//랜덤수를 배열에 저장하기
		for(int i=0; i<myarr.length; i++) {
			int rdNum = rand.nextInt();
			myarr[i] = rdNum; 
		}
//		System.out.println("myarr:"+myarr.toString());
		System.out.println(myarr);

	}

}
