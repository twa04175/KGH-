import java.util.Scanner;

public class PutAsterisk1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�� ���� *�� ǥ���մϱ�? : ");
		int n = stdIn.nextInt();
		
		// 1�� ���
		System.out.print("1�� ��� : ");
		int i = 0;
		while(i < n) {
			System.out.print('*');
			i++;
		}
		System.out.println();
		
		// 2�� ���
		System.out.print("2�� ��� : ");
		i = 0;
		while(i < n) {
			System.out.print('*');
			i++;
		}
		System.out.println();
		
		// 3�� ���
		System.out.print("3�� ��� : ");
//		while(n > 0) {
//			System.out.print('*');
//			n--;
//		}
		
//		while(n-- > 0)
//			System.out.print('*');
		
		System.out.println();
		
		// 4�� ���
		System.out.print("4�� ��� : ");
//		while(n > 0) {
//			System.out.print('*');
//			--n;
//		}
		
		System.out.println();
		while(--n >= 0) {
//			System.out.print(n + " ");
			System.out.print('*');
//			System.out.println();
		}
		
		System.out.println();
				
		stdIn.close();
	}

}
