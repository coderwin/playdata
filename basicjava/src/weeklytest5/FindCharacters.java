package weeklytest5;

public class FindCharacters {

	public static void main(String[] args) {
		FindCharacters fc = new FindCharacters();
		char[] charArr = { 'a', 'b' };

		System.out.print("입력 스트림 : String s = Boys, be ambitious");
		for (int i = 0; i < charArr.length; i++) {
			int count = fc.countChar("Boys, be ambitious", 'b');
//			System.out.println(count);
			System.out.print(charArr[i] + ". c = '" + charArr[i] + "'인 경우 => " + count + " 리턴");
			if (charArr[i] == 'b') {
				System.out.println(
						" (" + String.valueOf(charArr[i]).toUpperCase() + "와 " + charArr[i] + "는 서로 다르므로 다른 것으로 간주)");
			}
		}

	}

	public int countChar(String str, char c) {
		StringBuffer sb = new StringBuffer();
		// Method를 완성하세요...
		int count = 0;// c와 같은 개수
		// 하나씩 빼본다.
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		System.out.println(sb);

		return count;
	}
}
