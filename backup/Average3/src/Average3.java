import java.util.Scanner;

public class Average3 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
			
		
		System.out.println("정수값 x와 y의 평균값을 계산합니다.");
		System.out.print("x의 값 : ");
		int x = stdIn.nextInt();
		
		System.out.print("y의 값 : ");
		int y = stdIn.nextInt();
		
//		double ave = (double)(x + y) / 2;
//		double ave = (x + y) / 2;
		double ave = (x + y) / 2.0;
		System.out.println("x와 y의 평균값은 " + ave + "입니다.");
		
		stdIn.close();		
	}
 
}
