import java.util.Scanner;

public class ReverseArray01 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			ReverseArray01.swap(a, i, a.length-1-i);
		}
	}
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		ReverseArray01.reverse(x);
		
		System.out.println("요소의 나열을 바꾸었습니다.");
		for(int i=0; i<num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		
		stdIn.close();
	}
}
