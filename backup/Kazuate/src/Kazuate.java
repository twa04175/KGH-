import java.util.Random;
import java.util.Scanner;

public class Kazuate {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(1000);
		
		System.out.println("���� ������ ���� ����!!!");
		System.out.println("0~99 ������ ���� �����ּ���.");
		
		int x; 
		do {
			System.out.print("�� �ϱ��? : ");
			x = stdIn.nextInt();
		
			if(x > no) {
				System.out.println("�� ���� ���� �Է��Ͻÿ�.");
			} else if (x < no) {
				System.out.println("�� ū ���� �Է��Ͻÿ�.");
			}
		} while(x != no);
		
		System.out.println("�����Դϴ�.");
		
		stdIn.close();
	}

}
