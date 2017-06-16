import java.util.Scanner;

public class Circle01 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("반지름 : ");
		double r = stdIn.nextDouble();
		
		System.out.println("원둘레의 길이는 " + 2 * Math.PI * r + "입니다.");
		System.out.println("면적은 " + Math.PI * r * r + "입니다.");
	}

}
