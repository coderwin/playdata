package apiutil;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// 날짜시간에 관련된 작업
public class CalenderTest {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = new GregorianCalendar();
		
		System.out.println(cal);
		System.out.println(cal2);
		
		Date d = new Date();
		System.out.println(d);
		System.out.println("==============Calendar 사용방법==================");
		
		System.out.println(cal.get(0));
		System.out.println(cal.get(Calendar.YEAR)+"년");
//		System.out.println(cal.get(Calendar.MONTH) + "월");
		System.out.println((cal.get(Calendar.MONTH) + 1) + "월");
		System.out.println(cal.get(Calendar.DATE) + "일");
		System.out.println(cal.get(Calendar.HOUR) + "시");
		System.out.println(cal.get(Calendar.MINUTE) + "분");
		System.out.println(cal.get(Calendar.SECOND) + "초");
		
		cal2.set(2023, 10, 25);
		System.out.println(cal2);
		
		System.out.println(cal.getTimeInMillis());
		
		System.out.println("===========오늘부터 10월 30일까지 dday를 계산해보기================");
		// 10월 30일 만들기
		Calendar myCalendar = new GregorianCalendar();
		myCalendar.set(2023, 10, 30);
		long dDayMillis = myCalendar.getTimeInMillis();
		// 오늘 만들기
		Calendar myCalendar2 = new GregorianCalendar();
		long todayMillis = myCalendar2.getTimeInMillis();
		// 빼기
		long restMillis = dDayMillis- todayMillis;
		// 달로 만들기
		long restMin = restMillis * 1000 / 60 / 60 / 24;
		System.out.println("restMin : " + restMin);
		
		
		// 선생님
		Calendar today = new GregorianCalendar();
		Calendar dday = Calendar.getInstance();
		dday.set(2023, 9, 30);// 2023.10.30
		
		long restDay = dday.getTimeInMillis() - today.getTimeInMillis();
		restDay = restDay / 1000 / 60 / 60 / 24;
		System.out.println("남은일수 : " + restDay + "일");
		
		
		
//		System.out.println(Calendar.DAY_OF_MONTH);
//		System.out.println(Calendar.DAY_OF_WEEK);
//		System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);


	}
}
