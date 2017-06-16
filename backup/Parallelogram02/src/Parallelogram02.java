import java.util.Scanner;

public class Parallelogram02 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("평행사변형을 표시합니다.");
		System.out.print("밑변 : ");
		int width = stdIn.nextInt();
		
		System.out.print("높이 : ");
		int height = stdIn.nextInt();
		
		for(int i=1; i<=height; i++) {
			for(int j=1; j<=height-i ; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=width ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		stdIn.close();
	}

}
