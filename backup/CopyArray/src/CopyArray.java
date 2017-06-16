import java.util.Scanner;

public class CopyArray {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			b[i] = a[i];
		}
		
		System.out.println("a의 모든 요소를 b로 복사했습니다.");
		
		for(int i=0; i<n; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
		
		stdIn.close();
		
	}

}
