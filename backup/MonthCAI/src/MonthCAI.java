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
		System.out.println("������ " + monthString[month]);
		
		while(true) {
			System.out.print("�� ���Դϱ�? ");
			int m = stdIn.nextInt();
			
			if(month+1 == m) {
				break;
			}
			System.out.println("������ �ƴմϴ�.");
		}
		
		System.out.println("�����Դϴ�.");
		
		stdIn.close();
	}

}
