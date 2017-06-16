import java.util.Scanner;

public class DayTester03 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int y, m, d;
		
		System.out.print("양력 : ");
		y = stdIn.nextInt();
		
		System.out.println("이 해는 윤년" + (Day.isLeap(y) ? "입니다." : "이 아닙니다."));
		
		System.out.println("날짜를 입력하시오.");
		System.out.print("년 : ");
		y = stdIn.nextInt();
		System.out.print("월 : ");
		m = stdIn.nextInt();
		System.out.print("일 : ");
		d = stdIn.nextInt();
		
		Day a = new Day(y, m, d);
		System.out.println(a.getYear()+"년은 윤년" + (a.isLeap() ? "입니다." : "이 아닙니다."));
		
		stdIn.close();
		
	}

}
