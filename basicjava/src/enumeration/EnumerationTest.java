package enumeration;

import java.util.Calendar;

public class EnumerationTest {
	public static void main(String[] args) {
		Week today = Week.MONDAY;
		Week nextday = null;// 참조형이다.
		Week today2 = Week.MONDAY;
		
		System.out.println(today == Week.MONDAY);
		System.out.println(today.equals(Week.MONDAY));
		System.out.println(today == Week.WEDNESDAY);
		
		System.out.println(today == today2);
		System.out.println(today.equals(today2));
		
		Week[] weekArr = Week.values();
		System.out.println(weekArr);
		for(Week week : weekArr) {
			System.out.println(week);
		}
		
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println("=======================");
		
		Week today3 = null;
		
		Calendar cal = Calendar.getInstance();
		int week3 = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week3) {
		case 1:
			today3 = Week.SUNDAY; break;
		case 2:
			today3 = Week.MONDAY; break;
		case 3:
			today3 = Week.TUESDAY; break;
		case 4:
			today3 = Week.WEDNESDAY; break;
		case 5:
			today3 = Week.THURSDAY; break;
		case 6:
			today3 = Week.FRIDAY; break;
		case 7:
			today3 = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일: " + today3);
		
		
		if(today3 == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
