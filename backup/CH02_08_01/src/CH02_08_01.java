import java.util.Scanner;
import java.util.Random;

public class CH02_08_01 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("������ : ");
		int num = stdIn.nextInt() + rand.nextInt(11) -5;
		
		//int num = 100 + rand.nextInt(11) -5;
		
		System.out.println("�� ���� +-5�� ������ �����߽��ϴ�. �װ��� " + num + "�Դϴ�");
		
		stdIn.close();
	}

}
