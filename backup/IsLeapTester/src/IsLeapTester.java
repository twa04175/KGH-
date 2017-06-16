import java.util.Scanner;

public class IsLeapTester {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("양력 : ");
		int y = stdIn.nextInt();
		
		//Day day1 = new Day(y);
		//System.out.println("이 연도는 윤년" + (day1.isLeap() ? "입니다." : "이 아닙니다."));
		
		// 일회용 인스턴스
		System.out.println("이 연도는 윤년" + (new Day(y).isLeap() ? "입니다." : "이 아닙니다."));
		
		stdIn.close();		
	}

}
