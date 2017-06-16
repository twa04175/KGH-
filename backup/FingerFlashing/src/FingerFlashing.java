import java.util.Scanner;

public class FingerFlashing {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int hand;
		
		do {
			System.out.print("손을 선택하시오. (0-가위 / 1-바위 / 2-보) : ");
			hand = stdIn.nextInt();
		} while(!(hand>=0 && hand<=2));
		//} while(hand<0 || hand>2); // 드모르간의 법칙
		
		switch(hand) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		}
		
		stdIn.close();
	}

}
