package statement;

public class ForExam_Hap {
	
	public static void main(String[] args) {
		//1부터100까지의 합을 출력하기
		int total = 0; // 총합
		int evenTotal = 0;// 짝수
		int oddTotal = 0;// 홀수
		for(int i = 1; i < 101; i++) {
			total = total + i;
			// 짝수
			if(i % 2 == 0) {
				evenTotal += i;
			// 홀수
			} else {
				oddTotal += i;
			}
		}
		// 총합:
		System.out.println("총합:"+total);
		// 짝수합:
		System.out.println("총합:"+evenTotal);
		// 홀수합:
		System.out.println("총합:"+oddTotal);
		
		
		int hap = 0;//총합
//		hap = hap + 1;
//		hap = hap + 2;
//		hap = hap + 3;
//		hap = hap + 4;
		for(int i = 1; i <= 100; i++) {
//			System.out.println("i: "+i);
			hap = hap + i;
		}
		
		
		
	}
	
}
