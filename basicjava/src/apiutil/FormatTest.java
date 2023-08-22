package apiutil;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatTest {
	public static void main(String[] args) {
		
		// 날짜 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		Calendar cal = Calendar.getInstance();
		
		
		String data = sdf.format(cal.getTime());
		System.out.println("format을 적용한 날짜데이터=>" + data);
		
		// 숫자출력
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println(df.format(123456789));
		
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		System.out.println(df2.format(123456789.8219));
		System.out.println(df2.format(123456789.8256));
		
		System.out.println(df.format(123456789.8219));
		System.out.println(df.format(123456789.4219));
		System.out.println(df.format(123456789.5219));
		
		String decimaldata = "123456.785";
		try {
			double num = (double)df2.parse(decimaldata);
			System.out.println(df2.format(df2.parse(decimaldata)));
			System.out.println(df2.format(num));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DecimalFormat df3 = new DecimalFormat("$#,###");
		System.out.println(df3.format(123456789));
		DecimalFormat df4 = new DecimalFormat("#,###%");
		System.out.println(df4.format(123456789.523456));
		DecimalFormat df5 = new DecimalFormat("####%");
		System.out.println(df5.format(123456789.523456));
		
		
	}
}
