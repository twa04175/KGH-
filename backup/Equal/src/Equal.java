import java.util.Scanner;

public class Equal {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� a : ");
		int a = stdIn.nextInt();
		
		System.out.print("���� b : ");
		int b = stdIn.nextInt();
		
		if(a != b) {
			System.out.println("�� ���� �ٸ��ϴ�.");
		} else {
			System.out.println("�� ���� �����ϴ�.");
		}
		
		stdIn.close();
	} 

}
