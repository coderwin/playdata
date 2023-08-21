package apilang;

// String은 원본이 변경되지 않고 STring메소드의 호출 결과가 새로운 STring객체로 만들어져서 리턴한다.
//""로 연결되는 조작이 빈번한 경우 문자열이 지속적으로 바뀌므로 상수풀에 계속 객체가 만들어진다.
//ㅁ문자열조작이 자주 발생한느 경우 STringBuffer나 StringBuilder를 이용해서 작업
public class StringBufferTest {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("java programming");
		StringBuilder sbuilder = new StringBuilder("java programming");
		System.out.println("원본:" + sb);
		System.out.println("원본:" + sbuilder);

		// 문자열 뒤에 추가하기
		sb.append("재밌다.");
		sbuilder.append("재밌다.");
		System.out.println("원본:" + sb);
		System.out.println("원본:" + sbuilder);

		// 문자열주악ㄴ에 삽입하기
		sb.insert(2, "servlet");
		sbuilder.insert(5, "jsp");
		System.out.println("원본:" + sb);
		System.out.println("원본:" + sbuilder);

		// 문자열삭제
		sb.delete(2, 5);
		sbuilder.delete(4, 8);
		System.out.println("원본:" + sb);
		System.out.println("원본:" + sbuilder);
		
		//문자열거꾸로 변경
		sb.reverse();
		sbuilder.reverse();
		System.out.println("원본:" + sb);
		System.out.println("원본:" + sbuilder);

	}

}
