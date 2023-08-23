package weeklytest2;

/**
 * PlayBird : 새의 동작 테스트
 * @author Playdata
 *
 */
public class PlayBird {
	
	public static void main(String[] args) {
		// 오리가 나타났습니다.
		Duck myDouk = new Duck();
		// 이름을 지어줍니다.
		String doukName = "꽥꽥이";
		myDouk.setName(doukName);
		myDouk.fly();
		myDouk.sing();
		System.out.println(myDouk.toString());
		
		// 참새가 나타났습니다.
		Sparrow mySparrow = new Sparrow();
		// 이름을 지어줍니다.
		String sparrowName = "짹짹";
		mySparrow.setName(sparrowName);
		mySparrow.fly();
		mySparrow.sing();
		System.out.println(mySparrow.toString());
	}

}
