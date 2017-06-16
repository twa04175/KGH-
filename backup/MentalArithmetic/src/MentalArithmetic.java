import java.util.Random;
import java.util.Scanner;

public class MentalArithmetic {
	
	static Scanner stdIn = new Scanner(System.in);
	
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("다시 한번? <Yes-1/No-0> : ");
			cont = stdIn.nextInt();
		} while(cont != 0 && cont != 1);
		return cont == 1;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("암산 트레이닝!!!");
		do {
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			
			while(true) {
				System.out.print(x + " + " + y + " + " + z + " = ");
				int k = stdIn.nextInt();
				
				if(k == x+y+z) {
					System.out.println("정답입니다. 짝짝짝^^");
					break;
				}
				System.out.println("틀렸습니다.");
			}
		} while(confirmRetry());
		
		System.out.println("암산프로그램을 종료하였습니다.");
	}

}
