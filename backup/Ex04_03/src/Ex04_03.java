import java.util.Scanner;

public class Ex04_03 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("--- 두 수 사이의 수 나열하기 ---");
		
		System.out.print("정수 A : ");
		int n1 = stdIn.nextInt();	// 작은 수 
		
		System.out.print("정수 B : ");
		int n2 = stdIn.nextInt();	// 큰 수
		
		// swap
		if(n1 > n2) {
			int t = n1;
			n1 = n2;
			n2 = t;
		}
		
		do {
			System.out.print(n1 + " ");
			
			n1++;
		} while(n1 <= n2);
		
		stdIn.close();
	}

}
