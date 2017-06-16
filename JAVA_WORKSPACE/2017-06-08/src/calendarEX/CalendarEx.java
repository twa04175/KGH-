package calendarEX;

import java.util.Calendar;

public class CalendarEx {

	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		int dayOfWeek = cal.getMaximum(Calendar.DAY_OF_WEEK);
		int hour = cal.getMaximum(Calendar.HOUR);
		int hourOfDay = cal.getMaximum(Calendar.HOUR_OF_DAY);
		int ampm = cal.getMaximum(Calendar.AM_PM);
		int minute = cal.getMaximum(Calendar.MINUTE);
		int second = cal.getMaximum(Calendar.SECOND);
		int millisecond = cal.getMaximum(Calendar.MILLISECOND);

		System.out.print(msg+year+"/"+month+"/"+day+"/");
		
		switch(dayOfWeek) {
		case 0 :
			System.out.print("�Ͽ���");
			break;
		case 1 :
			System.out.print("������");
			break;
		case 2 :
			System.out.print("ȭ����");
			break;
		case 3 :
			System.out.print("������");
			break;
		case 4:
			System.out.print("�����");
			break;
		case 5 :
			System.out.print("�ݿ���");
			break;
		case 6 :
			System.out.print("�����");
			break;
		}
		
		System.out.print("("+hourOfDay+")");
		if(ampm == Calendar.AM) {
			System.out.print("����");
		} else {
			System.out.print("����");
		}
		
		System.out.println(hour+"�� "+minute+"�� "+second+"�� "+millisecond+"�и���");
	}
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("����",now);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();
		firstDate.set(2012, 11, 25);
		
		firstDate.set(Calendar.HOUR_OF_DAY, 20);
		firstDate.set(Calendar.MINUTE,30);
		printCalendar("ó�� ����Ʈ�� ����",firstDate);
	
	}
}
