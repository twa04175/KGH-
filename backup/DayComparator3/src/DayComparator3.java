import java.util.Scanner;

public class DayComparator3 {
	
	static boolean compDay(Day d1, Day d2) {
		return d1.getYear() == d2.getYear()
				&& d1.getMonth() == d2.getMonth()
				&& d1.getDate() == d2.getDate();
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("날짜1을 입력하시오.");
		System.out.print("년 : ");
		int y = stdIn.nextInt();
		System.out.print("월 : ");
		int m = stdIn.nextInt();
		System.out.print("일 : ");
		int d = stdIn.nextInt();
		
		Day day1 = new Day(y, m, d);
		
		System.out.println("날짜2을 입력하시오.");
		System.out.print("년 : ");
		y = stdIn.nextInt();
		System.out.print("월 : ");
		m = stdIn.nextInt();
		System.out.print("일 : ");
		d = stdIn.nextInt();
		
		Day day2 = new Day(y, m, d);
		
		if(compDay(day1, day2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		stdIn.close();
	}


}
