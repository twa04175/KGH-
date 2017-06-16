import java.util.Scanner;

public class Minus {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int a = stdIn.nextInt();
		
		int b = -a;
		
		System.out.println(a + "의 기호를 반전시킨 값은 " + b + "입니다.");
		
		stdIn.close();
	}

}
