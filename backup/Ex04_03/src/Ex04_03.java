import java.util.Scanner;

public class Ex04_03 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("--- �� �� ������ �� �����ϱ� ---");
		
		System.out.print("���� A : ");
		int n1 = stdIn.nextInt();	// ���� �� 
		
		System.out.print("���� B : ");
		int n2 = stdIn.nextInt();	// ū ��
		
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
