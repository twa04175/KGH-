import java.util.Scanner;

public class IsoscelesTriangle02 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("좌상변이 직각이 삼각형을 표시합니다.");
		System.out.print("몇 단 : ");
		int n = stdIn.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=n+1-i; j>0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		stdIn.close();
	}

}
