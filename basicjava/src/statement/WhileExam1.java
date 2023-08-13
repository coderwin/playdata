package statement;

public class WhileExam1 {

	public static void main(String[] args) {
		// 1부터 100까지 합하기
		int i = 1;
		int total = 0;
		// 짝수, 홀수 합 구하기
		int evenTotal = 0;
		int oddTotal = 0;
		while(i <= 100) {
			total += i;	
			if(i % 2 == 0) {
				evenTotal += i;
			} else {
				oddTotal += i;
				
			}
			i++;
		}
		System.out.println("총합:"+total);
		System.out.println("짝수 총합:"+evenTotal);
		System.out.println("홀수 총합:"+oddTotal);
	}
}
