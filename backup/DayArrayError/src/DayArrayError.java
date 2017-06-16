import java.util.Scanner;

public class DayArrayError {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String[] wd = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.print("날짜는 몇 개? : ");
		int n = stdIn.nextInt();
		
		Day[] a = new Day[n];
		
		for(int i=0; i<a.length; i++) {
//			a[i].set(2017, 10, 15); // new에 의해 실체가 생성되지 않았다.
			a[i] = new Day(2017, 10, 15);
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] = "
					+ a[i].getYear() + "년 "
					+ a[i].getMonth() + "월 "
					+ a[i].getDate() + "일("
					+ wd[a[i].dayOfWeek()] + ")");
		}
		
		stdIn.close();
	}
}
