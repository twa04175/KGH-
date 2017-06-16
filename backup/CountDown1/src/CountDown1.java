import java.util.Scanner;

public class CountDown1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("카운트다운을 시작합니다.");
		
		int x;
		
		do {
			System.out.print("양의 정수값 : ");
			x = stdIn.nextInt();
		} while(x <= 0);
		
		while(x >= 0) {
			System.out.println(x--);			
			//x--;
		}
		
		stdIn.close();
	}

}
