import java.util.Random;
import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = rand.nextInt(90) + 10;
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		for(int i=0; i<n/2; i++) {
			int t = a[i];
			a[i] = a[n-1-i];
			a[n-1-i] = t;
		}
		
		System.out.println("����� ������ �ݴ�� �ٲپ����ϴ�.");
		for(int i=0; i<n; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		stdIn.close();
	}

}
