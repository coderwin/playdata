package apiutil;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// 날짜시간에 관련된 작업
public class CalenderTest2 {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println(Calendar.AM);
		System.out.println(Calendar.PM);
		System.out.println(cal.get(Calendar.AM_PM));
		
		if(cal.get(Calendar.AM_PM) == Calendar.PM) {
			System.out.println("오후");
		} else {
			System.out.println("오전");
		}
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(Calendar.DAY_OF_MONTH);
		System.out.println(Calendar.SUNDAY);
		System.out.println(Calendar.WEDNESDAY);
		System.out.println(Calendar.SATURDAY);


	}
}
