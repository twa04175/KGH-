import java.util.Random;
import java.util.Scanner;

public class MentalArithmetic {
	
	static Scanner stdIn = new Scanner(System.in);
	
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("�ٽ� �ѹ�? <Yes-1/No-0> : ");
			cont = stdIn.nextInt();
		} while(cont != 0 && cont != 1);
		return cont == 1;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("�ϻ� Ʈ���̴�!!!");
		do {
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			
			while(true) {
				System.out.print(x + " + " + y + " + " + z + " = ");
				int k = stdIn.nextInt();
				
				if(k == x+y+z) {
					System.out.println("�����Դϴ�. ¦¦¦^^");
					break;
				}
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		} while(confirmRetry());
		
		System.out.println("�ϻ����α׷��� �����Ͽ����ϴ�.");
	}

}
