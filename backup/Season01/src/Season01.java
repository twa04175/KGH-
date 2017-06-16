import java.util.Scanner;

public class Season01 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int retry;
		
		do {
			System.out.print("계절을 표시합니다.\n몇 월 입니까? ");
			int month = stdIn.nextInt();
			
			if(month>=3 && month<=5) {
				System.out.println("이것은 봄입니다.");
			} else if(month>=6 && month<=8) {
				System.out.println("이것은 여름입니다.");
			} else if(month>=9 && month<=11) {
				System.out.println("이것은 가을입니다.");
			} else if(month==12 || month==1 || month==2) {
				System.out.println("이것은 겨울입니다.");
			}
			
			System.out.print("다시 한 번? 1--Yes / 0--No : ");
			retry = stdIn.nextInt();
		} while(retry == 1);
		
		System.out.println("프로그램을 종료하였습니다.");
	}

}
