import java.util.Random;
import java.util.Scanner;

public class BubbleSort01 {
	
	public static void main(String[] args) {
		//int[] a = new int[]{50, 70, 20, 10, 30};
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("배열의 개수 : ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = rand.nextInt(90) + 10;
		}
		
		System.out.print("버블정렬 전 : ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
			System.out.printf("%3d회전 후 : ", i+1);
			for(int k=0; k<n; k++) {
				System.out.print(a[k] + " ");
			}
			System.out.println();
		}
		
		System.out.print("버블정렬 후 : ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
