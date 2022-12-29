package calendra;

import java.util.Calendar;
import java.util.Date;

public class CalendraEaxmple {

	public static void main(String[] args) {
		
		for(int i=1; i<20; i++) {
			Calendar cal = Calendar.getInstance();

			cal.setTime(new Date());
			cal.add(Calendar.DATE, -i);
			Date oneHourBack = cal.getTime();

			System.out.println("Start => " + getStartOfDay(oneHourBack));

			System.out.println("End => " + getEndOfDay(oneHourBack));
			
		}
//		System.out.println("Start => " + getStartOfDay(new Date()));
//
//		System.out.println("End => " + getEndOfDay(new Date()));

	}
	public static long getStartOfDay(Date date) {
		
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(date);
	    int year = calendar.get(Calendar.YEAR);
	    int month = calendar.get(Calendar.MONTH);
	    int day = calendar.get(Calendar.DATE);
	    calendar.set(year, month, day, 0, 0, 0);
	    return calendar.getTimeInMillis();
	}

	public static long getEndOfDay(Date date) {
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(date);
	    int year = calendar.get(Calendar.YEAR);
	    int month = calendar.get(Calendar.MONTH);
	    int day = calendar.get(Calendar.DATE);
	    calendar.set(year, month, day, 23, 59, 59);
	    return calendar.getTimeInMillis();
	}

}