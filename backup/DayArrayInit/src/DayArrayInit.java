
public class DayArrayInit {
	
	public static void main(String[] args) {
		
		String[] wd = new String[] {"일", "월", "화", "수", "목", "금", "토"};
		
		Day[] x = new Day[] { 
				new Day(1948, 7, 17),
				new Day(1960, 6, 15),
				new Day(1962, 12, 17),
				new Day(1972, 11, 21)
		};
		
		for(int i=0; i<x.length; i++) {
			System.out.println("x[" + i + "] = "
					+ x[i].getYear() + "년 "
					+ x[i].getMonth() + "월 "
					+ x[i].getDate() + "일("
					+ wd[x[i].dayOfWeek()] + ")");
		}
	}

}
