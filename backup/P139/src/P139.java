import java.util.Scanner;

public class P139 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("1 - ���� ����");
			System.out.println("2 - ���� ����");
			System.out.println("3 - ���� ����");
			System.out.println("4 - ���� �ݱ�");
			
			System.out.print("�޴� ����(1-4) : ");
			n = stdIn.nextInt();
			
			System.out.println();
		//} while(!(n >= 1 && n <= 4));
		} while(n < 1 || n > 4); // ��𸣰��� ��Ģ
		
		switch(n) {
		case 1:
			System.out.println("������ �������ϴ�.");
			break;
		case 2:
			System.out.println("������ �����߽��ϴ�.");
			break;
		case 3:
			System.out.println("���Ͽ� ���⸦ �Ͽ����ϴ�.");
			break;
		case 4:
			System.out.println("������ �ݾҽ��ϴ�.");
			break;
		}
				
		stdIn.close();
	}

}
