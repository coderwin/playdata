package apiutil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 1부터 50까지 랜덤수를 6개 발생시켜서 ArrayList에 저장하고 출력형식대로 출력 ex) 랜덤수 : 5, 7, 9, 13 ,40
 * [출력형식] 5(홀수), 7(홀수), 9(홀수), 13(홀수), 40(짝수)
 * 
 * @author Playdata
 *
 */
public class ArrayListExam01 {

	public static void main(String[] args) {

		// 랜덤수 만들기
		Random randomNumBox = new Random();
		// 숫자박스 ArrayList 만들기
//		List<Number> numberBox = new ArrayList<>();
		List<Integer> numberBox = new ArrayList<>();

		// 랜덤수를 ArrayList에 주입
//		int size = 50;
		int size = 6;
		for (int i = 0; i < size; i++) {
			int randomNum = randomNumBox.nextInt(50) + 1;
			// 랜덤수를 ArrayList에 주입
			numberBox.add(randomNum);
		}
		// 숫자박스에서 하나씩 숫자를 빼서 홀수짝수 구분하여 출력하기
		StringBuffer print = new StringBuffer();
		int count = 0;//
		for (int num : numberBox) {
			if (count != numberBox.size() - 1) {
				if (num % 2 == 0) {
					print.append(num + "(짝수), ");
				} else {
					print.append(num + "(홀수), ");
				}
			} else {
				if (num % 2 == 0) {
					print.append(num + "(짝수)");
				} else {
					print.append(num + "(홀수)");
				}
			}
			count++;

		}
		System.out.println(print);
		count = 0;
		List<String> resultList = numberBox.stream().map((num) -> {
			String result = num != numberBox.get(numberBox.size() - 1) ?
					num % 2 == 0 ? num + "(짝수), " : num + "(홀수), " :
						num % 2 == 0 ? num + "(짝수)" : num + "(홀수)";
			return result;
		}).collect(Collectors.toList());
		System.out.println("hello : " + resultList);
		String result = String.valueOf(resultList);
		System.out.println(result);

	}

}
