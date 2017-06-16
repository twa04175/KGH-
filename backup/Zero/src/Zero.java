import java.util.Scanner;

public class Zero {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = stdIn.nextInt();
		
		if(!(n != 0)) { // n == 0
			System.out.println("이 값은 0입니다.");
		} else {
			System.out.println("이 값은 0이 아닙니다.");
		}
		
		stdIn.close();
	}

}
