import java.util.Scanner;
import static java.lang.Math.*;

public class Circle3 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("원의 면적을 계산합니다.");
		System.out.print("반지름 : ");
		double r = stdIn.nextDouble();
		
		System.out.println("면적은 " + PI * r * r);
	}

}
