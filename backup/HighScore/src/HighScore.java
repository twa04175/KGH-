import java.util.Scanner;

public class HighScore {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final int person = 5;
		int[] point = new int[person];
		
		System.out.println(person + "���� ������ �Է��Ͻÿ�.");
		for(int i=0; i<person; i++) {
			System.out.print((i+1) + "�� ���� : ");
			point[i] = stdIn.nextInt();
		}
		
		int max = point[0];
		for(int i=1; i<point.length; i++) {
			if(point[i] > max) {
				max = point[i];
			}
		}
		
		System.out.println("�ְ� ������  " + max + "�Դϴ�.");
		
		stdIn.close();
	}

}
