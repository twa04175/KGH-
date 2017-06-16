import java.util.Random;
import java.util.Scanner;

public class SelectionSort01 {
	
	public static void main(String[] args) {
		//int[] a = new int[]{50, 70, 20, 10, 30};
		
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("�迭�� ���� : ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = rand.nextInt(90) + 10;
		}
		
		// �������� �� ���
		System.out.print("�������� �� : ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// �������� ���� �κ�
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
			System.out.printf("%3dȸ�� �� : ", i+1);
			for(int k=0; k<n; k++) {
				System.out.print(a[k] + " ");
			}
			System.out.println();
		}
		
		// �������� �� ���
		System.out.print("�������� �� : ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		stdIn.close();
	}

}
