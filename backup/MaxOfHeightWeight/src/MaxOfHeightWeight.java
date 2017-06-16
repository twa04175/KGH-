import java.util.Scanner;

public class MaxOfHeightWeight {
	
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�ο� ����? : ");
		int person = stdIn.nextInt();
		
		int[] height = new int[person];
		int[] weight = new int[person];
		
		System.out.println(person + "���� ����� ü���� �Է��Ͻÿ�.");
		
		for(int i=0; i<person; i++) {
			System.out.print((i+1) + "���� ���� : ");
			height[i] = stdIn.nextInt();
			System.out.print((i+1) + "���� ü�� : ");
			weight[i] = stdIn.nextInt();
		}
		
		System.out.println("���� Ű�� ū ����� ���� : " + maxOf(height) + "cm");
		System.out.println("���� �׶��� ����� ü�� : " +  maxOf(weight) + "kg");
	}
}
