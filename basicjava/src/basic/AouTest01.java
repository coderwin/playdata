package basic;

import java.util.Random;

public class AouTest01 {
	
	public static void main(String[] args) {
		/*
		 * 문자열을 처리하기 위한 기능(api)을 사용하기 위해서 String클래스를 JVM이인식하는 작업공간에 할당
		 * 												- JVM이 찾아서 사용할 수 있는 미리 약속된 공간(heap)
		 * 
		 * [사용방법]
		 * api를 heap 메모리에 올리기 위해 사용하는 연사자 : new
		 * 
		 * new heap에 할당해서 사용한고 싶은 클래스명()
		 * -> 이때 클래스가 모두 heap에 올라가나요? 네
		 * 
		 */
		new String();
		// heap 메모리에 있는 걸 써먹기 위해서 변수 선언해준다.
		// 						변수 선언하면 stack 메모리에 올라간다.(heap 메모리에 있던 주소가)
		String str1 = new String();
		Object ob1 = new Object();
		StringBuffer sb = new StringBuffer();
		Thread t = new Thread();
		new Random();
	}

}
