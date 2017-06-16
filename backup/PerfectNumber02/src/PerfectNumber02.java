import java.util.Scanner;

public class PerfectNumber02 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
			
		System.out.print("완전수의 범위 : ");
		int n = stdIn.nextInt();
		int sum = 0, count = 0;
		
		for(int i=1; i<=n; i++) {
			sum = 0;
			for(int j=1; j<=i/2; j++) {
				if(i%j == 0) {
					sum += j;
				}
			}
			if(i == sum) {
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.println("\n1부터 " + n + "까지의 완전수의 개수 : " + count);
		
		stdIn.close();		
	}

}
