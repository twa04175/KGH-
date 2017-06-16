import java.util.Scanner;

public class PutAsteristFor {
	
	public static void main(String[] args) {		
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("몇 개의  *를 표시합니까? : ");
		int n = stdIn.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.print("+");
		}
		
		stdIn.close();
	}

}
