import java.util.Scanner;

public class FingerFlashing {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int hand;
		
		do {
			System.out.print("���� �����Ͻÿ�. (0-���� / 1-���� / 2-��) : ");
			hand = stdIn.nextInt();
		} while(!(hand>=0 && hand<=2));
		//} while(hand<0 || hand>2); // ��𸣰��� ��Ģ
		
		switch(hand) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("��");
			break;
		}
		
		stdIn.close();
	}

}
