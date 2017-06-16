
// ����������

import java.util.Random;
import java.util.Scanner;

public class FingerFlashing01 {

	public static void main(String[ ] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random( );
		String[ ] hands = {"����", "����", "��"};
		int retry;						// �ѹ� ��?

		do {
			// ��ǻ���� ���� 0, 1, 2�� ������ ����
			int comp = rand.nextInt(3);

			// �÷��̾��� ���� 0, 1, 2�� �Է�
			int user;
			do {
				System.out.print("���������� ");
				for (int i = 0; i < 3; i++)
					System.out.print("(" + i + ")" + hands[i] + " ");
				System.out.print(" : ");
				user = stdIn.nextInt( );
			} while (user < 0 || user > 2);

			// ������ ���� ǥ��
			System.out.println("���� " + hands[comp] + "�̰�, ����� " + 
							 hands[user] + "�Դϴ�.");

			// ����
			int judge = (user - comp + 3) % 3;
			switch (judge) {
			 case 0: System.out.println("�����ϴ�.");		break;
			 case 1: System.out.println("����� �̰���ϴ�.");	break;
			 case 2: System.out.println("����� �����ϴ�.");	break;
			}

			// �ѹ� �� ������ Ȯ��
			do {
				System.out.print("�ѹ� ��? (0)�ƴϿ� (1)�� : ");
				retry = stdIn.nextInt( );
			} while (retry != 0 && retry != 1);
		} while (retry == 1);
		System.out.println("���������� ������ �����Ͽ����ϴ�!!!");		
		
		stdIn.close();
	}
}
