import java.util.Random;
import java.util.Scanner;

public class MonthCAI {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		String[] monthString = {"January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November", "December"
		};
		
		int month = rand.nextInt(12);
		System.out.println("문제는 " + monthString[month]);
		
		while(true) {
			System.out.print("몇 월입니까? ");
			int m = stdIn.nextInt();
			
			if(month+1 == m) {
				break;
			}
			System.out.println("정답이 아닙니다.");
		}
		
		System.out.println("정답입니다.");
		
		stdIn.close();
	}

}
