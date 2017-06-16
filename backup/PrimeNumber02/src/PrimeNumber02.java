import java.util.Scanner;

public class PrimeNumber02 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("소수의 범위 : ");
		int n = stdIn.nextInt();
		int count = 0;
		
		for(int i=2; i<=n; i++) {
			for(int j=2; j<=i; j++) {
				if(i == j) {
					System.out.print(i + " ");
					count++;
				}
				if(i%j == 0) {
					break;
				}
			}
		}
		
		System.out.println("\n2부터 " + n + "까지의 소수의 개수 : " + count);
		
		stdIn.close();
	}

}
