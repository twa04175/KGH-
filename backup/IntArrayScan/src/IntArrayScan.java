import java.util.Scanner;

public class IntArrayScan {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		// 입력받는 for문
		for(int i=0; i<n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		// 출력하는 for문
		for(int i=0; i<n; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		stdIn.close();
	}

}
