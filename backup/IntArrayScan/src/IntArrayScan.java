import java.util.Scanner;

public class IntArrayScan {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		// �Է¹޴� for��
		for(int i=0; i<n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		// ����ϴ� for��
		for(int i=0; i<n; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		stdIn.close();
	}

}
