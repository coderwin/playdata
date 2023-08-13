package statement;

public class FroExam_Alpha {

	public static void main(String[] args) {
		// 알파벳출력
		// ABCD....Z
		char firstAlpha = 'A';
		for(int i = 0; i >= 0 ;i++) {
			System.out.println(firstAlpha);
			if(firstAlpha == 'Z') {
				break;
			}
			firstAlpha++;
		}
		
		System.out.println("============================");
		
		firstAlpha = 'A';
//		System.out.println((short)'Z');
		for(int i = 0; firstAlpha <= 'Z'; i++) {
			System.out.println(firstAlpha);
			firstAlpha+=i;
		}

	}

}
