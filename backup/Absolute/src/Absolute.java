import java.util.Scanner;

public class Absolute {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		a: {
			System.out.print("음의 정수 : ");
			int t = stdIn.nextInt();
			
			if(t >= 0) {
				break a;
			}
			
			t = -t;
			System.out.println("절대값은 " + t + "입니다.");
		}
		System.out.println("a 레이블 밖입니다.");
	}

}
