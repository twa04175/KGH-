import java.util.Scanner;

public class PointSumAveArray {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int sum = 0;
		final int person = 5;
		int[] point = new int[person];
		
		System.out.println(person + "���� ������ �Է��Ͻÿ�.");
		for(int i=0; i<person; i++) {
			System.out.print((i+1) + "���� ���� : ");
			point[i] = stdIn.nextInt();
			sum += point[i];
		}
		
		System.out.println("�հ�� " + sum + "���Դϴ�.");
		System.out.println("����� " + (double)sum/person + "���Դϴ�.");
		
		stdIn.close();
	}

}
