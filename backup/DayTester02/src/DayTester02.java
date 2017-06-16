import java.util.Scanner;

public class DayTester02 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("day1을 입력하시오.");
		System.out.print("년 : ");
		int y = stdIn.nextInt();
		System.out.print("월 : ");
		int m = stdIn.nextInt();
		System.out.print("일 : ");
		int d = stdIn.nextInt();
		
		Day day1 = new Day(y, m, d);
		System.out.println("day1 = " + day1);
		
		Day day2 = new Day(day1);
		System.out.println("day2를 day1과 같은 날짜로 만들었습니다.");
		System.out.println("day2 = " + day2);
		
		if(day1.equalTo(day2)) {
			System.out.println("day1과 day2는 같습니다.");
		} else {
			System.out.println("day1과 day2는 다릅니다.");
		}
		
		Day d1 = new Day();
		Day d2 = new Day(2010);
		Day d3 = new Day(2010, 10);
		Day d4 = new Day(2010, 10, 15);
		
		System.out.println("d1 = " + d1.toString());
		System.out.println("d2 = " + d2.toString());
		System.out.println("d3 = " + d3.toString());
		System.out.println("d4 = " + d4.toString());
		
		Day[] a = new Day[3];
		for(int i=0; i<a.length; i++) {
			a[i] = new Day();
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i].toString());
		}
		
		stdIn.close();
	}


}
