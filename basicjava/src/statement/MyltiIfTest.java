package statement;

import java.util.Scanner;

//if~else if~else문
public class MyltiIfTest {

	public static void main(String[] args) {
		//주민번호의 입력 받고 남자, 여자, 기타 출력하기
		Scanner key = new Scanner(System.in);
		System.out.println("주민번호입력:");
		int ssn = key.nextInt();
		if(ssn==1 | ssn==3) {
			System.out.println("남자");

		} else if(ssn==2 && ssn==4) {

		} else if(ssn==2 | ssn==4) {

			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
		
		
		
		
	}

}
