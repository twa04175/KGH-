import java.util.Scanner;

public class FingerFlashing1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� �����Ͻÿ�. (0-���� / 1-���� / 2-��) : ");
		int hand = stdIn.nextInt();
		
		// if������ ó��
/*		if(hand == 0) {
			System.out.println("����");
		} else if(hand == 1) {
			System.out.println("����");
		} else if(hand == 2) {
			System.out.println("��");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.\n�ٽ� ������ �ּ���.");
		}
			*/
		
		// switch������ ó��
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
		default:
			System.out.println("�߸� �Է��Ͽ����ϴ�.\n�ٽ� ������ �ּ���.");
			break;
		}
		
		stdIn.close();
	}

}
